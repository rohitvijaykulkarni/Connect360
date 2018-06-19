/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/

/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolobjectDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationpolicyDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationpolicysetDao;
import com.ibm.gbs.consentmgmt.dao.CosdconsentgroupDao;
import com.ibm.gbs.consentmgmt.dao.OrganisationunitDao;
import com.ibm.gbs.consentmgmt.dao.SecurityroleDao;
import com.ibm.gbs.consentmgmt.dao.UsersDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationpolicyset;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.consentmgmt.service.AuthServices;
import com.ibm.gbs.util.ConsentConverter;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.Message;
import com.ibm.gbs.vo.AllControlGroup;
import com.ibm.gbs.vo.AuthGroupPolicyVO;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.CosdauthorizationgroupVO;
import com.ibm.gbs.vo.CosdauthorizationpolicysetVO;
import com.ibm.gbs.vo.CosdconsentgroupVO;
import com.ibm.gbs.vo.CosdorgrolejobuserVO;
import com.ibm.gbs.vo.OrganisationunitVO;
import com.ibm.gbs.vo.SecurityroleVO;
import com.ibm.gbs.vo.UsersVO;
import com.ibm.gbs.vo.ViewPolicyAuthGroup;

// /auth/getListOrg/
// /auth/getJobList/

@RestController
@RequestMapping("/auth")
public class AuthController {
	
public static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@Autowired	
	AuthServices authServices ;

