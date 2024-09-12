package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.Transaction;

public interface TransferUseCase {
	Boolean transfer(Transaction transaction) throws Exception;

}
