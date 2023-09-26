package com.br.reservasalao.service;


import com.br.reservasalao.model.Reserva;
import com.br.reservasalao.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listaTodos(){
        return repository.findAll();
    }



    public Reserva create(Reserva aluno) {

        //Set<Curso> cursoList = Collections.singleton(new Curso().toBuilder().id(dto.getIdCurso()).build());

        //Aluno aluno = Aluno.builder()
        //.nome(dto.getNomeAluno())
        //.email(dto.getEmailAluno())
        //.cursos(cursoList)
        //.build();

        return repository.save(aluno);
    }

    public Reserva update(Reserva aluno) {
        return repository.save(aluno);
    }

    public List<Reserva> findAll() {
        return repository.findAll();
    }

    public Optional<Reserva> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
