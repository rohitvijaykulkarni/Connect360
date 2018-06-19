/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgrouptxn;
import com.ibm.gbs.util.HibernateUtil;

public class CosdconsentgrouptxnDao {
	
	
	 public void save(Cosdconsentgrouptxn cosdconsentgrouptxn) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(cosdconsentgrouptxn);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
 }
	 
	 
	 public  List<Cosdconsentgrouptxn> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdconsentgrouptxn> cosdconsentgrouptxnlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdconsentgrouptxnlist = session.createQuery("from Cosdconsentgrouptxn").list();
	            for (Iterator iterator = cosdconsentgrouptxnlist.iterator(); iterator.hasNext();) {
	            	Cosdconsentgrouptxn cosdconsentgrouptxn = (Cosdconsentgrouptxn) iterator.next();
	                System.out.println("Transaction ::" + cosdconsentgrouptxn.getConsentgrouptxnid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdconsentgrouptxnlist ;
	    }
	 
	 
	 
	 public Cosdconsentgrouptxn getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdconsentgrouptxn cosdconsentgrouptxn = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdconsentgrouptxn = (Cosdconsentgrouptxn) session.get(Cosdconsentgrouptxn.class, new BigDecimal(id));		 
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return cosdconsentgrouptxn ;
	 }
	 
	
		 
	 public void delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           Cosdconsentgrouptxn cosdconsentgrouptxn =  (Cosdconsentgrouptxn) session.get(Cosdconsentgrouptxn.class, new BigDecimal(id));
		 
		 	           session.delete(cosdconsentgrouptxn);
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	 }
	 
	 public String deleteBytxnID(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabactransaction cosdabactransaction = null ;
	      
		 	try {		 
		 	         session.beginTransaction();		 	             
		 	         cosdabactransaction = (Cosdabactransaction) session.get(Cosdabactransaction.class, new BigDecimal(id));
		 	          
		 	          Query query = session.createQuery("Delete Cosdconsentgrouptxn conttxn where  conttxn.cosdabactransaction = :NewValue" );
		 	          query.setParameter("NewValue", cosdabactransaction);
		 	         
		 	          int result = query.executeUpdate();
		 	          
		 	          session.getTransaction().commit();
		 	          System.out.println("Record Deleted ..");
		 	          
		 	         return "Record deleted" ;
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 	           return "Error- while delete operation" ;
		 
		 	    }
		 	finally
		 	{
		 		session.close();	
		 	}
	 }

	 public String update( Cosdconsentgrouptxn cosdconsentgrouptxn ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdconsentgrouptxn old_cosdconsentgrouptxn  = null ;
	        CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdconsentgrouptxn = cosdconsentgrouptxndao.getById(cosdconsentgrouptxn.getConsentgrouptxnid().longValue());
	            
	            if(old_cosdconsentgrouptxn == null)
	            return "Consent Group - is not present" ;
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(old_cosdconsentgrouptxn);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return "Updated" ;
}

}
