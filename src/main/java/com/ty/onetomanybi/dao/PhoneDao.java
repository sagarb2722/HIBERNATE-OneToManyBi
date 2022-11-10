package com.ty.onetomanybi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ty.onetomanybi.dto.Phone;
import com.ty.onetomanybi.dto.Sim;

public class PhoneDao {
	public void savePhone(Phone phone){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sagar");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
        entityTransaction.begin();
        entityManager.persist(phone);
     
		for (Sim sim : phone.getSims()) {
			entityManager.persist(sim);
		}
        
        entityTransaction.commit();
	}

}
