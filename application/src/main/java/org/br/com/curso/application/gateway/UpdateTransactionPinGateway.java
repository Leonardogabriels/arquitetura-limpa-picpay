package org.br.com.curso.application.gateway;

import org.br.com.curso.core.domain.TransactionPin;

public interface UpdateTransactionPinGateway {
	TransactionPin update(TransactionPin transactionPin);
}
