package com.skillbridge.controller;

import com.skillbridge.model.TrilhaAprendizagem;
import com.skillbridge.service.TrilhaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/trilhas")
public class TrilhaController {

    @Autowired
    private TrilhaService trilhaService;

    @GetMapping
    public ResponseEntity<List<TrilhaAprendizagem>> listarTodas() {
        List<TrilhaAprendizagem> trilhas = trilhaService.listarTodas();
        return ResponseEntity.ok(trilhas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrilhaAprendizagem> buscarPorId(@PathVariable Long id) {
        TrilhaAprendizagem trilha = trilhaService.buscarPorId(id);
        return ResponseEntity.ok(trilha);
    }

    @PostMapping
    public ResponseEntity<TrilhaAprendizagem> criar(@Valid @RequestBody TrilhaAprendizagem trilha) {
        TrilhaAprendizagem trilhaCriada = trilhaService.criar(trilha);
        return ResponseEntity.status(HttpStatus.CREATED).body(trilhaCriada);
    }
    @PutMapping("/{id}")
    public ResponseEntity<TrilhaAprendizagem> atualizar(@PathVariable Long id,
                                                        @Valid @RequestBody TrilhaAprendizagem trilha) {
        TrilhaAprendizagem trilhaAtualizada = trilhaService.atualizar(id, trilha);
        return ResponseEntity.ok(trilhaAtualizada);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        trilhaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
