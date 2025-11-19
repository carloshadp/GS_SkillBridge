package com.skillbridge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "competencias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Competencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome da competência é obrigatório")
    @Size(max = 100, message = "Nome não pode exceder 100 caracteres")
    @Column(nullable = false, unique = true, length = 100)
    private String nome;

    @Size(max = 100, message = "Categoria não pode exceder 100 caracteres")
    @Column(length = 100)
    private String categoria;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @JsonIgnoreProperties("competencias")
    @ManyToMany(mappedBy = "competencias")
    private Set<TrilhaAprendizagem> trilhas = new HashSet<>();
}
