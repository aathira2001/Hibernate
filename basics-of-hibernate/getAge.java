package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getAge {
public static void main(String[] args) {
	EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entitymanager= entitymanagerfactory.createEntityManager();
	EntityTransaction entityTransaction= entitymanager.getTransaction();
	
	Query query=entitymanager.createQuery("select s from Customer s where s.age>?1 or s.gender=?2");
	query.setParameter(1, 25);
	query.setParameter(2, "Female");
	List<Customer> customers= query.getResultList();

	for(Customer customer : customers) {
		System.out.println("the cust id is:" +customer.getId());
		System.out.println("the cust name is:" +customer.getName());
		System.out.println("the cust age is:" +customer.getAge());
		System.out.println("the cust place is:" +customer.getPlace());
		System.out.println("the cust gender is:" +customer.getGender());
		System.out.println("the cust noofyear is:" +customer.getNoofyear());
		System.out.println("the cust discount is:" +customer.getDiscount());
	}
}
}
