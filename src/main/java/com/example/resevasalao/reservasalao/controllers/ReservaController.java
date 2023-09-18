package com.example.resevasalao.reservasalao.controllers;

import com.example.resevasalao.reservasalao.model.Reserva;
import com.example.resevasalao.reservasalao.service.ReservaService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservaController {

    private ReservaService service;

    @GetMapping("/reservas")
    public ResponseEntity<List<Reserva>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Reserva> salvar(Reserva reserva){
        return ResponseEntity.ok(service.salvar(reserva));
    }

    @PutMapping
    public ResponseEntity<Reserva> alterar(@RequestBody Reserva reserva) throws ChangeSetPersister.NotFoundException {
        reserva = service.alterar(reserva);
        return ResponseEntity.ok(reserva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> consultar(@PathVariable Integer id) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reserva> deletar(@PathVariable Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
