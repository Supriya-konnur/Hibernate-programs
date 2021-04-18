package com.xworkz.waterfalls;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {

	public static SessionFactory factory;

	public static SessionFactory getfactory() {
		return factory;
	}

	static {
		try {
			System.out.println("invoked");
			Configuration configuration = new Configuration();
			configuration.configure();
			factory = configuration.buildSessionFactory();
			if (factory != null) {
				System.out.println("SFU created successfully");

			} else {
				throw new SessionFactoryCreationException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
