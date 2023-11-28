package com.br.reservasalao.model;

import com.br.reservasalao.dto.LocalDTO;
import com.br.reservasalao.dto.MoradorDTO;
import com.br.reservasalao.dto.ReservaDTO;
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
        this.evento = evento;
        this.data = data;
    }

    public Reserva(String evento, String data, LocalDTO local, MoradorDTO morador) {
        this.evento = evento;
        this.data = data;
        this.local = local.transformaParaDTO();
        this.morador = morador.transformaParaDTO();
    }

    public ReservaDTO transformaParaRespostaDTO(Reserva reserva){
        return new ReservaDTO(reserva.getEvento(), reserva.getData(), reserva.getLocal().transformaparaDTO(), reserva.getMorador().transformaparaDTO());
    }
}
