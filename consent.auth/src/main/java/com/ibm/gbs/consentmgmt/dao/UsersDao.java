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

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.util.HibernateUtil;

public class UsersDao {
	
	 public void save(Users users) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(users);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
   }
	 
	 public  List<Users> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Users> userslist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            userslist = session.createQuery("from Users").list();
	            for (Iterator iterator = userslist.iterator(); iterator.hasNext();) {
	            	Users users = (Users) iterator.next();
	                System.out.println(":: Unit Name ::" + users.getRolename());
	                	                
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return userslist ;
	    }
	 
	 public Users getById(String id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Users users = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	          users = (Users) session.get(Users.class, id);
		 	          
		 	         //session.delete(Users.class, id);
		 	          
		              if(users != null)
		 	          System.out.println(":: Rolename ::" + users.getRolename());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return users;
	 }
	 
	 public void delete(String id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         Users Users = (Users) session.get(Users.class, id);
		 
		 	         session.delete(Users);
		 	          System.out.println("User deleted::" + Users.getUsername());	 
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
	 }
	 
	 public void update(Users Users) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            UsersDao userdao = new UsersDao();
	            Users old_Users = userdao.getById(Users.getUsername());
	            old_Users.setRolename(Users.getRolename());
	            session.update(old_Users);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
}

}
