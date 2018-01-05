/**
 * 
 */
package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Simon SUDRE
 *
 * class AppService
 */
public class AppService {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

	
	/**
	 * execution log debug
	 * @param param parametre a afficher
	 */
	public void executer(String param) {
		LOG.debug("Traitement 1 : param = {}", param);
	}
}
