package com.ibm.gbs.consentmgmt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.consentmgmt.wcm.dao.ReferralPersonLADao;
import com.ibm.gbs.consentmgmt.wcm.dto.ReferralPersonLADto;
import com.ibm.gbs.util.Message;
import com.ibm.gbs.util.ODSUtil;
import com.ibm.gbs.util.PersonSearchUtil;
import com.ibm.gbs.util.WCMConverter;
import com.ibm.gbs.wcm.vo.PersonSearchVo;
import com.ibm.gbs.wcm.vo.ReferralPersonLAVo;
import com.ibm.mdm.esoa.client.Client;
import com.ibm.mdm.esoa.client.Client.ClientNameList;
import com.ibm.mdm.esoa.client.Client.DateofBirthList;
import com.ibm.mdm.esoa.client.Client.HomeAddressList;
import com.ibm.mdm.esoa.client.Client.HomePhoneList;
import com.ibm.mdm.esoa.client.Client.MailingAddressList;
import com.ibm.mdm.esoa.client.Client.MobilePhoneList;
import com.ibm.mdm.esoa.client.Client.OtherAddressList;
import com.ibm.mdm.esoa.client.Client.OtherPhoneList;
import com.ibm.mdm.esoa.client.Client.SSNList;
import com.ibm.mdm.esoa.client.Client.WorkAddressList;
import com.ibm.mdm.esoa.client.Client.WorkPhoneList;
import com.ibm.mdm.esoa.client.ClientId;
import com.ibm.mdm.esoa.client.IdEntity;
import com.ibm.mdm.esoa.client.IdEntityId;
import com.ibm.mdm.esoa.client.IdEntitySearchResult;
import com.ibm.mdm.esoa.client.MasterDataWebService;
import com.ibm.mdm.esoa.client.MasterDataWebServiceService;
import com.ibm.mdm.esoa.client.Memdate;
import com.ibm.mdm.esoa.client.Memident;
import com.ibm.mdm.esoa.client.Memlgaddr;
import com.ibm.mdm.esoa.client.Memlngnm;
import com.ibm.mdm.esoa.client.Memphone;
import com.ibm.wcm.ods.vo.ClientProfileLglSrcVo;

@RestController
@RequestMapping("/PersonSearch")
public class PersonSearchMDM {

	public static final Logger logger = LoggerFactory.getLogger(PersonSearchMDM.class);

