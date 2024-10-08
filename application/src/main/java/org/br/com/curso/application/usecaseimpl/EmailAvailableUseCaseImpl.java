package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.EmailAvailableGateway;
import org.br.com.curso.core.exception.EmailException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.EmailAvailableUseCase;

public class EmailAvailableUseCaseImpl implements EmailAvailableUseCase {
	private EmailAvailableGateway emailAvailableGateway;

	public EmailAvailableUseCaseImpl(EmailAvailableGateway emailAvailableGateway) {
		this.emailAvailableGateway = emailAvailableGateway;
	}

	@Override
	public Boolean emailAvailableEmail(String email) throws EmailException {
		if (!emailAvailableGateway.emailAvailable(email)) {
			throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
		}

		return true;
	}
}
