package com.wcm.test;

import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.CohortDao;
import com.ibm.gbs.consentmgmt.wcm.dao.CohortRuleDao;
import com.ibm.gbs.consentmgmt.wcm.dao.ReasonCodeDao;
import com.ibm.gbs.consentmgmt.wcm.dto.Cohort;
import com.ibm.gbs.consentmgmt.wcm.dto.CohortRule;
import com.ibm.gbs.wcm.vo.CohortRuleVO;

public class CohortRuleTest {
	
	@Test
	public void test()
	{
		CohortRuleDao dao = new CohortRuleDao();
		Cohort cohort = new Cohort();
		CohortDao CohortDao = new CohortDao();
		ReasonCodeDao reasonDao = new ReasonCodeDao();
		
		cohort= CohortDao.getById(30L);
		
		
		CohortRule cohortRulevo = new CohortRule();
		cohortRulevo.setCohortid(cohort);
		cohortRulevo.setRuleID("Rule2");
		cohortRulevo.setRuleShortDesc("Rule2 shortdesc");
		cohortRulevo.setRuleDescription("Rule2 desc");
		cohortRulevo.setRuleAction("Rule2 Action");
		
		cohortRulevo.setReasonCode(reasonDao.getById("reasoncode1"));
		cohortRulevo.setIsEnabled("Rule2 IsEnabled");
		cohortRulevo.setApprovalRequired("Rule3 ApprovalRequired");
		cohortRulevo.setStartDate(new Date());
		cohortRulevo.setEndDate(new Date());
		cohortRulevo.setCohortid(cohort);
		dao.save(cohortRulevo);
		System.out.println("..Inserted ..");
	}
	
	@Test
	public void test1()
	{
		CohortRuleDao dao = new CohortRuleDao();
		Cohort cohort = new Cohort();
		CohortDao CohortDao = new CohortDao();
		ReasonCodeDao reasonDao = new ReasonCodeDao();
		
		cohort= CohortDao.getById(30L);
		
		CohortRule cohortrule = new CohortRule();
		CohortRule cohortRulevo = new CohortRule();
		cohortRulevo.setCohortid(cohort);
		cohortRulevo.setRuleID("Rule55");
		cohortRulevo.setRuleShortDesc("Rule55 shortdesc");
		cohortRulevo.setRuleDescription("Rule2 desc");
		cohortRulevo.setRuleAction("Rule2 Action");
		
		cohortRulevo.setReasonCode(reasonDao.getById("reasoncode1"));
		cohortRulevo.setIsEnabled("Rule2 IsEnabled");
		cohortRulevo.setApprovalRequired("Rule3 ApprovalRequired");
		cohortRulevo.setStartDate(new Date());
		cohortRulevo.setEndDate(new Date());
		cohortRulevo.setCohortid(cohort);
		dao.save(cohortRulevo);
		System.out.println("..Inserted ..");
	}
	
}
