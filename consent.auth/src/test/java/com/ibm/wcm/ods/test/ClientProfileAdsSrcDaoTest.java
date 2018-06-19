package com.ibm.wcm.ods.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.wcm.dao.CohortDao;
import com.ibm.gbs.consentmgmt.wcm.dto.Cohort;
import com.ibm.wcm.ods.dao.ClientProfileAdsSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileCwSrcDao;
import com.ibm.wcm.ods.dao.CpAdsAbuseSrcDao;
import com.ibm.wcm.ods.dao.CpAdsEncounterSrcDao;
import com.ibm.wcm.ods.dto.ClientProfileAdsSrc;
import com.ibm.wcm.ods.dto.ClientProfileCwSrc;
import com.ibm.wcm.ods.dto.CpAdsAbuseSrc;
import com.ibm.wcm.ods.dto.CpAdsEncounterSrc;

public class ClientProfileAdsSrcDaoTest {

	@Test
	public void test()
	{
		ClientProfileAdsSrcDao clientprofilecwsrcdao = new ClientProfileAdsSrcDao();
		ClientProfileAdsSrc dto = new ClientProfileAdsSrc();
		CpAdsAbuseSrcDao abudao = new CpAdsAbuseSrcDao();
		CpAdsEncounterSrcDao encounterdao = new CpAdsEncounterSrcDao();
		
		CpAdsAbuseSrc cpadsabusesrc = new CpAdsAbuseSrc();
		CpAdsEncounterSrc cpadsencountersrc = new CpAdsEncounterSrc();
		
		List<ClientProfileAdsSrc> Cosdabaccontrolgrouplist = clientprofilecwsrcdao.getlistByClinetID(6234732l); ;
		Set<CpAdsAbuseSrc> cpAdsAbuseSrcs = null ;
		Set<CpAdsEncounterSrc> cpAdsEncounterSrcs = null ;
		
		System.out.println(":: sys 1::"+ Cosdabaccontrolgrouplist.size());
		
		for (Iterator iterator = Cosdabaccontrolgrouplist.iterator(); iterator.hasNext();) {
        	
			ClientProfileAdsSrc clientprofileadssrc = (ClientProfileAdsSrc) iterator.next();
			//cpadsabusesrc= abudao.getByclientProfileAdsSrc(clientprofileadssrc);
			cpadsencountersrc = encounterdao.getByclientProfileAdsSrc(clientprofileadssrc);
        	//clientprofileadssrc.getClientProfileAdsSeqNum();
			System.out.println("DiagnosisForService  :: " + cpadsencountersrc.getDiagnosisForService());
			System.out.println("History  :: " + cpadsabusesrc.getAbuseHistory());
            System.out.println("DischargeStatus  :: " + clientprofileadssrc.getDischargeStatus());
        }
		
		System.out.println("Done ..");
		
		//CP_ADS_ABUSE_SRC, CP_ADS_ENCOUNTER_SRC

	}
}
