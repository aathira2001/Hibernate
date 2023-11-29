package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCustomer {
public static void main(String[] args) {
	EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entitymanager= entitymanagerfactory.createEntityManager();
	EntityTransaction entityTransaction= entitymanager.getTransaction();
	
	Customer customer= entitymanager.find(Customer.class,4);
	if(customer!=null) {
		entityTransaction.begin();
		entitymanager.remove(customer);
		entityTransaction.commit();
	}
	else
		System.out.println("data already cleared");
}
}
