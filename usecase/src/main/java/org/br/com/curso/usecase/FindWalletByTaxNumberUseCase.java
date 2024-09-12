package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.Wallet;

public interface FindWalletByTaxNumberUseCase {
	Wallet findByTaxNumber(String TaxNumber) throws Exception;
}
