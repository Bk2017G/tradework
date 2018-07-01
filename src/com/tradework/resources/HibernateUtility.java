/**
 * 
 */
package com.tradework.resources;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author Super
 *
 */
public class HibernateUtility {
	
	private static final String CONFIGURATION_LOCATION = "com/tradework/resources/hibernate.cfg.xml";
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = getSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static SessionFactory getSessionFactory() throws Exception{
		try {
			if (sessionFactory==null) {

				// Step1 : Loading the configuration details from hibernate.cfg.xml
				Configuration configuration = new Configuration().configure(CONFIGURATION_LOCATION);

				// Step2 : Creating ServiceRegistry using the StandardServiceRegistryBuilder and Configuration defined in Step1

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

				// Step3 : Creating the SessionFactory using the Configuration and serviceRegistry
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
		} catch (Exception e) {
			e.printStackTrace();
			DOMConfigurator.configure("src/com/tradework/resources/log4j.xml");
			Logger logger=Logger.getLogger(HibernateUtility.class);
			logger.debug(e.getMessage(),e);
			throw e;
		}
		return sessionFactory;
	}

	public static SessionFactory createSessionFactory() throws Exception {
		return getSessionFactory();
	}

	public static void closeSessionFactory() {
		if(!sessionFactory.isClosed()){
			sessionFactory.close();
		}
	}
}
