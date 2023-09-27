package com.br.reservasalao.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "tb_reserva")
public class Reserva {

    @Id
    @GeneratedValue
    private long id;
    private String evento;
    private String data;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Morador morador;

    @ManyToOne
    private Local local;
}
