package com.br.reservasalao.dto;

import com.br.reservasalao.model.Local;
import com.br.reservasalao.model.Reserva;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class LocalDTO {
    String nome;
    Integer capacidade;

    public Local transformaParaDTO(){
        return new Local(nome, capacidade);
    }
    public LocalDTO transformaParaRespostaDTO(Local local){
        return new LocalDTO(local.getNome(), local.getCapacidade());
    }
}
