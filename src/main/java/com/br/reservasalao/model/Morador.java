package com.br.reservasalao.model;

import com.br.reservasalao.dto.LocalDTO;
import com.br.reservasalao.dto.MoradorDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String telefone;
    private String numeroAp;

    @OneToMany
    private List<Reserva> reservas;

    public Morador(String nome, String numeroAp) {
    }

    public MoradorDTO transformaparaDTO(){
        return new MoradorDTO(this.nome, this.numeroAp);
    }
}
