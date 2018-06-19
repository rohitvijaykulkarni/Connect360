package com.wcm.test;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.CohortDao;
import com.ibm.gbs.consentmgmt.wcm.dao.CohortTargetDao;
import com.ibm.gbs.consentmgmt.wcm.dao.TargetDao;
import com.ibm.gbs.consentmgmt.wcm.dto.Cohort;
import com.ibm.gbs.consentmgmt.wcm.dto.CohortTarget;
import com.ibm.gbs.consentmgmt.wcm.dto.Target;



public class CohortTargetTest {

	/*@Test
	public void test()
	{
		CohortTargetDao dao = new CohortTargetDao();
		CohortTarget target = new CohortTarget();
		Target t1 = new Target();
		TargetDao d = new TargetDao();
		t1 = d.getById(1L);
		Cohort cohort = new Cohort();
		CohortDao CohortDao = new CohortDao();
		
		cohort= CohortDao.getById(3L);
		target.setName("First");
		target.setCohortid(cohort);
		target.setTargetedID(t1);
		dao.save(target);
		System.out.println("..Inserted ..");
	}
	
	@Test
	public void test1()
	{
		CohortTargetDao dao = new CohortTargetDao();
		CohortTarget target = new CohortTarget();
		Target t1 = new Target();
		TargetDao d = new TargetDao();
		t1 = d.getById(2L);
		Cohort cohort = new Cohort();
		CohortDao CohortDao = new CohortDao();
		
		cohort= CohortDao.getById(3L);
		target.setName("Second");
		target.setCohortid(cohort);
		target.setTargetedID(t1);
		dao.save(target);
		System.out.println("..Inserted ..");
	}*/
	
	@Test
	public void test2()
	{
		CohortTargetDao dao = new CohortTargetDao();
		CohortTarget target = new CohortTarget();
		
		
		
		dao.getlistTarget(1l);
		System.out.println("..getlistTarget ..");
	}
}
