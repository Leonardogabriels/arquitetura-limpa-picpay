package org.br.com.curso.application.gateway;

import org.br.com.curso.core.domain.User;
import org.br.com.curso.core.domain.Wallet;

public interface CreateUserGateway {
	Boolean create(User user, Wallet wallet);
}
