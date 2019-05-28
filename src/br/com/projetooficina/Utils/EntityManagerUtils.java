package br.com.projetooficina.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {
	
private static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	private static void init() {
//		try {
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("default");
			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
