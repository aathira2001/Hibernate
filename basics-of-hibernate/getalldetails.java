package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getalldetails {
public static void main(String[] args) {
	EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entitymanager= entitymanagerfactory.createEntityManager();
	EntityTransaction entityTransaction= entitymanager.getTransaction();
	
	Query query=entitymanager.createQuery("select s from Customer s");
	List<Customer> customers= query.getResultList();
	
	for(Customer customer : customers) {
		System.out.println("the emp id is:"+customer.getId());
		System.out.println("the emp name is:"+customer.getName());
		System.out.println("the emp age is:"+customer.getAge());
		System.out.println("the emp place is:"+customer.getPlace());
		System.out.println("the emp gender is:"+customer.getGender());
		System.out.println("the emp noofyear is:"+customer.getNoofyear());
		System.out.println("the emp discount is:"+customer.getDiscount());
	}
	
}
}
