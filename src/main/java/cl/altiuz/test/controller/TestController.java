package cl.altiuz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.altiuz.test.model.MessageResponse;
import cl.altiuz.test.model.RequestEntity;
import cl.altiuz.test.services.ValidatorService;

@RestController
public class TestController {
	@Autowired
	ValidatorService validator;
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<MessageResponse> test(@RequestBody(required = true) RequestEntity requestEntity) {
		MessageResponse responseMessage = new MessageResponse();
		responseMessage.setCode(0);
		
		try {
			validator.validateRequest(requestEntity);
			responseMessage.setMessage(requestEntity.getMessage());
		} catch (Exception e) {
			responseMessage.setCode(1);
			responseMessage.setMessage(e.getMessage());
		}
				
		return new ResponseEntity<MessageResponse>(responseMessage, HttpStatus.OK);
	}
}
