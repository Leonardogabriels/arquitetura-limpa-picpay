package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.User;
import org.br.com.curso.core.exception.EmailException;
import org.br.com.curso.core.exception.TaxNumberException;
import org.br.com.curso.core.exception.TransactionPinException;
import org.br.com.curso.core.exception.InternalServerErrorException;

public interface CreateUserUseCase {
	void create(User user, String pin) throws TaxNumberException, EmailException,
			TransactionPinException, InternalServerErrorException;
}
