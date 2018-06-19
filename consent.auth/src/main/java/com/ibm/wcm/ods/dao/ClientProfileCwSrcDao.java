package com.ibm.wcm.ods.dao ;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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


import com.ibm.gbs.util.Constant;
import com.ibm.gbs.util.HibernateUtil;

import com.ibm.gbs.wcm.vo.CohortVO;
import com.ibm.wcm.ods.dto.ClientProfileCwSrc;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ClientProfileCwSrcDao {
	

	
	
	
	 public ClientProfileCwSrc save(ClientProfileCwSrc ClientProfileCwSrc) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(ClientProfileCwSrc);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	            return ClientProfileCwSrc ;
	        }
     }
	
	 public  List<ClientProfileCwSrc> getlist() {
		 
		 	System.out.println(" ");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<ClientProfileCwSrc> cosdpersonconsentlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdpersonconsentlist = session.createQuery("from ClientProfileCwSrc ").list();
	            for (Iterator iterator = cosdpersonconsentlist.iterator(); iterator.hasNext();) {
	            	ClientProfileCwSrc cosdpersonconsent = (ClientProfileCwSrc) iterator.next();
	                
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
	
	 public ClientProfileCwSrc getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      ClientProfileCwSrc ClientProfileCwSrc = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          ClientProfileCwSrc = (ClientProfileCwSrc) session.get(ClientProfileCwSrc.class, new BigDecimal(id));		 
		 	          	 
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
		 	return ClientProfileCwSrc ;
	 }
	 
	
		 
	 public String delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	     // Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           ClientProfileCwSrc ClientProfileCwSrc =  (ClientProfileCwSrc) session.get(ClientProfileCwSrc.class, new BigDecimal(id));
		 
		 	           session.delete(ClientProfileCwSrc);
		 	          	 
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

	 public String update( ClientProfileCwSrc ClientProfileCwSrc ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        ClientProfileCwSrc old_ClientProfileCwSrc  = null ;
	        ClientProfileCwSrcDao ClientProfileCwSrcdao = new ClientProfileCwSrcDao();
	        
	        try {
	              
	            transaction = session.beginTransaction(); 
	            
	            //old_ClientProfileCwSrc = ClientProfileCwSrcdao.getById(ClientProfileCwSrc.getPersonconsentid().longValue());	            
	            //if(old_ClientProfileCwSrc == null)
	            //return "Consent Person - is not present" ;	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            
	            session.update(ClientProfileCwSrc);
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

/*CREATE TABLE ClientProfileCwSrc (
	    ClientProfileCwSrcedID varchar2(30)  NOT NULL,
	    ClientProfileCwSrcDescription varchar2(100)  NOT NULL,
	    CONSTRAINT ClientProfileCwSrc_pk PRIMARY KEY (ClientProfileCwSrcedID)
	) ; */
