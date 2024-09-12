package org.br.com.curso.usecase;

import org.br.com.curso.core.domain.Transaction;
import org.br.com.curso.core.domain.Wallet;

import java.math.BigDecimal;

public interface CreateTransactionUseCase {
	Transaction create(Wallet to, Wallet from, BigDecimal value) throws Exception;
}
