package org.br.com.curso.usecase;

import org.br.com.curso.core.exception.EmailException;

public interface EmailAvailableUseCase {
	Boolean emailAvailableEmail(String email) throws EmailException;
}
