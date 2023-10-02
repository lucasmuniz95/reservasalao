package com.br.reservasalao.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class LocalReservaDTO {
    private String local;
    private Data reserva;
    private Boolean reservado;
}
