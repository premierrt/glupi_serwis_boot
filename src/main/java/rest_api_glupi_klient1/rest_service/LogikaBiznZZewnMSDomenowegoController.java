package rest_api_glupi_klient1.rest_service;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * uzyc feingClienta
 *
 */
@RestController
public class LogikaBiznZZewnMSDomenowegoController {

	private static final Log log= LogFactory.getLog(LogikaBiznZZewnMSDomenowegoController.class);
	
	@RequestMapping(value="/domainLogic", method=RequestMethod.GET)
	public String callexternalDomainMS() throws URISyntaxException{
		log.info(LogikaBiznZZewnMSDomenowegoController.class.getName() +  " wywolywanie logiki biz");
		RestTemplate rt = new RestTemplate();
		URI uri = new URI("http://localhost:8091/logic/");
		//!!! przeniesc do konfiguracji
		return rt.getForObject(uri, String.class);
	}
}
