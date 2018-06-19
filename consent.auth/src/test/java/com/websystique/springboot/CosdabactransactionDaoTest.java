package com.websystique.springboot;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolobjectDao;
import com.ibm.gbs.consentmgmt.dao.CosdabactransactionDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabactransactionVO;

public class CosdabactransactionDaoTest {
	
	/*@Test
    public void saveMethodTest(){       
	
		CosdabactransactionDao cosdabactransactiondao =  new CosdabactransactionDao() ;		
		Cosdabactransaction cosdabactransaction = new Cosdabactransaction();
		
		//cosdabactransaction.setTransactionid(new BigDecimal(220));
		cosdabactransaction.setTransactiontype("TTT");
		cosdabactransaction.setTransactionname("Trans_TTT");
		cosdabactransaction.setDefaultaccess("Default");
		cosdabactransaction.setCreatedby("ROHITK");
		cosdabactransaction.setCreatedon(new Date());
		cosdabactransaction.setLastupdatedby("IBM_360");
		cosdabactransaction.setLastupdatedon(new Date());
		cosdabactransactiondao.saveWithConsent(1, cosdabactransaction);
		
		//cosdabactransactiondao.
		System.out.println("2nd Insert");
    }*/
	
	/*@Test
    public void getConstraintTest(){
		
		System.out.println("Using Group ID - get Constraint -");
		CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
		Cosdabaccontrolobject cosdabaccontrolobject = cosdabaccontrolobjectdao.getByGrpId(60L);
		Cosdabactransaction cosdabactransaction = cosdabaccontrolobject.getCosdabactransaction() ;
		
		if( cosdabactransaction == null)
			System.out.println("Not Found ..%" );
		
		Converters conv = new Converters();
		
		CosdabactransactionVO cosdabactransactionvo = conv.convertToVo(cosdabactransaction) ;	
		
		System.out.println(":: Name Trans :: " + cosdabactransactionvo.getTransactionname());
		
	}*/
	
	@Test
	public void deleteMethod()
	{
		CosdabactransactionDao cosdabactransactiondao =  new CosdabactransactionDao() ;	
		cosdabactransactiondao.deleteConsentTxn(175);
		System.out.println("deleted");
	}

	/*@Test
    public void deleteMethodTest(){       
	
		CosdabactransactionDao cosdabactransactiondao =  new CosdabactransactionDao() ;		
		Cosdabactransaction cosdabactransaction = new Cosdabactransaction();
		
		cosdabactransaction.setTransactionid(new BigDecimal(200));
		cosdabactransaction.setTransactiontype("Type");
		cosdabactransaction.setTransactionname("NameT");
		cosdabactransaction.setDefaultaccess("Default");
		cosdabactransaction.setCreatedby("ROHITK");
		cosdabactransaction.setCreatedon(new Date());
		cosdabactransaction.setLastupdatedby("IBM_360");
		cosdabactransaction.setLastupdatedon(new Date());
		cosdabactransactiondao.delete(200L);
		System.out.println("2nd Insert");
    }*/
}
