package org.br.com.curso.application.gateway;

import org.br.com.curso.core.domain.Transaction;

public interface TransactionValidateGateway {
	Boolean validate(Transaction transaction);
}
