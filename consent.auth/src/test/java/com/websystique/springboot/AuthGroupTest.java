package com.websystique.springboot;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationgroupDao;
import com.ibm.gbs.consentmgmt.dao.OrganisationunitDao;
import com.ibm.gbs.consentmgmt.dao.SecurityroleDao;
import com.ibm.gbs.consentmgmt.dao.UsersDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.vo.CosdauthorizationgroupVO;

public class AuthGroupTest {
	
	
	/* {
	        "authorizationgroupid": 1,
	        "cosdabaccontrolgroup": 63,
	        "organisationunit": 0,
	        "securityrole": "SRole1",
	        "users": "User1",
	        "jobid": null,
	        "createdby": "Rohit",
	        "createdon": "2017-10-16",
	        "lastupdatedby": "Rohit",
	        "lastupdatedon": "2017-10-16"
	    }	*/
	
	@Test
    public void saveMethodTest()
	{
		File file = new File("Directory2");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
        System.out.println(" ::" + file.getAbsolutePath());
		/*long grpID = 60l;
		long orgUnitID = 1L;
		
		
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		Cosdauthorizationgroup cosdauthorizationgroup = new Cosdauthorizationgroup();
		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		Cosdabaccontrolgroup cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(grpID);
		
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao();
		Organisationunit organisationunit = organisationunitdao.getById(1L);
		
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = securityroledao.getById("SRole1");
		
		
		UsersDao usersdao = new UsersDao();
		Users users = usersdao.getById("User1");
		
		cosdauthorizationgroup.setAuthorizationgroupid(new BigDecimal("1501"));
		cosdauthorizationgroup.setCosdabaccontrolgroup(cosdabaccontrolgroup);
		cosdauthorizationgroup.setOrganisationunit(organisationunit);
		cosdauthorizationgroup.setSecurityrole(securityrole);
		cosdauthorizationgroup.setUsers(users);
		cosdauthorizationgroup.setJobid(new BigDecimal("1"));
		
		cosdauthorizationgroup.setLastupdatedby("Rohit");
		cosdauthorizationgroup.setCreatedby("Rohit");
		cosdauthorizationgroup.setCreatedon(new Date());
		cosdauthorizationgroup.setLastupdatedon(new Date());
		
		cosdauthorizationgroupdao.save(cosdauthorizationgroup);
		System.out.println("Saved ..");*/
		
    }

	/*@Test
    public void searchTest()
	{
		CosdauthorizationgroupVO cosdauthorizationgroupvo = new CosdauthorizationgroupVO();
		
		cosdauthorizationgroupvo.setCosdabaccontrolgroup(63l);
		cosdauthorizationgroupvo.setJobid(new BigDecimal("1"));
		cosdauthorizationgroupvo.setOrganisationunit(1L);
		cosdauthorizationgroupvo.setSecurityrole("SRole2");
		
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		List<Cosdauthorizationgroup> cosdauthorizationgrouplist = cosdauthorizationgroupdao.search(cosdauthorizationgroupvo);
		
		System.out.println("--:: size list ::" + cosdauthorizationgrouplist.size() );
		
	}*/
	
}
