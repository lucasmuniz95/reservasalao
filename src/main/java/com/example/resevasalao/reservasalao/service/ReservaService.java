package com.example.resevasalao.reservasalao.service;

import com.example.resevasalao.reservasalao.model.Reserva;
import com.example.resevasalao.reservasalao.repository.ReservaRepository;
import dto.ReservaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.io.FileNotFoundException;


@Slf4j
@Service
public class ReservaService {
    @Autowired
    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }


    public Reserva salvar(Reserva reserva){
        return repository.save(reserva);
    }

    public Reserva alterar(Reserva reserva) throws ChangeSetPersister.NotFoundException {
        if (Objects.nonNull(reserva.getId())) {
            reserva = repository.save(reserva);
        } else {
            throw new ChangeSetPersister.NotFoundException();
        }
        return reserva;
    }

    public List<Reserva> listar() {
        return repository.findAll();
    }

    public Boolean excluir(Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            log.info("Erro ao realizar a exclusao : {}", e);
            return false;
        }
        return true;
    }

    public Reserva consultarPorId(Integer id) throws ChangeSetPersister.NotFoundException {
        return repository
                .findById(id)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
    }
}
