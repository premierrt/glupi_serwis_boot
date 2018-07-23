package rest_api_glupi_klient1.rest_service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class GlupiService {

	private static final Log log = LogFactory.getLog(GlupiService.class);
	
	public String sayGoodbay(){
		log.info("Goodbay serwis");
		return "Serwis mowi Goodbay";
	}
	
}
