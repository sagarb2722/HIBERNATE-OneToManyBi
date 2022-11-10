package com.ty.onetomanybi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi.dto.Phone;
import com.ty.onetomanybi.dto.Sim;

public class SimDao {
public void saveSim (Sim sim){
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Phone phone=sim.getPhone();
	
	entityTransaction.begin();
	entityManager.persist(sim);
	entityManager.persist(phone);
	entityTransaction.commit();
}
}