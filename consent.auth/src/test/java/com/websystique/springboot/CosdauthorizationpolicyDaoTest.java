package com.websystique.springboot;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdauthorizationgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationpolicyDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationpolicysetDao;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicy;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicyset;

public class CosdauthorizationpolicyDaoTest {
	
	@Test
    public void saveMethodTest1()
	{
		CosdauthorizationpolicyDao cosdauthorizationpolicydao = new CosdauthorizationpolicyDao();
		CosdauthorizationgroupDao  cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao(); 
		
		Cosdauthorizationpolicy cosdauthorizationpolicy = new Cosdauthorizationpolicy();
		Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(26) ;
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(500);
		
		cosdauthorizationpolicy.setCosdauthorizationgroup(cosdauthorizationgroup);
		cosdauthorizationpolicy.setCosdauthorizationpolicyset(cosdauthorizationpolicyset);
		cosdauthorizationpolicy.setPolicyComments("1 Policy AuthGroup");
		
		cosdauthorizationpolicydao.save(cosdauthorizationpolicy);
		
		System.out.println("save ..1");
	}
	
	/*@Test
    public void saveMethodTest2()
	{
		CosdauthorizationpolicyDao cosdauthorizationpolicydao = new CosdauthorizationpolicyDao();
		CosdauthorizationgroupDao  cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao(); 
		
		Cosdauthorizationpolicy cosdauthorizationpolicy = new Cosdauthorizationpolicy();
		Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(1501l) ;
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(600);
		
		cosdauthorizationpolicy.setCosdauthorizationgroup(cosdauthorizationgroup);
		cosdauthorizationpolicy.setCosdauthorizationpolicyset(cosdauthorizationpolicyset);
		cosdauthorizationpolicy.setPolicyComments("1 Policy AuthGroup");
		
		cosdauthorizationpolicydao.save(cosdauthorizationpolicy);
		
		System.out.println("save ..2");
	}*/

}
