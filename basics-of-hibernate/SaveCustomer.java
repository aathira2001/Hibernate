package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCustomer {
    public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entitymanager= entitymanagerfactory.createEntityManager();
		EntityTransaction entityTransaction= entitymanager.getTransaction();
		
		Customer customer = new Customer();
		customer.setName("Akashu");
		customer.setAge(26);
		customer.setPlace("Mumbai");
		customer.setPhno(92212332535l);
		customer.setGender("Male");
		customer.setNoofyear(8);
		customer.setDiscount(30);
		
		entityTransaction.begin();
		entitymanager.persist(customer);
		entityTransaction.commit();
	}
}
