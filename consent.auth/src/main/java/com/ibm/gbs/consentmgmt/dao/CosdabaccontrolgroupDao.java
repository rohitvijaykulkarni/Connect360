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
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.JDBCUtil;
import com.ibm.gbs.vo.ATTCosdabactransactionVO;
import com.ibm.gbs.vo.AllControlGroup;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.CosdabactransactionVO;

public class CosdabaccontrolgroupDao {
	
	
	public List<CosdabacconstraintVO> searchAttributeData(String transName)
	{
		AllControlGroup allcontrolgroup = new AllControlGroup();
		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		//Cosdabaccontrolgroup cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(cosdabaccontrolgroupvo.getControlgroupid().longValue());
		Converters conv = new Converters();
		
		//allcontrolgroup.setControlGroup(conv.convertToVo(cosdabaccontrolgroup));
		String sqlTrans = "select DISTINCT cobj.CONTROLGROUPID as grpid , trans.TRANSACTIONID , trans.CREATEDBY , trans.CREATEDON ,trans.DEFAULTACCESS , trans.LASTUPDATEDBY , trans.LASTUPDATEDON , trans.TRANSACTIONNAME , trans.TRANSACTIONTYPE from COSDABACTRANSACTION trans ,COSDABACCONTROLOBJECT cobj where "
				+ " cobj.TRANSACTIONID = trans.TRANSACTIONID and   trans.TRANSACTIONNAME =?" ;
		
		String sqlConstraint = "select * from COSDABACCONSTRAINT const ,COSDABACCONTROLOBJECT cobj where "
				+ "cobj.attributeconstraintid = const.attributeconstraintid and cobj.CONTROLGROUPID = ? and cobj.transactionid = ? ";
		
		List<ATTCosdabactransactionVO> trans = new ArrayList<ATTCosdabactransactionVO>();
		List<CosdabacconstraintVO>  attributeslist = null ;
		Connection con = null ;
		PreparedStatement stmt =  null ;
		ResultSet resultTrans = null ; 
		ResultSet resultAtt = null ;
		PreparedStatement attstmt =  null ;
		try
		{
			con = JDBCUtil.getConnection_ConsentMgmt() ;
			
			stmt = con.prepareStatement(sqlTrans);
			
			stmt.setString(1, transName);
			
			resultTrans = stmt.executeQuery();
			
			while(resultTrans.next()) 
			{
				attstmt =  null ;
				ATTCosdabactransactionVO attTrans = new ATTCosdabactransactionVO();
				attTrans.setTransactionid(new BigDecimal(resultTrans.getInt("TRANSACTIONID")));
				attTrans.setCreatedby(resultTrans.getString("CREATEDBY"));
				attTrans.setCreatedon(new java.util.Date(resultTrans.getDate("CREATEDON").getTime()));
				attTrans.setDefaultaccess(resultTrans.getString("DEFAULTACCESS"));
				attTrans.setLastupdatedby(resultTrans.getString("LASTUPDATEDBY"));
				attTrans.setLastupdatedon(new java.util.Date(resultTrans.getDate("LASTUPDATEDON").getTime()));
				attTrans.setTransactionname(resultTrans.getString("TRANSACTIONNAME"));
				attTrans.setTransactiontype(resultTrans.getString("TRANSACTIONTYPE"));
				
				System.out.println("::TRANSACTIONID ::"+ resultTrans.getInt("TRANSACTIONID"));
				try
				{
					attstmt = con.prepareStatement(sqlConstraint);
					attstmt.setInt(1, resultTrans.getInt("grpid"));
					attstmt.setInt(2, resultTrans.getInt("TRANSACTIONID"));
					attributeslist = new<CosdabacconstraintVO> ArrayList() ;
					resultAtt = attstmt.executeQuery();
					while(resultAtt.next())
					{
						CosdabacconstraintVO attributes = new CosdabacconstraintVO();
						attributes.setAttributeconstraintid(new BigDecimal(resultAtt.getInt("ATTRIBUTECONSTRAINTID")));
						attributes.setAccessconstrainttype(resultAtt.getString("ACCESSCONSTRAINTTYPE"));
						attributes.setAttributename(resultAtt.getString("ATTRIBUTENAME"));
						attributes.setAttributevalue(resultAtt.getString("ATTRIBUTEVALUE"));
						attributes.setCreatedby(resultAtt.getString("CREATEDBY"));
						attributes.setLastupdatedby(resultAtt.getString("LASTUPDATEDBY"));
						attributes.setCreatedon(new java.util.Date(resultTrans.getDate("CREATEDON").getTime()));
						attributes.setLastupdatedon(new java.util.Date(resultTrans.getDate("LASTUPDATEDON").getTime()));
						System.out.println("::ATTRIBUTECONSTRAINTID ::"+ resultAtt.getInt("ATTRIBUTECONSTRAINTID"));
						attributeslist.add(attributes);
						//attTrans.setCosdabacconstraintvo(attributes);
					}
					
					attTrans.setCosdabacconstraintvo(attributeslist);
				}
				finally
				{
					if(resultAtt!=null)
						resultAtt.close();
						
						if(attstmt!=null)
							attstmt.close();
				}
				trans.add(attTrans);
			}
			
			allcontrolgroup.setTransaction(trans);
		}
		catch(Exception ex)
		{
			
		}
		finally
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
		
		
		return attributeslist ;
		
	}
	
