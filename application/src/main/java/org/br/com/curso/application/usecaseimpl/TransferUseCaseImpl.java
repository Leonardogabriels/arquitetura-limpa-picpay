package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.TransferGateway;
import org.br.com.curso.core.domain.Transaction;
import org.br.com.curso.core.exception.InternalServerErrorException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.TransferUseCase;

public class TransferUseCaseImpl implements TransferUseCase {

	final private TransferGateway transferGateway;
	public TransferUseCaseImpl(TransferGateway transferGateway) {
		this.transferGateway = transferGateway;
	}


	@Override
	public Boolean transfer(Transaction transaction) throws Exception {
		transaction.getFromWallet().transfer(transaction.getValue());
		transaction.getToWallet().receiveTransfer(transaction.getValue());
		if (!transferGateway.transfer(transaction)){
			throw new InternalServerErrorException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
		}
		return true;
	}
}