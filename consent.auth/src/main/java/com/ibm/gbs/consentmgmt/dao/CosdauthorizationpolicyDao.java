/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicy;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicyset;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.JDBCUtil;

public class CosdauthorizationpolicyDao {
	
	public void deleteAuthPoly(long id)
	{
		Connection con = null ;
		PreparedStatement stmt =  null ;
		
		try
		{
			con = JDBCUtil.getConnection_ConsentMgmt() ;
		
			stmt = con.prepareStatement("Delete from COSDAUTHORIZATIONPOLICY where AUTHORIZATIONGROUPID = " + id );	
			System.out.println("before Deleted ID - " + id);
			stmt.executeUpdate();
			System.out.println("Deleted ID - " + id);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				stmt.close();
				con.close();
			}
			catch(Exception ex)
			{
				
			}
		}
		
	}
	public void save(Cosdauthorizationpolicy cosdauthorizationpolicy) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(cosdauthorizationpolicy);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
}
	
	public String saveWithAuthGroupPolicy(long authGroupId , long policySetID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
        	Cosdauthorizationpolicy cosdauthorizationpolicy = new Cosdauthorizationpolicy();
        	
        	
    		CosdauthorizationgroupDao  cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
    		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
    		
            transaction = session.beginTransaction();
            
            CosdauthorizationpolicyDao cosdauthorizationpolicydao = new CosdauthorizationpolicyDao();
            List<Cosdauthorizationpolicy> cosdauthorizationpolicylist = cosdauthorizationpolicydao.getlistByAuthGroup(authGroupId);
            
            if( !cosdauthorizationpolicylist.isEmpty())
            {   System.out.println("Group :: Auth Group Creation ..Aleready Exists " + authGroupId);
            	return "already" ;
            }
            
    		Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(authGroupId) ;
    		Cosdauthorizationpolicyset cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(policySetID);
    		
    		cosdauthorizationpolicy.setCosdauthorizationgroup(cosdauthorizationgroup);
    		cosdauthorizationpolicy.setCosdauthorizationpolicyset(cosdauthorizationpolicyset);
    		cosdauthorizationpolicy.setPolicyComments("1 Policy AuthGroup");
            
            session.save(cosdauthorizationpolicy);
            transaction.commit();
            System.out.println("Group :: Auth Group + Policy Set linked ..saved " + authGroupId);
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            return "Fail" ;
        } finally {
            session.close();
        }
        return "saved" ;
}
	 
	 
	 public  List<Cosdauthorizationpolicy> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationpolicy> cosdauthorizationpolicylist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdauthorizationpolicylist = session.createQuery("from Cosdauthorizationpolicy").list();
	            for (Iterator iterator = cosdauthorizationpolicylist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationpolicy cosdauthorizationpolicy = (Cosdauthorizationpolicy) iterator.next();
	                System.out.println(" ");
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationpolicylist ;
	    }
	 
	 
	 public  List<Cosdauthorizationpolicy> getlistByGroupName(String groupname) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationpolicy> cosdauthorizationpolicylist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Cosdauthorizationpolicy where  controlgroupname = :grpName ");
	            query.setParameter("grpName", groupname);
	            
	            cosdauthorizationpolicylist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = cosdauthorizationpolicylist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationpolicy cosdauthorizationpolicy = (Cosdauthorizationpolicy) iterator.next();
	                System.out.println("Name ");
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationpolicylist ;
	    }
	 
	 public  List<Cosdauthorizationpolicy> getlistByAuthGroup(long authGrp) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationpolicy> cosdauthorizationpolicylist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            CosdauthorizationgroupDao  cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
	            Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(authGrp) ;
	            
	            Query query = session.createQuery("from Cosdauthorizationpolicy where  cosdauthorizationgroup = :grpName ");
	            query.setParameter("grpName", cosdauthorizationgroup);
	            
	            cosdauthorizationpolicylist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = cosdauthorizationpolicylist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationpolicy cosdauthorizationpolicy = (Cosdauthorizationpolicy) iterator.next();
	                System.out.println("Name ");
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationpolicylist ;
	    }
	 
	 
	 public Cosdauthorizationpolicy getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdauthorizationpolicy cosdauthorizationpolicy = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         cosdauthorizationpolicy = (Cosdauthorizationpolicy) session.get(Cosdauthorizationpolicy.class, new BigDecimal(id));
		              if(cosdauthorizationpolicy != null)
		            	  System.out.println("Name " + cosdauthorizationpolicy.getPolicyComments());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return cosdauthorizationpolicy;
	 }
	 
	 public void delete(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdauthorizationpolicy cosdauthorizationpolicy = null ;	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         cosdauthorizationpolicy = (Cosdauthorizationpolicy) session.get(Cosdauthorizationpolicy.class, new BigDecimal(id));
		              session.delete(cosdauthorizationpolicy);
		              if(cosdauthorizationpolicy != null)
		              {
		            	  System.out.println("Name " + cosdauthorizationpolicy);	 
		 	          }  	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	
	 }
	 
	 public String update(Cosdauthorizationpolicy cosdauthorizationpolicy) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdauthorizationpolicy old_cosdauthorizationpolicy = null ;
	        CosdauthorizationpolicyDao cosdauthorizationpolicydao = new CosdauthorizationpolicyDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdauthorizationpolicy = cosdauthorizationpolicydao.getById(cosdauthorizationpolicy.getAuthorizationpolicyid().longValue());
	            
	            if(old_cosdauthorizationpolicy == null)
	            return "authorizationpolicy is not present" ;
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(old_cosdauthorizationpolicy);
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
