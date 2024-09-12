package org.br.com.curso.application.gateway;

import org.br.com.curso.core.domain.Transaction;

public interface TransferGateway {
	Boolean transfer(Transaction transaction);
}
