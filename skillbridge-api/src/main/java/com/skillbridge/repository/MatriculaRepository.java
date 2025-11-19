package com.skillbridge.repository;

import com.skillbridge.model.Matricula;
import com.skillbridge.model.enums.StatusMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    List<Matricula> findByUsuarioId(Long usuarioId);
    List<Matricula> findByTrilhaId(Long trilhaId);
    List<Matricula> findByStatus(StatusMatricula status);
}
