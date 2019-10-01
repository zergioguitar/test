package cl.altiuz.test.services;

import org.springframework.stereotype.Service;

import cl.altiuz.test.model.RequestEntity;

@Service
public class ValidatorService {

	public void validateRequest(RequestEntity requestEntity) throws Exception {
		if(requestEntity==null) {
			throw new Exception("se requiere un body json válido en el request");
		}
		if(requestEntity.getMessage()==null || requestEntity.getMessage().trim().isEmpty())
		{
			throw new Exception("se requiere el parámetro message no puede ser nulo o vacío");
		}
		
	}
}
