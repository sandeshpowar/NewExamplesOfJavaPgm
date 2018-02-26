package com.scp.hibernateotm.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person=new Person(11, "ABC");
        PersonDetails personDetails=new PersonDetails(1, "412565", "2145", 10000);
       
        Configuration configuration=new Configuration();
        configuration.configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
        session.save(person);
     
        /* 1)----No needs to save the persondetails object because of "cascadeType.all"
         * 2)----When we did not use the cascadetype that time personDetails can be also saved 
       */
        session.save(personDetails);
      
     /* */  
        session.getTransaction().commit();
        
        

        
        
     
    }
}
