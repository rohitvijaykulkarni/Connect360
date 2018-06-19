/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/

/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.consentmgmt.dao.UsersDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Users;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.UsersVO;

@RestController
@RequestMapping("/pwdcontrol")
public class AuthorizationController {
	
	
	@RequestMapping(value = "/getAuthticate/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<UsersVO> getAuthticate(@RequestBody UsersVO usersvo) 
	{
		UsersDao Usersdao = new UsersDao();
		String user = usersvo.getUsername() ;
		String password = usersvo.getPassword() ;
		
		Users userdo = Usersdao.getById(user);
		if(userdo == null)
		{
			usersvo.setResult("false");
			return new ResponseEntity<UsersVO>(usersvo, HttpStatus.OK);
		}
		String result = userdo.getPassword().equals(password) ? "true" : "false" ;
		usersvo.setResult(result);
		if(result.equals("true")) 
		 usersvo.setUserRole(userdo.getRolename());
		return new ResponseEntity<UsersVO>(usersvo, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/getListUser/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<UsersVO>> getListUser() 
	{	
		UsersDao Usersdao = new UsersDao();
		UsersVO UsersVO  = new UsersVO();
		Converters conv = new Converters();
		List<Users> UsersList = Usersdao.getlist() ;
		List<UsersVO> cosdabacconstraintVoList = conv.covertList(UsersList, UsersVO);
		return new ResponseEntity<List<UsersVO>>(cosdabacconstraintVoList, HttpStatus.OK);
	
	
	}
}
