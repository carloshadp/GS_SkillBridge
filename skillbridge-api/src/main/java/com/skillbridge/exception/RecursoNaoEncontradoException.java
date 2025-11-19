package com.skillbridge.exception;

public class RecursoNaoEncontradoException extends RuntimeException {

    public RecursoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public RecursoNaoEncontradoException(String nomeRecurso, Long id) {
        super(String.format("%s com ID %d não encontrado(a)", nomeRecurso, id));
    }
}
