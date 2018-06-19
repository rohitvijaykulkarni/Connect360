package com.websystique.springboot;

import java.math.BigDecimal;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdorgrolejobuserDao;
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;

public class CosdorgrolejobuserDaotest {
	
	
	@Test
    public void saveMethodTest6()
	{ 
		CosdorgrolejobuserDao  cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		Cosdorgrolejobuser cosdorgrolejobuser = new Cosdorgrolejobuser();
		
		//43	All
		cosdorgrolejobuser.setRolename("All");
		cosdorgrolejobuser.setJobName("All");
		cosdorgrolejobuser.setUsername("All");
		cosdorgrolejobuser.setOrgName("All");
		cosdorgrolejobuser.setJobid(new BigDecimal("63"));
		cosdorgrolejobuser.setOrganisationunitid(new BigDecimal("61"));
		cosdorgrolejobuser.setOrgrolejobuserid(new BigDecimal("7"));
		cosdorgrolejobuser.setRolelevel("All");
		cosdorgrolejobuserdao.save(cosdorgrolejobuser);
		System.out.println("1");
	}
	
	/*@Test
    public void saveMethodTest5()
	{ 
		CosdorgrolejobuserDao  cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		Cosdorgrolejobuser cosdorgrolejobuser = new Cosdorgrolejobuser();
		
		//44	New Hope Community
		cosdorgrolejobuser.setRolename("Manager");
		cosdorgrolejobuser.setJobName("Manager");
		cosdorgrolejobuser.setUsername("Kyle");
		cosdorgrolejobuser.setOrgName("New Hope Community");
		cosdorgrolejobuser.setJobid(new BigDecimal("6"));
		cosdorgrolejobuser.setOrganisationunitid(new BigDecimal("44"));
		cosdorgrolejobuser.setOrgrolejobuserid(new BigDecimal("6"));
		cosdorgrolejobuser.setRolelevel("Level 2");
		cosdorgrolejobuserdao.save(cosdorgrolejobuser);
		System.out.println("1");
	}*/
	
	/*@Test
    public void saveMethodTest4()
	{ 
		CosdorgrolejobuserDao  cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		Cosdorgrolejobuser cosdorgrolejobuser = new Cosdorgrolejobuser();
					
		//48	Second Chance Adults
		cosdorgrolejobuser.setRolename("Manager");
		cosdorgrolejobuser.setJobName("Manager");
		cosdorgrolejobuser.setUsername("Karen");
		cosdorgrolejobuser.setOrgName("Sonama County");
		cosdorgrolejobuser.setJobid(new BigDecimal("4"));
		cosdorgrolejobuser.setOrganisationunitid(new BigDecimal("61"));
		cosdorgrolejobuser.setOrgrolejobuserid(new BigDecimal("4"));
		cosdorgrolejobuser.setRolelevel("Level 2");
		cosdorgrolejobuserdao.save(cosdorgrolejobuser);
		System.out.println("1");
	}*/
	
	/*@Test
    public void saveMethodTest3()
	{ 
		
		CosdorgrolejobuserDao  cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		Cosdorgrolejobuser cosdorgrolejobuser = new Cosdorgrolejobuser();
		// 46	Child Welfare Services
		cosdorgrolejobuser.setRolename("Supervisor");
		cosdorgrolejobuser.setJobName("Supervisor");
		cosdorgrolejobuser.setUsername("Laura");
		cosdorgrolejobuser.setOrgName("Child Welfare Services");
		cosdorgrolejobuser.setJobid(new BigDecimal("3"));
		cosdorgrolejobuser.setOrganisationunitid(new BigDecimal("46"));
		cosdorgrolejobuser.setOrgrolejobuserid(new BigDecimal("3"));
		cosdorgrolejobuser.setRolelevel("Level 3");
		cosdorgrolejobuserdao.save(cosdorgrolejobuser);
		System.out.println("1");
	}*/
	
	/*@Test
    public void saveMethodTest()
	{ 
		CosdorgrolejobuserDao  cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		Cosdorgrolejobuser cosdorgrolejobuser = new Cosdorgrolejobuser();
		
		cosdorgrolejobuser.setRolename("Caseworker");
		cosdorgrolejobuser.setJobName("Caseworker");
		cosdorgrolejobuser.setUsername("Sandy");
		cosdorgrolejobuser.setOrgName("Sonama County");
		cosdorgrolejobuser.setJobid(new BigDecimal("2"));
		cosdorgrolejobuser.setOrganisationunitid(new BigDecimal("61"));
		cosdorgrolejobuser.setOrgrolejobuserid(new BigDecimal("2"));
		cosdorgrolejobuser.setRolelevel("Level 1");
		//47	Sun Wellness
		cosdorgrolejobuserdao.save(cosdorgrolejobuser);
		System.out.println("1");
	}*/
	
	
	
	
	/*@Test
    public void saveMethodTest2()
	{  // 45	Good Hope Services
		CosdorgrolejobuserDao  cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		Cosdorgrolejobuser cosdorgrolejobuser = new Cosdorgrolejobuser();
		
		cosdorgrolejobuser.setRolename("Caseworker");
		cosdorgrolejobuser.setJobName("Caseworker");
		cosdorgrolejobuser.setUsername("James");
		cosdorgrolejobuser.setOrgName("Good Hope Services");
		cosdorgrolejobuser.setJobid(new BigDecimal("1"));
		cosdorgrolejobuser.setOrganisationunitid(new BigDecimal("45"));
		cosdorgrolejobuser.setOrgrolejobuserid(new BigDecimal("1"));
		cosdorgrolejobuser.setRolelevel("Level 1");
		cosdorgrolejobuserdao.save(cosdorgrolejobuser);
		System.out.println("1");
	}*/

}
