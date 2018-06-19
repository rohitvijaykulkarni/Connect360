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

import com.ibm.gbs.consentmgmt.dto.Cosdproxypersonconsent;
import com.ibm.gbs.util.HibernateUtil;

public class CosdproxypersonconsentDao { 
	
	 public void save(Cosdproxypersonconsent cosdproxypersonconsent) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(cosdproxypersonconsent);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
}
	 
	 
	 public  List<Cosdproxypersonconsent> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdproxypersonconsent> cosdproxypersonconsentlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdproxypersonconsentlist = session.createQuery("from Cosdproxypersonconsent").list();
	            for (Iterator iterator = cosdproxypersonconsentlist.iterator(); iterator.hasNext();) {
	            	Cosdproxypersonconsent cosdproxypersonconsent = (Cosdproxypersonconsent) iterator.next();
	                System.out.println("Transaction ::" + cosdproxypersonconsent.getProxyconsentid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdproxypersonconsentlist ;
	    }
	 
	 
	 
	 public Cosdproxypersonconsent getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdproxypersonconsent cosdproxypersonconsent = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdproxypersonconsent = (Cosdproxypersonconsent) session.get(Cosdproxypersonconsent.class, new BigDecimal(id));		 
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return cosdproxypersonconsent ;
	 }
	 
	
		 
	 public void delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           Cosdproxypersonconsent cosdproxypersonconsent =  (Cosdproxypersonconsent) session.get(Cosdproxypersonconsent.class, new BigDecimal(id));
		 
		 	           session.delete(cosdproxypersonconsent);
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	 }

	 public String update( Cosdproxypersonconsent cosdproxypersonconsent ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdproxypersonconsent old_cosdproxypersonconsent  = null ;
	        CosdproxypersonconsentDao cosdproxypersonconsentdao = new CosdproxypersonconsentDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdproxypersonconsent = cosdproxypersonconsentdao.getById(cosdproxypersonconsent.getProxyconsentid().longValue());
	            
	            if(old_cosdproxypersonconsent == null)
	            return "proxypersonconsent - is not present" ;
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(old_cosdproxypersonconsent);
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
