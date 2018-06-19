package com.websystique.springboot;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdabacconstraintDao;
import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdabactransactionDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.vo.CosdabacconstraintVO;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CosdabaccontrolgroupDaoTest {
	
	
	/*String QUERY = "FROM Person as p WHERE p.createUser = : createUser 
		     AND p.personId in " +
		     "(SELECT pn.personId FROM PersonName pn " + 
		     "WHERE pn.personNameType = 'FIRST' " + 
		     "AND pn.name LIKE CONCAT('%', :firstName, '%'))";

		(List<Person>)session.createQuery(QUERY)
		    .setString("createUser", createUser)
		    .setString("firstName", firstName).list();*/
	
	// From Cosdabactransaction as txn where txn.transactionid in ( Select CG.transactionid FROM Cosdabaccontrolgroup CG , Cosdabaccontrolobject CO where CG.)
	
	/*{
	    "controlgroupid": 12,
	    "controlgroupname": "in",
	    "createdby": "UMA",
	    "createdon": "2017-10-09",
	    "lastupdatedby": "Rohit",
	    "lastupdatedon": "2017-10-09"
	}*/
	
	/*@Test
    public void saveMethodTest()
	{
       
		Cosdabaccontrolgroup cosdabaccontrolgroup = new Cosdabaccontrolgroup();
		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao =  new CosdabaccontrolgroupDao() ;		
		
		//cosdabaccontrolgroup.setControlgroupid(new BigDecimal("1108"));
		cosdabaccontrolgroup.setControlgroupname("Object2");
		cosdabaccontrolgroup.setCreatedby("Object2");
		cosdabaccontrolgroup.setCreatedon(new Date());
		cosdabaccontrolgroup.setLastupdatedby("Srinivas");
		cosdabaccontrolgroup.setLastupdatedon(new Date());
		
		cosdabaccontrolgroupdao.save(cosdabaccontrolgroup);
		System.out.println("Constraint Added..");
		System.out.println("2nd Insert");
    }*/
	
	@Test
    public void deleteMethodTest()
	{
       		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao =  new CosdabaccontrolgroupDao() ;		
		
		List<CosdabacconstraintVO> listvo = cosdabaccontrolgroupdao.searchAttributeData("txn") ;
		
		System.out.println(".. Txn ...." + listvo.size());
		
    }
	
	/*@Test
    public void getListTest(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		List<Cosdabaccontrolgroup> list = cosdabaccontrolgroupdao.getlist() ;
		list.size() ;		
		
		System.out.println("2nd Insert" +  list.size());
    }*/
	
	/*@Test
    public void getListTestByGrpName(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		List<Cosdabaccontrolgroup> list = cosdabaccontrolgroupdao.getlistByGroupName("demo");
		list.size() ;
		
		System.out.println("Grp Name Size ::" +  list.size());
    }*/
	
	/*@Test
    public void getByIdTest(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		cosdabaccontrolgroupdao.getById(1L);
		
		System.out.println("Done ");
    }*/
	
	/*@Test
    public void delGrpName(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		long del = Long.parseLong("108");
		cosdabaccontrolgroupdao.delete(del);
		
		
		System.out.println("Grp Name");
    }*/

	@Test
    public void delGrpName(){
       
		//CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		
		CosdabactransactionDao transgrp = new CosdabactransactionDao();
		transgrp.saveExistingWithControl(404, 496);
		
		System.out.println("Grp Name");
    }
}
