package org.br.com.curso.usecase;

import org.br.com.curso.core.exception.TaxNumberException;

public interface TaxNumberAvailableUseCase {
	Boolean taxNumberAvaliable(String taxNumber) throws TaxNumberException;
}
