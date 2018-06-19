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
import org.springframework.web.bind.annotation.RequestBody;

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.util.ConsentConverter;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.JDBCUtil;
import com.ibm.gbs.vo.ATTCosdabactransactionVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.CosdabactransactionVO;
import com.ibm.gbs.vo.CosdconsentgroupVO;
import com.ibm.gbs.vo.ViewConsentGroup;

public class CosdconsentgroupDao {
	
	 public Cosdconsentgroup save(Cosdconsentgroup cosdconsentgroup) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	        		
	            transaction = session.beginTransaction();
	            
	            session.save(cosdconsentgroup);
	            transaction.commit();
	            return cosdconsentgroup ;
	        }
	        catch(org.hibernate.exception.ConstraintViolationException sqlIntex)
	        {
	        	System.out.println("Duplication in Constraint");
	        	return null ;
	        }
	        catch (HibernateException e) {
	        	System.out.println("Exception ..mmm");
	            transaction.rollback();
	            e.printStackTrace();
	        } 
	       finally {
	            session.close();
	        }
	        
	        return cosdconsentgroup ;
}
	 
	 
	 public  List<Cosdconsentgroup> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdconsentgroup> cosdconsentgrouplist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            cosdconsentgrouplist = session.createQuery("from Cosdconsentgroup").list();
	            for (Iterator iterator = cosdconsentgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdconsentgroup cosdconsentgroup = (Cosdconsentgroup) iterator.next();
	                System.out.println("Transaction ::" + cosdconsentgroup.getConsentgroupid());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdconsentgrouplist ;
	    }
	 
	 
	 
	 public Cosdconsentgroup getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdconsentgroup cosdconsentgroup = null ;	      
		 
	      try {		 
		 	          session.beginTransaction();		 	             
		 	          cosdconsentgroup = (Cosdconsentgroup) session.get(Cosdconsentgroup.class, new BigDecimal(id));		 
		 	          	 
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
		 	return cosdconsentgroup ;
	 }
	 
	
		 
	 public String  delete(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      
		 	try {		 
		 	           session.beginTransaction();		 	             
		 	           Cosdconsentgroup cosdconsentgroup =  (Cosdconsentgroup) session.get(Cosdconsentgroup.class, new BigDecimal(id));
		 	           
		 	          if(!cosdconsentgroup.getCosdconsentgrouptxns().isEmpty())
		 	        	  return "child record found" ; 
		 
		 	           session.delete(cosdconsentgroup);
		 	          	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 	return "deleted" ;
	 }

	 public String update( Cosdconsentgroup cosdconsentgroup ) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdconsentgroup old_cosdconsentgroup  = null ;
	        CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	           /* old_cosdconsentgroup = cosdconsentgroupdao.getById(cosdconsentgroup.getConsentgroupid().longValue());
	            
	            if(old_cosdconsentgroup == null)
	            return "Consent Group - is not present" ;*/
	            
	            //old_cosdauthorizationgroup.setJobid(cosdauthorizationgroup.getJobid());
	            session.update(cosdconsentgroup);
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return "Updated" ;
   }
	 
	 public  List<Cosdconsentgroup> getlistByGroupName(String groupname) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdconsentgroup> cosdconsentgrouplist = null ;
	        try {
	        	
	        	
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Cosdconsentgroup where  name LIKE :grpName ");
	            query.setParameter("grpName","%" + groupname +"%");
	            
	            cosdconsentgrouplist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = cosdconsentgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdconsentgroup cosdconsentgroup = (Cosdconsentgroup) iterator.next();
	                System.out.println("Name " + cosdconsentgroup.getName());
	            }
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        
	        return cosdconsentgrouplist ;
	    }	 

	 public ViewConsentGroup getConsetGrp(CosdconsentgroupVO cosdconsentgroupvo)
	 {
		 ViewConsentGroup viewconsentgroup = new ViewConsentGroup();
		 
		 CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		 Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(cosdconsentgroupvo.getConsentgroupid().longValue());
			
		 String sqlTrans = "select * from COSDABACTRANSACTION trans ,COSDCONSENTGROUPTXN contxn where "
					+ "contxn.TRANSACTIONID = trans.TRANSACTIONID and contxn.CONSENTGROUPID = ? " ;
				
			List<CosdabactransactionVO> trans = new ArrayList<CosdabactransactionVO>();
			Connection con = null ;
			PreparedStatement stmt =  null ;
			ResultSet resultTrans = null ; 
			ResultSet resultAtt = null ;
			PreparedStatement attstmt =  null ;
			try 
			{
				con = JDBCUtil.getConnection_ConsentMgmt() ;
			
				stmt = con.prepareStatement(sqlTrans);
			
				stmt.setInt(1, cosdconsentgroupvo.getConsentgroupid().intValue()); 
			
				resultTrans = stmt.executeQuery();
			
				while(resultTrans.next())
				{
					CosdabactransactionVO attTrans = new CosdabactransactionVO();
					attTrans.setTransactionid(new BigDecimal(resultTrans.getInt("TRANSACTIONID")));
					attTrans.setCreatedby(resultTrans.getString("CREATEDBY"));
					attTrans.setCreatedon(new java.util.Date(resultTrans.getDate("CREATEDON").getTime()));
					attTrans.setDefaultaccess(resultTrans.getString("DEFAULTACCESS"));
					attTrans.setLastupdatedby(resultTrans.getString("LASTUPDATEDBY"));
					attTrans.setLastupdatedon(new java.util.Date(resultTrans.getDate("LASTUPDATEDON").getTime()));
					attTrans.setTransactionname(resultTrans.getString("TRANSACTIONNAME"));
					attTrans.setTransactiontype(resultTrans.getString("TRANSACTIONTYPE"));
					trans.add(attTrans);
				}
				
				ConsentConverter conv = new ConsentConverter();				
				viewconsentgroup.setConsentGroup(conv.convertToVo(cosdconsentgroup));
				viewconsentgroup.setTransList(trans);
			}
			catch(Exception ex)
			{
				try
				{
					if(resultTrans!=null)
					resultTrans.close();
					
					if(stmt!=null)
						stmt.close();
					
					if(con!=null)
						con.close();
				}
				catch(Exception exsql)
				{
					
				}
			}
		 
		 return viewconsentgroup ;
		 
	 }
}
