package com.websystique.springboot;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdpersonconsentDao;
import com.ibm.gbs.consentmgmt.dao.OrganisationunitDao;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;

public class OrganisationunitDaoTest {
	
	@Test
    public void saveMethodTest(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode1");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Sonama County");
		organisationunit.setRecordstatus("Rstatus1");
		organisationunit.setWebaddress("Webaddress1");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	
	
	
	/*@Test
    public void saveMethodTest3(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("AllCodes");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("All");
		organisationunit.setRecordstatus("AllStatus");
		organisationunit.setWebaddress("All");
		
		  CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao() ;
		 // cosdpersonconsentdao.insertClientReg(50000l);
		System.out.println("added");
    }*/
	
	/*@Test
    public void saveMethodTest2(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode3");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Org3");
		organisationunit.setRecordstatus("Rstatus3");
		organisationunit.setWebaddress("Webaddress3");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	
	@Test
    public void saveMethodTest1(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode4");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Org4");
		organisationunit.setRecordstatus("RStatus4");
		organisationunit.setWebaddress("Webaddress4");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }*/
	
	/*public void saveMethodTest(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode1");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Child Welfare Services");
		organisationunit.setRecordstatus("Rstatus1");
		organisationunit.setWebaddress("Webaddress1");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	
	@Test
	public void saveMethodTest2(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode2");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Second Chance Adults");
		organisationunit.setRecordstatus("Rstatus2");
		organisationunit.setWebaddress("Webaddress2");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	@Test
	public void saveMethodTest3(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode3");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("New Hope Community");
		organisationunit.setRecordstatus("Rstatus3");
		organisationunit.setWebaddress("Webaddress3");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	@Test
	public void saveMethodTest4(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode4");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Sun Wellness");
		organisationunit.setRecordstatus("Rstatus4");
		organisationunit.setWebaddress("Webaddress4");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	@Test
	public void saveMethodTest5(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode5");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("Good Hope Services");
		organisationunit.setRecordstatus("Rstatus5");
		organisationunit.setWebaddress("Webaddress5");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }
	@Test
	public void saveMethodTest6(){
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao() ;
		Organisationunit organisationunit = new Organisationunit() ;
		
		organisationunit.setBusinesstypecode("BsCode6");
		//organisationunitvo.setOrganisationunitid(organisationunitvo.getOrganisationunitid());
		organisationunit.setName("All");
		organisationunit.setRecordstatus("Rstatus6");
		organisationunit.setWebaddress("Webaddress6");
		
		organisationunitdao.save(organisationunit);
		System.out.println("added");
    }*/

}
