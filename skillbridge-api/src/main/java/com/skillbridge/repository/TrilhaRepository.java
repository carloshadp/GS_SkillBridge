package com.skillbridge.repository;

import com.skillbridge.model.TrilhaAprendizagem;
import com.skillbridge.model.enums.NivelTrilha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TrilhaRepository extends JpaRepository<TrilhaAprendizagem, Long> {
    List<TrilhaAprendizagem> findByNivel(NivelTrilha nivel);
    List<TrilhaAprendizagem> findByFocoPrincipal(String focoPrincipal);
}
