package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.Transaction;

public interface UserNotificationUseCase {
	Boolean notificate(Transaction transaction, String email);

}
