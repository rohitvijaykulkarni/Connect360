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

import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.util.HibernateUtil;

public class SecurityroleDao {
	
	
	 public void save(Securityrole securityrole) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(securityrole);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
 }
	 
	 
	 public  List<Securityrole> getlist() {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Securityrole> securityrolelist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            securityrolelist = session.createQuery("from Securityrole").list();
	            for (Iterator iterator = securityrolelist.iterator(); iterator.hasNext();) {
	            	Securityrole securityrole = (Securityrole) iterator.next();
	                System.out.println(":: Role Name ::" + securityrole.getRolename());
	                	                
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return securityrolelist ;
	    }
	 
	 
	 public  List<Securityrole> getlistByGroupName(String name) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Securityrole> securityrolelist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Securityrole where  name = :name ");
	            query.setParameter("name", name);
	            
	            securityrolelist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = securityrolelist.iterator(); iterator.hasNext();) {
	            	Securityrole securityrole = (Securityrole) iterator.next();
	                System.out.println("Name " + securityrole.getRolename());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return securityrolelist ;
	    }
	 
	 
	 public Securityrole getById(String id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Securityrole securityrole = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          securityrole = (Securityrole) session.get(Securityrole.class, id);
		 	          
		              if(securityrole != null)
		 	          System.out.println(securityrole.getRolename());	 
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
		 	return securityrole;
	 }
	 
	 public void delete(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Securityrole securityrole = null ;	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         securityrole = (Securityrole) session.get(Securityrole.class, new BigDecimal(id));
		              session.delete(securityrole);
		              System.out.println(":: RoleName ::" + securityrole.getRolename());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	
	 }
	 
	 public String update( Organisationunit organisationunit) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Organisationunit old_organisationunit = null ;
	        OrganisationunitDao organisationunitdao = new OrganisationunitDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_organisationunit = organisationunitdao.getById(organisationunit.getOrganisationunitid().longValue());
	            
	            if(old_organisationunit == null)
	            return "Group is not present" ;
	            
	            old_organisationunit.setName(organisationunit.getName());
	            session.update(old_organisationunit);
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
