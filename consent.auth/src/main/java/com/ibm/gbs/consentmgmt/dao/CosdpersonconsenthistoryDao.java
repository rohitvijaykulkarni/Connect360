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

import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsenthistory;
import com.ibm.gbs.util.HibernateUtil;

public class CosdpersonconsenthistoryDao { 

	
	 public void save(Cosdpersonconsenthistory cosdpersonconsenthistory) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(cosdpersonconsenthistory);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
}
	 
	 
	 public  List<Cosdpersonconsenthistory> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdpersonconsenthistory> cosdpersonconsenthistorylist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdpersonconsenthistorylist = session.createQuery("from Cosdpersonconsenthistory").list();
	            for (Iterator iterator = cosdpersonconsenthistorylist.iterator(); iterator.hasNext();) {
	            	Cosdpersonconsenthistory cosdpersonconsenthistory = (Cosdpersonconsenthistory) iterator.next();
	                System.out.println("Transaction ::" + cosdpersonconsenthistory.getConsenthistoryid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdpersonconsenthistorylist ;
	    }
	 
	 
	 
	 public Cosdpersonconsenthistory getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdpersonconsenthistory cosdpersonconsenthistory = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdpersonconsenthistory = (Cosdpersonconsenthistory) session.get(Cosdpersonconsenthistory.class, new BigDecimal(id));		 
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return cosdpersonconsenthistory ;
	 }
	 
	
		 
	 public void delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           Cosdpersonconsenthistory cosdpersonconsenthistory =  (Cosdpersonconsenthistory) session.get(Cosdpersonconsenthistory.class, new BigDecimal(id));
		 
		 	           session.delete(cosdpersonconsenthistory);
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	 }

	 public String update( Cosdpersonconsenthistory cosdpersonconsenthistory ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdpersonconsenthistory old_cosdpersonconsenthistory  = null ;
	        CosdpersonconsenthistoryDao cosdpersonconsenthistorydao = new CosdpersonconsenthistoryDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdpersonconsenthistory = cosdpersonconsenthistorydao.getById(cosdpersonconsenthistory.getConsenthistoryid().longValue());
	            
	            if(old_cosdpersonconsenthistory == null)
	            return "Consent Group - is not present" ;
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(old_cosdpersonconsenthistory);
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
