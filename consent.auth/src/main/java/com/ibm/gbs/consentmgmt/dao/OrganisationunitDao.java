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
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.util.HibernateUtil;

public class OrganisationunitDao {
	
	 public void save(Organisationunit organisationunit) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(organisationunit);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
    }
	 
	 
	 public  List<Organisationunit> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Organisationunit> organisationunitlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            organisationunitlist = session.createQuery("from Organisationunit").list();
	            for (Iterator iterator = organisationunitlist.iterator(); iterator.hasNext();) {
	            	Organisationunit organisationunit = (Organisationunit) iterator.next();
	                System.out.println(":: Unit Name ::" + organisationunit.getName());
	                	                
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return organisationunitlist ;
	    }
	 
	 
	 public  List<Organisationunit> getlistByGroupName(String name) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Organisationunit> organisationunitlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Organisationunit where  name = :name ");
	            query.setParameter("name", name);
	            
	            organisationunitlist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = organisationunitlist.iterator(); iterator.hasNext();) {
	            	Organisationunit organisationunit = (Organisationunit) iterator.next();
	                System.out.println("Name " + organisationunit.getName());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return organisationunitlist ;
	    }
	 
	 
	 public Organisationunit getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Organisationunit organisationunit = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         organisationunit = (Organisationunit) session.get(Organisationunit.class, new BigDecimal(id));
		              if(organisationunit != null)
		 	          System.out.println(organisationunit.getOrganisationunitid() + " - " + organisationunit.getName());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return organisationunit;
	 }
	 
	 public void delete(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Organisationunit organisationunit = null ;	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          organisationunit = (Organisationunit) session.get(Organisationunit.class, new BigDecimal(id));
		              session.delete(organisationunit);
		              System.out.println(organisationunit.getOrganisationunitid() + " - " + organisationunit.getName());	 
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