	public AllControlGroup searchControlData(CosdabaccontrolgroupVO cosdabaccontrolgroupvo)
	{
		AllControlGroup allcontrolgroup = new AllControlGroup();
		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		Cosdabaccontrolgroup cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(cosdabaccontrolgroupvo.getControlgroupid().longValue());
		Converters conv = new Converters();
		
		allcontrolgroup.setControlGroup(conv.convertToVo(cosdabaccontrolgroup));
		String sqlTrans = "select DISTINCT trans.TRANSACTIONID , trans.CREATEDBY , trans.CREATEDON ,trans.DEFAULTACCESS , trans.LASTUPDATEDBY , trans.LASTUPDATEDON , trans.TRANSACTIONNAME , trans.TRANSACTIONTYPE from COSDABACTRANSACTION trans ,COSDABACCONTROLOBJECT cobj where "
				+ " cobj.TRANSACTIONID = trans.TRANSACTIONID and cobj.CONTROLGROUPID = ? " ;
		
		String sqlConstraint = "select * from COSDABACCONSTRAINT const ,COSDABACCONTROLOBJECT cobj where "
				+ "cobj.attributeconstraintid = const.attributeconstraintid and cobj.CONTROLGROUPID = ? and cobj.transactionid = ? ";
		
		List<ATTCosdabactransactionVO> trans = new ArrayList<ATTCosdabactransactionVO>();
		Connection con = null ;
		PreparedStatement stmt =  null ;
		ResultSet resultTrans = null ; 
		ResultSet resultAtt = null ;
		PreparedStatement attstmt =  null ;
		try
		{
			con = JDBCUtil.getConnection_ConsentMgmt() ;
			
			stmt = con.prepareStatement(sqlTrans);
			
			stmt.setInt(1, cosdabaccontrolgroup.getControlgroupid().intValue());
			
			resultTrans = stmt.executeQuery();
			
			while(resultTrans.next()) 
			{
				attstmt =  null ;
				ATTCosdabactransactionVO attTrans = new ATTCosdabactransactionVO();
				attTrans.setTransactionid(new BigDecimal(resultTrans.getInt("TRANSACTIONID")));
				attTrans.setCreatedby(resultTrans.getString("CREATEDBY"));
				attTrans.setCreatedon(new java.util.Date(resultTrans.getDate("CREATEDON").getTime()));
				attTrans.setDefaultaccess(resultTrans.getString("DEFAULTACCESS"));
				attTrans.setLastupdatedby(resultTrans.getString("LASTUPDATEDBY"));
				attTrans.setLastupdatedon(new java.util.Date(resultTrans.getDate("LASTUPDATEDON").getTime()));
				attTrans.setTransactionname(resultTrans.getString("TRANSACTIONNAME"));
				attTrans.setTransactiontype(resultTrans.getString("TRANSACTIONTYPE"));
				
				System.out.println("::TRANSACTIONID ::"+ resultTrans.getInt("TRANSACTIONID"));
				try
				{
					attstmt = con.prepareStatement(sqlConstraint);
					attstmt.setInt(1, cosdabaccontrolgroup.getControlgroupid().intValue());
					attstmt.setInt(2, resultTrans.getInt("TRANSACTIONID"));
					List<CosdabacconstraintVO>  attributeslist = new<CosdabacconstraintVO> ArrayList() ;
					resultAtt = attstmt.executeQuery();
					while(resultAtt.next())
					{
						CosdabacconstraintVO attributes = new CosdabacconstraintVO();
						attributes.setAttributeconstraintid(new BigDecimal(resultAtt.getInt("ATTRIBUTECONSTRAINTID")));
						attributes.setAccessconstrainttype(resultAtt.getString("ACCESSCONSTRAINTTYPE"));
						attributes.setAttributename(resultAtt.getString("ATTRIBUTENAME"));
						attributes.setAttributevalue(resultAtt.getString("ATTRIBUTEVALUE"));
						attributes.setCreatedby(resultAtt.getString("CREATEDBY"));
						attributes.setLastupdatedby(resultAtt.getString("LASTUPDATEDBY"));
						attributes.setCreatedon(new java.util.Date(resultTrans.getDate("CREATEDON").getTime()));
						attributes.setLastupdatedon(new java.util.Date(resultTrans.getDate("LASTUPDATEDON").getTime()));
						System.out.println("::ATTRIBUTECONSTRAINTID ::"+ resultAtt.getInt("ATTRIBUTECONSTRAINTID"));
						attributeslist.add(attributes);
						//attTrans.setCosdabacconstraintvo(attributes);
					}
					
					attTrans.setCosdabacconstraintvo(attributeslist);
				}
				finally
				{
					if(resultAtt!=null)
						resultAtt.close();
						
						if(attstmt!=null)
							attstmt.close();
				}
				trans.add(attTrans);
			}
			
			allcontrolgroup.setTransaction(trans);
		}
		catch(Exception ex)
		{
			
		}
		finally
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
		
		
		return allcontrolgroup ;
		
	}

