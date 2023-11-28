package com.br.reservasalao.authetication.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    SecurityFilter securityFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.POST, "auth/login").permitAll()
                        .requestMatchers(HttpMethod.POST, "auth/register").permitAll()
                        .requestMatchers(HttpMethod.POST, "/reservas").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/reservas").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/moradores").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/moradores").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/locais").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/locais").hasRole("ADMIN")
                        .requestMatchers("/reservas").hasRole("USER")
                        .requestMatchers("/moradores").hasRole("USER")
                        .requestMatchers("/locais").hasRole("USER")
                        .anyRequest().authenticated())
                .formLogin(form -> form.defaultSuccessUrl("/swagger-ui/index.html"))
                .logout(logout -> logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout")))
                .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}