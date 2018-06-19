package com.websystique.springboot;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.SecurityroleDao;
import com.ibm.gbs.consentmgmt.dto.Securityrole;

public class SecurityroleDaoTest {
	
	/*@Test
    public void saveMethodTest(){
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = new Securityrole();
		
		 List<Securityrole> securityrolelist  = securityroledao.getlist() ;
		 
		 System.out.println("securityrolelist");
		
	}*/
	
	@Test
    public void saveMethodTest3(){
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = new Securityrole();
		
		securityrole.setRolename("Level 3");
		securityrole.setLastwritten(new Date());
		securityroledao.save(securityrole);
	}
	@Test
    public void saveMethodTest2(){
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = new Securityrole();
		
		securityrole.setRolename("Level 2");
		securityrole.setLastwritten(new Date());
		securityroledao.save(securityrole);
	}
	@Test
    public void saveMethodTest1(){
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = new Securityrole();
		
		securityrole.setRolename("Level 1");
		securityrole.setLastwritten(new Date());
		securityroledao.save(securityrole);
	}
	
	/*@Test
    public void saveMethodTest1(){
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = new Securityrole();
		
		securityrole.setRolename("SRole2");
		securityrole.setLastwritten(new Date());
		securityroledao.save(securityrole);
	}
	
	@Test
    public void saveMethodTest2(){
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = new Securityrole();
		
		securityrole.setRolename("SRole3");
		securityrole.setLastwritten(new Date());
		securityroledao.save(securityrole);
	}*/

}
