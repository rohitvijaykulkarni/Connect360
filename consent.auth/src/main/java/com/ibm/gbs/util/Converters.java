/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdorgrolejobuserDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicyset;
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.ReferralLA;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.CosdabactransactionVO;
import com.ibm.gbs.vo.CosdauthorizationgroupVO;
import com.ibm.gbs.vo.CosdauthorizationpolicysetVO;
import com.ibm.gbs.vo.CosdorgrolejobuserVO;
import com.ibm.gbs.vo.OrganisationunitVO;
import com.ibm.gbs.vo.ReferralLAVO;
import com.ibm.gbs.vo.SecurityroleVO;
import com.ibm.gbs.vo.UsersVO;

public class Converters {
	
	public CosdauthorizationgroupVO convertToVo(Cosdauthorizationgroup cosdauthorizationgroup)
	{
		CosdauthorizationgroupVO cosdauthorizationgroupvo = new CosdauthorizationgroupVO() ;
		
		cosdauthorizationgroupvo.setAuthorizationgroupid(cosdauthorizationgroup.getAuthorizationgroupid());
		
		Cosdabaccontrolgroup cosdabaccontrolgroup = cosdauthorizationgroup.getCosdabaccontrolgroup() ;
		if(cosdabaccontrolgroup!= null)
		{
			//Cosdabaccontrolgroup cosdabaccontrolgroup = cosdauthorizationgroup.getCosdabaccontrolgroup() ; 
			cosdauthorizationgroupvo.setCosdabaccontrolgroup(cosdabaccontrolgroup.getControlgroupid().longValue());
			cosdauthorizationgroupvo.setControlgroupname(cosdabaccontrolgroup.getControlgroupname());
		}
		if(cosdauthorizationgroup.getOrganisationunit() != null)
		{ 
			cosdauthorizationgroupvo.setOrganisationunit(cosdauthorizationgroup.getOrganisationunit().getOrganisationunitid().longValue());
			cosdauthorizationgroupvo.setOrganisationname(cosdauthorizationgroup.getOrganisationunit().getName());
		}
		if(cosdauthorizationgroup.getSecurityrole() != null)
		cosdauthorizationgroupvo.setSecurityrole(cosdauthorizationgroup.getSecurityrole().getRolename());
		if(cosdauthorizationgroup.getUsers() != null)
		cosdauthorizationgroupvo.setUsers(cosdauthorizationgroup.getUsers().getUsername());
		cosdauthorizationgroupvo.setAuthGroupName(cosdauthorizationgroup.getAuthGroupName());
		cosdauthorizationgroupvo.setJobid(cosdauthorizationgroup.getJobid());
		CosdorgrolejobuserDao cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		cosdauthorizationgroupvo.setJob(null);
		cosdauthorizationgroupvo.setJobuserName(null);
		
		if(cosdauthorizationgroup.getJobid() != null)
		{Cosdorgrolejobuser cosdorgrolejobuser = cosdorgrolejobuserdao.getById(cosdauthorizationgroup.getJobid().longValue());
		String jobuserName = cosdorgrolejobuser.getUsername();
		String jobRoleName = cosdorgrolejobuser.getRolename() ;
		
		cosdauthorizationgroupvo.setJob(jobRoleName);
		cosdauthorizationgroupvo.setJobuserName(jobuserName);}
		
		cosdauthorizationgroupvo.setLastupdatedby(cosdauthorizationgroup.getLastupdatedby());
		cosdauthorizationgroupvo.setCreatedby(cosdauthorizationgroup.getCreatedby());
		cosdauthorizationgroupvo.setCreatedon(cosdauthorizationgroup.getCreatedon());
		cosdauthorizationgroupvo.setLastupdatedon(cosdauthorizationgroup.getLastupdatedon());
		
		return cosdauthorizationgroupvo;
	}

