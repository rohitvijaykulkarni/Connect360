package com.ibm.gbs.consentmgmt.wcm.dao ;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.wcm.dto.Target;
import com.ibm.gbs.util.Constant;
import com.ibm.gbs.util.HibernateUtil;

public class ApiHistDao  {

	 public Target save(Target target) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(target);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	            return target ;
	        }
  }
	
	 public  List<Target> getlist() {
		 
		 	System.out.println(" ");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Target> cosdpersonconsentlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdpersonconsentlist = session.createQuery("from Cosdpersonconsent where histroyRecord = 'NO' ").list();
	            for (Iterator iterator = cosdpersonconsentlist.iterator(); iterator.hasNext();) {
	            	Target cosdpersonconsent = (Target) iterator.next();
	                
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdpersonconsentlist ;
	    }
	
	 public Target getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Target Target = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          Target = (Target) session.get(Target.class, new BigDecimal(id));		 
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	      finally
	      {
	    	  session.close();
	      }
		 	return Target ;
	 }
	 
	
		 
	 public String delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	     // Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           Target Target =  (Target) session.get(Target.class, new BigDecimal(id));
		 
		 	           session.delete(Target);
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 	           return "Error - in deletion" ;
		 
		 	    }
		 	finally
		 	{
		 		session.close();
		 	}
		 	
		 	return "deleted" ;
	 }

	 public String update( Target Target ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Target old_Target  = null ;
	        TargetDao Targetdao = new TargetDao();
	        
	        try {
	              
	            transaction = session.beginTransaction(); 
	            
	            //old_Target = Targetdao.getById(Target.getPersonconsentid().longValue());	            
	            //if(old_Target == null)
	            //return "Consent Person - is not present" ;	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            
	            session.update(Target);
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

/*
 
-- Table: API_HIST
CREATE TABLE API_HIST (
    targetID number(19,2)  NOT NULL,
    sendDate date  NOT NULL,
    sendStatus varchar2(40)  NOT NULL,
    targetTransID number(20,2)  NOT NULL
) ; */
