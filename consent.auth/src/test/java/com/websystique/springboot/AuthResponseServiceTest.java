package com.websystique.springboot;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.AuthRequestDao;
import com.ibm.gbs.consentmgmt.dto.AuthRequest;
import com.ibm.gbs.consentmgmt.service.AuthResponseService;
import com.ibm.gbs.vo.AuthRequestVO;

public class AuthResponseServiceTest {
	
	/*@Test
    public void saveMethodTest()
	{
		AuthResponseService authresponseservice =  new AuthResponseService();
		AuthRequestVO authrequestvo = new AuthRequestVO(); 
		// tue_tn
		// hghg
		authrequestvo.setApiSwith("Policy");
		authrequestvo.setTransName("hghg");
		authresponseservice.usePolicyData(authrequestvo) ;
	}*/
	
	@Test
    public void saveMethodTest()
	{
		AuthResponseService authresponseservice =  new AuthResponseService();
		AuthRequestVO authrequestvo = new AuthRequestVO();
		AuthRequest authrequest = new AuthRequest(); 
		// tue_tn
		// hghg
		authrequestvo.setApiSwith("Policy");
		authrequestvo.setTransName("hghg");
		authresponseservice.usePolicyData(authrequestvo) ;
		
		authrequest.setApiSwith("Policy");
		authrequest.setTransName("hghg");
		AuthRequestDao AuthRequestDao = new AuthRequestDao();
		
		AuthRequestDao.save(authrequest);
		System.out.println("Inserted");
		
	}

}
