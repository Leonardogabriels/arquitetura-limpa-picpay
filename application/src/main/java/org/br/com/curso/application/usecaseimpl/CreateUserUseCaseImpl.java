package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.CreateUserGateway;
import org.br.com.curso.core.domain.TransactionPin;
import org.br.com.curso.core.domain.User;
import org.br.com.curso.core.domain.Wallet;
import org.br.com.curso.core.exception.EmailException;
import org.br.com.curso.core.exception.InternalServerErrorException;
import org.br.com.curso.core.exception.TaxNumberException;
import org.br.com.curso.core.exception.TransactionPinException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.CreateUserUseCase;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

	private CreateUserGateway createUserGateway;

	public CreateUserUseCaseImpl(CreateUserGateway createUserGateway) {

		this.createUserGateway = createUserGateway;

	}

	@Override
	public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException {

		if (!createUserGateway.create(user, new Wallet(new TransactionPin(pin), BigDecimal.ZERO, user))) {
			throw new InternalServerErrorException(ErrorCodeEnum.ON0004.getMessage(), ErrorCodeEnum.ON0004.getCode());
		}
	}
}