	public List<CosdauthorizationgroupVO> covertList( List<Cosdauthorizationgroup>  doObjs, CosdauthorizationgroupVO Cosdauthorizationgroup)
	{
		List<CosdauthorizationgroupVO> voObjs = new ArrayList<CosdauthorizationgroupVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	
	public CosdabaccontrolgroupVO convertToVo(Cosdabaccontrolgroup cosdabaccontrolgroup)
	{
		CosdabaccontrolgroupVO cosdabaccontrolgroupvo = new CosdabaccontrolgroupVO() ;
		//Cosdabaccontrolgroup cosdabaccontrolgroup = new Cosdabaccontrolgroup();
		cosdabaccontrolgroupvo.setControlgroupid(cosdabaccontrolgroup.getControlgroupid());
		
		
		
		cosdabaccontrolgroupvo.setControlgroupname(cosdabaccontrolgroup.getControlgroupname());
		cosdabaccontrolgroupvo.setCreatedby(cosdabaccontrolgroup.getCreatedby());
		cosdabaccontrolgroupvo.setCreatedon(cosdabaccontrolgroup.getCreatedon());
		cosdabaccontrolgroupvo.setLastupdatedby(cosdabaccontrolgroup.getLastupdatedby());
		cosdabaccontrolgroupvo.setLastupdatedon(cosdabaccontrolgroup.getLastupdatedon());
		return cosdabaccontrolgroupvo;
	}

	public List<CosdabaccontrolgroupVO> covertList( List<Cosdabaccontrolgroup>  doObjs, CosdabaccontrolgroupVO cosdabaccontrolgroupvo)
	{
		List<CosdabaccontrolgroupVO> voObjs = new ArrayList<CosdabaccontrolgroupVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public CosdabacconstraintVO convertToVo(Cosdabacconstraint cosdabacconstraint)
	{
		CosdabacconstraintVO cosdabacconstraintvo = new CosdabacconstraintVO() ;
		cosdabacconstraintvo.setAttributeconstraintid(cosdabacconstraint.getAttributeconstraintid());
		cosdabacconstraintvo.setAccessconstrainttype(cosdabacconstraint.getAccessconstrainttype());		
		cosdabacconstraintvo.setAttributename(cosdabacconstraint.getAttributename());
		cosdabacconstraintvo.setCreatedby(cosdabacconstraint.getCreatedby());
		cosdabacconstraintvo.setCreatedon(cosdabacconstraint.getCreatedon());
		cosdabacconstraintvo.setAttributevalue(cosdabacconstraint.getAttributevalue());
		cosdabacconstraintvo.setLastupdatedby(cosdabacconstraint.getLastupdatedby());
		cosdabacconstraintvo.setLastupdatedon(cosdabacconstraint.getLastupdatedon());
		return cosdabacconstraintvo;
	}

	public List<CosdabacconstraintVO> covertList( List<Cosdabacconstraint>  doObjs, CosdabacconstraintVO cosdabacconstraintvo)
	{
		List<CosdabacconstraintVO> voObjs = new ArrayList<CosdabacconstraintVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 	
		
		return voObjs ;
		
	}
	
	public CosdabactransactionVO convertToVo(Cosdabactransaction cosdabactransaction)
	{
		CosdabactransactionVO cosdabactransactionvo = new CosdabactransactionVO() ;
		
		//cosdabactransactionvo.setControlgroupid(cosdabactransaction.C);
		cosdabactransactionvo.setTransactionid(cosdabactransaction.getTransactionid());
		cosdabactransactionvo.setTransactionname(cosdabactransaction.getTransactionname());
		cosdabactransactionvo.setTransactiontype(cosdabactransaction.getTransactiontype());
		cosdabactransactionvo.setDefaultaccess(cosdabactransaction.getDefaultaccess());
		cosdabactransactionvo.setCreatedby(cosdabactransaction.getCreatedby());
		cosdabactransactionvo.setLastupdatedby(cosdabactransaction.getLastupdatedby());
		
		return cosdabactransactionvo;
	}

	public List<CosdabactransactionVO> covertList( List<Cosdabactransaction>  doObjs, CosdabactransactionVO cosdabacconstraintvo)
	{
		List<CosdabactransactionVO> voObjs = new ArrayList<CosdabactransactionVO>();
		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		
		return voObjs ;
		
	}
	
	
	public OrganisationunitVO convertToVo(Organisationunit organisationunit)
	{
		OrganisationunitVO organisationunitvo = new OrganisationunitVO() ;			
		
		organisationunitvo.setBusinesstypecode(organisationunit.getBusinesstypecode());
		organisationunitvo.setOrganisationunitid(organisationunit.getOrganisationunitid());
		organisationunitvo.setName(organisationunit.getName());
		organisationunitvo.setRecordstatus(organisationunit.getRecordstatus());
		organisationunitvo.setWebaddress(organisationunit.getWebaddress());
		return organisationunitvo;
	}

	public List<OrganisationunitVO> covertList( List<Organisationunit>  doObjs, OrganisationunitVO organisationunitvo)
	{
		List<OrganisationunitVO> voObjs = new ArrayList<OrganisationunitVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public CosdorgrolejobuserVO convertToVo( Cosdorgrolejobuser cosdorgrolejobuser)
	{
		CosdorgrolejobuserVO cosdorgrolejobuservo = new CosdorgrolejobuserVO() ;		
		
		cosdorgrolejobuservo.setRolename(cosdorgrolejobuser.getRolename());
		cosdorgrolejobuservo.setUsername(cosdorgrolejobuser.getUsername());
		cosdorgrolejobuservo.setJobid(cosdorgrolejobuser.getJobid());
		cosdorgrolejobuservo.setOrganisationunitid(cosdorgrolejobuser.getOrganisationunitid());
		cosdorgrolejobuservo.setOrgrolejobuserid(cosdorgrolejobuser.getOrgrolejobuserid());
		
		return cosdorgrolejobuservo;
	}

	public List<CosdorgrolejobuserVO> covertList( List<Cosdorgrolejobuser>  doObjs, CosdorgrolejobuserVO cosdorgrolejobuser)
	{
		 List<CosdorgrolejobuserVO> voObjs =  new ArrayList<CosdorgrolejobuserVO>();		
		
		 doObjs.forEach(doObj->voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public UsersVO convertToVo( Users users)
	{
		UsersVO usersvo = new UsersVO() ;		
		
		usersvo.setUsername(users.getUsername());
		usersvo.setPassword(users.getPassword());
		usersvo.setRolename(users.getRolename());
		usersvo.setFirstname(users.getFirstname());
		usersvo.setLastname(users.getLastname());
		
		return usersvo;
	}

	public List<UsersVO> covertList( List<Users>  doObjs, UsersVO UsersVO)
	{
		 List<UsersVO> voObjs =  new ArrayList<UsersVO>();		
		
		 doObjs.forEach(doObj->voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public SecurityroleVO convertToVo( Securityrole securityrole)
	{
		SecurityroleVO securityrolevo = new SecurityroleVO() ;		
		
		securityrolevo.setRolename(securityrole.getRolename());
		securityrolevo.setLastwritten(securityrole.getLastwritten());
		return securityrolevo;
	}

	public List<SecurityroleVO> covertList( List<Securityrole> doObjs, SecurityroleVO securityrolevo)
	{
		 List<SecurityroleVO> voObjs =  new ArrayList<SecurityroleVO>();		
		
		 doObjs.forEach(doObj->voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public CosdauthorizationpolicysetVO convertToVo( Cosdauthorizationpolicyset cosdauthorizationpolicyset)
	{
		CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo = new CosdauthorizationpolicysetVO() ;		
		
		cosdauthorizationpolicysetvo.setClassificationlevel(cosdauthorizationpolicyset.getClassificationlevel());
		cosdauthorizationpolicysetvo.setComments(cosdauthorizationpolicyset.getComments());
		cosdauthorizationpolicysetvo.setConsentstatus(cosdauthorizationpolicyset.getConsentstatus());
		cosdauthorizationpolicysetvo.setCreatedby(cosdauthorizationpolicyset.getCreatedby());
		cosdauthorizationpolicysetvo.setLastupdatedby(cosdauthorizationpolicyset.getLastupdatedby());
		cosdauthorizationpolicysetvo.setPolicysetid(cosdauthorizationpolicyset.getPolicysetid());
		cosdauthorizationpolicysetvo.setTransactionType(cosdauthorizationpolicyset.getTransactionType());
		cosdauthorizationpolicysetvo.setName(cosdauthorizationpolicyset.getName());
		return cosdauthorizationpolicysetvo;
	}

	public List<CosdauthorizationpolicysetVO> covertList( List<Cosdauthorizationpolicyset> doObjs, CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo)
	{
		 List<CosdauthorizationpolicysetVO> voObjs =  new ArrayList<CosdauthorizationpolicysetVO>();		
		
		 doObjs.forEach(doObj->voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public List<ReferralLAVO> covertList( List<ReferralLA>  doObjs, ReferralLAVO referrallavo)
	{
		List<ReferralLAVO> voObjs = new ArrayList<ReferralLAVO>();		
		doObjs.forEach(doObj-> voObjs.add(convertToVo(doObj))); 
		
		return voObjs ;		
	}
	
	public ReferralLAVO convertToVo( ReferralLA referralla)
	{
		ReferralLAVO referrallavo = new ReferralLAVO() ;		
		
		referrallavo.setReferralID(referralla.getReferralID());
		referrallavo.setClientID(referralla.getClientID());
		referrallavo.setCustomerName(referralla.getCustomer_name());
		referrallavo.setReferral_Type(referralla.getReferral_Type());
		referrallavo.setOther_info(referralla.getOther_info());
		referrallavo.setFname(referralla.getFname());
		referrallavo.setLname(referralla.getLname());
		referrallavo.setCvwName(referralla.getCvwName());
		referrallavo.setSrccode(referralla.getSrccode());
		referrallavo.setMemberID(referralla.getMemberID());
		referrallavo.setMinor(referralla.getMinor());
		referrallavo.setParolee(referralla.getParolee());
		referrallavo.setTransName(referralla.getTransName());
		return referrallavo;
	}
}
