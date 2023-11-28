package com.br.reservasalao.dto;

import com.br.reservasalao.model.Local;
import com.br.reservasalao.model.Morador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class MoradorDTO {
    private String nome;
    private String numeroAp;

    public Morador transformaParaDTO(){
        return new Morador(nome, numeroAp);
    }

    public MoradorDTO transformaParaRespostaDTO(Morador morador){
        return new MoradorDTO(morador.getNome(), morador.getNumeroAp());
    }



}

