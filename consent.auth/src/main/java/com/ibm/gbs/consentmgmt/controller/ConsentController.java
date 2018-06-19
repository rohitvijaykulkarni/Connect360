/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/

/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import org.springframework.http.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import com.ibm.gbs.consentmgmt.dao.CosdabaccontrolgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdabactransactionDao;
import com.ibm.gbs.consentmgmt.dao.CosdconsentexceptionDao;
import com.ibm.gbs.consentmgmt.dao.CosdconsentgroupDao;
import com.ibm.gbs.consentmgmt.dao.CosdconsentgrouptxnDao;
import com.ibm.gbs.consentmgmt.dao.CosdpersonconsentDao;
import com.ibm.gbs.consentmgmt.dao.CosdpersonconsenthistoryDao;
import com.ibm.gbs.consentmgmt.dao.ReferralLADao;
import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;
import com.ibm.gbs.consentmgmt.dto.Cosdabaccontrolgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdabactransaction;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentexception;
import com.ibm.gbs.consentmgmt.dto.Cosdconsentgroup;
import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsent;
import com.ibm.gbs.consentmgmt.dto.Cosdpersonconsenthistory;
import com.ibm.gbs.consentmgmt.dto.ReferralLA;
import com.ibm.gbs.util.ConsentConverter;
import com.ibm.gbs.util.Converters;
import com.ibm.gbs.util.HibernateUtil;
import com.ibm.gbs.util.Message;
import com.ibm.gbs.vo.AllControlGroup;
import com.ibm.gbs.vo.CosdabacconstraintVO;
import com.ibm.gbs.vo.CosdabaccontrolgroupVO;
import com.ibm.gbs.vo.CosdabactransactionVO;
import com.ibm.gbs.vo.CosdconsentexceptionVO;
import com.ibm.gbs.vo.CosdconsentgroupVO;
import com.ibm.gbs.vo.CosdpersonconsentVO;
import com.ibm.gbs.vo.ReferralLAVO;
import com.ibm.gbs.vo.ViewConsentGroup;

@RestController
@RequestMapping("/consent")
public class ConsentController {
	
	public static final Logger logger = LoggerFactory.getLogger(ControlController.class);
	
	@RequestMapping(value = "/viewConsentGrp/", method = RequestMethod.POST, produces = "application/json")			
	 public ResponseEntity<ViewConsentGroup> viewConsentGrp(@RequestBody CosdconsentgroupVO cosdconsentgroupvo) 
	 {	System.out.println(":: Grp ID ::" + cosdconsentgroupvo.getConsentgroupid().longValue());
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		ViewConsentGroup vConsentGrp = cosdconsentgroupdao.getConsetGrp(cosdconsentgroupvo);
		return new ResponseEntity<ViewConsentGroup>(vConsentGrp, HttpStatus.OK);
	 }
	
