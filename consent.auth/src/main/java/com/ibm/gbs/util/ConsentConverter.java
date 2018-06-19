/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibm.gbs.consentmgmt.dto.Cosdconsentexception;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgrouptxn;
import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsent;
import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsenthistory;
import com.ibm.gbs.consentmgmt.dto.Cosdproxypersonconsent;
import com.ibm.gbs.vo.CosdconsentexceptionVO;
import com.ibm.gbs.vo.CosdconsentgroupVO;
import com.ibm.gbs.vo.CosdconsentgrouptxnVO;
import com.ibm.gbs.vo.CosdpersonconsentVO;
import com.ibm.gbs.vo.CosdpersonconsenthistoryVO;
import com.ibm.gbs.vo.CosdproxypersonconsentVO;


public class ConsentConverter {
	
	/*--- CosdproxypersonconsentVO --*/
	public CosdproxypersonconsentVO convertToVo(Cosdproxypersonconsent Cosdconsentgroup)
	{
		CosdproxypersonconsentVO cosdproxypersonconsentvo = new CosdproxypersonconsentVO() ;
		return cosdproxypersonconsentvo;
	}

	public List<CosdproxypersonconsentVO> covertList(List<Cosdproxypersonconsent>  doObjs, CosdproxypersonconsentVO cosdconsentgroupvo)
	{
		List<CosdproxypersonconsentVO> voObjs = new ArrayList<CosdproxypersonconsentVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	/*--- cosdpersonconsenthistoryvo --*/
	public CosdpersonconsenthistoryVO convertToVo(Cosdpersonconsenthistory Cosdconsentgroup)
	{
		CosdpersonconsenthistoryVO cosdpersonconsenthistoryvo = new CosdpersonconsenthistoryVO() ;
		return cosdpersonconsenthistoryvo;
	}

	public List<CosdpersonconsenthistoryVO> covertList(List<Cosdpersonconsenthistory>  doObjs, CosdpersonconsenthistoryVO cosdconsentgroupvo)
	{
		List<CosdpersonconsenthistoryVO> voObjs = new ArrayList<CosdpersonconsenthistoryVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}

	
	public CosdconsentgroupVO convertToVo(Cosdconsentgroup Cosdconsentgroup)
	{
		CosdconsentgroupVO cosdconsentgroupvo = new CosdconsentgroupVO() ;
		
		cosdconsentgroupvo.setConsentgroupid(Cosdconsentgroup.getConsentgroupid());
		cosdconsentgroupvo.setName(Cosdconsentgroup.getName());
		cosdconsentgroupvo.setDescription(Cosdconsentgroup.getDescription());
		
		cosdconsentgroupvo.setCreatedby(Cosdconsentgroup.getCreatedby());
		cosdconsentgroupvo.setCreatedon(Cosdconsentgroup.getCreatedon());
		
		cosdconsentgroupvo.setLastupdatedby(Cosdconsentgroup.getLastupdatedby());
		cosdconsentgroupvo.setLastupdatedon(Cosdconsentgroup.getLastupdatedon());
		
		return cosdconsentgroupvo;
	}

	public List<CosdconsentgroupVO> covertList( List<Cosdconsentgroup>  doObjs, CosdconsentgroupVO cosdconsentgroupvo)
	{
		List<CosdconsentgroupVO> voObjs = new ArrayList<CosdconsentgroupVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	/*--- CosdpersonconsentVO--*/
	public CosdpersonconsentVO convertToVo(Cosdpersonconsent cosdpersonconsent)
	{
		CosdpersonconsentVO cosdpersonconsentvo = new CosdpersonconsentVO() ;
		
		
		
		cosdpersonconsentvo.setPersonconsentid(cosdpersonconsent.getPersonconsentid());
		cosdpersonconsentvo.setAuthpersoncontactinfoone(cosdpersonconsent.getAuthpersoncontactinfoone());
		cosdpersonconsentvo.setAuthpersoncontactinfotwo(cosdpersonconsent.getAuthpersoncontactinfotwo());
		cosdpersonconsentvo.setAuthpersonnameone(cosdpersonconsent.getAuthpersonnameone());
		cosdpersonconsentvo.setAuthpersonnametwo(cosdpersonconsent.getAuthpersonnametwo());
		cosdpersonconsentvo.setAuthpersonrelone(cosdpersonconsent.getAuthpersonrelone());
		cosdpersonconsentvo.setAuthpersonreltwo(cosdpersonconsent.getAuthpersonreltwo());
		cosdpersonconsentvo.setConcernroleid(cosdpersonconsent.getConcernroleid());
		cosdpersonconsentvo.setContactaddressid(cosdpersonconsent.getContactaddressid());
		cosdpersonconsentvo.setContactphone(cosdpersonconsent.getContactphone());
		cosdpersonconsentvo.setCreatedon(cosdpersonconsent.getCreatedon());
		cosdpersonconsentvo.setCreatedby(cosdpersonconsent.getCreatedby());
		cosdpersonconsentvo.setLastupdatedby(cosdpersonconsent.getLastupdatedby());
		cosdpersonconsentvo.setLastupdatedon(cosdpersonconsent.getLastupdatedon());
		cosdpersonconsentvo.setThirdpartyfirstname(cosdpersonconsent.getThirdpartyfirstname());
		cosdpersonconsentvo.setThirdpartylastname(cosdpersonconsent.getThirdpartylastname());
		cosdpersonconsentvo.setThirdpartyotherrelationship(cosdpersonconsent.getThirdpartyotherrelationship());
		cosdpersonconsentvo.setThirdpartyrelationship(cosdpersonconsent.getThirdpartyrelationship());
		cosdpersonconsentvo.setFileid(cosdpersonconsent.getFileid());
		cosdpersonconsentvo.setAppSuite(cosdpersonconsent.getAppSuite());
		cosdpersonconsentvo.setCity(cosdpersonconsent.getCity()); 
		cosdpersonconsentvo.setStreet(cosdpersonconsent.getStreet());
		cosdpersonconsentvo.setZipCode(cosdpersonconsent.getZipCode());
		cosdpersonconsentvo.setState(cosdpersonconsent.getState());
		cosdpersonconsentvo.setCustomerName(cosdpersonconsent.getCustomerName());
		cosdpersonconsentvo.setConsentCatList(cosdpersonconsent.getConsentCatGrp());
		cosdpersonconsentvo.setClientid(cosdpersonconsent.getClientid());
		
		cosdpersonconsentvo.setIdentificationno(cosdpersonconsent.getIdentificationno());
		cosdpersonconsentvo.setIdentificationtype(cosdpersonconsent.getIdentificationtype());
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
		if(cosdpersonconsent.getStartdate() != null)
		{			  
			String startDate= formatter.format(cosdpersonconsent.getStartdate()); 		
			cosdpersonconsentvo.setStartdate(startDate);
		}
	    //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    
		if(cosdpersonconsent.getEnddate() != null)
	    {
			String endDate= formatter.format(cosdpersonconsent.getEnddate()); 
			cosdpersonconsentvo.setEnddate(endDate);
			
			 boolean editNotAllowed = cosdpersonconsent.getEnddate().before(new Date()) ;
			 
			 if(editNotAllowed == true)
				 cosdpersonconsentvo.setIseditAllow(false);
	    }
	   
	     
		cosdpersonconsentvo.setLastupdatedby(cosdpersonconsent.getLastupdatedby());
		cosdpersonconsentvo.setCreatedby(cosdpersonconsent.getCreatedby());
		cosdpersonconsentvo.setLastupdatedon(new Date());
		cosdpersonconsentvo.setCreatedon(new Date());
		return cosdpersonconsentvo;
	}

	public List<CosdpersonconsentVO> covertList( List<Cosdpersonconsent>  doObjs, CosdpersonconsentVO cosdpersonconsentvo)
	{
		List<CosdpersonconsentVO> voObjs = new ArrayList<CosdpersonconsentVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	/*--- CosdconsentexceptionVO--*/
	public CosdconsentexceptionVO convertToVo(Cosdconsentexception cosdconsentexception)
	{
		CosdconsentexceptionVO cosdconsentexceptionvo = new CosdconsentexceptionVO() ;
		
		cosdconsentexceptionvo.setConsentexceptionid(cosdconsentexception.getConsentexceptionid());
		cosdconsentexceptionvo.setConsentstatus(cosdconsentexception.getConsentstatus());
		cosdconsentexceptionvo.setCosdconsentgroup(cosdconsentexception.getCosdconsentgroup().getConsentgroupid().longValue());
		cosdconsentexceptionvo.setCosdpersonconsent(cosdconsentexception.getCosdpersonconsent().getPersonconsentid().longValue());
		
		cosdconsentexceptionvo.setCreatedby(cosdconsentexception.getCreatedby());
		cosdconsentexceptionvo.setCreatedon(cosdconsentexception.getCreatedon());
		cosdconsentexceptionvo.setLastupdatedby(cosdconsentexception.getLastupdatedby());
		cosdconsentexceptionvo.setLastupdatedo(cosdconsentexception.getLastupdatedo());
		
		return cosdconsentexceptionvo;
	}

	public List<CosdconsentexceptionVO> covertList( List<Cosdconsentexception>  doObjs, CosdconsentexceptionVO cosdpersonconsentvo)
	{
		List<CosdconsentexceptionVO> voObjs = new ArrayList<CosdconsentexceptionVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	/*--- CosdconsentgrouptxnVO --*/
	public CosdconsentgrouptxnVO convertToVo(Cosdconsentgrouptxn cosdconsentgrouptxn)
	{
		CosdconsentgrouptxnVO cosdconsentgrouptxnvo = new CosdconsentgrouptxnVO() ;
		
		cosdconsentgrouptxnvo.setConsentgrouptxnid(cosdconsentgrouptxn.getConsentgrouptxnid());
		cosdconsentgrouptxnvo.setCosdconsentgroup(cosdconsentgrouptxn.getCosdconsentgroup().getConsentgroupid().longValue());
		cosdconsentgrouptxnvo.setCreatedby(cosdconsentgrouptxn.getCreatedby());
		cosdconsentgrouptxnvo.setCreatedon(cosdconsentgrouptxn.getCreatedon());
		cosdconsentgrouptxnvo.setLastupdatedby(cosdconsentgrouptxn.getLastupdatedby());
		cosdconsentgrouptxnvo.setLastupdatedon(cosdconsentgrouptxn.getLastupdatedon());
		return cosdconsentgrouptxnvo;
	}

	public List<CosdconsentgrouptxnVO> covertList( List<Cosdconsentgrouptxn>  doObjs, CosdconsentgrouptxnVO cosdpersonconsentvo)
	{
		List<CosdconsentgrouptxnVO> voObjs = new ArrayList<CosdconsentgrouptxnVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
}
