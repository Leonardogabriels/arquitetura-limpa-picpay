package org.br.com.curso.usecase;

import java.math.BigDecimal;

public interface ConsultBalanceUseCase {
	BigDecimal consult(String taxNumber) throws Exception;

}
