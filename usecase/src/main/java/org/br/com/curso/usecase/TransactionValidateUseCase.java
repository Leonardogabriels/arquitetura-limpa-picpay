package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.Transaction;
import org.br.com.curso.core.exception.TransferException;

public interface TransactionValidateUseCase {
	Boolean validate(Transaction transaction) throws TransferException;

}
