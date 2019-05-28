package br.com.projetooficina.repository;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.projetooficina.Utils.EntityManagerUtils;
import br.com.projetooficina.model.Colaborador;


public class ColaboradorRepository implements Serializable {
	
	private static final long serialVersionUID = -1322883546610174996L;


	
	EntityManager entityManager;
	
	public void novoRegistro(Colaborador colaboradorModel) {
		entityManager = EntityManagerUtils.getEntityManager();
		System.out.println("chamou repo.save2");
		EntityTransaction trs = entityManager.getTransaction();
		trs.begin();
		entityManager.persist(colaboradorModel);
		trs.commit();		
	}

}
