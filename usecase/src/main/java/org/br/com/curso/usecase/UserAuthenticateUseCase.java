package org.br.com.curso.usecase;

import org.br.com.curso.core.exception.AuthenticateException;

public interface UserAuthenticateUseCase {
	Boolean authenticate(String username, String password) throws AuthenticateException;

}
