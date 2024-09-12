package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.CreateTransactionGateway;
import org.br.com.curso.core.domain.Transaction;
import org.br.com.curso.core.domain.Wallet;
import org.br.com.curso.core.exception.TransferException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.CreateTransactionUseCase;

import java.math.BigDecimal;

public class CreateTransactionUseCaseImpl implements CreateTransactionUseCase {
	final private CreateTransactionGateway createTransactionGateway;

	public CreateTransactionUseCaseImpl(CreateTransactionGateway createTransactionGateway) {
		this.createTransactionGateway = createTransactionGateway;
	}

	@Override
	public Transaction create(Wallet to, Wallet from, BigDecimal value) throws Exception {
		var transaction = new Transaction(to, from, value);
		var transactionSaved = createTransactionGateway.create(transaction);

		if (transactionSaved == null){
			throw new TransferException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
		}

		return  transactionSaved;
	}
}
