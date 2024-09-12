package org.br.com.curso.application.gateway;

import org.br.com.curso.core.domain.TransactionPin;

public interface TransactionPinValidateGateway {
	boolean validate(TransactionPin transactionPin, String pin);
}
