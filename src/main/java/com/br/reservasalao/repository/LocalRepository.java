package com.br.reservasalao.repository;

import com.br.reservasalao.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM Local WHERE capacidade IS NOT NULL ORDER BY capacidade")
    List<Local> findLocalOrderByCapacidade();
}
