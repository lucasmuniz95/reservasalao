package com.br.reservasalao.service;


import com.br.reservasalao.dto.LocalDTO;
import com.br.reservasalao.dto.MoradorDTO;
import com.br.reservasalao.model.Reserva;
import com.br.reservasalao.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listaTodos(){

        LocalDTO local = new LocalDTO();
        MoradorDTO morador = new MoradorDTO();
        List<Reserva> list = repository.findAll();
        list.stream().map(r -> {
            r.setLocal(local.transformaParaDTO());
            r.setMorador(morador.transformaParaDTO());
            return list;
        }).collect(Collectors.toList());


        return repository.findAll();
    }
    public Reserva create(Reserva reserva) {
        return repository.save(reserva);
    }

    public Reserva update(Reserva reserva) {
        return repository.save(reserva);
    }

    public Optional<Reserva> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
