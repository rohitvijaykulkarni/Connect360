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
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolobjectDao;
import com.ibm.gbs.consentmgmt.dao.CosdabactransactionDao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolobject;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.consentmgmt.model.User;
import com.ibm.gbs.consentmgmt.service.ControlService;
import com.ibm.gbs.consentmgmt.util.CustomErrorType;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.Message;
import com.ibm.gbs.vo.AllControlGroup;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.CosdabactransactionVO;

@RestController
@RequestMapping("/control")
public class ControlController {

	public static final Logger logger = LoggerFactory.getLogger(ControlController.class);
	
	@Autowired	
	ControlService controlservice ;
	
		// ------------------- Constraint  ---------------------------------------/
	   
		@RequestMapping(value = "/getConstraint/", method = RequestMethod.POST, produces = "application/json")			
		public ResponseEntity<CosdabacconstraintVO> getConstraint(@RequestBody CosdabaccontrolgroupVO cosdabaccontrolgroupvo) 
		{				
			//List<Cosdabacconstraint> cosdabacconstraintList = controlservice.getListConstraint();
			
			CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
			Cosdabaccontrolobject cosdabaccontrolobject = null ;//cosdabaccontrolobjectdao.getByGrpId(cosdabaccontrolgroupvo.getControlgroupid().longValue()) ;
			Cosdabacconstraint cosdabacconstraint = cosdabaccontrolobject.getCosdabacconstraint() ;
			
			if( cosdabacconstraint == null)
				return new ResponseEntity(new Message("Constraint not found For Control Group -" + cosdabaccontrolgroupvo.getControlgroupid().longValue()), HttpStatus.OK);
			
			Converters conv = new Converters();
			
			CosdabacconstraintVO cosdabacconstraintvo = conv.convertToVo(cosdabacconstraint) ;	 
			
			
			
			return new ResponseEntity<CosdabacconstraintVO>(cosdabacconstraintvo, HttpStatus.OK);
		}
	
		@RequestMapping(value = "/listAllConstraint/", method = RequestMethod.POST, produces = "application/json")			
		public ResponseEntity<List<CosdabacconstraintVO>> listAllConstraint() 
		{				
			List<Cosdabacconstraint> cosdabacconstraintList = controlservice.getListConstraint();
			
			CosdabacconstraintVO cosdabacconstraintvo = new CosdabacconstraintVO();
			Converters conv = new Converters();
								
			
			if (cosdabacconstraintList.isEmpty()) {
						return new ResponseEntity(HttpStatus.OK);
						// You many decide to return HttpStatus.NOT_FOUND
			}
			List<CosdabacconstraintVO> cosdabacconstraintVoList = conv.covertList(cosdabacconstraintList, cosdabacconstraintvo);
			return new ResponseEntity<List<CosdabacconstraintVO>>(cosdabacconstraintVoList, HttpStatus.OK);
		}

		@RequestMapping(value = "/delConstraint/", method = RequestMethod.POST)
		public ResponseEntity<?> delConstraint(@RequestBody CosdabacconstraintVO cosdabacconstraintvo) {
			logger.info("Fetching & Deleting User with id {} ", cosdabacconstraintvo.getAttributeconstraintid());
	        long del = Long.parseLong(cosdabacconstraintvo.getAttributeconstraintid().toString());
			 String result = controlservice.deleteConstraint(del);
			System.out.println(":: Result ::" + result);
			return new ResponseEntity(new Message(result), HttpStatus.OK);
		}
		
		@RequestMapping(value = "/updateConstraint/", method = RequestMethod.POST)
		public ResponseEntity<?> updateConstraint(@RequestBody CosdabacconstraintVO cosdabacconstraintvo , HttpServletRequest request)
		{	
			logger.info(":: constraint type ::", cosdabacconstraintvo.getAccessconstrainttype());
			Cosdabacconstraint cosdabacconstraint = new Cosdabacconstraint();
			
			try
			{
				String username = HibernateUtil.getUserName(request); // HttpServletRequest request
				cosdabacconstraint.setAttributeconstraintid(cosdabacconstraintvo.getAttributeconstraintid());
				cosdabacconstraint.setAccessconstrainttype(cosdabacconstraintvo.getAccessconstrainttype());
				cosdabacconstraint.setAttributevalue(cosdabacconstraintvo.getAttributevalue());
				cosdabacconstraint.setAttributename(cosdabacconstraintvo.getAttributename());
				cosdabacconstraint.setCreatedby(username);
				cosdabacconstraint.setCreatedon(new Date());
				cosdabacconstraint.setLastupdatedby(username);
				
				
				controlservice.updateConstraint(cosdabacconstraint);
		    	Converters conv = new Converters();
		    	cosdabacconstraintvo = conv.convertToVo(cosdabacconstraint) ;
		    	return new ResponseEntity(cosdabacconstraintvo, HttpStatus.OK);
			
			}
			catch(Exception ex)
			{    System.out.println("::-----$$$$$ ::" + ex);
				ex.printStackTrace();
				return new ResponseEntity(new Message("Unable to Update Record."), HttpStatus.OK);
			}
			
			
		}	
		