	/*---------------Services for MDM Person Search - START------------------*/

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/searchForIdList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<IdEntitySearchResult>> searchForIdList(@RequestBody PersonSearchVo personSearchVo) {

		System.out.println(":: start searchForIdList ##::");

		/*------------- INPUTS - START--------------*/
		System.out.println(":: Input First Name ::" + personSearchVo.getFirstName());
		System.out.println(":: Input Last Name ::" + personSearchVo.getLastName());
		System.out.println(":: Input SSN ::" + personSearchVo.getSsn());
		System.out.println(":: Input Address ::" + personSearchVo.getAddress());
		System.out.println(":: Input City ::" + personSearchVo.getCity());
		System.out.println(":: Input State::" + personSearchVo.getState());
		System.out.println(":: Input Zip ::" + personSearchVo.getZipCode());
		System.out.println(":: Input Date of Birth ::" + personSearchVo.getDateofBirth());
		System.out.println(":: Input Phone ::" + personSearchVo.getPhone());

		List<IdEntitySearchResult> idEntitySearchResults = null;

		try {

			MasterDataWebServiceService service = new MasterDataWebServiceService();
			MasterDataWebService mds = service.getMasterDataWebServicePort();

			if (personSearchVo.getFirstName() == null && personSearchVo.getLastName() == null
					&& personSearchVo.getSsn() == null && personSearchVo.getAddress() == null
					&& personSearchVo.getCity() == null && personSearchVo.getState() == null
					&& personSearchVo.getZipCode() == null && personSearchVo.getDateofBirth() == null
					&& personSearchVo.getPhone() == null) {
				return new ResponseEntity(new Message("NO_INPUT"), HttpStatus.OK);
			}

			// Name
			Memlngnm inputName = null;
			if (personSearchVo.getFirstName() != null && personSearchVo.getLastName() == null
					&& personSearchVo.getSsn() == null && personSearchVo.getAddress() == null
					&& personSearchVo.getCity() == null && personSearchVo.getState() == null
					&& personSearchVo.getZipCode() == null && personSearchVo.getDateofBirth() == null
					&& personSearchVo.getPhone() == null) {
				return new ResponseEntity(new Message("LAST_NAME_REQUIRED"), HttpStatus.OK);
			} else if (personSearchVo.getFirstName() == null && personSearchVo.getLastName() != null
					&& personSearchVo.getSsn() == null && personSearchVo.getAddress() == null
					&& personSearchVo.getCity() == null && personSearchVo.getState() == null
					&& personSearchVo.getZipCode() == null && personSearchVo.getDateofBirth() == null
					&& personSearchVo.getPhone() == null) {
				return new ResponseEntity(new Message("FIRST_NAME_REQUIRED"), HttpStatus.OK);
			} else if (personSearchVo.getFirstName() != null && personSearchVo.getLastName() != null) {
				inputName = new Memlngnm();
				inputName.setFirstName(personSearchVo.getFirstName());
				inputName.setLastName(personSearchVo.getLastName());
			}

			ClientNameList clientNameList = null;
			if (inputName != null) {
				clientNameList = new ClientNameList();
				clientNameList.getClientName().add(inputName);
			}

			// SSN
			Memident inputSSN = null;
			if (personSearchVo.getSsn() != null && !personSearchVo.getSsn().equals("")) {
				inputSSN = new Memident();
				inputSSN.setIdNumber(personSearchVo.getSsn());
				inputSSN.setIdIssuer("SSA");
			}

			SSNList ssnList = null;
			if (inputSSN != null) {
				ssnList = new SSNList();
				ssnList.getSSN().add(inputSSN);
			}

			// Address - StreetLine1
			Memlgaddr inputAddr = null;

			if ((personSearchVo.getAddress() != null && !personSearchVo.getAddress().equals(""))
					|| (personSearchVo.getCity() != null && !personSearchVo.getCity().equals(""))
					|| (personSearchVo.getState() != null && !personSearchVo.getState().equals(""))
					|| (personSearchVo.getZipCode() != null && !personSearchVo.getZipCode().equals(""))) {

				inputAddr = new Memlgaddr();

				if (personSearchVo.getAddress() != null && !personSearchVo.getAddress().equals("")) {
					inputAddr.setStreetLine1(personSearchVo.getAddress());
				}
				if (personSearchVo.getCity() != null && !personSearchVo.getCity().equals("")) {
					inputAddr.setCity(personSearchVo.getCity());
				}
				if (personSearchVo.getState() != null && !personSearchVo.getState().equals("")) {

					if (personSearchVo.getFirstName() == null && personSearchVo.getLastName() == null
							&& personSearchVo.getSsn() == null && personSearchVo.getAddress() == null
							&& personSearchVo.getCity() == null && personSearchVo.getDateofBirth() == null
							&& personSearchVo.getPhone() == null) {
						return new ResponseEntity(new Message("CITY_OR_ADDR_REQUIRED"), HttpStatus.OK);
					} else {
						inputAddr.setState(personSearchVo.getState());
					}
				}
				if (personSearchVo.getZipCode() != null && !personSearchVo.getZipCode().equals("")) {

					if (personSearchVo.getFirstName() == null && personSearchVo.getLastName() == null
							&& personSearchVo.getSsn() == null && personSearchVo.getAddress() == null
							&& personSearchVo.getCity() == null && personSearchVo.getDateofBirth() == null
							&& personSearchVo.getPhone() == null) {
						return new ResponseEntity(new Message("CITY_OR_ADDR_REQUIRED"), HttpStatus.OK);
					} else {
						inputAddr.setZipCode(personSearchVo.getZipCode());
					}
				}
			}

			HomeAddressList homeAddrList = null;
			MailingAddressList mailingAddrList = null;
			WorkAddressList workAddrList = null;
			OtherAddressList otherAddrList = null;
			if (inputAddr != null) {
				// HomeAddress
				homeAddrList = new HomeAddressList();
				homeAddrList.getHomeAddress().add(inputAddr);
				// MailingAddress
				mailingAddrList = new MailingAddressList();
				mailingAddrList.getMailingAddress().add(inputAddr);
				// WorkAddress
				workAddrList = new WorkAddressList();
				workAddrList.getWorkAddress().add(inputAddr);
				// OtherAddress
				otherAddrList = new OtherAddressList();
				otherAddrList.getOtherAddress().add(inputAddr);
			}

			// Date of Birth
			Memdate inputDOB = null;
			if (personSearchVo.getDateofBirth() != null && !personSearchVo.getDateofBirth().equals("")) {
				inputDOB = new Memdate();
				inputDOB.setDateVal(personSearchVo.getDateofBirth());
			}

			DateofBirthList dateofBirthList = null;
			if (inputDOB != null) {
				dateofBirthList = new DateofBirthList();
				dateofBirthList.getDateofBirth().add(inputDOB);
			}

			// Phone
			Memphone inputPhone = null;
			if (personSearchVo.getPhone() != null && !personSearchVo.getPhone().equals("")) {
				inputPhone = new Memphone();
				inputPhone.setPhNumber(personSearchVo.getPhone());
			}

			HomePhoneList homePhoneList = null;
			MobilePhoneList mobilePhoneList = null;
			WorkPhoneList workPhoneList = null;
			OtherPhoneList otherPhoneList = null;
			if (inputPhone != null) {
				// HomePhone
				homePhoneList = new HomePhoneList();
				homePhoneList.getHomePhone().add(inputPhone);
				// MobilePhone
				mobilePhoneList = new MobilePhoneList();
				mobilePhoneList.getMobilePhone().add(inputPhone);
				// WorkPhone
				workPhoneList = new WorkPhoneList();
				workPhoneList.getWorkPhone().add(inputPhone);
				// OtherPhone
				otherPhoneList = new OtherPhoneList();
				otherPhoneList.getOtherPhone().add(inputPhone);
			}

			// Bean
			Client clientBean = new Client();
			if (clientNameList != null) {
				clientBean.setClientNameList(clientNameList);
			}
			if (ssnList != null) {
				clientBean.setSSNList(ssnList);
			}
			if (homeAddrList != null) {
				clientBean.setHomeAddressList(homeAddrList);
			}
			if (mailingAddrList != null) {
				clientBean.setMailingAddressList(mailingAddrList);
			}
			if (workAddrList != null) {
				clientBean.setWorkAddressList(workAddrList);
			}
			if (otherAddrList != null) {
				clientBean.setOtherAddressList(otherAddrList);
			}
			if (dateofBirthList != null) {
				clientBean.setDateofBirthList(dateofBirthList);
			}
			if (homePhoneList != null) {
				clientBean.setHomePhoneList(homePhoneList);
			}
			if (mobilePhoneList != null) {
				clientBean.setMobilePhoneList(mobilePhoneList);
			}
			if (workPhoneList != null) {
				clientBean.setWorkPhoneList(workPhoneList);
			}
			if (otherPhoneList != null) {
				clientBean.setOtherPhoneList(otherPhoneList);
			}

			idEntitySearchResults = mds.searchForIdList(clientBean, (short) 0, 100, null, null, null);
			System.out.println(" Entity List Size ::" + idEntitySearchResults.size());

			if (idEntitySearchResults.isEmpty()) {
				return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.OK);
			} else {
				// Get latest records based on maudRecNum
				idEntitySearchResults = PersonSearchUtil.getFilteredData(idEntitySearchResults);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return new ResponseEntity<List<IdEntitySearchResult>>(idEntitySearchResults, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/getIdEntityListByIdEntityIds", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<IdEntity> getIdEntityListByIdEntityIds(@RequestBody PersonSearchVo personSearchVo) {

		System.out.println(":: getIdEntityListByIdEntityIds ##::");

		/*------------- INPUTS - START--------------*/
		System.out.println(":: Input EnterpriseId ::" + personSearchVo.getEnterpriseId());

		List<IdEntity> idEntityList = null;
		IdEntity idEntity = null;

		try {

			MasterDataWebServiceService service = new MasterDataWebServiceService();
			MasterDataWebService mds = service.getMasterDataWebServicePort();

			IdEntityId idEntityId = new IdEntityId();
			idEntityId.setEnterpriseId(new Long(personSearchVo.getEnterpriseId()));

			List<IdEntityId> idEntityIdList = new ArrayList<IdEntityId>();
			idEntityIdList.add(idEntityId);

			/*------------- INPUTS - END--------------*/

			/*------------- EXECUTE - START--------------*/
			idEntityList = mds.getIdEntityListByIdEntityIds(idEntityIdList, null, null, null);

			System.out.println(" IdEntityList.size() ::" + idEntityList.size());

			if (idEntityList.isEmpty()) {
				return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.OK);
			} else {
				// Filter Golden Records
				List<IdEntitySearchResult> idEntitySearchResults = new ArrayList<IdEntitySearchResult>();
				IdEntitySearchResult idEntitySearchResult = new IdEntitySearchResult();
				idEntitySearchResult.setIdEntity(idEntityList.get(0));
				idEntitySearchResults.add(idEntitySearchResult);
				idEntitySearchResults = PersonSearchUtil.getFilteredData(idEntitySearchResults);
				idEntity = idEntitySearchResults.get(0).getIdEntity();
			}
			/*------------- EXECUTE - END--------------*/

		} catch (Exception ex) {
			System.out.println("Exception ex");
			ex.printStackTrace();
		}

		return new ResponseEntity<IdEntity>(idEntity, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/getClientList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<HashMap> getClientList(@RequestBody PersonSearchVo personSearchVo) {

		System.out.println(":: getClientList ##::");

		/*------------- INPUTS - START--------------*/
		System.out.println(":: Input memIdnum ::" + personSearchVo.getMemIdnum());
		System.out.println(":: Input srcCode ::" + personSearchVo.getSrcCode());

		HashMap personSearchData = new HashMap<>();
		List<Client> clientList = null;
		ResponseEntity<List<ClientProfileLglSrcVo>> clientProfileLglSrcList = null;

		try {

			MasterDataWebServiceService service = new MasterDataWebServiceService();
			MasterDataWebService mds = service.getMasterDataWebServicePort();

			ClientId clientId = new ClientId();
			clientId.setMemIdnum(personSearchVo.getMemIdnum());
			clientId.setSrcCode(personSearchVo.getSrcCode());
			
			List<ClientId> clientIdList = new ArrayList<ClientId>();
			clientIdList.add(clientId);

			/*------------- INPUTS - END--------------*/

			/*------------- EXECUTE - START--------------*/
			clientList = mds.getClientList(clientIdList, null, null, null);

			System.out.println(" clientList.size() ::" + clientList.size());

			if (clientList.isEmpty()) {
				return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.OK);
			} else {
				personSearchData.put("MDMData", clientList);
			}

			LinkedHashMap odsData = ODSUtil.getODSData(personSearchVo.getMemIdnum(), personSearchVo.getSrcCode());
			if (odsData == null) {
				personSearchData.put("ODSData", "null");
			} else {
				personSearchData.put("ODSData", odsData);
			}

			/*------------- EXECUTE - END--------------*/

		} catch (Exception ex) {
			System.out.println("Exception ex");
			ex.printStackTrace();
		}

		return new ResponseEntity<HashMap>(personSearchData, HttpStatus.OK);
	}
	/*---------------Services for MDM Person Search - END------------------*/

	/*---------------Services for ReferralPersonLA - Start------------------*/

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/saveReferralPersonLA/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ReferralPersonLAVo> saveReferralPersonLA(@RequestBody ReferralPersonLAVo vo,
			HttpServletRequest request) {

		System.out.println(":: saveReferralPersonLA ::");
		ReferralPersonLADao dao = new ReferralPersonLADao();
		WCMConverter conv = new WCMConverter();
		ReferralPersonLADto dto = conv.convertToDto(vo);

		dto = dao.save(dto);
		if (dto == null) {
			return new ResponseEntity(new Message("FAILED"), HttpStatus.OK);
		}

		vo = conv.convertToVo(dto);

		System.out.println(":: saved ::");

		return new ResponseEntity<ReferralPersonLAVo>(vo, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/listAllReferralPersonLA/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ReferralPersonLAVo>> listAllReferralPersonLA() {
		System.out.println(":: listAllReferralPersonLA() ::");
		ReferralPersonLADao dao = new ReferralPersonLADao();

		List<ReferralPersonLADto> list = dao.getlist();
		if (list == null) {
			return new ResponseEntity(new Message("NO HISTORY"), HttpStatus.OK);
		}

		WCMConverter conv = new WCMConverter();
		List<ReferralPersonLAVo> voList = conv.convertList(list);

		return new ResponseEntity<List<ReferralPersonLAVo>>(voList, HttpStatus.OK);
	}

	/*---------------Services for ReferralPersonLA - End------------------*/
}
