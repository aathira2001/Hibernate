package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Saveperson {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerfactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager= entityManagerfactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	person person = new person();
	person.setName("Diya");
	person.setAge(23);
	person.setPhno(456789123);
	person.setGender("female");
	person.setMstatus("single");
	
	person person2 = new person();
	person2.setName("Athira");
	person2.setAge(22);
	person2.setPhno(916789123);
	person2.setGender("female");
	person2.setMstatus("single");
	
	person person3 = new person();
	person3.setName("Aswathi");
	person3.setAge(20);
	person3.setPhno(922789123);
	person3.setGender("female");
	person3.setMstatus("single");
	
	Adhaarcard adhaarcard=new Adhaarcard();
	adhaarcard.setAid(784561022);
	adhaarcard.setAddress("kochi");
	adhaarcard.setPinno(451263);
	
	
	Adhaarcard adhaarcard2=new Adhaarcard();
	adhaarcard2.setAid(784588122);
	adhaarcard2.setAddress("kottayam");
	adhaarcard2.setPinno(6835263);
	
	Adhaarcard adhaarcard3 =new Adhaarcard();
	adhaarcard3.setAid(784331122);
	adhaarcard3.setAddress("kottayam");
	adhaarcard3.setPinno(686515);
	
	
	person.setCard(adhaarcard);
	person2.setCard(adhaarcard2);
	person3.setCard(adhaarcard3);
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(person2);
	entityManager.persist(person3);
	entityManager.persist(adhaarcard);
	entityManager.persist(adhaarcard2);
	entityManager.persist(adhaarcard3);
	entityTransaction.commit();
}
}