	 public void save(Cosdabaccontrolgroup cosdaBaControlGroup) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            Cosdabaccontrolobject cosdabaccontrolobject = new Cosdabaccontrolobject ();	            
	            session.save(cosdaBaControlGroup);	            
	            cosdabaccontrolobject.setCosdabaccontrolgroup(cosdaBaControlGroup);
	           
	            
	            transaction.commit();
	        }catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
       }
	 
	 
	 public  List<Cosdabaccontrolgroup> getlist() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabaccontrolgroup> Cosdabaccontrolgrouplist = null ;
	        try {
	              
	            transaction = session.beginTransaction();
	            Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup").list();
	            for (Iterator iterator = Cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdabaccontrolgroup cosdabaccontrolgroup = (Cosdabaccontrolgroup) iterator.next();
	                System.out.println("Name " + cosdabaccontrolgroup.getControlgroupname());
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
	 
	 
	/* String QUERY = "FROM Person as p WHERE p.createUser = : createUser 
		     AND p.personId in " +
		     "(SELECT pn.personId FROM PersonName pn " + 
		     "WHERE pn.personNameType = 'FIRST' " + 
		     "AND pn.name LIKE :firstName)";

		(List<Person>)session.createQuery(QUERY)
		    .setString("createUser", createUser)
		    .setString("firstName", "%" + firstName + "%").list();*/
	 
	 
	 public  List<Cosdabaccontrolgroup> getlistByGroupName(String groupname) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        List<Cosdabaccontrolgroup> Cosdabaccontrolgrouplist = null ;
	        try {
	        	
	        	
	              
	            transaction = session.beginTransaction();
	            
	            Query query = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname LIKE :grpName ");
	            query.setParameter("grpName","%" + groupname +"%");
	            
	            Cosdabaccontrolgrouplist = query.list();
	            //Cosdabaccontrolgrouplist = session.createQuery("from Cosdabaccontrolgroup where  controlgroupname = :code").list();
	            for (Iterator iterator = Cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
	            	Cosdabaccontrolgroup cosdabaccontrolgroup = (Cosdabaccontrolgroup) iterator.next();
	                System.out.println("Name " + cosdabaccontrolgroup.getControlgroupname());
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
	 
	 
	 public Cosdabaccontrolgroup getById(long id)
	 {
		 
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabaccontrolgroup cosdabaccontrolGroup = null ;
	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		              cosdabaccontrolGroup = (Cosdabaccontrolgroup) session.get(Cosdabaccontrolgroup.class, new BigDecimal(id));
		              if(cosdabaccontrolGroup != null)
		 	          System.out.println(cosdabaccontrolGroup.getControlgroupid() + " - " + cosdabaccontrolGroup.getControlgroupname());	 
		 	          session.getTransaction().commit();
		         }		 
		 	catch (HibernateException e) {		 
		 	            e.printStackTrace();		 
		 	            session.getTransaction().rollback();
		 
		 	    }
		 		finally {
	            session.close();
	        }
		 	return cosdabaccontrolGroup;
	 }
	 
	 public void deleteChild(Cosdabaccontrolobject cosdabaccontrolobject )
	 {
		 long txn = 0 ;
		 long constraint = 0 ;
		 CosdabacconstraintDao cosdabacconstraintdao = new CosdabacconstraintDao();
		 CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		 
		 if(cosdabaccontrolobject.getCosdabactransaction() != null )
		 {
			 txn = cosdabaccontrolobject.getCosdabactransaction().getTransactionid().longValue() ;
			 
			// cosdabactransactiondao.delete(txn);
			 
		 }
		 if(cosdabaccontrolobject.getCosdabacconstraint() != null)
		 {
			 constraint = cosdabaccontrolobject.getCosdabacconstraint().getAttributeconstraintid().longValue() ;
			
			 //cosdabacconstraintdao.delete(constraint);
		 }
		
	 }
	 
	 public String delete(long id)
	 {
		  CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
		  
		  Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction transaction = null;
	      Cosdabaccontrolgroup cosdabaccontrolGroup = null ;	      
		 	try {		 
		 	          session.beginTransaction();		 	             
		              cosdabaccontrolGroup = (Cosdabaccontrolgroup) session.get(Cosdabaccontrolgroup.class, new BigDecimal(id));
		              
		               cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao() ;
		               Cosdabaccontrolobject cosdabaccontrolobject = cosdabaccontrolobjectdao.getByGrpId(id) ;
		              
		              if(cosdabaccontrolobject !=null && cosdabaccontrolobject.getCosdabactransaction() !=null )
		              {
		            	  System.out.println("Error-child record present");
		            	  return "Error-child record present" ;
		              }
		              
		              session.delete(cosdabaccontrolGroup);       
		              
		              
		 	          System.out.println(cosdabaccontrolGroup.getControlgroupid() + " - " + cosdabaccontrolGroup.getControlgroupname());	 
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
	 
	 public String update( Cosdabaccontrolgroup cosdabaccontrolGroup) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        Cosdabaccontrolgroup old_cosdabaccontrolGroup = null ;
	        CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
	        try {
	              
	            transaction = session.beginTransaction();
	            
	            old_cosdabaccontrolGroup = cosdabaccontrolgroupdao.getById(cosdabaccontrolGroup.getControlgroupid().longValue());
	            
	            if(old_cosdabaccontrolGroup == null)
	            return "Group is not present" ;
	            
	            old_cosdabaccontrolGroup.setControlgroupname(cosdabaccontrolGroup.getControlgroupname());
	            session.update(old_cosdabaccontrolGroup);
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
