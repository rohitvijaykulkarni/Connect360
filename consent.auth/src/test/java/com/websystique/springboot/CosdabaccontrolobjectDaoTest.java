package com.websystique.springboot;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolobjectDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CosdabaccontrolobjectDaoTest {
	
	/*@Test
    public void saveMethodTest(){
       
		System.out.println("start");
		Connect360Services connect360services = new Connect360Services();
		connect360services.saveControlObject();
		System.out.println("Control object Added");
    }*/
	/*
	@Test
    public void updateMethodTest(){
       
		
    }*/
	
	/*@Test
    public void getListTest(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		List<Cosdabaccontrolgroup> list = cosdabaccontrolgroupdao.getlist() ;
		list.size() ;
		
		System.out.println("2nd Insert" +  list.size());
    }
	
	@Test
    public void getByIdTest(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao=  new CosdabaccontrolgroupDao() ;
		cosdabaccontrolgroupdao.getById(1L);
		
		System.out.println("Done ");
    }
*/
	@Test
    public void getAllControl(){
       
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao =  new CosdabaccontrolgroupDao() ;
		CosdabaccontrolgroupVO cosdabaccontrolgroupvo = new CosdabaccontrolgroupVO();
		cosdabaccontrolgroupvo.setControlgroupid(new BigDecimal(142l));
		cosdabaccontrolgroupdao.searchControlData(cosdabaccontrolgroupvo);
		
		System.out.println("Done ");
    }
}
