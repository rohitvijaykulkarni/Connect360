package com.websystique.springboot;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ibm.gbs.consentmgmt.dao.CosdabacconstraintDao;
import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolobjectDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.util.Message;
import com.ibm.gbs.vo.CosdabacconstraintVO;

public class CosdabacconstraintTest {
	
	/*@Test
    public void saveMethodTest(){
       
		Cosdabacconstraint cosdabacconstraint = new Cosdabacconstraint();
		
		CosdabacconstraintDao cosdabacconstraintdao =  new CosdabacconstraintDao() ;		
		//cosdabacconstraint.setAttributeconstraintid(new BigDecimal(1100));
		cosdabacconstraint.setAttributename("name");
		cosdabacconstraint.setAttributevalue("Value");
		cosdabacconstraint.setAccessconstrainttype("AType");
		cosdabacconstraint.setCreatedby("SRI");
		cosdabacconstraint.setCreatedon(new Date());
		cosdabacconstraint.setLastupdatedby("IBM_360");
		cosdabacconstraint.setLastupdatedon(new Date());
		
		cosdabacconstraintdao.save(162, 162 ,cosdabacconstraint);
		System.out.println("Constraint Added..");
    }*/
	
	@Test
    public void getConstraintTest(){
		
		System.out.println("Using Group ID - get Constraint -");
		CosdabacconstraintDao cosdabacconstraintdao =  new CosdabacconstraintDao() ;
		cosdabacconstraintdao.delete(128);
	}
	
	
	/*@Test
    public void getConstraintTest(){
		
		System.out.println("Using Group ID - get Constraint -");
		CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
		Cosdabaccontrolobject cosdabaccontrolobject = cosdabaccontrolobjectdao.getByGrpId(60L);
		Cosdabacconstraint cosdabacconstraint = cosdabaccontrolobject.getCosdabacconstraint() ;
		
		if( cosdabacconstraint == null)
			System.out.println("Not Found ..%" );
		
		Converters conv = new Converters();
		
		CosdabacconstraintVO cosdabacconstraintvo = conv.convertToVo(cosdabacconstraint) ;	
		
		System.out.println(":: Type :: " + cosdabacconstraintvo.getAccessconstrainttype());
		
	}
*/
}
