package com.websystique.springboot;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdconsentexceptionDao;

public class CosdconsentexceptionDaoTest {
	
	@Test
    public void saveMethodTest(){ 
		
		CosdconsentexceptionDao cosdconsentexceptiondao = new CosdconsentexceptionDao();
		
		cosdconsentexceptiondao.deleteByPersonConsent(127l);
		System.out.println(".. CosdconsentexceptionDaoTest ...");
	}

}