	@RequestMapping(value = "/listConsentGroup/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdconsentgroupVO>> listAllConstraint() 
	{	
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		List<Cosdconsentgroup> cosdconsentgrouplist = cosdconsentgroupdao.getlist() ;
		
		CosdconsentgroupVO cosdabacconstraintvo = new CosdconsentgroupVO();
		ConsentConverter conv = new ConsentConverter();
							
		
		if (cosdconsentgrouplist.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		List<CosdconsentgroupVO> cosdconsentgroupVolist = conv.covertList(cosdconsentgrouplist, cosdabacconstraintvo);
		return new ResponseEntity<List<CosdconsentgroupVO>>(cosdconsentgroupVolist, HttpStatus.OK);
	}
	
	
	 @RequestMapping(value = "/listgrpwithgrpName/", method = RequestMethod.POST, produces = "application/json")			
	 public ResponseEntity<List<CosdconsentgroupVO>> listAllgrpWithName(@RequestBody CosdconsentgroupVO cosdconsentgroupvo) 
	 {		
	    	System.out.println(":: Search::" + cosdconsentgroupvo.getName());
	    	CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
			List<Cosdconsentgroup> cosdconsentgrouplist = cosdconsentgroupdao.getlistByGroupName(cosdconsentgroupvo.getName().toUpperCase());
			
			ConsentConverter conv = new ConsentConverter();
			
			List<CosdconsentgroupVO> cosdabaccontrolgroupsVo = conv.covertList(cosdconsentgrouplist, cosdconsentgroupvo);
			System.out.println("::-- Cosdabaccontrolgroup --::" + cosdabaccontrolgroupsVo.size());
				
				if (cosdconsentgrouplist.isEmpty()) {
					return new ResponseEntity(new Message("NO Group Found."), HttpStatus.OK); 			
						
				}
				return new ResponseEntity<List<CosdconsentgroupVO>>(cosdabaccontrolgroupsVo, HttpStatus.OK);
	}


	@RequestMapping(value = "/saveConGrp/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<CosdconsentgroupVO> saveConGrp(@RequestBody CosdconsentgroupVO cosdconsentgroupvo,HttpServletRequest request) 
	{	
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		Cosdconsentgroup cosdconsentgroup = new Cosdconsentgroup() ;
		String username = HibernateUtil.getUserName(request); // HttpServletRequest request
		//cosdconsentgroup.setConsentgroupid(cosdconsentgroupvo.getConsentgroupid());
		cosdconsentgroup.setName(cosdconsentgroupvo.getName().toUpperCase());
		cosdconsentgroup.setDescription(cosdconsentgroupvo.getDescription());
		
		cosdconsentgroup.setCreatedby(username);
		cosdconsentgroup.setCreatedon(new Date());
		
		cosdconsentgroup.setLastupdatedby(username);
		cosdconsentgroup.setLastupdatedon(new Date());
		
		
		//List<Cosdconsentgroup> Cosdconsentgrouplist  = cosdconsentgroupdao.getlistByGroupName(cosdconsentgroupvo.getName());
		
		//if(Cosdconsentgrouplist == null || Cosdconsentgrouplist.size() == 0)
		cosdconsentgroup = cosdconsentgroupdao.save(cosdconsentgroup);
		if(cosdconsentgroup == null)
		{
			return new ResponseEntity(new Message("Duplicate"), HttpStatus.OK);
		}
		
		ConsentConverter conv = new ConsentConverter();
		cosdconsentgroupvo = conv.convertToVo(cosdconsentgroup);	
		
		if (cosdconsentgroup == null) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		//List<CosdconsentgroupVO> cosdconsentgroupVolist = conv.covertList(cosdconsentgrouplist, cosdabacconstraintvo);
		return new ResponseEntity<CosdconsentgroupVO>(cosdconsentgroupvo, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/updateConGrp/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<CosdconsentgroupVO> updateConGrp(@RequestBody CosdconsentgroupVO cosdconsentgroupvo ,HttpServletRequest request) 
	{	
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(cosdconsentgroupvo.getConsentgroupid().longValue()) ;
		
		if (cosdconsentgroup == null) {
			return new ResponseEntity(new Message("Not Found") ,HttpStatus.OK);
			// You many decide to return HttpStatus.NOT_FOUND
          }
		String username = HibernateUtil.getUserName(request); // HttpServletRequest request
		//cosdconsentgroup.setConsentgroupid(cosdconsentgroupvo.getConsentgroupid());
		cosdconsentgroup.setName(cosdconsentgroupvo.getName());
		cosdconsentgroup.setDescription(cosdconsentgroupvo.getDescription());
		
		cosdconsentgroup.setCreatedby(username);
		cosdconsentgroup.setCreatedon(new Date());
		
		cosdconsentgroup.setLastupdatedby(username);
		cosdconsentgroup.setLastupdatedon(new Date());
		
		String result = cosdconsentgroupdao.update(cosdconsentgroup);
		
		
		ConsentConverter conv = new ConsentConverter();
		cosdconsentgroupvo = conv.convertToVo(cosdconsentgroup);	
		
		
		//List<CosdconsentgroupVO> cosdconsentgroupVolist = conv.covertList(cosdconsentgrouplist, cosdabacconstraintvo);
		return new ResponseEntity<CosdconsentgroupVO>(cosdconsentgroupvo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delConGrp/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<?> delConGrp(@RequestBody CosdconsentgroupVO cosdconsentgroupvo) 
	{	
		CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao();
		Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(cosdconsentgroupvo.getConsentgroupid().longValue()) ;
		
		if (cosdconsentgroup == null) {
			return new ResponseEntity(new Message("Not Found") ,HttpStatus.OK);
			// You many decide to return HttpStatus.NOT_FOUND
          }
		
		String result = cosdconsentgroupdao.delete(cosdconsentgroupvo.getConsentgroupid().longValue());
	
			
		ConsentConverter conv = new ConsentConverter();
		cosdconsentgroupvo = conv.convertToVo(cosdconsentgroup);	
		
		
		//List<CosdconsentgroupVO> cosdconsentgroupVolist = conv.covertList(cosdconsentgrouplist, cosdabacconstraintvo);
		return new ResponseEntity(new Message(result), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveConsTxn/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<CosdabactransactionVO> saveConsTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo, HttpServletRequest request) 
	{	
		logger.info(":: Transactionname ::", cosdabactransactionvo.getTransactionname());
		
		Cosdabactransaction cosdabactransaction = new Cosdabactransaction();
		try
		{   String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			cosdabactransaction.setTransactionname(cosdabactransactionvo.getTransactionname());
			cosdabactransaction.setTransactiontype(cosdabactransactionvo.getTransactiontype());
			cosdabactransaction.setDefaultaccess(cosdabactransactionvo.getDefaultaccess());
			cosdabactransaction.setLastupdatedby(username);
			cosdabactransaction.setCreatedby(username);
			cosdabactransaction.setLastupdatedon(new Date());
			cosdabactransaction.setCreatedon(new Date());
			
		    logger.info("before insert");
		    
		    CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao() ;
		    if(cosdabactransactionvo.getControlgroupid() == null)
		    {
		    	return new ResponseEntity(new Message("Consent Group ID is null."), HttpStatus.OK);
		    }
		    
		    
		    
		    String result = cosdabactransactiondao.getlistByTxnName(cosdabactransactionvo.getTransactionname());// ,cosdabactransactionvo.getControlgroupid().longValue());
		    
		    if("empty".equalsIgnoreCase(result))
		    {
		    
		    	cosdabactransaction = cosdabactransactiondao.saveWithConsent(cosdabactransactionvo.getControlgroupid().longValue(), cosdabactransaction);
		    
		    	Converters conv = new Converters();
		    	CosdabactransactionVO cosdabactransactionVo = conv.convertToVo(cosdabactransaction);
		    	cosdabactransactionVo.setControlgroupid(cosdabactransactionvo.getControlgroupid());
		    	return new ResponseEntity(cosdabactransactionVo, HttpStatus.OK);
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
	
	@RequestMapping(value = "/updateConsTxn/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<CosdabactransactionVO> updateConsTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo, HttpServletRequest request) 
	{	
		logger.info(":: Transactionname ::", cosdabactransactionvo.getTransactionname());
		
		Cosdabactransaction cosdabactransaction = new Cosdabactransaction();
		try
		{
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao() ;
			cosdabactransaction = cosdabactransactiondao.getById(cosdabactransactionvo.getTransactionid().longValue());
			
			if(cosdabactransaction == null)
				return new ResponseEntity(new Message("Given Transactionid Record not found"), HttpStatus.OK);
			
			cosdabactransaction.setTransactionname(cosdabactransactionvo.getTransactionname());
			cosdabactransaction.setTransactiontype(cosdabactransactionvo.getTransactiontype());
			cosdabactransaction.setDefaultaccess(cosdabactransactionvo.getDefaultaccess());
			cosdabactransaction.setLastupdatedby(username);
			cosdabactransaction.setCreatedby(username);
			cosdabactransaction.setLastupdatedon(new Date());
			cosdabactransaction.setCreatedon(new Date());
			
		    logger.info("before insert");
		    
		    
		    cosdabactransactiondao.update(cosdabactransaction);
		    
		    Converters conv = new Converters();
		    cosdabactransactionvo = conv.convertToVo(cosdabactransaction);
		    return new ResponseEntity(cosdabactransactionvo, HttpStatus.OK);
		   
		  
		}
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
		}		
	}	
	
	@RequestMapping(value = "/deleteConsTxn/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<?> deleteConsTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo) 
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao() ;
		try
		{
			cosdabactransactiondao.deleteConsentTxn(cosdabactransactionvo.getTransactionid().longValue());
		}
		catch(Exception ex)
		{
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);	
		}
		 
		 return new ResponseEntity(new Message("Deleted.."), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/existTrans/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<?> existConsTxn(@RequestBody CosdabactransactionVO cosdabactransactionvo) 
	{
		CosdabactransactionDao cosdabactransactiondao = new CosdabactransactionDao() ;
		//CosdconsentgrouptxnDao cosdconsentgrouptxndao = new CosdconsentgrouptxnDao();
		
		try
		{
			String result = cosdabactransactiondao.getlistByTxnConsentID(cosdabactransactionvo.getTransactionid().longValue()) ;
			
			if("duplicate".equalsIgnoreCase(result))
			{
				 return new ResponseEntity(new Message("duplicate"), HttpStatus.OK);
			}
			
			cosdabactransactiondao.saveExistingWithConsent(cosdabactransactionvo.getControlgroupid().longValue() ,cosdabactransactionvo.getTransactionid().longValue());
		}
		catch(Exception ex)
		{
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);	
		}
		 
		 return new ResponseEntity(new Message("success"), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveConsPerson/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<CosdpersonconsentVO> saveConsPerson(@RequestBody CosdpersonconsentVO cosdpersonconsentvo, HttpServletRequest request) 
	{	
		logger.info(":: Phone ::", cosdpersonconsentvo.getContactphone());
		System.out.println("Client ID --->"+ cosdpersonconsentvo.getClientid());
		
		Cosdpersonconsent cosdpersonconsent = new Cosdpersonconsent();
		try
		{
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			cosdpersonconsent.setAuthpersoncontactinfoone(cosdpersonconsentvo.getAuthpersoncontactinfoone());
			cosdpersonconsent.setAuthpersoncontactinfotwo(cosdpersonconsentvo.getAuthpersoncontactinfotwo());
			cosdpersonconsent.setAuthpersonnameone(cosdpersonconsentvo.getAuthpersonnameone());
			cosdpersonconsent.setAuthpersonnametwo(cosdpersonconsentvo.getAuthpersonnametwo());
			cosdpersonconsent.setAuthpersonrelone(cosdpersonconsentvo.getAuthpersonrelone());
			cosdpersonconsent.setAuthpersonreltwo(cosdpersonconsentvo.getAuthpersonreltwo());
			cosdpersonconsent.setConcernroleid(cosdpersonconsentvo.getConcernroleid());
			cosdpersonconsent.setContactaddressid(cosdpersonconsentvo.getContactaddressid());
			cosdpersonconsent.setContactphone(cosdpersonconsentvo.getContactphone());
			cosdpersonconsent.setCreatedon(cosdpersonconsentvo.getCreatedon());
			cosdpersonconsent.setCreatedby(cosdpersonconsentvo.getCreatedby());
			cosdpersonconsent.setLastupdatedby(cosdpersonconsentvo.getLastupdatedby());
			cosdpersonconsent.setLastupdatedon(cosdpersonconsentvo.getLastupdatedon());
			cosdpersonconsent.setThirdpartyfirstname(cosdpersonconsentvo.getThirdpartyfirstname());
			cosdpersonconsent.setThirdpartylastname(cosdpersonconsentvo.getThirdpartylastname());
			cosdpersonconsent.setThirdpartyotherrelationship(cosdpersonconsentvo.getThirdpartyotherrelationship());
			cosdpersonconsent.setThirdpartyrelationship(cosdpersonconsentvo.getThirdpartyrelationship());
			cosdpersonconsent.setFileid(cosdpersonconsentvo.getFileid());
			cosdpersonconsent.setLastupdatedby(username);
			cosdpersonconsent.setCreatedby(username);
			cosdpersonconsent.setLastupdatedon(new Date());
			cosdpersonconsent.setCreatedon(new Date());
			cosdpersonconsent.setClientid(cosdpersonconsentvo.getClientid());
			String name = cosdpersonconsentvo.getCustomerName(); 
			System.out.println("name --->"+ cosdpersonconsentvo.getCustomerName());
			
			cosdpersonconsent.setCustomerName(cosdpersonconsentvo.getCustomerName().toUpperCase());
			cosdpersonconsent.setConsentCatGrp(cosdpersonconsentvo.getConsentUser());
			
			cosdpersonconsent.setConsentCatGrp(cosdpersonconsentvo.getConsentCatList());
			cosdpersonconsent.setCity(cosdpersonconsentvo.getCity());
			cosdpersonconsent.setStreet(cosdpersonconsentvo.getStreet());
			cosdpersonconsent.setAppSuite(cosdpersonconsentvo.getAppSuite());
			cosdpersonconsent.setZipCode(cosdpersonconsentvo.getZipCode());
			cosdpersonconsent.setState(cosdpersonconsentvo.getState());
			cosdpersonconsent.setHistroyRecord("NO");
			if(cosdpersonconsentvo.getStartdate() != null) 
			{
				Date startdate = formatter.parse(cosdpersonconsentvo.getStartdate());
				cosdpersonconsent.setStartdate(startdate);
			}
			if(cosdpersonconsentvo.getEnddate() != null)
			{
				Date enddate = formatter.parse(cosdpersonconsentvo.getEnddate());
				cosdpersonconsent.setEnddate(enddate);
			}
			
			cosdpersonconsent.setConsentCatGrp(cosdpersonconsentvo.getConsentCatList());
			cosdpersonconsent.setIdentificationno(cosdpersonconsentvo.getIdentificationno());
			cosdpersonconsent.setIdentificationtype(cosdpersonconsentvo.getIdentificationtype());
			cosdpersonconsent.setClientid(cosdpersonconsentvo.getClientid());
			
		    logger.info("before insert :: ClientID ::" + cosdpersonconsentvo.getClientid());
		    
		    CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao() ;
		  
		    String result = cosdpersonconsentdao.isDuplicate(cosdpersonconsent) ;
		    if(result.equalsIgnoreCase("duplicate"))
		    {
		    	logger.info("Duplicate Found");
		    	return new ResponseEntity(new Message("duplicate"), HttpStatus.OK);
		    }
		    
		    cosdpersonconsent = cosdpersonconsentdao.save(cosdpersonconsent) ;	    
		    
		    CosdconsentexceptionDao  cosdconsentexceptiondao = new CosdconsentexceptionDao();
		    
		    cosdpersonconsentvo.setPersonconsentid(cosdpersonconsent.getPersonconsentid());
		    cosdconsentexceptiondao.insertList(cosdpersonconsentvo , username) ;
		    
		    logger.info("before insert Client Reg");
		    //cosdpersonconsentdao.insertClientReg(cosdpersonconsent);
		    Converters conv = new Converters();
			//CosdabactransactionVO cosdabactransactionVo = conv.convertToVo(cosdpersonconsent);
		    
		    cosdpersonconsentdao.updateClientID(cosdpersonconsent ,name);
		    
		    return new ResponseEntity(cosdpersonconsentvo, HttpStatus.OK);
		   
		  
		}
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
		}		
	}
	
	@RequestMapping(value = "/listConsentPerson/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdpersonconsentVO>> listConsentPerson() 
	{	
		CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
		List<Cosdpersonconsent> cosdpersonconsentlist = cosdpersonconsentdao.getlist() ;
		
		CosdpersonconsentVO cosdpersonconsentvo = new CosdpersonconsentVO();
		ConsentConverter conv = new ConsentConverter();
							
		
		if (cosdpersonconsentlist.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		List<CosdpersonconsentVO> cosdconsentgroupVolist = conv.covertList(cosdpersonconsentlist, cosdpersonconsentvo);
		return new ResponseEntity<List<CosdpersonconsentVO>>(cosdconsentgroupVolist, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listConsentPersonByCriteria/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdpersonconsentVO>> listConsentPersonBySearch(@RequestBody CosdpersonconsentVO cosdpersonconsentvo, HttpServletRequest request) 
	{	
		CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
		List<Cosdpersonconsent> cosdpersonconsentlist = cosdpersonconsentdao.getlistBySearch(cosdpersonconsentvo);
		
		//CosdpersonconsentVO cosdpersonconsentvo = new CosdpersonconsentVO();
		ConsentConverter conv = new ConsentConverter();
							
		
		if (cosdpersonconsentlist.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		List<CosdpersonconsentVO> cosdconsentgroupVolist = conv.covertList(cosdpersonconsentlist, cosdpersonconsentvo);
		return new ResponseEntity<List<CosdpersonconsentVO>>(cosdconsentgroupVolist, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/editConsPerson/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<String> editConsPerson(@RequestBody CosdpersonconsentVO cosdpersonconsentvo , HttpServletRequest request) 
	{	
		System.out.println("In Edit Method -Edit PersonConsentID(Histroy).." + cosdpersonconsentvo.getPersonconsentid());
		
		Cosdpersonconsent cosdpersonconsent = new Cosdpersonconsent();
		Cosdpersonconsenthistory cosdpersonconsenthistory = new Cosdpersonconsenthistory();
		CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
		CosdpersonconsenthistoryDao cosdpersonconsenthistorydao = new CosdpersonconsenthistoryDao();
		
		try
		{
			String username = HibernateUtil.getUserName(request); // HttpServletRequest request
			long oldpersonConsent = cosdpersonconsentvo.getPersonconsentid().longValue() ;
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			cosdpersonconsent = cosdpersonconsentdao.getById(oldpersonConsent);
			
			cosdpersonconsent.setHistroyRecord("YES");
			cosdpersonconsentdao.update(cosdpersonconsent) ;
			
			cosdpersonconsenthistory.setCosdpersonconsent(cosdpersonconsent);
			cosdpersonconsenthistory.setActiontype(cosdpersonconsentvo.getActionType());
			cosdpersonconsenthistory.setCreatedby(username);
			cosdpersonconsenthistory.setLastupdatedby(username);
			cosdpersonconsenthistory.setCreatedon(new Date());
			cosdpersonconsenthistory.setLastupdatedon(new Date());
			cosdpersonconsenthistory.setCancelreason(cosdpersonconsentvo.getReason());
			cosdpersonconsenthistorydao.save(cosdpersonconsenthistory);
			
			cosdpersonconsent.setClientid(cosdpersonconsent.getClientid());
			cosdpersonconsent.setAuthpersoncontactinfoone(cosdpersonconsentvo.getAuthpersoncontactinfoone());
			cosdpersonconsent.setAuthpersoncontactinfotwo(cosdpersonconsentvo.getAuthpersoncontactinfotwo());
			cosdpersonconsent.setAuthpersonnameone(cosdpersonconsentvo.getAuthpersonnameone());
			cosdpersonconsent.setAuthpersonnametwo(cosdpersonconsentvo.getAuthpersonnametwo());
			cosdpersonconsent.setAuthpersonrelone(cosdpersonconsentvo.getAuthpersonrelone());
			cosdpersonconsent.setAuthpersonreltwo(cosdpersonconsentvo.getAuthpersonreltwo());
			cosdpersonconsent.setConcernroleid(cosdpersonconsentvo.getConcernroleid());
			cosdpersonconsent.setContactaddressid(cosdpersonconsentvo.getContactaddressid());
			cosdpersonconsent.setContactphone(cosdpersonconsentvo.getContactphone());
			cosdpersonconsent.setCreatedon(cosdpersonconsentvo.getCreatedon());
			cosdpersonconsent.setCreatedby(cosdpersonconsentvo.getCreatedby());
			cosdpersonconsent.setLastupdatedby(cosdpersonconsentvo.getLastupdatedby());
			cosdpersonconsent.setLastupdatedon(cosdpersonconsentvo.getLastupdatedon());
			cosdpersonconsent.setThirdpartyfirstname(cosdpersonconsentvo.getThirdpartyfirstname());
			cosdpersonconsent.setThirdpartylastname(cosdpersonconsentvo.getThirdpartylastname());
			cosdpersonconsent.setThirdpartyotherrelationship(cosdpersonconsentvo.getThirdpartyotherrelationship());
			cosdpersonconsent.setThirdpartyrelationship(cosdpersonconsentvo.getThirdpartyrelationship());
			cosdpersonconsent.setFileid(cosdpersonconsentvo.getFileid());
			cosdpersonconsent.setLastupdatedby(username);
			cosdpersonconsent.setCreatedby(username);
			cosdpersonconsent.setLastupdatedon(new Date());
			cosdpersonconsent.setCreatedon(new Date());
			
			//cosdpersonconsent.setCustomerName(cosdpersonconsentvo.getCustomerName());
			cosdpersonconsent.setConsentCatGrp(cosdpersonconsentvo.getConsentUser());
			
			cosdpersonconsent.setConsentCatGrp(cosdpersonconsentvo.getConsentCatList());
			cosdpersonconsent.setCity(cosdpersonconsentvo.getCity());
			cosdpersonconsent.setStreet(cosdpersonconsentvo.getStreet());
			cosdpersonconsent.setAppSuite(cosdpersonconsentvo.getAppSuite());
			cosdpersonconsent.setZipCode(cosdpersonconsentvo.getZipCode());
			cosdpersonconsent.setState(cosdpersonconsentvo.getState());
			
			cosdpersonconsent.setIdentificationno(cosdpersonconsentvo.getIdentificationno());
			cosdpersonconsent.setIdentificationtype(cosdpersonconsentvo.getIdentificationtype());
			
			
			if(cosdpersonconsentvo.getStartdate() != null) 
			{
				System.out.println("Edit:: Start Date::" + cosdpersonconsentvo.getStartdate());
				Date startdate = formatter.parse(cosdpersonconsentvo.getStartdate());
				cosdpersonconsent.setStartdate(startdate);
			}
			if(cosdpersonconsentvo.getEnddate() != null)
			{
				System.out.println("Edit:: End Date::" + cosdpersonconsentvo.getEnddate());
				Date enddate = formatter.parse(cosdpersonconsentvo.getEnddate());
				cosdpersonconsent.setEnddate(enddate);
			}
			
			cosdpersonconsent.setConsentCatGrp(cosdpersonconsentvo.getConsentCatList());
			
			
		    logger.info("before insert");
		    
		   // CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao() ;
		     cosdpersonconsent.setHistroyRecord("NO");
		     cosdpersonconsentdao.save(cosdpersonconsent) ;
		     cosdpersonconsentvo.setPersonconsentid(cosdpersonconsent.getPersonconsentid());
		     
		     cosdpersonconsentdao.updateClientReg(cosdpersonconsent ,oldpersonConsent);
		    CosdconsentexceptionDao  cosdconsentexceptiondao = new CosdconsentexceptionDao();
		    
		    cosdconsentexceptiondao.deleteByPersonConsent(cosdpersonconsentvo.getPersonconsentid().longValue());
		    
		    logger.info("After delete old Exception ..");		    
		    cosdpersonconsentvo.setPersonconsentid(cosdpersonconsent.getPersonconsentid());
		    cosdconsentexceptiondao.insertList(cosdpersonconsentvo , username) ;
		    
		    //logger.info("before insert Client Reg");
		    //cosdpersonconsentdao.insertClientReg(cosdpersonconsent);
		    Converters conv = new Converters();
			//CosdabactransactionVO cosdabactransactionVo = conv.convertToVo(cosdpersonconsent);
		    System.out.println("In Edit Method -Creted New PersonConsentID.." + cosdpersonconsent.getPersonconsentid());
		    return new ResponseEntity(cosdpersonconsentvo, HttpStatus.OK);
		   
		  
		}
		catch(Exception ex)
		{    System.out.println("::-----$$$$$ ::" + ex);
			ex.printStackTrace();
			return new ResponseEntity(new Message("Fail"), HttpStatus.OK);
		}	
		
	}
	
	
	@RequestMapping(value = "/delConPerson/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<?> delConPerson(@RequestBody CosdpersonconsentVO cosdpersonconsentvo) 
	{	
		CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
		Cosdpersonconsent cosdpersonconsent = cosdpersonconsentdao.getById(cosdpersonconsentvo.getPersonconsentid().longValue()) ;
		
		if (cosdpersonconsent == null) {
			return new ResponseEntity(new Message("Not Found") ,HttpStatus.OK);
			// You many decide to return HttpStatus.NOT_FOUND
          }
		
		String result = cosdpersonconsentdao.delete(cosdpersonconsentvo.getPersonconsentid().longValue());
	
		
		
		//List<CosdconsentgroupVO> cosdconsentgroupVolist = conv.covertList(cosdconsentgrouplist, cosdabacconstraintvo);
		return new ResponseEntity(new Message(result), HttpStatus.OK);
	}
	
	@PostMapping("/uploadFile")
	//@PostMapping("/uploadfile")
	public ResponseEntity<?> uploadFile(
            @RequestParam("file") MultipartFile uploadfile) {

		String unixpath= "/" ;
		String windowspath= "\\";
		String pathSep = unixpath ;
        logger.debug("Single file upload!");
        int id = 0 ;
       
        if (uploadfile.isEmpty()) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {
        	
        	String pattern = "dd-MM-yyyy" ;
        	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        	String date = simpleDateFormat.format(new Date());
        	System.out.println(date);
        	
        	File file = new File("Upload");
        	
        	double byets = file.length() ;
            double mb =  byets/(1024*1024);
            System.out.println(" File Size ::" + mb);
            
            if(mb > 1)
            {
            	 return new ResponseEntity("File Size is more than 1 MB .", HttpStatus.BAD_REQUEST);
            }
        	if (!file.exists()) {
                if (file.mkdir()) {
                    System.out.println("Directory is created!");
                } else {
                    System.out.println("Failed to create directory!");
                }
            }

            String dateFolder =  "Upload" + pathSep + date  ;
            
            File file1 = new File(dateFolder);
            if (!file1.exists()) {
                if (file1.mkdir()) {
                    System.out.println("Directory inside is created!");
                } else {
                    System.out.println("Failed inside to create directory!");
                }
            }
            
            
            
        	/*File convFile = new File( uploadfile.getOriginalFilename());
            uploadfile.transferTo(convFile);*/
            CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
            id = cosdpersonconsentdao.getFileID() + 1;
            String fpath = dateFolder + pathSep +id+"__" +uploadfile.getOriginalFilename() ;
            File convFile = new File(fpath);
            convFile.createNewFile();
            FileOutputStream fos = new FileOutputStream(convFile);
            fos.write(uploadfile.getBytes());
            fos.close();
            
            cosdpersonconsentdao.FileUpload(convFile, fpath);
            //cosdpersonconsentdao.saveFromVO(cosdpersonconsentvo);
         

        }catch (IOException ex) {
        	System.out.println("IOException ::" + ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        catch (Exception e) {
        	System.out.println("Exception ::" + e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(new Integer(id), new HttpHeaders(), HttpStatus.OK);

    } // http://www.technicalkeeda.com/spring-tutorials/spring-4-mvc-download-file-from-server
	
	
	
	//@RequestMapping(value = "/pdf/{fileName:.+}", method = RequestMethod.GET, produces = "application/pdf")
	@RequestMapping(value = "/download/{id}", method = RequestMethod.GET, produces = "application/pdf")
	 public ResponseEntity<InputStreamResource> download(@PathVariable("id") String id) throws IOException {
	  String fileName = "poly.pdf" ;
	  //ClassPathResource pdfFile = new ClassPathResource("poly.pdf");
	  //Upload\13-11-2017\Consent_UseCases_20170908.pdf
	  CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();    	
  	//String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
  	String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
  	System.out.println(" 1 File PAth - " + FilePath);
  	//FilePath = FilePath.replace('/', '\\');
  	System.out.println(" 2 File PAth - " + FilePath);
	  ClassPathResource pdfFile = new ClassPathResource(FilePath);
	  System.out.println("::1 ::" + pdfFile.getPath() + ":: ::" );
	  pdfFile.createRelative("C:\\Connect360");
	  System.out.println("::2 ::" + pdfFile.getDescription() + ":: ::" );
	 
	  
	  HttpHeaders headers = new HttpHeaders();
	  headers.setContentType(MediaType.parseMediaType("application/pdf"));
	  headers.add("Access-Control-Allow-Origin", "*");
	  headers.add("Access-Control-Allow-Methods", "GET, POST, PUT");
	  headers.add("Access-Control-Allow-Headers", "Content-Type");
	  headers.add("Content-Disposition", "filename=" + fileName);
	  headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
	  headers.add("Pragma", "no-cache");
	  headers.add("Expires", "0");
	  headers.setContentLength(pdfFile.contentLength());
	  InputStreamResource fileInputStream = null;
	  headers.setContentLength(pdfFile.contentLength());
	  ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(
			    new InputStreamResource(pdfFile.getInputStream()), headers, HttpStatus.OK);
			  return response;
	  

	 }
	
    @RequestMapping(value = "/getdwn/{id}/", method = RequestMethod.GET)
    public StreamingResponseBody getSteamingFile(HttpServletResponse response ,@PathVariable("id") String id) throws IOException {
        // @PathVariable("id") String id
    	CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();    	
    	//String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
    	String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
    	
    	System.out.println("FilePath -" + FilePath);
    		response.setContentType("application/zip");
    		response.setHeader("Content-Disposition", "attachment; filename=\"demo.pdf\"");
    		InputStream inputStream = new FileInputStream(new File(FilePath)); // Upload\13-11-2017\Consent_UseCases_20170908.pdf
    		return outputStream -> {
            int nRead;
            byte[] data = new byte[1024];
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                System.out.println("Writing some bytes..");
                outputStream.write(data, 0, nRead);
            }
    		};
    	
    }
    
    @RequestMapping(value = "/saveConStatus/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<CosdconsentexceptionVO> saveConStatus(@RequestBody CosdconsentexceptionVO cosdconsentgroupvo,HttpServletRequest request) 
	{	
    	String username = HibernateUtil.getUserName(request); // HttpServletRequest request
    	Cosdconsentexception cosdconsentexception = new Cosdconsentexception();
    	CosdconsentexceptionDao cosdconsentexceptiondao = new CosdconsentexceptionDao();
    	CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();
    	CosdconsentgroupDao cosdconsentgroupdao = new CosdconsentgroupDao() ;
    	
    	Cosdpersonconsent cosdpersonconsent = cosdpersonconsentdao.getById(cosdconsentgroupvo.getCosdpersonconsent());    	
    	Cosdconsentgroup cosdconsentgroup = cosdconsentgroupdao.getById(cosdconsentgroupvo.getCosdconsentgroup());
    	
    	cosdconsentexception.setCosdconsentgroup(cosdconsentgroup);
    	cosdconsentexception.setCosdpersonconsent(cosdpersonconsent);
    	cosdconsentexception.setConsentstatus(cosdconsentgroupvo.getConsentstatus());
    	
    	cosdconsentexception.setCreatedby(username);
    	cosdconsentexception.setCreatedon(new Date());
    	//cosdconsentexception.setLastupdatedby(username);
    	//cosdconsentexception.setLastupdatedo(new Date());
    	cosdconsentexceptiondao.save(cosdconsentexception);
		//List<CosdconsentgroupVO> cosdconsentgroupVolist = conv.covertList(cosdconsentgrouplist, cosdabacconstraintvo);
		return new ResponseEntity<CosdconsentexceptionVO>(cosdconsentgroupvo, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/listConsentStatus/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<CosdconsentexceptionVO>> listConsentStatus() 
	{	
    	CosdconsentexceptionDao cosdconsentexceptiondao = new CosdconsentexceptionDao();
		List<Cosdconsentexception> cosdconsentexceptionlist = cosdconsentexceptiondao.getlist() ;
		
		CosdconsentexceptionVO cosdconsentexceptionvo = new CosdconsentexceptionVO();
		ConsentConverter conv = new ConsentConverter();
							
		
		if (cosdconsentexceptionlist.isEmpty()) {
					return new ResponseEntity(HttpStatus.OK);
					// You many decide to return HttpStatus.NOT_FOUND
		}
		File file = new File("");
		new ResponseEntity(file ,HttpStatus.OK);
		List<CosdconsentexceptionVO> cosdconsentexceptionVolist = conv.covertList(cosdconsentexceptionlist, cosdconsentexceptionvo);
		return new ResponseEntity<List<CosdconsentexceptionVO>>(cosdconsentexceptionVolist, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/getFile/{id}", method = RequestMethod.GET, produces = "application/pdf")
	public ResponseEntity<InputStreamResource> getFile(@PathVariable("id") String id) {
    	try
    	{
    	  CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();    	
    	  	//String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
    	  	String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
    	  System.out.println("File Path -" + FilePath);

		File file = new File(FilePath);
		
		InputStream stream = new FileInputStream(file);
		
		System.out.println(" Stream -> " + stream.toString());
		System.out.println(" File Length -> " + file.length());
		
		InputStreamResource fileInputStream = new InputStreamResource(stream); 
	    
	    
	    System.out.println(" File Length -> " + fileInputStream.getFilename());
		 HttpHeaders headers = new HttpHeaders();
		  headers.setContentType(MediaType.parseMediaType("application/pdf"));
		  headers.add("Access-Control-Allow-Origin", "*");
		  headers.add("Access-Control-Allow-Methods", "GET, POST, PUT");
		  headers.add("Access-Control-Allow-Headers", "Content-Type");
		  headers.add("Content-Disposition", "filename=" + fileInputStream.getFilename());
		  headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		  headers.add("Pragma", "no-cache");
		  headers.add("Expires", "0");
		  headers.setContentLength(file.length());
		new ResponseEntity(fileInputStream ,headers, HttpStatus.OK);
		
    	}
    	catch(Exception ex)
    	{
    		System.out.println("Fail in getFile Service ..");
    		new ResponseEntity("Fail" ,HttpStatus.OK);
    	}
    	return new ResponseEntity(HttpStatus.OK);

	}
    
    @RequestMapping(value = "/getConsForm/{id}", method = RequestMethod.GET, produces = "application/pdf")
    public ResponseEntity<InputStreamResource> download2(@PathVariable("id") String id) throws IOException {
     //System.out.println("Calling Download:- " + fileName);
     //ClassPathResource pdfFile = new ClassPathResource("dwnload/" + "Cosdie_ClassDiagram1.pdf");
     
     CosdpersonconsentDao cosdpersonconsentdao = new CosdpersonconsentDao();    	
	  	//String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
	  	String FilePath = cosdpersonconsentdao.FileDown(Integer.parseInt(id));
	  System.out.println("File Path -" + FilePath);
	  
	  if( FilePath == null || FilePath.trim().equals(""))
		  new ResponseEntity("File Not Found" ,HttpStatus.OK);

	File file = new File(FilePath);
	
	if ( file == null || file.exists() == false )
		 new ResponseEntity("File Not Found" ,HttpStatus.OK);
	
	InputStream stream = new FileInputStream(file);
	
	System.out.println(" Stream -> " + stream.toString());
	System.out.println(" File Length -> " + file.length());
	
	InputStreamResource fileInputStream = new InputStreamResource(stream); 
	//fileInputStream.getInputStream()
	
     HttpHeaders headers = new HttpHeaders();
     headers.setContentType(MediaType.parseMediaType("application/pdf"));
     headers.add("Access-Control-Allow-Origin", "*");
     headers.add("Access-Control-Allow-Methods", "GET, POST, PUT");
     headers.add("Access-Control-Allow-Headers", "Content-Type");
     headers.add("Content-Disposition", "filename=ConsentForm.pdf");
     headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
     headers.add("Pragma", "no-cache");
     headers.add("Expires", "0");

     headers.setContentLength(file.length());
     ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(
    		 new InputStreamResource(stream) , headers, HttpStatus.OK);
     return response;

    }
    
    @RequestMapping(value = "/getRefList/", method = RequestMethod.POST, produces = "application/json")			
	public ResponseEntity<List<ReferralLAVO>> getRefnList() 
	{
		System.out.println(":: RefnList ::");		
		ReferralLADao refDao = new ReferralLADao();
		List<ReferralLA> referrallalist =  refDao.getlist();
		
		if(referrallalist.isEmpty())
		{
			//return new ResponseEntity(new Message("Referral List is Empty") , HttpStatus.OK) ;
		}
		
		Converters conv = new Converters();
		ReferralLAVO refla = new ReferralLAVO();
		
		List<ReferralLAVO> referrallavolist = conv.covertList(referrallalist, refla);
		System.out.println("::-- Referral LA --::" + referrallavolist.size());
			
			
	  return new ResponseEntity<List<ReferralLAVO>>(referrallavolist, HttpStatus.OK);
	}
}
