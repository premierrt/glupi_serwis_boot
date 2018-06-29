package rest_api_glupi_klient1.rest_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlupiController {

	@RequestMapping(value="/goodbay", method=RequestMethod.GET)
	public ResponseEntity<String> sayGoodbay(){
		return new ResponseEntity<String>("========= " + GlupiController.class.getName() + " says Goodbay ===========", HttpStatus.OK);
	}
}
