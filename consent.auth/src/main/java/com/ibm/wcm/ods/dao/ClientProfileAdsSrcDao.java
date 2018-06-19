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

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.util.Constant;
import com.ibm.gbs.util.HibernateUtil;

import com.ibm.gbs.wcm.vo.CohortVO;
import com.ibm.wcm.ods.dto.ClientProfileAdsSrc;
import com.ibm.wcm.ods.dto.ClientProfileMhsSrc;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ClientProfileAdsSrcDao {
	

	public List<ClientProfileAdsSrc> getMemberListByMemIDSrcCode(String memIdnum, String srcCode) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<ClientProfileAdsSrc> list = null;

		try {
			transaction = session.beginTransaction();
			Query query = session
					.createQuery("from ClientProfileAdsSrc where clientId = :cid and sourceSystemId = :sid");
			query.setParameter("cid", memIdnum);
			query.setParameter("sid", srcCode);
			list = query.list();

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				ClientProfileAdsSrc dto = (ClientProfileAdsSrc) iterator.next();
			}

			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

		return list;
	}
	
	
	
	 public ClientProfileAdsSrc save(ClientProfileAdsSrc ClientProfileAdsSrc) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(ClientProfileAdsSrc);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	            return ClientProfileAdsSrc ;
	        }
     }
	
	 public  List<ClientProfileAdsSrc> getlist() {
		 
		 	System.out.println(" ");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<ClientProfileAdsSrc> cosdpersonconsentlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdpersonconsentlist = session.createQuery("from ClientProfileAdsSrc ").list();
	            for (Iterator iterator = cosdpersonconsentlist.iterator(); iterator.hasNext();) {
	            	ClientProfileAdsSrc cosdpersonconsent = (ClientProfileAdsSrc) iterator.next();
	                
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
	
	 public ClientProfileAdsSrc getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      ClientProfileAdsSrc ClientProfileAdsSrc = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          ClientProfileAdsSrc = (ClientProfileAdsSrc) session.get(ClientProfileAdsSrc.class, new BigDecimal(id));		 
		 	          	 
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
		 	return ClientProfileAdsSrc ;
	 }
	 
	 public  List<ClientProfileAdsSrc> getlistByClinetID  (String clientId) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<ClientProfileAdsSrc> Cosdabaccontrolgrouplist = null ;
	        try {
	        	
	        	
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from ClientProfileAdsSrc where  clientId = :clientId ");
	            query.setParameter("clientId",clientId);
	            
	            Cosdabaccontrolgrouplist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = Cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
	            	ClientProfileAdsSrc clientprofileadssrc = (ClientProfileAdsSrc) iterator.next();
	                System.out.println("DischargeStatus  :: " + clientprofileadssrc.getDischargeStatus());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return Cosdabaccontrolgrouplist ;
	    }
	 
	 public  ClientProfileAdsSrc getByClinetID  (long clientId) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<ClientProfileAdsSrc> Cosdabaccontrolgrouplist = null ;
	        ClientProfileAdsSrc clientprofileadssrc = null ;
	        try {
	        	
	        	
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from ClientProfileAdsSrc where  clientId = :clientId ");
	            query.setBigDecimal("clientId",new BigDecimal(clientId));
	            
	            Cosdabaccontrolgrouplist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = Cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
	            	 clientprofileadssrc = (ClientProfileAdsSrc) iterator.next();
	                System.out.println("DischargeStatus  :: " + clientprofileadssrc.getDischargeStatus());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return clientprofileadssrc ;
	    }
	 
	
		 
	 public String delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	     // Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           ClientProfileAdsSrc ClientProfileAdsSrc =  (ClientProfileAdsSrc) session.get(ClientProfileAdsSrc.class, new BigDecimal(id));
		 
		 	           session.delete(ClientProfileAdsSrc);
		 	          	 
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

	 public String update( ClientProfileAdsSrc ClientProfileAdsSrc ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        ClientProfileAdsSrc old_ClientProfileAdsSrc  = null ;
	        ClientProfileAdsSrcDao ClientProfileAdsSrcdao = new ClientProfileAdsSrcDao();
	        
	        try {
	              
	            transaction = session.beginTransaction(); 
	            
	            //old_ClientProfileAdsSrc = ClientProfileAdsSrcdao.getById(ClientProfileAdsSrc.getPersonconsentid().longValue());	            
	            //if(old_ClientProfileAdsSrc == null)
	            //return "Consent Person - is not present" ;	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            
	            session.update(ClientProfileAdsSrc);
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

/*CREATE TABLE ClientProfileAdsSrc (
	    ClientProfileAdsSrcedID varchar2(30)  NOT NULL,
	    ClientProfileAdsSrcDescription varchar2(100)  NOT NULL,
	    CONSTRAINT ClientProfileAdsSrc_pk PRIMARY KEY (ClientProfileAdsSrcedID)
	) ; */
