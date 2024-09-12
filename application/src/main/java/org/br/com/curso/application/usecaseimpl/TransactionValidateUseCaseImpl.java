package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.TransactionValidateGateway;
import org.br.com.curso.core.domain.Transaction;
import org.br.com.curso.core.exception.TransferException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.TransactionValidateUseCase;

public class TransactionValidateUseCaseImpl implements TransactionValidateUseCase {
	private TransactionValidateGateway transactionValidateGateway;

	public TransactionValidateUseCaseImpl(TransactionValidateGateway transactionValidateGateway) {
		this.transactionValidateGateway = transactionValidateGateway;
	}

	@Override
	public Boolean validate(Transaction transaction) throws TransferException {
		if (!transactionValidateGateway.validate(transaction)){
			throw new TransferException(ErrorCodeEnum.TR0004.getMessage(), ErrorCodeEnum.TR0004.getCode());
		}
		return true;
	}
}