	@RequestMapping(value = "/getListOrg/", method = RequestMethod.GET, produces = "application/json")			
	public ResponseEntity<List<OrganisationunitVO>> getOrgList() 
	{
		System.out.println(":: Organisation List ::");
		OrganisationunitVO organisationunitvo = new OrganisationunitVO();
		List<Organisationunit> organisationunitlist = authServices.getOrgList() ;
		
		if(organisationunitlist.isEmpty())
		{
			return new ResponseEntity(new Message("Organisationunit is Empty") , HttpStatus.OK) ;
		}
		
		Converters conv = new Converters();
		
		List<OrganisationunitVO> organisationunitvolist = conv.covertList(organisationunitlist, organisationunitvo);
		System.out.println("::-- Cosdabaccontrolgroup --::" + organisationunitvolist.size());
			
			
	  return new ResponseEntity<List<OrganisationunitVO>>(organisationunitvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getJobList/", method = RequestMethod.GET, produces = "application/json")			
	public ResponseEntity<List<CosdorgrolejobuserVO>> getJobList() 
	{
		System.out.println(":: Organisation List ::");
		CosdorgrolejobuserVO cosdorgrolejobuservo = new CosdorgrolejobuserVO();
		List<Cosdorgrolejobuser> cosdorgrolejobuserlist = authServices.getlist() ;
		
		if(cosdorgrolejobuserlist.isEmpty())
		{
			return new ResponseEntity(new Message("Job List empty") , HttpStatus.OK) ;
		}
		
		Converters conv = new Converters();
		
		List<CosdorgrolejobuserVO> cosdorgrolejobuservolist = conv.covertList(cosdorgrolejobuserlist, cosdorgrolejobuservo);
		System.out.println("::-- Cosdabaccontrolgroup --::" + cosdorgrolejobuservolist.size());
			
			
	 
		return new ResponseEntity<List<CosdorgrolejobuserVO>>(cosdorgrolejobuservolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getUserList/", method = RequestMethod.GET, produces = "application/json")			
	public ResponseEntity<List<UsersVO>> getUserList() 
	{
		System.out.println(":: Organisation List ::");
		UsersVO usersvo = new UsersVO();
		List<Users> userslist = authServices.getUserList() ;
		
		if(userslist.isEmpty())
		{
			return new ResponseEntity(new Message("User List empty") , HttpStatus.OK) ;
		}
		
		Converters conv = new Converters();
		
		List<UsersVO> usersvolist = conv.covertList(userslist, usersvo);
		System.out.println("::-- Cosdabaccontrolgroup --::" + usersvolist.size());
			
			
	 
		return new ResponseEntity<List<UsersVO>>(usersvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getSRoleList/", method = RequestMethod.GET, produces = "application/json")			
	public ResponseEntity<List<SecurityroleVO>> getSRoleList() 
	{
		System.out.println(":: Organisation List ::");
		SecurityroleVO securityrolevo = new SecurityroleVO();
		List<Securityrole> secRoleList = authServices.getSecRoleList();
		
		if(secRoleList.isEmpty())
		{
			return new ResponseEntity(new Message("Security Role List empty") , HttpStatus.OK) ;
		}
		
		Converters conv = new Converters();
		
		List<SecurityroleVO> usersvolist = conv.covertList(secRoleList, securityrolevo);
		System.out.println("::-- Cosdabaccontrolgroup --::" + usersvolist.size());
			
			
	 
		return new ResponseEntity<List<SecurityroleVO>>(usersvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getListAuthGroup/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdauthorizationgroupVO>> ListAuthGroup() 
	{				
		List<Cosdauthorizationgroup> cosdauthorizationgrouplist = authServices.getListAuthGroup() ;
		
		CosdauthorizationgroupVO cosdauthorizationgroupvo = new CosdauthorizationgroupVO();
		Converters conv = new Converters();
							
		
		if (cosdauthorizationgrouplist.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		
		List<CosdauthorizationgroupVO> cosdabacconstraintVoList = conv.covertList(cosdauthorizationgrouplist, cosdauthorizationgroupvo);
		return new ResponseEntity<List<CosdauthorizationgroupVO>>(cosdabacconstraintVoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/searchAuthGroup/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdauthorizationgroupVO>> searchAuthGroup(@RequestBody CosdauthorizationgroupVO cosdauthorizationgroupvo) 
	{				
		//List<Cosdauthorizationgroup> cosdauthorizationgrouplist = authServices.getListAuthGroup() ;
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		List<Cosdauthorizationgroup> cosdauthorizationgrouplist = cosdauthorizationgroupdao.search(cosdauthorizationgroupvo);
		//List<Cosdauthorizationgroup> cosdauthorizationgrouplist = cosdauthorizationgroupdao.searchBeforeSave(cosdauthorizationgroupvo);
		
		//CosdauthorizationgroupVO cosdauthorizationgroupvo = new CosdauthorizationgroupVO();
		Converters conv = new Converters();
							
		
		if (cosdauthorizationgrouplist.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND 
		}
		
		List<CosdauthorizationgroupVO> cosdabacconstraintVoList = conv.covertList(cosdauthorizationgrouplist, cosdauthorizationgroupvo);
		return new ResponseEntity<List<CosdauthorizationgroupVO>>(cosdabacconstraintVoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updateAuthGroup/", method = RequestMethod.POST)
	public ResponseEntity<?> updateAuthGroup(@RequestBody CosdauthorizationgroupVO cosdauthorizationgroupvo, HttpServletRequest request) 
	{
		long cntGrp = cosdauthorizationgroupvo.getCosdabaccontrolgroup() ;
		long orgUnit = cosdauthorizationgroupvo.getOrganisationunit() ;
		String secRole =  cosdauthorizationgroupvo.getSecurityrole() ;
		String user = cosdauthorizationgroupvo.getUsers() ;
		System.out.println("**updateAuthGroup Method - " + cntGrp +":org unit -:" + orgUnit +":secRole:" + secRole +":User:" + user );
		System.out.println("Auth ID For Update : " + cosdauthorizationgroupvo.getAuthorizationgroupid().longValue());
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(cosdauthorizationgroupvo.getAuthorizationgroupid().longValue());
		
		if(cosdauthorizationgroup == null )
		{
			return new ResponseEntity(new Message("Auth Group ID not found  -" + cosdauthorizationgroupvo.getAuthorizationgroupid().longValue()), HttpStatus.OK);
		}
		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		Cosdabaccontrolgroup cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(cntGrp);
		
		String username = HibernateUtil.getUserName(request); // HttpServletRequest request
		OrganisationunitDao organisationunitdao = new OrganisationunitDao();
		Organisationunit organisationunit = organisationunitdao.getById(orgUnit);
		
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = securityroledao.getById(secRole);
		
		
		UsersDao usersdao = new UsersDao();
		Users users = usersdao.getById(user);
				
		cosdauthorizationgroup.setCosdabaccontrolgroup(cosdabaccontrolgroup);
		cosdauthorizationgroup.setOrganisationunit(organisationunit);
		cosdauthorizationgroup.setSecurityrole(securityrole);
		cosdauthorizationgroup.setUsers(users);
		cosdauthorizationgroup.setJobid(cosdauthorizationgroupvo.getJobid());
		//cosdauthorizationgroup.setAuthGroupName(cosdauthorizationgroupvo.getAuthGroupName());
		cosdauthorizationgroup.setLastupdatedby(username);
		cosdauthorizationgroup.setCreatedby(username);
		cosdauthorizationgroup.setCreatedon(new Date());
		cosdauthorizationgroup.setLastupdatedon(new Date());
		
		cosdauthorizationgroupdao.update(cosdauthorizationgroup);
		Converters conv = new Converters();
		cosdauthorizationgroupvo = conv.convertToVo(cosdauthorizationgroup) ;
		return new ResponseEntity<CosdauthorizationgroupVO>(cosdauthorizationgroupvo, HttpStatus.OK);

	}
	
	
	@RequestMapping(value = "/saveAuthGroup/", method = RequestMethod.POST)
	public ResponseEntity<?> saveAuthGroup(@RequestBody CosdauthorizationgroupVO cosdauthorizationgroupvo,HttpServletRequest request) 
	{
		System.out.println("Auth GroupName -" + cosdauthorizationgroupvo.getAuthGroupName());
		
		
		String username = HibernateUtil.getUserName(request); // HttpServletRequest request
		long cntGrp = cosdauthorizationgroupvo.getCosdabaccontrolgroup() ;
		long orgUnit = cosdauthorizationgroupvo.getOrganisationunit() ;
		String secRole =  cosdauthorizationgroupvo.getSecurityrole() ;
		String user = cosdauthorizationgroupvo.getUsers() ;
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		Cosdauthorizationgroup cosdauthorizationgroup = new Cosdauthorizationgroup();
		
		
		List<Cosdauthorizationgroup> cosdauthorizationgrouplist = cosdauthorizationgroupdao.getlistByGroupName(cosdauthorizationgroupvo.getAuthGroupName().toUpperCase());
	    
	    
	    if(cosdauthorizationgrouplist != null && !cosdauthorizationgrouplist.isEmpty())
	    {
	    	return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
	    }
		
		
		
		
		CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		Cosdabaccontrolgroup cosdabaccontrolgroup = cosdabaccontrolgroupdao.getById(cntGrp);
		
		
		OrganisationunitDao organisationunitdao = new OrganisationunitDao();
		Organisationunit organisationunit = orgUnit < 1 ? null : organisationunitdao.getById(orgUnit);
		
		
		SecurityroleDao securityroledao = new SecurityroleDao();
		Securityrole securityrole = secRole == null ? null :securityroledao.getById(secRole);
		
		
		UsersDao usersdao = new UsersDao();
		Users users = user == null ? null :usersdao.getById(user);
				
		cosdauthorizationgroup.setCosdabaccontrolgroup(cosdabaccontrolgroup);
		cosdauthorizationgroup.setOrganisationunit(organisationunit);
		cosdauthorizationgroup.setSecurityrole(securityrole);
		cosdauthorizationgroup.setUsers(users);
		cosdauthorizationgroup.setJobid(cosdauthorizationgroupvo.getJobid());
		cosdauthorizationgroup.setAuthGroupName(cosdauthorizationgroupvo.getAuthGroupName().toUpperCase());
		cosdauthorizationgroup.setLastupdatedby(username);
		cosdauthorizationgroup.setCreatedby(username);
		cosdauthorizationgroup.setCreatedon(new Date());
		cosdauthorizationgroup.setLastupdatedon(new Date());
		
		System.out.println("in Save Job ID -" + cosdauthorizationgroupvo.getJobid());
		System.out.println("in save securityrole -" + securityrole);
		System.out.println("in save Users -" + users);
		
		String result = cosdauthorizationgroupdao.save(cosdauthorizationgroup);
		
		if("duplicate".equalsIgnoreCase(result))
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		
		if("fail".equalsIgnoreCase(result))
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
	
		Converters conv = new Converters();
		cosdauthorizationgroupvo = conv.convertToVo(cosdauthorizationgroup) ;
		return new ResponseEntity<CosdauthorizationgroupVO>(cosdauthorizationgroupvo, HttpStatus.OK);

	}

	@RequestMapping(value = "/deleteAuthGroup/", method = RequestMethod.POST)
	public ResponseEntity<?> deleteAuthGroup(@RequestBody CosdauthorizationgroupVO cosdauthorizationgroupvo) 
	{
		
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		Cosdauthorizationgroup cosdauthorizationgroup = cosdauthorizationgroupdao.getById(cosdauthorizationgroupvo.getAuthorizationgroupid().longValue());
		
		if(cosdauthorizationgroup == null )
		{
			return new ResponseEntity(new Message("Auth Group ID not found  -" + cosdauthorizationgroupvo.getAuthorizationgroupid().longValue()), HttpStatus.OK);
		}
		
		String result = cosdauthorizationgroupdao.delete(cosdauthorizationgroupvo.getAuthorizationgroupid().longValue()) ;
		
		return new ResponseEntity(new Message(result), HttpStatus.OK);
	}
	
	/* ----------------------------- */
	
	@RequestMapping(value = "/getListPolySet/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdauthorizationpolicysetVO>> getListPolySet() 
	{				
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao(); 
		List<Cosdauthorizationpolicyset> cosdauthorizationpolicysetList = cosdauthorizationpolicysetdao.getlist() ;
		
		CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo = new CosdauthorizationpolicysetVO();
		Converters conv = new Converters();
							
		
		if (cosdauthorizationpolicysetList.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		
		List<CosdauthorizationpolicysetVO> cosdauthorizationpolicysetvolist = conv.covertList(cosdauthorizationpolicysetList, cosdauthorizationpolicysetvo);
		return new ResponseEntity<List<CosdauthorizationpolicysetVO>>(cosdauthorizationpolicysetvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/savePolySet/", method = RequestMethod.POST)
	public ResponseEntity<?> savePolySet(@RequestBody CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo ,HttpServletRequest request) {
		logger.info(":: Consentstatus ::", cosdauthorizationpolicysetvo.getConsentstatus());
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = new Cosdauthorizationpolicyset();
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		try
		{
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			cosdauthorizationpolicyset.setClassificationlevel(cosdauthorizationpolicysetvo.getClassificationlevel());
			cosdauthorizationpolicyset.setComments(cosdauthorizationpolicysetvo.getComments());
			cosdauthorizationpolicyset.setConsentstatus(cosdauthorizationpolicysetvo.getConsentstatus());
			//cosdauthorizationpolicyset.setCreatedby(cosdauthorizationpolicysetvo.getCreatedby());
			cosdauthorizationpolicyset.setCreatedby(username);
			cosdauthorizationpolicyset.setCreatedon(new Date());
			cosdauthorizationpolicyset.setLastupdatedby(username);
			cosdauthorizationpolicyset.setLastupdatedon(new Date()); //(new Date());
			cosdauthorizationpolicyset.setTransactionType(cosdauthorizationpolicysetvo.getTransactionType());
			cosdauthorizationpolicyset.setName(cosdauthorizationpolicysetvo.getName().toUpperCase());
			
			//cosdauthorizationpolicyset.setPolicysetid(cosdauthorizationpolicysetvo.getPolicysetid());
			
		    logger.info("before insert");
		    
		    
		    
		    	String result = cosdauthorizationpolicysetdao.save(cosdauthorizationpolicyset);
		    	
		    	Converters conv = new Converters();
		    	CosdauthorizationpolicysetVO cosdabaccontrolgroupvo = conv.convertToVo(cosdauthorizationpolicyset) ;
		    	return new ResponseEntity(cosdabaccontrolgroupvo, HttpStatus.OK);
		 		    	
		    
		}
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
		}
		
		
	}
	
	@RequestMapping(value = "/updatePolySet/", method = RequestMethod.POST)
	public ResponseEntity<?> updatePolySet(@RequestBody CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo , HttpServletRequest request)
	{	
		logger.info(":: Consentstatus ::", cosdauthorizationpolicysetvo.getConsentstatus());
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = new Cosdauthorizationpolicyset();
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		
		try
		{
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			cosdauthorizationpolicyset.setClassificationlevel(cosdauthorizationpolicysetvo.getClassificationlevel());
			cosdauthorizationpolicyset.setComments(cosdauthorizationpolicysetvo.getComments());
			cosdauthorizationpolicyset.setConsentstatus(cosdauthorizationpolicysetvo.getConsentstatus());
			cosdauthorizationpolicyset.setCreatedby(username);
			cosdauthorizationpolicyset.setLastupdatedby(username);
			cosdauthorizationpolicyset.setPolicysetid(cosdauthorizationpolicysetvo.getPolicysetid());
			cosdauthorizationpolicyset.setTransactionType(cosdauthorizationpolicysetvo.getTransactionType());
			cosdauthorizationpolicyset.setName(cosdauthorizationpolicysetvo.getName());
			
						
			cosdauthorizationpolicysetdao.update(cosdauthorizationpolicyset);
	    	
			Converters conv = new Converters();
			cosdauthorizationpolicysetvo = conv.convertToVo(cosdauthorizationpolicyset) ;
	    	return new ResponseEntity(cosdauthorizationpolicysetvo, HttpStatus.OK);
		
		}
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Unable to Update Record."), HttpStatus.OK);
		}
		
		
	}	
	
	@RequestMapping(value = "/deletePolySet/", method = RequestMethod.POST)
	public ResponseEntity<?> deletePolySet(@RequestBody CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo) 
	{
		
		CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		Cosdauthorizationpolicyset cosdauthorizationpolicyset = cosdauthorizationpolicysetdao.getById(cosdauthorizationpolicysetvo.getPolicysetid().longValue());
		
		if(cosdauthorizationpolicyset == null )
		{
			return new ResponseEntity(new Message("Policy Set ID not found  -" + cosdauthorizationpolicysetvo.getPolicysetid().longValue()), HttpStatus.OK);
		}
		
		String result = cosdauthorizationpolicysetdao.delete(cosdauthorizationpolicyset.getPolicysetid().longValue());
		
		return new ResponseEntity(new Message(result), HttpStatus.OK);
	}
	
	 @RequestMapping(value = "/listgrpwithgrpName/", method = RequestMethod.POST, produces = "application/json")			
	 public ResponseEntity<List<CosdauthorizationpolicysetVO>> listAllgrpWithName(@RequestBody CosdauthorizationpolicysetVO cosdauthorizationpolicysetvo) 
	 {		
	    	System.out.println(":: Search::" + cosdauthorizationpolicysetvo.getName());
	    	CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
			List<Cosdauthorizationpolicyset> cosdconsentgrouplist = cosdauthorizationpolicysetdao.getlistByGroupName(cosdauthorizationpolicysetvo.getName().toUpperCase());
			
			Converters conv = new Converters();
			
			List<CosdauthorizationpolicysetVO> cosdabaccontrolgroupsVo = conv.covertList(cosdconsentgrouplist, cosdauthorizationpolicysetvo);
			System.out.println("::-- Cosdabaccontrolgroup --::" + cosdabaccontrolgroupsVo.size());
				
				if (cosdconsentgrouplist.isEmpty()) {
					return new ResponseEntity(new Message("NO Group Found."), HttpStatus.OK); 			
						
				}
				return new ResponseEntity<List<CosdauthorizationpolicysetVO>>(cosdabaccontrolgroupsVo, HttpStatus.OK);
	}
	 
	 @RequestMapping(value = "/saveAuthGroupPolicy/", method = RequestMethod.POST)
	  public ResponseEntity<?> saveAuthGroupPolicy(@RequestBody AuthGroupPolicyVO authgrouppolicyvo) 
	 {  
		 CosdauthorizationpolicyDao cosdauthorizationpolicydao = new CosdauthorizationpolicyDao();
	     String result = cosdauthorizationpolicydao.saveWithAuthGroupPolicy(authgrouppolicyvo.getAuthGroupId() ,authgrouppolicyvo.getPolicySetID() );
	     
	    if("already".equalsIgnoreCase(result))
	     return new ResponseEntity(new Message("This Auth Grp is already in other PolicySet"), HttpStatus.OK);
	     
	     if("saved".equalsIgnoreCase(result))
	     return new ResponseEntity(authgrouppolicyvo, HttpStatus.OK);
	     else
	     return new ResponseEntity(new Message("Failed to save"), HttpStatus.OK); 
	 }

	 @RequestMapping(value = "/viewAuthPolicy/", method = RequestMethod.POST, produces = "application/json")			
	 public ResponseEntity<ViewPolicyAuthGroup> viewAuthPolicy(@RequestBody CosdauthorizationpolicysetVO policyset) 
	 {	
		 CosdauthorizationpolicysetDao cosdauthorizationpolicysetdao = new CosdauthorizationpolicysetDao();
		 ViewPolicyAuthGroup  viewpolicyauthgroupvo = cosdauthorizationpolicysetdao.getViewPolicyAuthGroup(policyset.getPolicysetid().longValue());
		 
		 return new ResponseEntity(viewpolicyauthgroupvo, HttpStatus.OK);
		 
	 }
}
