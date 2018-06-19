package com.wcm.test;

import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.ReferralStatusHistDao;
import com.ibm.gbs.consentmgmt.wcm.dao.RegistrationRequestDao;
import com.ibm.gbs.consentmgmt.wcm.dto.ReferralStatusHist;
import com.ibm.gbs.consentmgmt.wcm.dto.RegistrationRequest;

public class HistRefRegTest {

	@Test
	public void test()
	{
		ReferralStatusHistDao dao = new ReferralStatusHistDao();
		ReferralStatusHist hist = new ReferralStatusHist();
		
		RegistrationRequest reg = new RegistrationRequest();
		RegistrationRequestDao daoreg = new RegistrationRequestDao();
		reg = daoreg.getById(42l);
		hist.setRegReq(reg);
		hist.setStatus("Pending");
		hist.setStatusDate(new Date());
		hist.setStatusComments("Waiting for Approval");
		hist.setStatusUser("User1");
		dao.save(hist);
		System.out.println("saved");
	}
}
