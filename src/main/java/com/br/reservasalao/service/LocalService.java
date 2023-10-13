package com.br.reservasalao.service;

import com.br.reservasalao.model.Local;
import com.br.reservasalao.repository.LocalRepository;

import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LocalService {
    @Autowired
    private LocalRepository repository;

    public List<Local> listaTodos(){
        return repository.findAll();
    }



    public Local create(Local local) {
        return repository.save(local);
    }

    public Local update(Local local) {
        if (Objects.nonNull(local.getId())) {
            local = repository.save(local);
        } else {
            throw new NotFoundException();
        }
        return local;
    }

    public List<Local> findAll() {
        return repository.findAll();
    }

    public Optional<Local> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Local> findLocalByCapacidadeOrderByCapacidade(){
        return repository.findLocalByCapacidadeOrderByCapacidade();
    }
}