		@RequestMapping(value = "/saveConstraint/", method = RequestMethod.POST)
		public ResponseEntity<?> saveConstraint(@RequestBody CosdabacconstraintVO cosdabacconstraintvo, HttpServletRequest request) {
			logger.info(":: constraint type ::", cosdabacconstraintvo.getAccessconstrainttype());
			Cosdabacconstraint cosdabacconstraint = new Cosdabacconstraint();
			try
			{
				String username = HibernateUtil.getUserName(request); // HttpServletRequest request
				//cosdabacconstraint.setAttributeconstraintid(cosdabacconstraintvo.getAttributeconstraintid());
				cosdabacconstraint.setAccessconstrainttype(cosdabacconstraintvo.getAccessconstrainttype());
				cosdabacconstraint.setAttributevalue(cosdabacconstraintvo.getAttributevalue());
				cosdabacconstraint.setAttributename(cosdabacconstraintvo.getAttributename());
				cosdabacconstraint.setCreatedby(username);
				cosdabacconstraint.setCreatedon(cosdabacconstraintvo.getCreatedon());
				cosdabacconstraint.setLastupdatedby(username);
				
				
				controlservice.saveConstraint(cosdabacconstraintvo.getControlgroupid().longValue(),cosdabacconstraintvo.getTransactionid().longValue(),cosdabacconstraint);
				cosdabacconstraintvo.setAttributeconstraintid(cosdabacconstraint.getAttributeconstraintid());
		    	Converters conv = new Converters();
		    	cosdabacconstraintvo = conv.convertToVo(cosdabacconstraint) ;
		    	return new ResponseEntity(cosdabacconstraintvo, HttpStatus.OK);
				
			   
			}
			catch(Exception ex)
			{    System.out.println("::-----$$$$$ ::" + ex);
				ex.printStackTrace();
				return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
			}
		}
	// ------------------- End Constraint ---------------------------------------/
		
		
	// ------------------- TRANSACTION  TXN ----------------------------------------/
		
