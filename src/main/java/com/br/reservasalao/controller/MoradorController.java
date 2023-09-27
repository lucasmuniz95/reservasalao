package com.br.reservasalao.controller;

import com.br.reservasalao.model.Morador;
import com.br.reservasalao.model.Reserva;
import com.br.reservasalao.service.MoradorService;
import com.br.reservasalao.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    @Autowired
    MoradorService service;


    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Morador> listarTodos() {
        return service.listaTodos();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Morador> create(@RequestBody Morador morador) {
        Morador moradorCreated = service.create(morador);
        return ResponseEntity.status(201).body(moradorCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Morador> update(@RequestBody Morador morador) {
        Morador moradorCreated = service.create(morador);

        return ResponseEntity.status(201).body(moradorCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Morador> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
