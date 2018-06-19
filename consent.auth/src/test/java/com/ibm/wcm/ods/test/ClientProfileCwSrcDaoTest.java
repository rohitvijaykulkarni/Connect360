package com.ibm.wcm.ods.test;

import org.junit.Test;

import com.ibm.wcm.ods.dao.ClientProfileCwSrcDao;
import com.ibm.wcm.ods.dto.ClientProfileCwSrc;

public class ClientProfileCwSrcDaoTest {

	@Test
	public void test()
	{
		ClientProfileCwSrcDao clientprofilecwsrcdao = new ClientProfileCwSrcDao();
		ClientProfileCwSrc dto = new ClientProfileCwSrc();
		dto = clientprofilecwsrcdao.getById(6234732l);
		System.out.println("::" + dto.getClientProfileCwSeqNum());
		System.out.println("Done ..");
	}
}
