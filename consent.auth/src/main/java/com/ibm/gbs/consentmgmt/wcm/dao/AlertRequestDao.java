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

import com.ibm.gbs.consentmgmt.wcm.dto.AlertRequest;
import com.ibm.gbs.util.HibernateUtil;

import com.ibm.gbs.util.Constant;

public class AlertRequestDao  {
	
	 public AlertRequest save(AlertRequest AlertRequest) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(AlertRequest);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	            return AlertRequest ;
	        }
  }
	
	 public  List<AlertRequest> getlist() {
		 
		 	System.out.println(" ");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<AlertRequest> cosdpersonconsentlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdpersonconsentlist = session.createQuery("from AlertRequest ").list();
	            for (Iterator iterator = cosdpersonconsentlist.iterator(); iterator.hasNext();) {
	            	AlertRequest cosdpersonconsent = (AlertRequest) iterator.next();
	                
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
	
	 public AlertRequest getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      AlertRequest AlertRequest = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          AlertRequest = (AlertRequest) session.get(AlertRequest.class, new BigDecimal(id));		 
		 	          	 
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
		 	return AlertRequest ;
	 }
	 
	
		 
	 public String delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	     // Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           AlertRequest AlertRequest =  (AlertRequest) session.get(AlertRequest.class, new BigDecimal(id));
		 
		 	           session.delete(AlertRequest);
		 	          	 
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

	 public String update( AlertRequest AlertRequest ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        AlertRequest old_AlertRequest  = null ;
	        AlertRequestDao AlertRequestdao = new AlertRequestDao();
	        
	        try {
	              
	            transaction = session.beginTransaction(); 
	            
	            //old_AlertRequest = AlertRequestdao.getById(AlertRequest.getPersonconsentid().longValue());	            
	            //if(old_AlertRequest == null)
	            //return "Consent Person - is not present" ;	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            
	            session.update(AlertRequest);
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
 * CREATE TABLE ALERT_request (
    alertreqReqtID number(25,2)  NOT NULL,
    cohortID number(25,2)  NOT NULL,
    ruleID number(19,2)  NOT NULL,
    reasoncode varchar2(40)  NOT NULL,
    createdDate date  NOT NULL,
    createdByUser varchar2(40)  NOT NULL,
    sourceSys varchar2(40)  NOT NULL,
    sourceSysID varchar2(40)  NOT NULL,
    fName varchar2(30)  NOT NULL,
    lName varchar2(40)  NOT NULL,
    status varchar2(40)  NOT NULL,
    comments varchar2(100)  NOT NULL,
    CONSTRAINT ALERT_request_pk PRIMARY KEY (alertreqReqtID)
) ; */
