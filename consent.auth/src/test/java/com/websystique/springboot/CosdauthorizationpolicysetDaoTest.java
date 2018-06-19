package com.websystique.springboot;

import java.math.BigDecimal;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdauthorizationpolicysetDao;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicyset;

public class CosdauthorizationpolicysetDaoTest {

	
	/*@Test
    public void saveMethodTest1()
	{
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = new Cosdauthorizationpolicyset();
		
		//cosdauthorizationpolicyset.setPolicysetid(new BigDecimal("600"));
		cosdauthorizationpolicyset.setClassificationlevel("A");
		cosdauthorizationpolicyset.setComments("policyset Comments1");
		cosdauthorizationpolicyset.setConsentstatus("Yes");
		cosdauthorizationpolicyset.setPolicysetid(new BigDecimal("600"));
		
		cosdauthorizationpolicysetdao.save(cosdauthorizationpolicyset);
		System.out.println("done..inserted");
	}
	
	@Test
    public void saveMethodTest2()
	{
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = new Cosdauthorizationpolicyset();
		
		cosdauthorizationpolicyset.setPolicysetid(new BigDecimal("601"));
		cosdauthorizationpolicyset.setClassificationlevel("A");
		cosdauthorizationpolicyset.setComments("policyset Comments1");
		cosdauthorizationpolicyset.setConsentstatus("Yes");
		
		cosdauthorizationpolicysetdao.save(cosdauthorizationpolicyset);
		System.out.println("done..inserted");
	}*/
	
	/*@Test
    public void saveMethodTest2()
	{
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(4);
		
		System.out.println(":: ::->" + cosdauthorizationpolicyset.getComments());
	}*/
	
	@Test
	public void saveTest3()
	{
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		cosdauthorizationpolicysetdao.getViewPolicyAuthGroup(500l);
	}
}
