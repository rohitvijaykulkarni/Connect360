package com.wcm.test;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.ReasonCodeDao;
import com.ibm.gbs.consentmgmt.wcm.dto.ReasonCode;

public class ReasonCodeTest {

	@Test
	public void test()
	{
		ReasonCode reasonCode = new ReasonCode();
		ReasonCodeDao dao = new ReasonCodeDao();
		
		reasonCode.setReasonCode("reasonCode3");
		reasonCode.setReasonDesc("reasonDesc3");
		dao.save(reasonCode);
		System.out.println("Inserted ..reason code");
	}
}
