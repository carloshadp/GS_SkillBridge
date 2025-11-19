package com.skillbridge.service;

import com.skillbridge.exception.RecursoNaoEncontradoException;
import com.skillbridge.model.TrilhaAprendizagem;
import com.skillbridge.repository.TrilhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrilhaService {

    @Autowired
    private TrilhaRepository trilhaRepository;

    public List<TrilhaAprendizagem> listarTodas() {
        return trilhaRepository.findAll();
    }

    public TrilhaAprendizagem buscarPorId(Long id) {
        return trilhaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("TrilhaAprendizagem", id));
    }

    public TrilhaAprendizagem criar(TrilhaAprendizagem trilha) {
        return trilhaRepository.save(trilha);
    }

    public TrilhaAprendizagem atualizar(Long id, TrilhaAprendizagem trilhaAtualizada) {
        TrilhaAprendizagem trilhaExistente = buscarPorId(id);

        trilhaExistente.setNome(trilhaAtualizada.getNome());
        trilhaExistente.setDescricao(trilhaAtualizada.getDescricao());
        trilhaExistente.setNivel(trilhaAtualizada.getNivel());
        trilhaExistente.setCargaHoraria(trilhaAtualizada.getCargaHoraria());
        trilhaExistente.setFocoPrincipal(trilhaAtualizada.getFocoPrincipal());

        return trilhaRepository.save(trilhaExistente);
    }

    public void deletar(Long id) {
        TrilhaAprendizagem trilha = buscarPorId(id);
        trilhaRepository.delete(trilha);
    }
}
