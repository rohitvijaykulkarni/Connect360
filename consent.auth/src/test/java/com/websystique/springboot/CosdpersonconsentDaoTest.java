package com.websystique.springboot;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdpersonconsentDao;
import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsent;

import ch.qos.logback.core.net.SyslogOutputStream;

public class CosdpersonconsentDaoTest {
	
	/*@Test
    public void saveMethodTest()
	{
		Cosdpersonconsent cosdpersonconsent = new Cosdpersonconsent();
		
			cosdpersonconsent.setAuthpersoncontactinfoone("Authpersoncontactinfoone3");
			cosdpersonconsent.setAuthpersoncontactinfotwo("Authpersoncontactinfo3");
			cosdpersonconsent.setAuthpersonnameone("Authpersonnameone");
			cosdpersonconsent.setAuthpersonnametwo("Authpersonnametwo");
			cosdpersonconsent.setAuthpersonrelone("Role1");
			cosdpersonconsent.setAuthpersonreltwo("role2");
			cosdpersonconsent.setConcernroleid(new BigDecimal("5"));
			cosdpersonconsent.setContactaddressid(new BigDecimal("5"));
			cosdpersonconsent.setContactphone("12345");
			cosdpersonconsent.setThirdpartyfirstname("firstname");
			cosdpersonconsent.setThirdpartylastname("lastname");
			cosdpersonconsent.setThirdpartyotherrelationship("Other_Rel");
			cosdpersonconsent.setThirdpartyrelationship("RelShp");
			
			cosdpersonconsent.setLastupdatedby("UMA");
			cosdpersonconsent.setCreatedby("UMA");
			cosdpersonconsent.setLastupdatedon(new Date());
			cosdpersonconsent.setCreatedon(new Date());
			System.out.println("before");
			    
			    CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao() ;
			  
			cosdpersonconsent = cosdpersonconsentdao.save(cosdpersonconsent) ;
			
			System.out.println("Done");
		
	}
*/
	@Test
	public void test()
	{
		Cosdpersonconsent cosdpersonconsent = new Cosdpersonconsent();
		try
		{
			  CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao() ;
			  cosdpersonconsent.setCustomerName("Michael Cohen");
			  
			 // cosdpersonconsentdao.updateClientID(cosdpersonconsent);//(cosdpersonconsent)
		}
		finally
		{
			
		}
		
	}
}
