package com.example.resevasalao.reservasalao.repository;

import com.example.resevasalao.reservasalao.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
