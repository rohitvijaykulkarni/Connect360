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
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;
import com.ibm.gbs.util.HibernateUtil;



public class CosdorgrolejobuserDao {
	
	 public void save(Cosdorgrolejobuser cosdorgrolejobuser) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	      
	        try {
	              
	        		transaction = session.beginTransaction();	            
	        		session.save(cosdorgrolejobuser);
	        		transaction.commit();
	        		
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
    }
	 
	
	 public Cosdorgrolejobuser getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdorgrolejobuser cosdorgrolejobuser = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          
		 	          cosdorgrolejobuser = (Cosdorgrolejobuser) session.get(Cosdorgrolejobuser.class, new BigDecimal(id));
		              if(cosdorgrolejobuser != null)		 	         
		              System.out.println(cosdorgrolejobuser.getRolename() + " - " + cosdorgrolejobuser.getUsername());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 		finally {
	            session.close();
	        }
		 	return cosdorgrolejobuser;
	 }
	 
	 
	 public  List<Cosdorgrolejobuser> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdorgrolejobuser> cosdorgrolejobuserlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdorgrolejobuserlist = session.createQuery("from Cosdorgrolejobuser").list();
	            for (Iterator iterator = cosdorgrolejobuserlist.iterator(); iterator.hasNext();) {
	            	Cosdorgrolejobuser cosdabaccontrolgroup = (Cosdorgrolejobuser) iterator.next();
	                System.out.println("Name " + cosdabaccontrolgroup);
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdorgrolejobuserlist ;
	    }
	 
	 
	
	 
	 public String delete(long id)
	 {
		 
		  Cosdorgrolejobuser cosdorgrolejobuser = null ;
		  
		  
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	   	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdorgrolejobuser = (Cosdorgrolejobuser) session.get(Cosdorgrolejobuser.class, new BigDecimal(id));             
		              session.delete(cosdorgrolejobuser);     
		              System.out.println( cosdorgrolejobuser.getRolename() + " - " + cosdorgrolejobuser.getUsername());	 
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
	 
	 public String update(  Cosdorgrolejobuser cosdorgrolejobuser ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdorgrolejobuser old_cosdorgrolejobuser = null ;
	        CosdorgrolejobuserDao cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdorgrolejobuser = cosdorgrolejobuserdao.getById(cosdorgrolejobuser.getOrganisationunitid().longValue());
	            
	            if(old_cosdorgrolejobuser == null)
	            return "Group is not present" ;
	            
	            old_cosdorgrolejobuser.setUsername(cosdorgrolejobuser.getUsername());
	            session.update(old_cosdorgrolejobuser);
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
