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
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.util.HibernateUtil;

public class CosdabacconstraintDao {
		
	
	public void save(long grpId ,long txnid ,Cosdabacconstraint cosdabacconstraint) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(cosdabacconstraint);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	       // updateControlObject(grpId ,cosdabacconstraint);
	        
	        Cosdabactransaction cosdabactransaction = null ;
	        CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
	        cosdabactransaction = cosdabactransactiondao.getById(txnid);
	          
	         Cosdabaccontrolgroup controlgrp = null ;
	         CosdabaccontrolgroupDao controlgrpdao = new CosdabaccontrolgroupDao();
	         controlgrp = controlgrpdao.getById(grpId);
	        
	         CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao() ; 
	         Cosdabaccontrolobject cosdabaccontrolobject = cosdabaccontrolobjectdao.getByTxnID(cosdabactransaction, controlgrp);
	         
	        if(cosdabaccontrolobject != null && cosdabaccontrolobject.getCosdabacconstraint() == null)
	        {
	        	cosdabaccontrolobject.setCosdabacconstraint(cosdabacconstraint);
	        	 cosdabaccontrolobjectdao.update(cosdabaccontrolobject);
	        }
	        else
	        {
	        	cosdabaccontrolobject = new Cosdabaccontrolobject();
	        	cosdabaccontrolobject.setCosdabaccontrolgroup(controlgrp);
	        	cosdabaccontrolobject.setCosdabactransaction(cosdabactransaction);
	        	cosdabaccontrolobject.setCosdabacconstraint(cosdabacconstraint);
	        	cosdabaccontrolobjectdao.save(cosdabaccontrolobject);
	        }
    }
	 
	 
	 public  List<Cosdabacconstraint> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabacconstraint> cosdabacconstraintList = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdabacconstraintList = session.createQuery("from Cosdabacconstraint").list();
	            for (Iterator iterator = cosdabacconstraintList.iterator(); iterator.hasNext();) {
	            	Cosdabacconstraint cosdabacconstraint = (Cosdabacconstraint) iterator.next();
	                System.out.println("Name " + cosdabacconstraint.getAttributename());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdabacconstraintList ;
	    }
	 
	 
	 
	 public Cosdabacconstraint getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabacconstraint cosdabacconstraint = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabacconstraint = (Cosdabacconstraint) session.get(Cosdabacconstraint.class, new BigDecimal(id));
		 
		 	          System.out.println(cosdabacconstraint.getAttributename() + " - " + cosdabacconstraint.getAttributevalue());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	finally {
	            session.close();
	        }
		 	
		 	return cosdabacconstraint;
	 }
	 
	

	 public String delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabacconstraint cosdabacconstraint = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabacconstraint = (Cosdabacconstraint) session.get(Cosdabacconstraint.class, new BigDecimal(id));
		 	          
		 	          Query query = session.createQuery("update Cosdabaccontrolobject set cosdabacconstraint = :NewValue" +
								" where cosdabacconstraint = :oldValue");
		 	          query.setParameter("NewValue", null);
		 	          query.setParameter("oldValue", cosdabacconstraint);
		 	          int result = query.executeUpdate();
		 	          
		 	          session.delete(cosdabacconstraint);
		 	          System.out.println(cosdabacconstraint.getAttributename() + " - " + cosdabacconstraint.getAttributevalue());	 
		 	          session.getTransaction().commit();
		 	          
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
	 
	 public String deleteFromControlGroup(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabacconstraint cosdabacconstraint = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabacconstraint = (Cosdabacconstraint) session.get(Cosdabacconstraint.class, new BigDecimal(id));
		 	          
		 	         /* Query query = session.createQuery("update Cosdabaccontrolobject set cosdabacconstraint = :NewValue" +
								" where cosdabacconstraint = :oldValue");
		 	          query.setParameter("NewValue", null);
		 	          query.setParameter("oldValue", cosdabacconstraint);
		 	          int result = query.executeUpdate();*/
		 	          
		 	          session.delete(cosdabacconstraint);
		 	          System.out.println(cosdabacconstraint.getAttributename() + " - " + cosdabacconstraint.getAttributevalue());	 
		 	          session.getTransaction().commit();
		 	          
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
	 
	 
	     /**
		 * @param grpID
		 * @param cosdabactransaction
		 */
	  public String update( Cosdabacconstraint cosdabacconstraint) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdabacconstraint old_cosdabacconstraint = null ;
	        CosdabacconstraintDao cosdabacconstraintdao = new CosdabacconstraintDao();
	        try {
	              
	            transaction = session.beginTransaction();	            
	            old_cosdabacconstraint = cosdabacconstraintdao.getById(cosdabacconstraint.getAttributeconstraintid().longValue());
	            
	            if(old_cosdabacconstraint == null)
	            return "constraint is not present" ;
	            
	            //old_cosdabacconstraint.setAttributename(cosdabacconstraint.getAttributename());
	            session.update(cosdabacconstraint);
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
