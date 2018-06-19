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

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.util.HibernateUtil;

public class CosdabaccontrolobjectDao {
	
	 public void save(Cosdabaccontrolobject cosdabaccontrolobject) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(cosdabaccontrolobject);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
    }
	 
	 
	 public  List<Cosdabaccontrolobject> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabaccontrolobject> cosdabaccontrolobjectlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdabaccontrolobjectlist = session.createQuery("from Cosdabaccontrolgroup").list();
	            for (Iterator iterator = cosdabaccontrolobjectlist.iterator(); iterator.hasNext();) {
	            	Cosdabaccontrolobject cosdabaccontrolobject = (Cosdabaccontrolobject) iterator.next();
	                System.out.println("Transaction ::" + cosdabaccontrolobject.getCosdabactransaction());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdabaccontrolobjectlist ;
	    }
	 
	 
	 
	 public Cosdabaccontrolobject getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabaccontrolobject cosdabaccontrolobject = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabaccontrolobject = (Cosdabaccontrolobject) session.get(Cosdabaccontrolobject.class, new BigDecimal(id));		 
		 	          System.out.println(cosdabaccontrolobject.getCosdabaccontrolgroup()+ " - " + cosdabaccontrolobject.getCosdabactransaction());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return cosdabaccontrolobject ;
	 }
	 
	 public Cosdabaccontrolobject getByGrpId(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabaccontrolobject cosdabaccontrolobject = null ;	      
	      Cosdabaccontrolgroup cosdabaccontrolgroup = null ;
	      List<Cosdabaccontrolobject> cosdabaccontrolobjectlist = null ;
	      
	      try {		 
		 	          session.beginTransaction();		 	 
		 	          // 1. Take cosdabaccontrolgroup
		 	          CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		 	          cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(id);
		 	          
		 	          Query query = session.createQuery("from Cosdabaccontrolobject where  cosdabaccontrolgroup = :cosdabaccontrolgroupId ");
			          query.setParameter("cosdabaccontrolgroupId", cosdabaccontrolgroup);
			          cosdabaccontrolobjectlist = query.list();
			          
			          if(cosdabaccontrolobjectlist.isEmpty())
			        	  return cosdabaccontrolobject ;
			          
			          for (Iterator iterator = cosdabaccontrolobjectlist.iterator(); iterator.hasNext();) {
			        	  cosdabaccontrolobject = (Cosdabaccontrolobject) iterator.next();
			                
			            }
		 	         
			          System.out.println(cosdabaccontrolobject.getCosdabaccontrolgroup()+ " - " + cosdabaccontrolobject.getCosdabactransaction());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	      finally{
	    	  session.close();
	      }
		 	return cosdabaccontrolobject ;
	 }
	 
	 public Cosdabaccontrolobject getByTxnID(long txnid)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabaccontrolobject cosdabaccontrolobject = null ;	      
	      Cosdabactransaction cosdabactransaction = null ;
	      List<Cosdabactransaction> cosdabactransactionlist = null ;
	      
	      try {		  
		 	          session.beginTransaction();		 	 
		 	          // 1. Take cosdabaccontrolgroup
		 	          CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		 	          cosdabactransaction = cosdabactransactiondao.getById(txnid);
		 	          
		 	          Query query = session.createQuery("from Cosdabaccontrolobject where  cosdabactransaction = :txnID ");
			          query.setParameter("txnID", cosdabactransaction);
			          cosdabactransactionlist = query.list();
			          
			          for (Iterator iterator = cosdabactransactionlist.iterator(); iterator.hasNext();) {
			        	  cosdabaccontrolobject = (Cosdabaccontrolobject) iterator.next();
			                
			            }
		 	         
			          //System.out.println(cosdabaccontrolobject.getCosdabaccontrolgroup()+ " - " + cosdabaccontrolobject.getCosdabactransaction());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	      finally{
	    	  session.close();
	      }
		 	return cosdabaccontrolobject ;
	 }
	 
	 public Cosdabaccontrolobject getByTxnID(Cosdabactransaction cosdabactransaction,Cosdabaccontrolgroup controlgrp)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabaccontrolobject cosdabaccontrolobject = null ;	      
	     
	      List<Cosdabactransaction> cosdabactransactionlist = null ;
	      
	      try {		  
		 	          session.beginTransaction();		 	 
		 	          // 1. Take cosdabaccontrolgroup
		 	          
		 	        
		 	          
		 	          Query query = session.createQuery("from Cosdabaccontrolobject where  cosdabactransaction = :txnID and cosdabaccontrolgroup =:grpID and cosdabacconstraint is null");
			          query.setParameter("txnID", cosdabactransaction);
			          query.setParameter("grpID", controlgrp);
			          cosdabactransactionlist = query.list();
			          
			          for (Iterator iterator = cosdabactransactionlist.iterator(); iterator.hasNext();) {
			        	  cosdabaccontrolobject = (Cosdabaccontrolobject) iterator.next();
			                
			            }
		 	         
			          //System.out.println(cosdabaccontrolobject.getCosdabaccontrolgroup()+ " - " + cosdabaccontrolobject.getCosdabactransaction());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	      finally{
	    	  session.close();
	      }
		 	return cosdabaccontrolobject ;
	 }
		 
	 public void delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          Cosdabaccontrolobject cosdabaccontrolobject = (Cosdabaccontrolobject) session.get(Cosdabaccontrolobject.class, new BigDecimal(id));
		 
		 	         session.delete(cosdabaccontrolobject);
		 	          System.out.println(cosdabaccontrolobject.getCosdabaccontrolgroup()+ " - " + cosdabaccontrolobject.getCosdabactransaction());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	 }

	 public void update(Cosdabaccontrolobject cosdabaccontrolobject) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.update(cosdabaccontrolobject);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
  }

}
