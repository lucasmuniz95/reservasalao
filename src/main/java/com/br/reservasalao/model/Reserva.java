package com.br.reservasalao.model;

import com.br.reservasalao.dto.LocalDTO;
import com.br.reservasalao.dto.LocalReservaDTO;
import com.br.reservasalao.dto.MoradorDTO;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String evento;
    private String data;

    @ManyToOne
    private Local local;

    @ManyToOne
    private Morador morador;


    public Reserva(String evento, String data) {
    }

    public Reserva(String evento, String data, LocalDTO local, MoradorDTO morador) {
    }
}
