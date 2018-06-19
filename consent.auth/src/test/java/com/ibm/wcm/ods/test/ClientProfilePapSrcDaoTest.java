package com.ibm.wcm.ods.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.ibm.wcm.ods.dao.ClientProfileAdsSrcDao;
import com.ibm.wcm.ods.dao.ClientProfilePapSrcDao;
import com.ibm.wcm.ods.dao.CpAdsAbuseSrcDao;
import com.ibm.wcm.ods.dao.CpPapEligSrcDao;
import com.ibm.wcm.ods.dto.ClientProfileAdsSrc;
import com.ibm.wcm.ods.dto.ClientProfilePapSrc;
import com.ibm.wcm.ods.dto.CpPapEligSrc;

public class ClientProfilePapSrcDaoTest {
	
	@Test
	public void test()
	{
		ClientProfilePapSrcDao clientprofilecwsrcdao = new ClientProfilePapSrcDao();
		ClientProfilePapSrc dto = new ClientProfilePapSrc();
		CpPapEligSrc papElig = new CpPapEligSrc();
		CpPapEligSrcDao abudao = new CpPapEligSrcDao();
		
		List<ClientProfilePapSrc> clientprofilepapsrclist = clientprofilecwsrcdao.getlistByClinetID(6234732l); ;
		
		for (Iterator iterator = clientprofilepapsrclist.iterator(); iterator.hasNext();) {
        	
			ClientProfilePapSrc clientprofileadssrc = (ClientProfilePapSrc) iterator.next();
			papElig = abudao.getByClientProfilePapSrc(clientprofileadssrc);
			//cpadsencountersrc = encounterdao.getByClientProfilePapSrc  (clientprofileadssrc);
        	//clientprofileadssrc.getClientProfileAdsSeqNum();
			
			System.out.println(":: SourceSystemId  :: " + clientprofileadssrc.getSourceSystemId());
			System.out.println(":: EligStatusCashProg  :: " + papElig.getEligStatusCashProg());
            
        }
		
	}

}
