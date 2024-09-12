package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.TransactionPin;
import org.br.com.curso.core.exception.BadRequestException;
import org.br.com.curso.core.exception.PinException;
import org.br.com.curso.core.exception.TransferException;

public interface TransactionPinValidateUseCase {
	Boolean validate(TransactionPin transactionPin, String pin) throws TransferException, PinException, BadRequestException;
}
