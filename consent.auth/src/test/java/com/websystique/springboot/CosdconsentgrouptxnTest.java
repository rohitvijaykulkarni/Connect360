package com.websystique.springboot;

import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdconsentgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdconsentgrouptxnDao;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgrouptxn;

public class CosdconsentgrouptxnTest {
	
	
	@Test
    public void saveMethodTest()
	{
		Cosdconsentgrouptxn cosdconsentgrouptxn = new Cosdconsentgrouptxn() ; 
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		
		//cosdconsentgrouptxn.setConsentgrouptxnid(cosdconsentgrouptxn.getConsentgrouptxnid());
		cosdconsentgrouptxn.setCosdconsentgroup(cosdconsentgroupdao.getById(1));
		cosdconsentgrouptxn.setCreatedby("Rohit");
		cosdconsentgrouptxn.setCreatedon(new Date());
		cosdconsentgrouptxn.setLastupdatedby("Rohit");
		cosdconsentgrouptxn.setLastupdatedon(new Date());
		
		CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
		cosdconsentgrouptxndao.save(cosdconsentgrouptxn);
		
		System.out.println("::saved ::");
	}
	
	@Test
    public void save2MethodTest()
	{
		Cosdconsentgrouptxn cosdconsentgrouptxn = new Cosdconsentgrouptxn() ; 
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		
		//cosdconsentgrouptxn.setConsentgrouptxnid(cosdconsentgrouptxn.getConsentgrouptxnid());
		cosdconsentgrouptxn.setCosdconsentgroup(cosdconsentgroupdao.getById(2));
		cosdconsentgrouptxn.setCreatedby("Rohit");
		cosdconsentgrouptxn.setCreatedon(new Date());
		cosdconsentgrouptxn.setLastupdatedby("Rohit");
		cosdconsentgrouptxn.setLastupdatedon(new Date());
		
		CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
		cosdconsentgrouptxndao.save(cosdconsentgrouptxn);
		
		System.out.println("::saved ::");
	}


}
