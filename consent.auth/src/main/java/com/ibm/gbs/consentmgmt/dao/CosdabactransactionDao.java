/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgrouptxn;
import com.ibm.gbs.util.HibernateUtil;

public class CosdabactransactionDao {
	
	
	
	 public  String getlistByTxnName(String txnName ,long grpid) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabactransaction> Cosdabactransactionlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            // ("select from Customer c.customerId left join Policy p.policyId  on c.customerId=p.policyId").list(); 
	            SQLQuery query = session.createSQLQuery("select txn.TRANSACTIONID from Cosdabactransaction txn ,Cosdconsentgrouptxn contxn where txn.TRANSACTIONID = contxn.TRANSACTIONID and contxn.CONSENTGROUPID = "+ grpid + " and txn.TRANSACTIONNAME = '"+ txnName +"'");
	           
	            if(query.list().isEmpty())
	            {
	            	System.out.println("...");
	            	return "empty";
	            }
	            else
	            {
	            	return "duplicate";
	            }
	            
	             
	           
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	        	 transaction.commit();
	            session.close();
	        }
	        
	        return "empty";
	    }
	 
	 public  String getlistByTxnName(String txnName ) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabactransaction> Cosdabactransactionlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            // ("select from Customer c.customerId left join Policy p.policyId  on c.customerId=p.policyId").list(); 
	            SQLQuery query = session.createSQLQuery("select txn.TRANSACTIONID from Cosdabactransaction txn  where   txn.TRANSACTIONNAME = '"+ txnName +"'");
	           
	            if(query.list().isEmpty())
	            {
	            	System.out.println("...");
	            	return "empty";
	            }
	            else
	            {
	            	return "duplicate";
	            }
	            
	             
	           
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	        	 transaction.commit();
	            session.close();
	        }
	        
	        return "empty";
	    }
	 
	 public  String getlistByTxnConsentID(long txnid ) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabactransaction> Cosdabactransactionlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            // ("select from Customer c.customerId left join Policy p.policyId  on c.customerId=p.policyId").list(); 
	            SQLQuery query = session.createSQLQuery("select TRANSACTIONID from cosdconsentgrouptxn where TRANSACTIONID = "+ txnid +"");
	           
	            if(query.list().isEmpty())
	            {
	            	System.out.println("cosdconsentgrouptxn... empty so add tranaction " + txnid);
	            	return "empty";
	            }
	            else
	            {   System.out.println("cosdconsentgrouptxn...duplicate  so dont add tranaction " + txnid);
	            	return "duplicate";
	            }
	            
	             
	           
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	        	 transaction.commit();
	            session.close();
	        }
	        
	        return "empty";
	    }

	 public void save(long grpID , Cosdabactransaction cosdabactransaction) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(cosdabactransaction);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        
	        CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao() ;
	        Cosdabaccontrolobject cosdabaccontrolobject = new Cosdabaccontrolobject();
	        CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
	        Cosdabaccontrolgroup cosdabaccontrolGroup = cosdabaccontrolgroupdao.getById(grpID);
	        
	        cosdabaccontrolobject.setCosdabaccontrolgroup(cosdabaccontrolGroup);
	        cosdabaccontrolobject.setCosdabactransaction(cosdabactransaction);
	        cosdabaccontrolobjectdao.save(cosdabaccontrolobject);
	       
       }
	 
	 public Cosdabactransaction saveWithConsent(long grpID , Cosdabactransaction cosdabactransaction) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(cosdabactransaction);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        
	        CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
	        Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(grpID);
	        
	        Cosdconsentgrouptxn cosdconsentgrouptxn = new Cosdconsentgrouptxn();
	        cosdconsentgrouptxn.setCosdabactransaction(cosdabactransaction);
	        cosdconsentgrouptxn.setCosdconsentgroup(cosdconsentgroup);
	        CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
	        cosdconsentgrouptxndao.save(cosdconsentgrouptxn);
	        return cosdabactransaction ;
    }
	 
	 public Cosdabactransaction saveExistingWithConsent(long grpID , long transactionID) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdabactransaction cosdabactransaction = null ;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
	            cosdabactransaction = cosdabactransactiondao.getById(transactionID);
	            //session.save(cosdabactransaction);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        
	        CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
	        Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(grpID);
	        
	        Cosdconsentgrouptxn cosdconsentgrouptxn = new Cosdconsentgrouptxn();
	        cosdconsentgrouptxn.setCosdabactransaction(cosdabactransaction);
	        cosdconsentgrouptxn.setCosdconsentgroup(cosdconsentgroup);
	        CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
	        cosdconsentgrouptxndao.save(cosdconsentgrouptxn);
	        System.out.println("Added .." );
	        return cosdabactransaction ;
 }
	 
	 public Cosdabactransaction saveExistingWithControl(long grpID , long transactionID) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdabactransaction cosdabactransaction = null ;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
	            cosdabactransaction = cosdabactransactiondao.getById(transactionID);
	            //session.save(cosdabactransaction);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        
	        CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao() ;
	        Cosdabaccontrolobject cosdabaccontrolobject = new Cosdabaccontrolobject();
	        CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
	        Cosdabaccontrolgroup cosdabaccontrolGroup = cosdabaccontrolgroupdao.getById(grpID);
	        
	        cosdabaccontrolobject.setCosdabaccontrolgroup(cosdabaccontrolGroup);
	        cosdabaccontrolobject.setCosdabactransaction(cosdabactransaction);
	        cosdabaccontrolobjectdao.save(cosdabaccontrolobject);
	        
	        
	        System.out.println("...saveExistingWithControl .." );
	        return cosdabactransaction ;
}
	 
	 
	 public  List<Cosdabactransaction> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabactransaction> cosdabactransactionList = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdabactransactionList = session.createQuery("from Cosdabactransaction").list();
	            for (Iterator iterator = cosdabactransactionList.iterator(); iterator.hasNext();) {
	            	Cosdabactransaction cosdabactransaction = (Cosdabactransaction) iterator.next();
	                System.out.println("Name " + cosdabactransaction.getTransactionname());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdabactransactionList ;
	    }
	 
	 
	 
	 public Cosdabactransaction getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabactransaction cosdabactransaction = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabactransaction = (Cosdabactransaction) session.get(Cosdabactransaction.class, new BigDecimal(id));
		 
		 	          System.out.println(":: Name ::" + cosdabactransaction.getTransactionname() + " - Type -" + cosdabactransaction.getTransactiontype());	 
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
		 	return cosdabactransaction ;
	 }
	 
	 public void update(Cosdabactransaction cosdabactransaction) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.update(cosdabactransaction);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
    }
	 
	 public String delete(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabactransaction cosdabactransaction = null ;
	      CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
	      
		 	try {		 
		 			Cosdabaccontrolobject cosdabaccontrolobject = cosdabaccontrolobjectdao.getByTxnID(id);
		 			
		 				if(cosdabaccontrolobject.getCosdabacconstraint() != null)
		 				{  System.out.println("Error-constraint Record Present");
		 					return "Error-constraint Record Present" ;
		 				}
		 		
		 			  session.beginTransaction();		 	             
		 	          cosdabactransaction = (Cosdabactransaction) session.get(Cosdabactransaction.class, new BigDecimal(id));
		 	          
		 	          Query query = session.createQuery("update Cosdabaccontrolobject set cosdabactransaction = :NewValue , cosdabaccontrolgroup = :grpID"+
								" where cosdabactransaction = :oldValue");
		 	         query.setParameter("NewValue", null);
		 	        query.setParameter("grpID", null);
		 	         query.setParameter("oldValue", cosdabactransaction);
		 	         int result = query.executeUpdate();
		 	        
		 	         session.delete(cosdabactransaction);
		 	         System.out.println("deleted:: Name ::" + cosdabactransaction.getTransactionname() + " - Type -" + cosdabactransaction.getTransactiontype());	 
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
	 
	 public String deleteFromGroup(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabactransaction cosdabactransaction = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdabactransaction = (Cosdabactransaction) session.get(Cosdabactransaction.class, new BigDecimal(id));
		 	          
		 	          /*Query query = session.createQuery("update Cosdabaccontrolobject set cosdabactransaction = :NewValue" +
								" where cosdabactransaction = :oldValue");
		 	          query.setParameter("NewValue", null);
		 	          query.setParameter("oldValue", cosdabactransaction);
		 	          int result = query.executeUpdate();*/
		 	        
		 	         session.delete(cosdabactransaction);
		 	         System.out.println("deleted:: Name ::" + cosdabactransaction.getTransactionname() + " - Type -" + cosdabactransaction.getTransactiontype());	 
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
	 
	 
	 public String deleteConsentTxn(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabactransaction cosdabactransaction = null ;
	      
		 	try {		 
		 	         session.beginTransaction();		 	             
		 	         cosdabactransaction = (Cosdabactransaction) session.get(Cosdabactransaction.class, new BigDecimal(id));
		 	          
		 	         CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
		 	         cosdconsentgrouptxndao.deleteBytxnID(cosdabactransaction.getTransactionid().longValue());
		 	         		 	        
		 	         session.delete(cosdabactransaction);
		 	         System.out.println("deleted:: Name ::" + cosdabactransaction.getTransactionname() + " - Type -" + cosdabactransaction.getTransactiontype());	 
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