		@RequestMapping(value = "/getTxn/", method = RequestMethod.POST, produces = "application/json")			
		public ResponseEntity<CosdabactransactionVO> getTxn(@RequestBody CosdabaccontrolgroupVO cosdabaccontrolgroupvo) 
		{				
			//List<Cosdabacconstraint> cosdabacconstraintList = controlservice.getListConstraint();
			System.out.println(":: Group ID ::"+ cosdabaccontrolgroupvo.getControlgroupid().longValue());
			 
			CosdabaccontrolobjectDao cosdabaccontrolobjectdao = new CosdabaccontrolobjectDao();
			Cosdabaccontrolobject cosdabaccontrolobject = null ; //cosdabaccontrolobjectdao.getByGrpId(cosdabaccontrolgroupvo.getControlgroupid().longValue()) ;
			Cosdabactransaction cosdabactransaction = cosdabaccontrolobject.getCosdabactransaction();
			
			if( cosdabactransaction == null)
				return new ResponseEntity(new Message("Transaction not found For Control Group -" + cosdabaccontrolgroupvo.getControlgroupid().longValue()), HttpStatus.OK);
			
			Converters conv = new Converters();
			
			CosdabactransactionVO cosdabactransactionvo = conv.convertToVo(cosdabactransaction) ;	 
			
			
			
			return new ResponseEntity<CosdabactransactionVO>(cosdabactransactionvo, HttpStatus.OK);
		}	
	@RequestMapping(value = "/listAlltxn/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdabactransactionVO>> listAlltxn() 
	{				
		List<Cosdabactransaction> cosdabactxngrouplist = controlservice.getListCosdabacTxn();
		//System.out.println("::-- Cosdabaccontrolgroup --::" + cosdabaccontrolgroups.size());
		CosdabactransactionVO cosdabactransaction = new CosdabactransactionVO();
		Converters conv = new Converters();
		
		List<CosdabactransactionVO> cosdabaccontrolgroupsVolist = conv.covertList(cosdabactxngrouplist, cosdabactransaction);
		
		
		if (cosdabaccontrolgroupsVolist.isEmpty()) {
					return new ResponseEntity(HttpStatus.NO_CONTENT);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<CosdabactransactionVO>>(cosdabaccontrolgroupsVolist, HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteTxn/", method = RequestMethod.POST)	
	public ResponseEntity<?> deleteTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo) {
		logger.info("Fetching & Deleting User with id {}", cosdabactransactionvo.getTransactionid().toString());
        long del = Long.parseLong(cosdabactransactionvo.getTransactionid().toString());
		 String result = controlservice.deleteCosdabacTxn(del);
		System.out.println(":: Result ::" + result);
		return new ResponseEntity(new Message(result), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/updateTxn/", method = RequestMethod.POST)
	public ResponseEntity<?> updateTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo , HttpServletRequest request )
	{	
		logger.info(":: Transactionname ::", cosdabactransactionvo.getTransactionname());
	
		Cosdabactransaction cosdabactransaction = new Cosdabactransaction();
		try
		{
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			cosdabactransaction.setTransactionid(cosdabactransactionvo.getTransactionid());
			cosdabactransaction.setTransactionname(cosdabactransactionvo.getTransactionname());
			cosdabactransaction.setTransactiontype(cosdabactransactionvo.getTransactiontype());
			cosdabactransaction.setDefaultaccess(cosdabactransactionvo.getDefaultaccess());
			cosdabactransaction.setLastupdatedby(username);		
			cosdabactransaction.setLastupdatedon(new Date());
		
		
			logger.info("before insert");
			controlservice.updateCosdabacTxn(cosdabactransaction);
			Converters conv = new Converters();
			CosdabactransactionVO cosdabactransactionVo = conv.convertToVo(cosdabactransaction);
			return new ResponseEntity(cosdabactransactionVo, HttpStatus.OK);  
		}	
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
		}	
				
	}	
	
	@RequestMapping(value = "/saveTxn/", method = RequestMethod.POST)	
	public ResponseEntity<?> saveTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo ,HttpServletRequest request) {
		logger.info(":: Transactionname ::", cosdabactransactionvo.getTransactionname());
		
		Cosdabactransaction cosdabactransaction = new Cosdabactransaction();
		try
		{
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			cosdabactransaction.setTransactionname(cosdabactransactionvo.getTransactionname());
			cosdabactransaction.setTransactiontype(cosdabactransactionvo.getTransactiontype());
			cosdabactransaction.setDefaultaccess(cosdabactransactionvo.getDefaultaccess());
			cosdabactransaction.setLastupdatedby(username);
			cosdabactransaction.setCreatedby(username);
			cosdabactransaction.setLastupdatedon(new Date());
			cosdabactransaction.setCreatedon(new Date());
			
		    logger.info("before insert");
		    
		    CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao();
		    String result = "empty" ; //cosdabactransactiondao.getlistByTxnName(cosdabactransactionvo.getTransactionname());
		    
		    if("empty".equalsIgnoreCase(result))
		    {
		    	controlservice.saveCosdabacTxn( cosdabactransactionvo.getControlgroupid().longValue(), cosdabactransaction);
		    	cosdabactransactionvo.setTransactionid(cosdabactransaction.getTransactionid());
		    	logger.info(":: Transactionid ::" + cosdabactransaction.getTransactionid());
		    	Converters conv = new Converters();
		    	CosdabactransactionVO cosdabactransactionVo = conv.convertToVo(cosdabactransaction);
		    	return new ResponseEntity(cosdabactransactionvo, HttpStatus.OK);
		    }
		    else
		    {
		    	return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		    }
		   
		  
		}
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
		}		
		
	}
	
	@RequestMapping(value = "/existTrans/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<?> existConsTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo) 
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao() ;
		//CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
		 
		try
		{
			/*String result = cosdabactransactiondao.getlistByTxnConsentID(cosdabactransactionvo.getTransactionid().longValue()) ;
			
			if("duplicate".equalsIgnoreCase(result))
			{
				 return new ResponseEntity(new Message("duplicate"), HttpStatus.OK);
			}*/
			
			cosdabactransactiondao.saveExistingWithControl(cosdabactransactionvo.getControlgroupid().longValue() ,cosdabactransactionvo.getTransactionid().longValue());
		}
		catch(Exception ex)
		{
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);	
		}
		 
		 return new ResponseEntity(new Message("success"), HttpStatus.OK);
	}
	// ------------------- End Txn ---------------------------------------/
	
