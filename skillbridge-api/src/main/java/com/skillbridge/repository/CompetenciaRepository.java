package com.skillbridge.repository;

import com.skillbridge.model.Competencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {
    Optional<Competencia> findByNome(String nome);
}
