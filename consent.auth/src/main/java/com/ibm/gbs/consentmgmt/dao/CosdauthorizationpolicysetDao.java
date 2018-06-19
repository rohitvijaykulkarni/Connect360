/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicyset;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.JDBCUtil;
import com.ibm.gbs.vo.CosdauthorizationgroupVO;
import com.ibm.gbs.vo.CosdauthorizationpolicysetVO;
import com.ibm.gbs.vo.ViewPolicyAuthGroup;

public class CosdauthorizationpolicysetDao {
	
	 public String  save(Cosdauthorizationpolicyset cosdauthorizationpolicyset) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            session.save(cosdauthorizationpolicyset);
	            transaction.commit();
	        }catch(org.hibernate.exception.ConstraintViolationException cvex)
	        {
	        	System.out.println();
	        	return "Duplicate" ;
	        }
	        catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	            return "Fail" ;
	        } finally {
	            session.close();
	        }
	        return "save";
}
	 
	 
	 public  List<Cosdauthorizationpolicyset> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationpolicyset> cosdauthorizationpolicysetlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdauthorizationpolicysetlist = session.createQuery("from Cosdauthorizationpolicyset").list();
	            for (Iterator iterator = cosdauthorizationpolicysetlist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationpolicyset cosdauthorizationpolicyset = (Cosdauthorizationpolicyset) iterator.next();
	                System.out.println(":: Unit ID ::" + cosdauthorizationpolicyset.getConsentstatus());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationpolicysetlist ;
	    }
	 
	 
	 public  List<Cosdauthorizationpolicyset> getlistByGroupName(String groupname) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdauthorizationpolicyset> cosdauthorizationpolicysetlist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Cosdauthorizationpolicyset where  name LIKE :grpName ");	           
	            query.setParameter("grpName","%" + groupname +"%");
	            
	            cosdauthorizationpolicysetlist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = cosdauthorizationpolicysetlist.iterator(); iterator.hasNext();) {
	            	Cosdauthorizationpolicyset cosdauthorizationpolicyset = (Cosdauthorizationpolicyset) iterator.next();
	                System.out.println("Name " + cosdauthorizationpolicyset.getConsentstatus());
	            }
	            System.out.println("..Not Found ..??");
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdauthorizationpolicysetlist ;
	    }
	 
	 
	 public Cosdauthorizationpolicyset getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdauthorizationpolicyset cosdauthorizationpolicyset = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         cosdauthorizationpolicyset = (Cosdauthorizationpolicyset) session.get(Cosdauthorizationpolicyset.class, new BigDecimal(id));
		              if(cosdauthorizationpolicyset != null)
		            	  System.out.println("Name " + cosdauthorizationpolicyset.getConsentstatus());	 
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
		 	return cosdauthorizationpolicyset;
	 }
	 
	 public String delete(long id)
	 {		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdauthorizationpolicyset cosdauthorizationpolicyset = null ;	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		 	         cosdauthorizationpolicyset = (Cosdauthorizationpolicyset) session.get(Cosdauthorizationpolicyset.class, new BigDecimal(id));
		              session.delete(cosdauthorizationpolicyset);
		              if(cosdauthorizationpolicyset != null)
		              {
		            	  System.out.println("Name " + cosdauthorizationpolicyset.getConsentstatus());	 
		 	          }  	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 	           return "Error while deletion" ;
		 
		 	    }
		 	
		 	return "deleted" ;
	 }
	 
	 public String update(Cosdauthorizationpolicyset cosdauthorizationpolicyset) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdauthorizationpolicyset old_cosdauthorizationpolicyset = null ;
	        CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(cosdauthorizationpolicyset.getPolicysetid().longValue());
	            
	            if(old_cosdauthorizationpolicyset == null)
	            return "Group is not present" ;
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(cosdauthorizationpolicyset);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return "Updated" ;
 }
	 
	 public ViewPolicyAuthGroup getViewPolicyAuthGroup(long policySet)
	 {
		 ViewPolicyAuthGroup viewpolicyauthgroup = new ViewPolicyAuthGroup();
		 
		 String viewGroupQ = " select authgrp.AUTHORIZATIONGROUPID as AUTHORIZATIONGROUPID, poliset.POLICYSETID , poliset.COSD_ABAC_SEC_CLASSIFICATION , "
		 		+ "poliset.COMMENTS , poliset.CONSENTSTATUS , poliset.CREATEDBY , poliset.CREATEDON , poliset.LASTUPDATEDBY , poliset.LASTUPDATEDON, "
		 		+ "poliset.TRANSACTIONTYPE, poliset.NAME , authgrp.AUTHORIZATIONGROUPID from COSDAUTHORIZATIONPOLICYSET poliset , "
		 		+ "COSDAUTHORIZATIONPOLICY poli , COSDAUTHORIZATIONGROUP authgrp "
				+" where poli.POLICYSETID = poliset.POLICYSETID and authgrp.AUTHORIZATIONGROUPID = poli.AUTHORIZATIONGROUPID and poliset.POLICYSETID = ? " ;
		 
		 Connection con = null ;
		 PreparedStatement stmt =  null ;
		 ResultSet viewAuthGRouprs = null ; 
		 
		 try
		 {
		
			 CosdauthorizationgroupDao  cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
			 CosdauthorizationpolicysetVO policyset  = new CosdauthorizationpolicysetVO();			 
			 List<CosdauthorizationgroupVO> authGroups = new ArrayList<CosdauthorizationgroupVO>();
			
			 con = JDBCUtil.getConnection_ConsentMgmt() ;				
			 stmt = con.prepareStatement(viewGroupQ);				
			 stmt.setLong(1, policySet);				
			 viewAuthGRouprs = stmt.executeQuery();
			 
			 CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
			 Cosdauthorizationpolicyset cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(policySet);
			 Converters conv = new Converters();
			
			 
			 
			 System.out.println("Method - getViewPolicyAuthGroup() :: viewGroupQ ::-" + viewGroupQ);
				
			 while(viewAuthGRouprs.next())
			 {
				 if(policyset.getPolicysetid() == null || policyset.getPolicysetid().longValue() < 1 )
				 {
					 policyset.setPolicysetid(new BigDecimal(viewAuthGRouprs.getInt("POLICYSETID")));				 
					 policyset.setClassificationlevel(viewAuthGRouprs.getString("COSD_ABAC_SEC_CLASSIFICATION"));
					 policyset.setComments(viewAuthGRouprs.getString("COMMENTS"));
					 policyset.setConsentstatus(viewAuthGRouprs.getString("CONSENTSTATUS"));
					 policyset.setCreatedby(viewAuthGRouprs.getString("CREATEDBY"));
					 if(viewAuthGRouprs.getDate("CREATEDON") != null)
					 policyset.setCreatedon(new java.util.Date(viewAuthGRouprs.getDate("CREATEDON").getTime()));
					 policyset.setLastupdatedby(viewAuthGRouprs.getString("LASTUPDATEDBY"));
					 if(viewAuthGRouprs.getDate("LASTUPDATEDON") != null)
					 policyset.setLastupdatedon(new java.util.Date(viewAuthGRouprs.getDate("LASTUPDATEDON").getTime()));
					 policyset.setTransactionType(viewAuthGRouprs.getString("TRANSACTIONTYPE"));
				     policyset.setName(viewAuthGRouprs.getString("NAME"));
			     }
				 
				 if( viewAuthGRouprs.getInt("AUTHORIZATIONGROUPID") > 0)
				 {
					 Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(viewAuthGRouprs.getInt("AUTHORIZATIONGROUPID")) ;
					  conv = new Converters();
					 
					 authGroups.add(conv.convertToVo(cosdauthorizationgroup));
				 }
			 
		   } // try
			 policyset = conv.convertToVo(cosdauthorizationpolicyset) ;
			 viewpolicyauthgroup.setPolicyset(policyset);
			 viewpolicyauthgroup.setAuthGroups(authGroups);
			 
			 System.out.println("Before Try finish ..");
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 finally
		 {
			 try
				{
					if(viewAuthGRouprs!=null)
						viewAuthGRouprs.close();
					
					if(stmt!=null)
						stmt.close();
					
					if(con!=null)
						con.close();
				}
				catch(Exception exsql)
				{
					
				}
			 
		 }
		 return viewpolicyauthgroup ;
	 }
	 
	

}
