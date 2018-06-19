/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdconsentexception;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsent;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.vo.CosdpersonconsentVO;

public class CosdconsentexceptionDao {
	
	
	public String insertList(CosdpersonconsentVO cosdpersonconsentvo ,String userName)
	{
		String consentList = cosdpersonconsentvo.getConsentCatList() ; // categorylist
		
		System.out.println("::consentList ::" + consentList);
		
		if(consentList == null || consentList.trim().equalsIgnoreCase(""))
			return "consent List is empty "; 
		
		Cosdconsentexception cosdconsentexception = new Cosdconsentexception();
    	CosdconsentexceptionDao cosdconsentexceptiondao = new CosdconsentexceptionDao();
    	CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
    	CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao() ;
    	
    	Cosdpersonconsent cosdpersonconsent = cosdpersonconsentdao.getById(cosdpersonconsentvo.getPersonconsentid().longValue());
		int cnt = 0 ; 
		for (String consentCat: consentList.split(",")) {
			
			long consentGrpCat = Long.parseLong(consentCat);
			Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(consentGrpCat);
			cosdconsentexception.setCosdconsentgroup(cosdconsentgroup);
	    	cosdconsentexception.setCosdpersonconsent(cosdpersonconsent);
	    	cosdconsentexception.setConsentstatus("Yes");
	    	
	    	cosdconsentexception.setCreatedby(userName);
	    	cosdconsentexception.setCreatedon(new Date());
	    	//cosdconsentexception.setLastupdatedby(username);
	    	//cosdconsentexception.setLastupdatedo(new Date());
	    	cosdconsentexceptiondao.save(cosdconsentexception);
	        System.out.println("::Cosdconsentexception insertLoop ::" + ++cnt + ": ::" + consentGrpCat);
	      }
		
		System.out.println("::success Exception insert::");
		return "success"; 
	}
	
	 public void save(Cosdconsentexception cosdconsentexception) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(cosdconsentexception);
	            transaction.commit();
	        }catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
}
	 
	 
	 public  List<Cosdconsentexception> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdconsentexception> cosdconsentexceptionlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdconsentexceptionlist = session.createQuery("from Cosdconsentexception").list();
	            for (Iterator iterator = cosdconsentexceptionlist.iterator(); iterator.hasNext();) {
	            	Cosdconsentexception cosdconsentexception = (Cosdconsentexception) iterator.next();
	                System.out.println("Transaction ::" + cosdconsentexception.getConsentexceptionid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdconsentexceptionlist ;
	    }
	 
	 
	 
	 public Cosdconsentexception getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdconsentexception cosdconsentexception = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdconsentexception = (Cosdconsentexception) session.get(Cosdconsentexception.class, new BigDecimal(id));		 
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return cosdconsentexception ;
	 }
	 
	
		 
	 public void delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           Cosdconsentexception cosdconsentexception =  (Cosdconsentexception) session.get(Cosdconsentexception.class, new BigDecimal(id));
		 
		 	           session.delete(cosdconsentexception);
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	 }
	 
	 public void deleteByPersonConsent(long id)
	 { 
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();	
		 	          CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
		 	           Cosdpersonconsent cosdpersonconsent = cosdpersonconsentdao.getById(id);
		 	           Query qry = session.createQuery("delete from Cosdconsentexception conexcpt where conexcpt.cosdpersonconsent=:personID");
		 	           qry.setParameter("personID",cosdpersonconsent);
		 	          
		 	           int res = qry.executeUpdate();		 	          	 
		 	           session.getTransaction().commit();
		 	           
		 	           System.out.println("Deleted Exception...using PersonConsent ID:: " + id);
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
	 }

	 public String update( Cosdconsentexception cosdconsentexception ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdconsentexception old_cosdconsentexception  = null ;
	        CosdconsentexceptionDao cosdconsentexceptiondao = new CosdconsentexceptionDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdconsentexception = cosdconsentexceptiondao.getById(cosdconsentexception.getConsentexceptionid().longValue());
	            
	            if(old_cosdconsentexception == null)
	            return "Consent Group - is not present" ;
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(old_cosdconsentexception);
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
