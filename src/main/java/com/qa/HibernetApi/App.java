package com.qa.HibernetApi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	// hey jpa please give me members object with id 2
    	
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bismillah");
    	
    	// Entity manager is an interface. 
    	
    	EntityManager em=emf.createEntityManager();
   
    	Members mbs=em.find(Members.class, 2);
    	
    	
    	System.out.println(mbs);
    
    	
    	Members mb = new Members();
    	
    	mb.setId(7);
    	mb.setActive(8);
    	mb.setAddress("Dhaka");
    	mb.setContact("09876542323");
    	mb.setName("Ma");
    	
    	em.getTransaction().begin();
    	em.persist(mb);
    	em.getTransaction().commit();
   
    	
    
    }
}
