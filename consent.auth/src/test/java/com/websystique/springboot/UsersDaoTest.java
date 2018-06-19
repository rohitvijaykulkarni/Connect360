package com.websystique.springboot;

import java.util.Date;

import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.SecurityroleDao;
import com.ibm.gbs.consentmgmt.dao.UsersDao;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;

public class UsersDaoTest {
	
	/*@Test
    public void saveMethodTest(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("User1");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("Supervisor");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		//users.set
		usersdao.save(users);
		System.out.println("added");
    }
	
	@Test
    public void saveMethodTest2(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("User2");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("Supervisor");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		
		usersdao.save(users);
		System.out.println("added");
    }
	
	@Test
    public void saveMethodTest3(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("User3");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("Supervisor");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		
		usersdao.save(users);
		System.out.println("added");
    }*/
	
	/*@Test
    public void saveMethodTest(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("Laura");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("Supervisor");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		
		usersdao.save(users);
		System.out.println("added");
    }
	
	@Test
    public void saveMethodTest2(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("James");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("Caseworker");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		
		usersdao.save(users);
		System.out.println("added");
    }*/
	
	/*@Test
    public void saveMethodTest3(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("karen");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("Manager");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		
		usersdao.save(users);
		System.out.println("added");
    }
	
	@Test
    public void saveMethodTest4(){
		
		UsersDao usersdao = new UsersDao() ;
		Users users = new Users() ;
		
		users.setUsername("Sandy");
		users.setPassword("$2a$10$8O0y9lmoTjfvaClJN7uI/.CRoNjGJZ0LSJt3UlfAaY3QtPpQVpMmS");
		users.setRolename("CaseWorker");
		users.setFirstname("Fname");
		users.setLastname("Lname");
		
		usersdao.save(users);
		System.out.println("added");
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
}
