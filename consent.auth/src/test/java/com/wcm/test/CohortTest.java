package com.wcm.test;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.CohortDao;
import com.ibm.gbs.consentmgmt.wcm.dao.CohortRuleDao;
import com.ibm.gbs.consentmgmt.wcm.dto.Cohort;



public class CohortTest {

	
	@Test
	public void test()
	{
		CohortRuleDao cohort= new CohortRuleDao();
		cohort.searchCohortRule(61l);
		System.out.println("::: ---:::");
	}
	/*@Test
	public void test()
	{
		CohortDao dao = new CohortDao();
		Cohort cohort = new Cohort();
		
		cohort.setName("CohortRule1");
		cohort.setCohortdescription("2nd");
		dao.save(cohort);
		System.out.println("..Inserted ..");
	}*/
	
	/*@Test
	public void test()
	{
		CohortDao dao = new CohortDao();
		Cohort cohort = new Cohort();
		
		cohort.setName("CohortRule1");
		cohort.setCohortdescription("2nd");
		dao.save(cohort);
		dao.getlistwithName("CohortRule1");
		System.out.println("..selected ..");
	}*/
}
