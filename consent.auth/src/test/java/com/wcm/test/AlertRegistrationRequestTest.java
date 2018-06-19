package com.wcm.test;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.AlertRequestDao;
import com.ibm.gbs.consentmgmt.wcm.dao.RegistrationRequestDao;
import com.ibm.gbs.consentmgmt.wcm.dto.AlertRequest;
import com.ibm.gbs.consentmgmt.wcm.dto.RegistrationRequest;

public class AlertRegistrationRequestTest {
	
	@Test
	public void test()
	{
		/*
		 * BigDecimal cohortID ;
	BigDecimal ruleID ;
	String reasoncode ;
	Date createdDate ;
	String createdByUser ;
	String sourceSys ;
	String sourceSysID ;
	String fName ;
	String lname ;
	
	String status ;
	String comments ;
	
		 */
		AlertRequestDao dao = new AlertRequestDao();
		AlertRequest obj = new AlertRequest();
		
		obj.setCohortID(new BigDecimal(10.0));
		obj.setCreatedDate(new Date());
		obj.setfName("Srinivas");
		obj.setLname("Bokka");
		obj.setReasoncode("reasonCode1");
		obj.setCreatedByUser("Sandy");
		obj.setRuleID(new BigDecimal(20.0));
		obj.setSourceSys("SourceSys");
		obj.setSourceSysID("sourceSysID");
		obj.setStatus("status1");
		obj.setComments("comments");
		
		dao.save(obj);
		System.out.println("Alt Request :: Inserted");
	}
}

