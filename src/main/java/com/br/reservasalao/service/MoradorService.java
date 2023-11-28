package com.br.reservasalao.service;

import com.br.reservasalao.model.Morador;
import com.br.reservasalao.model.Reserva;
import com.br.reservasalao.repository.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoradorService {

    @Autowired
    private MoradorRepository repository;

    public List<Morador> listaTodos(){
        return repository.findAll();
    }



    public Morador create(Morador morador) {
        return repository.save(morador);
    }

    public Morador update(Morador morador) {
        return repository.save(morador);
    }

    public List<Morador> findAll() {
        return repository.findAll();
    }

    public Optional<Morador> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
