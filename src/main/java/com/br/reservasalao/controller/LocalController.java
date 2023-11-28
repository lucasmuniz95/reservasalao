package com.br.reservasalao.controller;


import com.br.reservasalao.dto.LocalDTO;
import com.br.reservasalao.model.Local;
import com.br.reservasalao.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locais")
public class LocalController {

    @Autowired
    LocalService service;


    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Local> listarTodos() {
        return service.listaTodos();
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<LocalDTO> create(@RequestBody LocalDTO dto) {
        Local local = service.create(dto.transformaParaDTO());
        return ResponseEntity.status(201).body(dto.transformaParaRespostaDTO(local));
    }

    @PutMapping
    public ResponseEntity<LocalDTO> update(@RequestBody Local local) {
        local = service.update(local);
        return ResponseEntity.ok(local.transformaparaDTO());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Local> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/listar-por-capacidade")
    @ResponseStatus(HttpStatus.OK)
    public List<Local> findLocalOrderByCapacidade(){
        return service.findLocalOrderByCapacidade();
    }
}
