package com.ibm.wcm.ods.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.ibm.wcm.ods.dao.ClientProfileMhsSrcDao;
import com.ibm.wcm.ods.dao.ClientProfilePapSrcDao;
import com.ibm.wcm.ods.dao.CpMhsInfoSrcDao;
import com.ibm.wcm.ods.dao.CpPapEligSrcDao;
import com.ibm.wcm.ods.dto.ClientProfileMhsSrc;
import com.ibm.wcm.ods.dto.ClientProfilePapSrc;
import com.ibm.wcm.ods.dto.CpMhsInfoSrc;
import com.ibm.wcm.ods.dto.CpPapEligSrc;

public class ClientProfileMhsSrcDaoTest {
	
	@Test
	public void test()
	{
		ClientProfileMhsSrcDao clientprofilemhssrcdao = new ClientProfileMhsSrcDao();
		ClientProfileMhsSrc dto = new ClientProfileMhsSrc();
		CpMhsInfoSrc cpmhsinfosrc = new CpMhsInfoSrc();
		CpMhsInfoSrcDao abudao = new CpMhsInfoSrcDao();
		
		List<ClientProfileMhsSrc> ClientProfileMhsSrclist = clientprofilemhssrcdao.getlistByClinetID(6234732l); ;
		
		for (Iterator iterator = ClientProfileMhsSrclist.iterator(); iterator.hasNext();) {
        	
			ClientProfileMhsSrc clientprofilemhssrc = (ClientProfileMhsSrc) iterator.next();
			List<CpMhsInfoSrc> cpmhsinfosrclist = abudao.getByClientProfileMhsSrc(clientprofilemhssrc);
			
			
			System.out.println(":: SourceSystemId  :: " + clientprofilemhssrc.getNumOpEmgncyMhsPast30d());
			System.out.println(":: EligStatusCashProg  :: " + cpmhsinfosrc.getClientProfileMhsSrc());
            
        }
		
	}

}
