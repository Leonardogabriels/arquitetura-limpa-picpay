package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.usecase.ConsultBalanceUseCase;
import org.br.com.curso.usecase.FindWalletByTaxNumberUseCase;

import java.math.BigDecimal;

public class ConsultBalanceUseCaseImpl implements ConsultBalanceUseCase {
	final private FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase;

	public ConsultBalanceUseCaseImpl(FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase) {
		this.findWalletByTaxNumberUseCase = findWalletByTaxNumberUseCase;
	}

	@Override
	public BigDecimal consult(String taxNumber) throws Exception {
		return findWalletByTaxNumberUseCase.findByTaxNumber(taxNumber).getBalance();
	}
}
