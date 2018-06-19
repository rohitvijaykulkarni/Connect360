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
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.vo.CosdauthorizationgroupVO;

public class CosdauthorizationgroupDao {
	
	
	public  List<Cosdauthorizationgroup> search(CosdauthorizationgroupVO cosdauthorizationgroupvo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Cosdauthorizationgroup> cosdauthorizationgrouplist = null ;
        CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
        Cosdabaccontrolgroup cosdabaccontrolgroup = null ;
        OrganisationunitDao organisationunitdao = new OrganisationunitDao();
		Organisationunit organisationunit = null ;
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole sRole = null ;
		
        try {
        	
        	String whereClause = " " ;
        	String and = " " ;
        	boolean andEnable = false ;
            
        	boolean isgrpName = false ;
            boolean isorgUnitID = false ;
            boolean issecurityrole = false ;
            boolean isJobjID = false ;
            
        	long grpID = cosdauthorizationgroupvo.getCosdabaccontrolgroup();
        	
        	if(grpID > 0)
        	{
        		cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(grpID);
        		whereClause = whereClause + " cosdabaccontrolgroup = :grpName " ; 
        		andEnable = true ;
        		isgrpName = true ;
        	}
        	
    		 		
    		long orgUnitID = cosdauthorizationgroupvo.getOrganisationunit();
    		if(orgUnitID > 0)
    		{
    			organisationunit = organisationunitdao.getById(orgUnitID);
    			and = andEnable ? " And " : " " ;
    			whereClause = whereClause + and  + " organisationunit = :orgUnit  " ;
    			andEnable = true ;
    			isorgUnitID = true ;
    		}
        	
        	String securityrole = cosdauthorizationgroupvo.getSecurityrole() ;
        	if( securityrole != null && !securityrole.trim().equals("0"))
        	{
        		sRole = securityroledao.getById(securityrole);
        		and = andEnable ? " And " : " " ;
        		whereClause = whereClause + and + " securityrole = :secRole  " ;
        		andEnable = true ;
        		issecurityrole = true ;
        	}
        	
        	BigDecimal jobid = cosdauthorizationgroupvo.getJobid() ;
        	if (jobid != null && jobid.intValue() > 0)
        	{
        		and = andEnable ? " And " : " " ;        	
        		whereClause = whereClause + and + " jobid = :jID  " ;
        		isJobjID = true ;
        		andEnable = true ;
        	}
        	
        	String wherestr = andEnable ? " Where " : " " ; 
        	whereClause = wherestr + whereClause ;
    		
    		System.out.println(":: :: grpID" + grpID + ":: orgUnitID ::" + orgUnitID + ":: securityrole ::" + securityrole + ":: jobid ::" + jobid);
    		System.out.println("::**--> " + whereClause );
    		
    		/*CosdorgrolejobuserDao cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
    		Cosdorgrolejobuser cosdorgrolejobuser =  cosdorgrolejobuserdao.getById(jobid);		
      */  	
            transaction = session.beginTransaction();
            
            /*Query query = session.createQuery("from Cosdauthorizationgroup where  cosdabaccontrolgroup = :grpName and "
            		+ " organisationunit = :orgUnit and securityrole = :secRole and jobid = :jID");*/
            Query query = session.createQuery("from Cosdauthorizationgroup " + whereClause );
            if(isgrpName)
            query.setParameter("grpName",cosdabaccontrolgroup);
            if(isorgUnitID)
            query.setParameter("orgUnit",organisationunit);
            if(issecurityrole)
            query.setParameter("secRole", sRole);
            if(isJobjID)
            query.setParameter("jID", jobid);
            
            cosdauthorizationgrouplist = query.list();
            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
            for (Iterator iterator = cosdauthorizationgrouplist.iterator(); iterator.hasNext();) {
            	Cosdauthorizationgroup cosdauthorizationgroup = (Cosdauthorizationgroup) iterator.next();
                System.out.println("Authorization ID " + cosdauthorizationgroup.getAuthorizationgroupid());
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        
        return cosdauthorizationgrouplist ;
    }
 
	
	 public String save(Cosdauthorizationgroup cosdauthorizationgroup) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(cosdauthorizationgroup);
	            transaction.commit();
	            return "saved" ;
	        }
	        catch(org.hibernate.exception.ConstraintViolationException sqlIntex)
	        {
	        	System.out.println("Duplication in Constraint");
	        	return "duplicate" ;
	        }
	        catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	            return "fail" ;
	        } finally {
	            session.close();
	        }
	        
	        
 }
	 
	 
	 public  List<Cosdauthorizationgroup> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationgroup> cosdauthorizationgrouplist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdauthorizationgrouplist = session.createQuery("from Cosdauthorizationgroup").list();
	            for (Iterator iterator = cosdauthorizationgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationgroup cosdauthorizationgroup = (Cosdauthorizationgroup) iterator.next();
	                System.out.println(":: Unit ID ::" + cosdauthorizationgroup.getAuthorizationgroupid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationgrouplist ;
	    }
	 
	 
	 public  List<Cosdauthorizationgroup> getlistByGroupName(String groupname) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationgroup> cosdabaccontrolgrouplist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Cosdauthorizationgroup where  authGroupName = :grpName ");
	            query.setParameter("grpName", groupname);
	            
	            cosdabaccontrolgrouplist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationgroup cosdabaccontrolgroup = (Cosdauthorizationgroup) iterator.next();
	                System.out.println("Name ::" + cosdabaccontrolgroup.getAuthGroupName());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdabaccontrolgrouplist ;
	    }
	 
	 
	 public Cosdauthorizationgroup getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdauthorizationgroup cosdauthorizationgroup = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         cosdauthorizationgroup = (Cosdauthorizationgroup) session.get(Cosdauthorizationgroup.class, new BigDecimal(id));
		              if(cosdauthorizationgroup != null)
		 	          System.out.println(" Group Id -"+ cosdauthorizationgroup.getAuthorizationgroupid() + " - Job id - " + cosdauthorizationgroup.getJobid());	 
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
		 	return cosdauthorizationgroup;
	 }
	 
	 public String  delete(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdauthorizationgroup cosdauthorizationgroup = null ;	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         cosdauthorizationgroup = (Cosdauthorizationgroup) session.get(Cosdauthorizationgroup.class, new BigDecimal(id));
		 	         
		 	        CosdauthorizationpolicyDao cosdauthorizationpolicydao = new CosdauthorizationpolicyDao();
		 	        
		 	        cosdauthorizationpolicydao.deleteAuthPoly(id);
		 	        System.out.println("Child Record deleted ..if present");
		 	          
		 	         if(cosdauthorizationgroup == null)
		 	         {
		 	        	 return "Not Found" ;
		 	         }
		 	         
		              session.delete(cosdauthorizationgroup);
		              if(cosdauthorizationgroup != null)
		              {
			 	          System.out.println(" Group Id -"+ cosdauthorizationgroup.getAuthorizationgroupid() + " - Job id - " + cosdauthorizationgroup.getJobid());	 
		 	          }  	 
		 	          session.getTransaction().commit();
		 	          return "Deleted" ;
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		              return "Error - While deletion" ;
		 	    }
		 	finally
		 	{
		 		session.close();
		 	}
		 	
	 }
	 
	 public String update( Cosdauthorizationgroup cosdauthorizationgroup) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdauthorizationgroup old_cosdauthorizationgroup = null ;
	        CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdauthorizationgroup = cosdauthorizationgroupdao.getById(cosdauthorizationgroup.getAuthorizationgroupid().longValue());
	            
	            if(old_cosdauthorizationgroup == null)
	            return "Group is not present" ;
	            
	            old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(cosdauthorizationgroup);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return "Updated" ;
}
	 
	
	 
	 
	 public  List<Cosdauthorizationgroup> searchBeforeSave(CosdauthorizationgroupVO cosdauthorizationgroupvo) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationgroup> cosdauthorizationgrouplist = null ;
	        CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
	        Cosdabaccontrolgroup cosdabaccontrolgroup = null ;
	        OrganisationunitDao organisationunitdao = new OrganisationunitDao();
			Organisationunit organisationunit = null ;
			SecurityroleDao securityroledao = new SecurityroleDao();
			Securityrole sRole = null ;
			
	        try {
	        	
	        	String whereClause = " " ;
	        	String and = " " ;
	        	boolean andEnable = false ;
	            
	        	boolean isgrpName = false ;
	            boolean isorgUnitID = false ;
	            boolean issecurityrole = false ;
	            boolean isJobjID = false ;
	            
	        	long grpID = cosdauthorizationgroupvo.getCosdabaccontrolgroup();
	        	
	        	if(grpID > 0)
	        	{
	        		cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(grpID);
	        		whereClause = whereClause + " cosdabaccontrolgroup = :grpName " ; 
	        		andEnable = true ;
	        		isgrpName = true ;
	        	}
	        	
	    		 		
	    		long orgUnitID = cosdauthorizationgroupvo.getOrganisationunit();
	    		
	    			organisationunit = orgUnitID < 1? null : organisationunitdao.getById(orgUnitID);
	    			and = andEnable ? " And " : " " ;
	    			whereClause = whereClause + and  + " organisationunit = :orgUnit  " ;
	    			andEnable = true ;
	    			isorgUnitID = true ;
	    		
	        	
	        	String securityrole = cosdauthorizationgroupvo.getSecurityrole() ;
	        	
	        		sRole = securityrole == null ? null : securityroledao.getById(securityrole);
	        		and = andEnable ? " And " : " " ;
	        		whereClause = whereClause + and + " securityrole = :secRole  " ;
	        		andEnable = true ;
	        		issecurityrole = true ;
	        	
	        	
	        	BigDecimal jobid = cosdauthorizationgroupvo.getJobid() ;
	        	if (jobid != null)
	        	{
	        		and = andEnable ? " And " : " " ;        	
	        		whereClause = whereClause + and + " jobid = :jID  " ;
	        		isJobjID = true ;
	        		andEnable = true ;
	        	}
	        	
	        	String user = cosdauthorizationgroupvo.getUsers() ;
	        	UsersDao  userdao = new UsersDao();
	        	Users Users = user == null ? null :userdao.getById(user);
	        	whereClause = whereClause + and + " Users = :users  " ;
	        	boolean isUser = true ;
	        	
	        	String wherestr = andEnable ? " Where " : " " ; 
	        	whereClause = wherestr + whereClause ;
	    		
	        	
	    		
	    		System.out.println("::**--> " + whereClause );
	    		
	    		/*CosdorgrolejobuserDao cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
	    		Cosdorgrolejobuser cosdorgrolejobuser =  cosdorgrolejobuserdao.getById(jobid);		
	      */  	
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Cosdauthorizationgroup where  cosdabaccontrolgroup = :grpName and "
	            		+ " organisationunit = :orgUnit and securityrole = :secRole and jobid = :jID and Users = :users ");
	          //  Query query = session.createQuery("from Cosdauthorizationgroup " + whereClause );
	            if(isgrpName)
	            query.setParameter("grpName",cosdabaccontrolgroup);
	            if(isorgUnitID)
	            query.setParameter("orgUnit",organisationunit);
	            if(issecurityrole)
	            query.setParameter("secRole", sRole);
	            if(isJobjID)
	            query.setParameter("jID", jobid);
	            if(isUser)
		         query.setParameter("users", Users);
	            
	            cosdauthorizationgrouplist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = cosdauthorizationgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationgroup cosdauthorizationgroup = (Cosdauthorizationgroup) iterator.next();
	                System.out.println("Authorization ID " + cosdauthorizationgroup.getAuthorizationgroupid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationgrouplist ;
	    }

}
