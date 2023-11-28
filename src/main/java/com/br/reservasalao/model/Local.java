package com.br.reservasalao.model;

import com.br.reservasalao.dto.LocalDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Integer capacidade;

    @OneToMany
    private List<Reserva> reservas;

    public Local(String nome, Integer capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public LocalDTO transformaparaDTO(){
        return new LocalDTO(this.nome, this.capacidade);
    }
}
