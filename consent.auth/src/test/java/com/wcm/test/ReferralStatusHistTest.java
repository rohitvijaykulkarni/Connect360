package com.wcm.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.ReferralStatusHistDao;
import com.ibm.gbs.consentmgmt.wcm.dao.RegistrationRequestDao;
import com.ibm.gbs.consentmgmt.wcm.dto.ReferralStatusHist;
import com.ibm.gbs.consentmgmt.wcm.dto.RegistrationRequest;

public class ReferralStatusHistTest {

	@Test
	public void test() {
		ReferralStatusHistDao histDao = new ReferralStatusHistDao();
		ReferralStatusHist hist = new ReferralStatusHist();

		RegistrationRequestDao regDao = new RegistrationRequestDao();
		RegistrationRequest reg = new RegistrationRequest();

		List<ReferralStatusHist> list = null;

		// http://localhost:8090/TransactionController/saveReferralStatusHist/
		/*reg = regDao.getById(21);
		hist.setRegReq(reg);
		hist.setStatus("Pending");
		hist.setStatusDate(new Date());
		hist.setStatusComments("Waiting for Approval");
		hist.setStatusUser("User1");
		histDao.save(hist);
		System.out.println("saved");*/

		// http://localhost:8090/TransactionController/listAllReferralStatusHist/
		/*list = histDao.getlist();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			hist = (ReferralStatusHist) iterator.next();
			System.out.println("RefStatHistId: " + hist.getHis_reqreqtid() + ", RegReqId: "
					+ hist.getRegReq().getReqReqtID() + ", User: " + hist.getStatusUser() + ", Status: "
					+ hist.getStatus() + ", Comments : " + hist.getStatusComments());
		}*/

		// http://localhost:8090/TransactionController/listAllRefStatusHistByRegReqId/				
		/*list = histDao.getlistWithRegReqID(2);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			hist = (ReferralStatusHist) iterator.next();
			System.out.println("RefStatHistId: " + hist.getHis_reqreqtid() + ", RegReqId: "
					+ hist.getRegReq().getReqReqtID() + ", User: " + hist.getStatusUser() + ", Status: "
					+ hist.getStatus() + ", Comments : " + hist.getStatusComments());
		}*/
		
		// http://localhost:8090/TransactionController/getRefStatusHistByID/				
		/*hist = histDao.getById(11);
		System.out.println("RefStatHistId: " + hist.getHis_reqreqtid() + ", RegReqId: "
				+ hist.getRegReq().getReqReqtID() + ", User: " + hist.getStatusUser() + ", Status: "
				+ hist.getStatus() + ", Comments : " + hist.getStatusComments());*/
		
		// http://localhost:8090/TransactionController/updateReferralStatusHist/
		/*reg = regDao.getById(21);
		hist.setHis_reqreqtid(25);
		hist.setRegReq(reg);
		hist.setStatus("Approved");
		hist.setStatusDate(new Date());
		hist.setStatusComments("Approved");
		hist.setStatusUser("User1");
		histDao.update(hist);
		System.out.println("updated");*/
		
		// http://localhost:8090/TransactionController/deleteReferralStatusHist/
		/*histDao.delete(26);
		System.out.println("deleted");*/
	}
}
