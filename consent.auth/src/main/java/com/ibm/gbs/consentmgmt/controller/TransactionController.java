package com.ibm.gbs.consentmgmt.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.consentmgmt.wcm.dao.AlertRequestDao;
import com.ibm.gbs.consentmgmt.wcm.dao.CohortDao;
import com.ibm.gbs.consentmgmt.wcm.dao.ReferralStatusHistDao;
import com.ibm.gbs.consentmgmt.wcm.dao.RegistrationRequestDao;
import com.ibm.gbs.consentmgmt.wcm.dto.AlertRequest;
import com.ibm.gbs.consentmgmt.wcm.dto.Cohort;
import com.ibm.gbs.consentmgmt.wcm.dto.ReferralStatusHist;
import com.ibm.gbs.consentmgmt.wcm.dto.RegistrationRequest;
import com.ibm.gbs.util.Message;
import com.ibm.gbs.util.WCMConverter;
import com.ibm.gbs.wcm.vo.AlertRequestVO;
import com.ibm.gbs.wcm.vo.CohortVO;
import com.ibm.gbs.wcm.vo.ReferralStatusHistVO;
import com.ibm.gbs.wcm.vo.RegistrationRequestVO;

@RestController
@RequestMapping("/TransactionController")
public class TransactionController {

	@RequestMapping(value = "/listAllRegRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<RegistrationRequestVO>> listAllCohort() 
	{
		System.out.println(":: list All Registration Request()::");
		RegistrationRequestDao requestdao = new RegistrationRequestDao();
    	
		List<RegistrationRequest> requestlist = requestdao.getlist() ;
		RegistrationRequestVO vo = new RegistrationRequestVO();
		WCMConverter conv = new WCMConverter();
		List<RegistrationRequestVO> requestvolist = conv.covertList(requestlist, vo);
		
		
		return new ResponseEntity<List<RegistrationRequestVO>>(requestvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listAllRegRequestWCohort/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<RegistrationRequestVO>> listAllRegRequestWCohort(@RequestBody CohortVO cohort) 
	{
		System.out.println(":: list All Reg RequestWCohort::");
		RegistrationRequestDao requestdao = new RegistrationRequestDao();
    	
		List<RegistrationRequest> requestlist = requestdao.getlistWithCohortID(cohort);
		RegistrationRequestVO vo = new RegistrationRequestVO();
		WCMConverter conv = new WCMConverter();
		List<RegistrationRequestVO> requestvolist = conv.covertList(requestlist, vo);
		
		
		return new ResponseEntity<List<RegistrationRequestVO>>(requestvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getRegReqlistWithStatus/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<RegistrationRequestVO>> getRegReqlistWithStatus(@RequestBody RegistrationRequestVO regvo) 
	{
		System.out.println(":: getRegReqlistWithStatus()::" + regvo.getStatus() );
		RegistrationRequestDao requestdao = new RegistrationRequestDao();
    	
		List<RegistrationRequest> requestlist = requestdao.getlistWithStatus(regvo.getStatus());
		RegistrationRequestVO vo = new RegistrationRequestVO();
		WCMConverter conv = new WCMConverter();
		List<RegistrationRequestVO> requestvolist = conv.covertList(requestlist, vo);
		
		
		return new ResponseEntity<List<RegistrationRequestVO>>(requestvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<RegistrationRequestVO> saveRequest(@RequestBody RegistrationRequestVO regrequest,HttpServletRequest request) 
	{	
		System.out.println(":: save Request()::");
		RegistrationRequestDao requestdao = new RegistrationRequestDao();
		WCMConverter conv = new WCMConverter();
		RegistrationRequest req = conv.convertTo(regrequest) ;
		req.setCreatedDate(new Date());
		req.setStatus("Staged");
		req = requestdao.save(req);
		if(regrequest == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}		
		
		RegistrationRequestVO voReg = conv.convertToVo(req);
		
		return new ResponseEntity<RegistrationRequestVO>(voReg, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updateRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<Message> updateRequest(@RequestBody RegistrationRequestVO regrequest,HttpServletRequest request) 
	{	
		System.out.println(":: update Request()::");
		RegistrationRequestDao requestdao = new RegistrationRequestDao();
		
		WCMConverter conv = new WCMConverter();
		RegistrationRequest req = conv.convertTo(regrequest) ;
		
    	
		String result =  requestdao.update(req);
		if(regrequest == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		
		
		return new ResponseEntity<Message>(new Message(result), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<Message> deleteRequest(@RequestBody RegistrationRequestVO regrequest,HttpServletRequest request) 
	{	
		System.out.println(":: delete Request::");
		WCMConverter conv = new WCMConverter();
		RegistrationRequest req = conv.convertTo(regrequest) ;
		
		RegistrationRequestDao requestdao = new RegistrationRequestDao();
    	
		String result =  requestdao.delete(req.getReqReqtID().longValue());
		
		if(regrequest == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		
		
		return new ResponseEntity<Message>(new Message(result), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listAllAltRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<AlertRequestVO>> listAltRequest() 
	{
		System.out.println(":: list All Registration Request()::");
		AlertRequestDao requestdao = new AlertRequestDao();
    	
		List<AlertRequest> requestlist = requestdao.getlist() ;
		AlertRequestVO vo = new AlertRequestVO();
		WCMConverter conv = new WCMConverter();
		List<AlertRequestVO> requestvolist = conv.covertList(requestlist, vo);
		 
		
		return new ResponseEntity<List<AlertRequestVO>>(requestvolist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveAltRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<AlertRequestVO> saveAltRequest(@RequestBody AlertRequest regrequest,HttpServletRequest request) 
	{	
		System.out.println(":: save Alt Request::");
		AlertRequestDao requestdao = new AlertRequestDao();
    	
		regrequest = requestdao.save(regrequest);
		if(regrequest == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		WCMConverter conv = new WCMConverter();
		AlertRequestVO voAlt = conv.convertToVo(regrequest);
		
		return new ResponseEntity<AlertRequestVO>(voAlt, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updateAltRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<Message> updateAltRequest(@RequestBody AlertRequest regrequest,HttpServletRequest request) 
	{	
		System.out.println(":: update Alt Request()::");
		AlertRequestDao requestdao = new AlertRequestDao();
    	
		String result =  requestdao.update(regrequest);
		if(regrequest == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		
		
		return new ResponseEntity<Message>(new Message(result), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteAltRequest/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<Message> deleteAltRequest(@RequestBody AlertRequest regrequest,HttpServletRequest request) 
	{	
		System.out.println(":: delete Alt Request::");
		AlertRequestDao requestdao = new AlertRequestDao();
    	
		String result =  requestdao.delete(regrequest.getReqReqtID().longValue());
		
		if(regrequest == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		
		
		return new ResponseEntity<Message>(new Message(result), HttpStatus.OK);
	}
	
/*---------------Services for ReferralStatusHist - Start------------------*/
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/saveReferralStatusHist/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ReferralStatusHistVO> saveReferralStatusHist(@RequestBody ReferralStatusHistVO voObj, HttpServletRequest request) {
		
		System.out.println(":: saveReferralStatusHist ::");
		ReferralStatusHistDao daoObj = new ReferralStatusHistDao();
		WCMConverter conv = new WCMConverter();
		ReferralStatusHist referralStatusHist = conv.convertTo(voObj);
		
		if(referralStatusHist.getRegReq() != null)
		{
			RegistrationRequestDao dao = new RegistrationRequestDao();
			RegistrationRequest RegistrationRequest = referralStatusHist.getRegReq() ;
			RegistrationRequest.setStatus("Pending");
			dao.update(RegistrationRequest);
			System.out.println(":: Updated ..Request in Request table ::");
		}
			
		
		referralStatusHist = daoObj.save(referralStatusHist);		
		if (referralStatusHist == null) {
			return new ResponseEntity(new Message("FAILED"), HttpStatus.OK);
		}

		voObj = conv.convertToVo(referralStatusHist);
		
		System.out.println(":: saved ::");
		return new ResponseEntity(new Message("Request Approved - Pending to send WCM Target"), HttpStatus.OK);
		//return new ResponseEntity<ReferralStatusHistVO>(voObj, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/listAllReferralStatusHist/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<ReferralStatusHistVO>> listAllReferralStatusHist() 
	{
		System.out.println(":: listAllReferralStatusHist() ::");
		ReferralStatusHistDao daoObj = new ReferralStatusHistDao();
    	
		List<ReferralStatusHist> list = daoObj.getlist() ;
		if (list == null) {
			return new ResponseEntity(new Message("NO HISTORY"), HttpStatus.OK);
		}
		 
		ReferralStatusHistVO voObj = new ReferralStatusHistVO();
		WCMConverter conv = new WCMConverter();
		List<ReferralStatusHistVO> voList = conv.convertList(list, voObj);		
		
		return new ResponseEntity<List<ReferralStatusHistVO>>(voList, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/listAllRefStatusHistByRegReqId/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<ReferralStatusHistVO>> listAllRefStatusHistByRegReqId(@RequestBody ReferralStatusHistVO voObj, HttpServletRequest request) 
	{
		System.out.println(":: listAllRefStatusHistByRegReqId() ::");
		ReferralStatusHistDao daoObj = new ReferralStatusHistDao();
    	
		List<ReferralStatusHist> list = daoObj.getlistWithRegReqID(voObj.getReqReqtID().longValue());		
		if (list == null) {
			return new ResponseEntity(new Message("NO HISTORY"), HttpStatus.OK);
		}
		
		WCMConverter conv = new WCMConverter();
		List<ReferralStatusHistVO> voList = conv.convertList(list, voObj);
				
		return new ResponseEntity<List<ReferralStatusHistVO>>(voList, HttpStatus.OK);
	}
	
	/*@RequestMapping(value = "/getRefStatusHistByID/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ReferralStatusHistVO> getRefStatusHistByID(@RequestBody ReferralStatusHistVO voObj, HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		ReferralStatusHistDao daoObj = new ReferralStatusHistDao();
		
		if (session == null) {
			System.out.println("Session is null");
		} else {
			System.out.println("Session is Found");
		}

		ReferralStatusHist hist = daoObj.getById(voObj.getHis_reqreqtid().longValue());

		WCMConverter conv = new WCMConverter();
		voObj = conv.convertToVo(hist);

		if (voObj == null) {
			return new ResponseEntity(new Message("FAILED"), HttpStatus.OK);

		}
		return new ResponseEntity<ReferralStatusHistVO>(voObj, HttpStatus.OK);
	}*/
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/updateReferralStatusHist/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<Message> updateReferralStatusHist(@RequestBody ReferralStatusHistVO voObj, HttpServletRequest request) 
	{	
		System.out.println(":: updateReferralStatusHist() ::");
		ReferralStatusHistDao daoObj = new ReferralStatusHistDao();
		
		WCMConverter conv = new WCMConverter();
		ReferralStatusHist obj = conv.convertTo(voObj) ;		
    	
		String result =  daoObj.update(obj);
		if(result == null)
		{
			return new ResponseEntity(new Message("FAILED"), HttpStatus.OK);
		}
				
		return new ResponseEntity<Message>(new Message(result), HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/deleteReferralStatusHist/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<Message> deleteReferralStatusHist(@RequestBody ReferralStatusHistVO voObj, HttpServletRequest request) 
	{	
		System.out.println(":: saveReferralStatusHist ::");
		ReferralStatusHistDao daoObj = new ReferralStatusHistDao();
		WCMConverter conv = new WCMConverter();
		ReferralStatusHist referralStatusHist = conv.convertTo(voObj);
		
		if(referralStatusHist.getRegReq() != null)
		{
			RegistrationRequestDao dao = new RegistrationRequestDao();
			RegistrationRequest RegistrationRequest = referralStatusHist.getRegReq() ;
			RegistrationRequest.setStatus("Rejected");
			dao.update(RegistrationRequest);
			System.out.println(":: Updated ..Request in Request table ::");
		}
			
		
		referralStatusHist = daoObj.save(referralStatusHist);		
		if (referralStatusHist == null) {
			return new ResponseEntity(new Message("FAILED"), HttpStatus.OK);
		}

		voObj = conv.convertToVo(referralStatusHist);
		
		System.out.println(":: saved ::");
		return new ResponseEntity(new Message("Request Approved - Pending to send WCM Target"), HttpStatus.OK);
	
	}
	
	/*---------------Services for ReferralStatusHist - End------------------*/	
}
