package org.br.com.curso.application.gateway;

import org.br.com.curso.core.domain.Wallet;

public interface FindWalletByTaxNumberGateway {
	Wallet findByTaxNumber(String taxNumber) throws Exception;
}
