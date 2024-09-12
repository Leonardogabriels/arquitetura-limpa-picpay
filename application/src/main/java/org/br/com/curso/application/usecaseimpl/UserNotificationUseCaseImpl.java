package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.UserNotificationGateway;
import org.br.com.curso.core.domain.Transaction;
import org.br.com.curso.usecase.UserNotificationUseCase;

public class UserNotificationUseCaseImpl implements UserNotificationUseCase {

	private UserNotificationGateway userNotificationGateway;

	public UserNotificationUseCaseImpl(UserNotificationGateway userNotificationGateway) {
		this.userNotificationGateway = userNotificationGateway;
	}

	@Override
	public Boolean notificate(Transaction transaction, String email) {
		return userNotificationGateway.notificate(transaction, email);
	}
}
