package rest_api_glupi_klient1.rest_service;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class MadryController {

	@Value("${message}")
	private String messageFromConfig;
	
	@RequestMapping(value="/eloConfig", method=RequestMethod.GET)
	public ResponseEntity<String> sayGodbayFromConfig(){
		
		return new ResponseEntity<String> (messageFromConfig, HttpStatus.OK);
	}
}
