package rest_api_glupi_klient1.rest_service;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
	
	   @Autowired
	    private RestTemplate restTemplate;
	   /**
	    * Bardzo ważne jest oznaczenie RestTemplate jako @Bean ponieważ wtedy dodawany jest do niego interceptor odpowiedzialny za rozproszone logowanie,
	    *  bez tego, nie otrzymamy pożądanego efektu. 
	    * @return
	    */
	  @Bean
	    public RestTemplate getRestTemplate() {
	        return new RestTemplate();
	    }
	
	@RequestMapping(value="/domainLogic", method=RequestMethod.GET)
	public String callexternalDomainMS() throws URISyntaxException{
		log.info(LogikaBiznZZewnMSDomenowegoController.class.getName() +  " wywolywanie logiki biz");
		URI uri = new URI("http://localhost:8091/logic/");
		//!!! przeniesc do konfiguracji
		return restTemplate.getForObject(uri, String.class);
	}
}
