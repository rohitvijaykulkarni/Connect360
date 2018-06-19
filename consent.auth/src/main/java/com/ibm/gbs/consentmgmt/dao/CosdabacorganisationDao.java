/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdabacorganisation;
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;
import com.ibm.gbs.util.HibernateUtil;

public class CosdabacorganisationDao {
	
	 public void save(Cosdabacorganisation cosdabacorganisation) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	      
	        try {
	              
	        		transaction = session.beginTransaction();	            
	        		session.save(cosdabacorganisation);
	        		transaction.commit();
	        		
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
 }
	 
	
	 public Cosdabacorganisation getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabacorganisation cosdabacorganisation = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          
		 	          cosdabacorganisation = (Cosdabacorganisation) session.get(Cosdabacorganisation.class, new BigDecimal(id));
		              if(cosdabacorganisation != null)		 	         
		              System.out.println( cosdabacorganisation.getOrganisationid() + " - " + cosdabacorganisation.getParentorganisationunitid());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 		finally {
	            session.close();
	        }
		 	return cosdabacorganisation;
	 }
	 
	 
	 public  List<Cosdabacorganisation> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabacorganisation> cosdabacorganisationlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdabacorganisationlist = session.createQuery("from Cosdabacorganisation").list();
	            for (Iterator iterator = cosdabacorganisationlist.iterator(); iterator.hasNext();) {
	            	Cosdabacorganisation cosdabacorganisation = (Cosdabacorganisation) iterator.next();
	                System.out.println("Name " + cosdabacorganisation.getOrganisationid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdabacorganisationlist ;
	    }
	 
	 
	
	 
	 public String delete(long id)
	 {
		 
		 Cosdabacorganisation cosdabacorganisation = null ;
		  
		  
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	   	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabacorganisation = (Cosdabacorganisation) session.get(Cosdabacorganisation.class, new BigDecimal(id));             
		              session.delete(cosdabacorganisation);     
		              System.out.println( " Organisationid -" + cosdabacorganisation.getOrganisationid() + "-Organisationunit-" + cosdabacorganisation.getOrganisationunitid());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 	           return "Error- while delete operation" ;
		 
		 	    }
		 	 finally {
	            session.close();
	        }
		 	return "Record deleted" ;
	 }
	 
	
}
