package com.br.reservasalao.dto;


import com.br.reservasalao.model.Local;
import com.br.reservasalao.model.Morador;
import com.br.reservasalao.model.Reserva;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReservaDTO {

    private String evento;
    private String data;
    private LocalDTO local;
    private MoradorDTO morador;

    public ReservaDTO(String evento, String data, LocalDTO local, MoradorDTO morador) {
        this.evento = evento;
        this.data = data;
        this.local = local;
        this.morador = morador;
    }


    public Reserva transformaParaDTO(){
        return new Reserva(this.evento, this.data, this.local, this.morador);
    }


    public ReservaDTO transformaParaRespostaDTO(Reserva reserva){
        return new
                ReservaDTO(reserva.getEvento(),
                reserva.getData(),
                reserva.getLocal().transformaparaDTO(),
                reserva.getMorador().transformaparaDTO());
    }
}
