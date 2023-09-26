package com.br.reservasalao.controller;

import com.br.reservasalao.model.Reserva;
import com.br.reservasalao.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    ReservaService service;


    @GetMapping("/listar-todas")
    @ResponseStatus(HttpStatus.OK)
    public List<Reserva> listarTodos() {
        return service.listaTodos();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reserva> create(@RequestBody Reserva aluno) {
        Reserva reservaCreated = service.create(aluno);
        return ResponseEntity.status(201).body(reservaCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reserva> update(@RequestBody Reserva reserva) {
        Reserva reservaCreated = service.create(reserva);

        return ResponseEntity.status(201).body(reservaCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Reserva> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