	// -------------------Retrieve All Cosdabaccontrolgroup---------------------------------------------/
	@RequestMapping(value = "/listgrp/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdabaccontrolgroupVO>> listAllgrp() 
	{				
		List<Cosdabaccontrolgroup> cosdabaccontrolgroups = controlservice.getListCosdabaccontrolgroup();
		CosdabaccontrolgroupVO cosdabaccontrolgroupvo = new CosdabaccontrolgroupVO();
		Converters conv = new Converters();
		
		List<CosdabaccontrolgroupVO> cosdabaccontrolgroupsVo = conv.covertList(cosdabaccontrolgroups, cosdabaccontrolgroupvo);
		System.out.println("::-- Cosdabaccontrolgroup --::" + cosdabaccontrolgroupsVo.size());
			
			if (cosdabaccontrolgroupsVo.isEmpty()) {
				return new ResponseEntity(new Message("NO Group Found."), HttpStatus.OK); 			
					
			}
			return new ResponseEntity<List<CosdabaccontrolgroupVO>>(cosdabaccontrolgroupsVo, HttpStatus.OK);
	}
	    
	 @RequestMapping(value = "/listgrpwithgrpName/", method = RequestMethod.POST, produces = "application/json")			
	 public ResponseEntity<List<CosdabaccontrolgroupVO>> listAllgrpWithName(@RequestBody CosdabaccontrolgroupVO cosdabaccontrolgroupvo ,HttpServletRequest request) 
	 {		
		 	String username = HibernateUtil.getUserName(request); // HttpServletRequest request
	    	System.out.println(":: ::" + cosdabaccontrolgroupvo.getControlgroupname());
			List<Cosdabaccontrolgroup> cosdabaccontrolgroups = controlservice.getListcontrolgroupWithGrpName(cosdabaccontrolgroupvo.getControlgroupname().toUpperCase());
			
			Converters conv = new Converters();
			
			List<CosdabaccontrolgroupVO> cosdabaccontrolgroupsVo = conv.covertList(cosdabaccontrolgroups, cosdabaccontrolgroupvo);
			System.out.println("::-- Cosdabaccontrolgroup --::" + cosdabaccontrolgroupsVo.size());
				
				if (cosdabaccontrolgroupsVo.isEmpty()) {
					return new ResponseEntity(new Message("NO Group Found."), HttpStatus.OK); 			
						
				}
				return new ResponseEntity<List<CosdabaccontrolgroupVO>>(cosdabaccontrolgroupsVo, HttpStatus.OK);
	}

		@RequestMapping(value = "/delControlGrp/", method = RequestMethod.POST)
		public ResponseEntity<?> deleteControlGrp(@RequestBody CosdabaccontrolgroupVO cosdabaccontrolgroupvo) {
			logger.info("Fetching & Deleting User with id {}", cosdabaccontrolgroupvo.getControlgroupid());
            long del = Long.parseLong(cosdabaccontrolgroupvo.getControlgroupid().toString());
			 String result = controlservice.deleteCosdabaccontrolgroup(del);
			System.out.println(":: REsult ::" + result);
			return new ResponseEntity(new Message(result), HttpStatus.OK);
		}
		
		@RequestMapping(value = "/updateControlGrp/", method = RequestMethod.POST)
		public ResponseEntity<?> updateControlGrp(@RequestBody CosdabaccontrolgroupVO controlGrpVo ,HttpServletRequest request)
		{	logger.info("Group Name ::", controlGrpVo.getControlgroupname() + ":: ID ::" + controlGrpVo.getControlgroupid());
			Cosdabaccontrolgroup cosdabaccontrolgroup = new Cosdabaccontrolgroup();
			try
			{   String username = HibernateUtil.getUserName(request); // HttpServletRequest request
				cosdabaccontrolgroup.setControlgroupid(controlGrpVo.getControlgroupid());
				cosdabaccontrolgroup.setControlgroupname(controlGrpVo.getControlgroupname().toUpperCase());
				cosdabaccontrolgroup.setCreatedby(username);
				cosdabaccontrolgroup.setCreatedon(new Date());
				cosdabaccontrolgroup.setLastupdatedby(username);
				cosdabaccontrolgroup.setLastupdatedon(new Date());
								
				String result = controlservice.updateCosdabaccontrolgroup(cosdabaccontrolgroup);
			
				return new ResponseEntity(new Message(result), HttpStatus.OK);
			
			}
			catch(Exception ex)
			{    System.out.println("::-----$$$$$ ::" + ex);
				ex.printStackTrace();
				return new ResponseEntity(new Message("Unable to Update Record."), HttpStatus.OK);
			}
			
			
		}	
		
		@RequestMapping(value = "/saveControlGrp/", method = RequestMethod.POST)
		public ResponseEntity<?> saveControlGrp(@RequestBody CosdabaccontrolgroupVO controlGrpVo ,HttpServletRequest request) {
			logger.info(":: Group Name ::", controlGrpVo.getControlgroupname());
			Cosdabaccontrolgroup cosdabaccontrolgroup = new Cosdabaccontrolgroup();
			try
			{
				String username = HibernateUtil.getUserName(request);
				
				cosdabaccontrolgroup.setControlgroupname(controlGrpVo.getControlgroupname().toUpperCase());
				cosdabaccontrolgroup.setCreatedby(username);
				cosdabaccontrolgroup.setCreatedon(new Date());
				cosdabaccontrolgroup.setLastupdatedby(username);
				cosdabaccontrolgroup.setLastupdatedon(new Date());
			    logger.info("before insert");
			    
			    List<Cosdabaccontrolgroup> cosdabaccontrolgroups = controlservice.getListcontrolgroupWithGrpName(cosdabaccontrolgroup.getControlgroupname());
			    
			    if(cosdabaccontrolgroups == null || cosdabaccontrolgroups.size() == 0)
			    { 
			    	controlservice.saveCosdabaccontrolgroup(cosdabaccontrolgroup);
			    	Converters conv = new Converters();
			    	CosdabaccontrolgroupVO cosdabaccontrolgroupvo = conv.convertToVo(cosdabaccontrolgroup) ;
			    	return new ResponseEntity(cosdabaccontrolgroupvo, HttpStatus.OK);
			    }
			    else
			    {
			    	return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
			    }
			}
			catch(Exception ex)
			{    System.out.println("::-----$$$$$ ::" + ex);
				ex.printStackTrace();
				return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
			}
			
			
		}
		
		@RequestMapping(value = "/getgrpWithGrpID/", method = RequestMethod.POST, produces = "application/json")			
		 public ResponseEntity<CosdabaccontrolgroupVO> getgrpWithGrpID(@RequestBody CosdabaccontrolgroupVO cosdabaccontrolgroupvo ,HttpServletRequest request) 
		 {		
			    HttpSession session = request.getSession(false) ;
			    
			    if(session == null)
			    {
			    	System.out.println("Session is null");
			    }
			    else 
			    {
			    	System.out.println("Session is Found");
			    }
			     System.out.println(":: Get details of Control Group Id ::" + cosdabaccontrolgroupvo.getControlgroupid());
		    	Cosdabaccontrolgroup cosdabaccontrolgroup = controlservice.getGrpwithID(cosdabaccontrolgroupvo.getControlgroupid().longValue());
				
				Converters conv = new Converters();
		    	CosdabaccontrolgroupVO vogroup = conv.convertToVo(cosdabaccontrolgroup) ;
				
					
					if (vogroup == null) {
						return new ResponseEntity(new Message("NO Group Found."), HttpStatus.OK); 			
							
					}
					return new ResponseEntity<CosdabaccontrolgroupVO>(vogroup, HttpStatus.OK);
		}
		
		@RequestMapping(value = "/SearchAllControl/", method = RequestMethod.POST, produces = "application/json")			
		 public ResponseEntity<AllControlGroup> SearchAllControl(@RequestBody CosdabaccontrolgroupVO cosdabaccontrolgroupvo) 
		 {	CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
		 	AllControlGroup allcontrolgroup = cosdabaccontrolgroupdao.searchControlData(cosdabaccontrolgroupvo);
			return new ResponseEntity<AllControlGroup>(allcontrolgroup, HttpStatus.OK);
		 }
		
		@RequestMapping(value = "/listAllConstraintWithTxn/{txnName}/", method = RequestMethod.GET, produces = "application/json")			
		public ResponseEntity<List<CosdabacconstraintVO>> listAllConstraintWithTxn(@PathVariable("txnName") String txn) 
		{				
			System.out.println("-- listAllConstraintWithTxn --" + txn);
			
			CosdabaccontrolgroupDao cosdabaccontrolgroupdao = new CosdabaccontrolgroupDao();
			List<CosdabacconstraintVO> cosdabacconstraintVoList = cosdabaccontrolgroupdao.searchAttributeData(txn);
			CosdabacconstraintVO cosdabacconstraintvo = new CosdabacconstraintVO();
			Converters conv = new Converters();
								
			
			if (cosdabacconstraintVoList.isEmpty()) {
						return new ResponseEntity(HttpStatus.OK);
						// You many decide to return HttpStatus.NOT_FOUND
			}
			//List<CosdabacconstraintVO> cosdabacconstraintVoList = conv.covertList(cosdabacconstraintList, cosdabacconstraintvo);
			return new ResponseEntity<List<CosdabacconstraintVO>>(cosdabacconstraintVoList, HttpStatus.OK);
		}

}