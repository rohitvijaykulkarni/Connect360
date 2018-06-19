package com.wcm.test;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.TargetDao;
import com.ibm.gbs.consentmgmt.wcm.dto.Target;




public class TargetTest {
	
	@Test
	public void test()
	{
		TargetDao dao = new TargetDao();
		Target target = new Target();
		
		target.setTargetName("Target2");
		target.setTargetAddress("WCM");
		target.setTargetAltAddress("WCM");
		target.setTargetDescription("Target Desc2");
		dao.save(target);
		System.out.println("..Inserted ..");
	}

}
