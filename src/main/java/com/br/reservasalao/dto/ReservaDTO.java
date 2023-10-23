package com.br.reservasalao.dto;


import com.br.reservasalao.model.Local;
import com.br.reservasalao.model.Reserva;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {

    private String evento;
    private String data;
    private LocalDTO local;
    private MoradorDTO morador;

    public Reserva transformaParaDTO(){
        return new Reserva(evento, data, local, morador);
    }


    public ReservaDTO transformaParaRespostaDTO(Reserva reserva){
        return new ReservaDTO(getEvento(), getData(), getLocal().transformaParaRespostaDTO(reserva.getLocal()), getMorador().transformaParaRespostaDTO(reserva.getMorador()));
    }
}
