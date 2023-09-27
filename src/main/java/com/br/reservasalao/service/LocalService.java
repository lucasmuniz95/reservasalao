package com.br.reservasalao.service;

import com.br.reservasalao.model.Local;
import com.br.reservasalao.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        return repository.save(local);
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
}
