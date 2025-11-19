package com.skillbridge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.skillbridge.model.enums.StatusMatricula;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "matriculas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties("matriculas")
    @NotNull(message = "Usuário é obrigatório")
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @JsonIgnoreProperties("matriculas")
    @NotNull(message = "Trilha é obrigatória")
    @ManyToOne
    @JoinColumn(name = "trilha_id", nullable = false)
    private TrilhaAprendizagem trilha;

    @Column(name = "data_inscricao", nullable = false)
    private LocalDate dataInscricao;

    @NotNull(message = "Status é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private StatusMatricula status;

    @PrePersist
    protected void onCreate() {
        if (dataInscricao == null) {
            dataInscricao = LocalDate.now();
        }
        if (status == null) {
            status = StatusMatricula.EM_ANDAMENTO;
        }
    }
}
