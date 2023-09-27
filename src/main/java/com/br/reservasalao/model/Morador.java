package com.br.reservasalao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_morador")
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String telefone;
    private String numeroAp;

    @OneToMany(mappedBy = "morador")
    private List<Reserva> reservasList;
}
