package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.FindWalletByTaxNumberGateway;
import org.br.com.curso.core.domain.Wallet;
import org.br.com.curso.core.exception.NotFoundException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.FindWalletByTaxNumberUseCase;

public class FindWalletByTaxNumberUseCaseImpl implements FindWalletByTaxNumberUseCase {
	private FindWalletByTaxNumberGateway findWalletByTaxNumberGateway;

	public FindWalletByTaxNumberUseCaseImpl(FindWalletByTaxNumberGateway findWalletByTaxNumberGateway) {
		this.findWalletByTaxNumberGateway = findWalletByTaxNumberGateway;
	}

	@Override
	public Wallet findByTaxNumber(String taxNumber) throws Exception {
		var wallet =  findWalletByTaxNumberGateway.findByTaxNumber(taxNumber);
		if (wallet == null){
			throw new NotFoundException(ErrorCodeEnum.WA0001.getMessage(), ErrorCodeEnum.WA0001.getCode());
		}
		return wallet;
	}
}