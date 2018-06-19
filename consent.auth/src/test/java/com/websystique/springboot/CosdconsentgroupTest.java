package com.websystique.springboot;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdconsentgroupDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.vo.CosdconsentgroupVO;

public class CosdconsentgroupTest {
	
	@Test
    public void saveMethodTest()
	{
		Cosdconsentgroup cosdconsentgroup = new Cosdconsentgroup() ; 
		
		cosdconsentgroup.setName("consentone");
		cosdconsentgroup.setDescription("consent Desc1");
		
		cosdconsentgroup.setCreatedby("Rohit");
		cosdconsentgroup.setCreatedon(new Date());
		
		cosdconsentgroup.setLastupdatedby("Rohit");
		cosdconsentgroup.setLastupdatedon(new Date());
		
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		cosdconsentgroupdao.save(cosdconsentgroup);
	}

	
	/*@Test
    public void save2MethodTest()
	{
		Cosdconsentgroup cosdconsentgroup = new Cosdconsentgroup() ; 
		
		cosdconsentgroup.setName("consenttwo");
		cosdconsentgroup.setDescription("consent Desc2");
		
		cosdconsentgroup.setCreatedby("Rohit");
		cosdconsentgroup.setCreatedon(new Date());
		
		cosdconsentgroup.setLastupdatedby("Rohit");
		cosdconsentgroup.setLastupdatedon(new Date());
		
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		cosdconsentgroupdao.save(cosdconsentgroup);
	}
	
	@Test
    public void save3MethodTest()
	{
		Cosdconsentgroup cosdconsentgroup = new Cosdconsentgroup() ; 
		
		cosdconsentgroup.setName("consent3");
		cosdconsentgroup.setDescription("consent Desc3");
		
		cosdconsentgroup.setCreatedby("Rohit");
		cosdconsentgroup.setCreatedon(new Date());
		
		cosdconsentgroup.setLastupdatedby("Rohit");
		cosdconsentgroup.setLastupdatedon(new Date());
		
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		cosdconsentgroupdao.save(cosdconsentgroup);
	}*/
	
	/*@Test
    public void save3MethodTest()
	{
		CosdconsentgroupVO cosdconsentgroupvo = new CosdconsentgroupVO() ;
		cosdconsentgroupvo.setConsentgroupid(new BigDecimal(1l));	
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		cosdconsentgroupdao.getConsetGrp(cosdconsentgroupvo);
		System.out.println("Done ..");
	}*/
	
	/*@Test
    public void save3MethodTest()
	{
		CosdconsentgroupVO cosdconsentgroupvo = new CosdconsentgroupVO() ;
		cosdconsentgroupvo.setConsentgroupid(new BigDecimal(1l));	
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		List<Cosdconsentgroup> Cosdconsentgrouplist  = cosdconsentgroupdao.getlistByGroupName("con");
		System.out.println("Done .." + Cosdconsentgrouplist.size());
	}*/
	
}
