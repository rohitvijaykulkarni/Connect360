/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.gbs.consentmgmt.dao.CosdabacconstraintDao;
import com.ibm.gbs.consentmgmt.dao.CosdauthorizationgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdorgrolejobuserDao;
import com.ibm.gbs.consentmgmt.dao.OrganisationunitDao;
import com.ibm.gbs.consentmgmt.dao.SecurityroleDao;
import com.ibm.gbs.consentmgmt.dao.UsersDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdauthorizationgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdorgrolejobuser;
import com.ibm.gbs.consentmgmt.dto.Organisationunit;
import com.ibm.gbs.consentmgmt.dto.Securityrole;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.vo.CosdabactransactionVO;
import com.ibm.gbs.vo.CosdauthorizationgroupVO;
import com.ibm.gbs.vo.OrganisationunitVO;


/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/


@Service("AuthServices")
public class AuthServices {
	
	public List<Organisationunit> getOrgList()
	{
		OrganisationunitDao organisationunitdao = new OrganisationunitDao();		
		List<Organisationunit> organisationunitlist = organisationunitdao.getlist() ;		
		
		
		return organisationunitlist ;
	}
	
	public List<Cosdorgrolejobuser> getlist()
	{
		CosdorgrolejobuserDao cosdorgrolejobuserdao = new CosdorgrolejobuserDao();
		List<Cosdorgrolejobuser> cosdorgrolejobuser = cosdorgrolejobuserdao.getlist() ;
		return cosdorgrolejobuser;
	}
	
	public List<Users> getUserList()
	{
		UsersDao userdao = new UsersDao();
		List<Users> usersList = userdao.getlist();
		return usersList;
	}
	
	public List<Securityrole> getSecRoleList()
	{
		SecurityroleDao securityroledao = new SecurityroleDao();
		List<Securityrole> securityrolelist = securityroledao.getlist() ;
		return securityrolelist;
	}
	
	public String saveAuthGroup(CosdauthorizationgroupVO cosdauthorizationgroupvo)
	{
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		Cosdauthorizationgroup cosdauthorizationgroup = new Cosdauthorizationgroup();
		
		//cosdauthorizationgroup.
		
		return cosdauthorizationgroupdao.save(cosdauthorizationgroup);
	}
	
	public String editAuthGroup(CosdauthorizationgroupVO cosdauthorizationgroupvo)
	{
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		Cosdauthorizationgroup cosdauthorizationgroup = new Cosdauthorizationgroup();
		
		//cosdauthorizationgroup.
		
		return cosdauthorizationgroupdao.update(cosdauthorizationgroup);
	}
	
	
	public String deleteAuthGroup(long authID)
	{
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		
		return cosdauthorizationgroupdao.delete(authID);
	}
	
	public List<Cosdauthorizationgroup> getListAuthGroup()
	{
		CosdauthorizationgroupDao cosdauthorizationgroupdao = new CosdauthorizationgroupDao();
		
		List<Cosdauthorizationgroup> cosdauthorizationgrouplist = cosdauthorizationgroupdao.getlist() ;
		return cosdauthorizationgrouplist ;
	}

}


