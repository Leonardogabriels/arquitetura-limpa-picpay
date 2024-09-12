package org.br.com.curso.application.usecaseimpl;

import org.br.com.curso.application.gateway.TaxNumberAvailableGateway;
import org.br.com.curso.core.exception.TaxNumberException;
import org.br.com.curso.core.exception.enums.ErrorCodeEnum;
import org.br.com.curso.usecase.TaxNumberAvailableUseCase;

public class TaxNumberAvailableUseCaseImpl implements TaxNumberAvailableUseCase {
	private TaxNumberAvailableGateway taxNumberAvailableGateway;

	public TaxNumberAvailableUseCaseImpl(TaxNumberAvailableGateway taxNumberAvailableGateway) {
		this.taxNumberAvailableGateway = taxNumberAvailableGateway;
	}

	@Override
	public Boolean taxNumberAvaliable(String taxNumber) throws TaxNumberException {

		if (!taxNumberAvailableGateway.taxNumberAvailable(taxNumber)) {
			throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
		}

		return true;
	}
}