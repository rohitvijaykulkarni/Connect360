package com.ibm.gbs.consentmgmt.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.util.Message;
import com.ibm.gbs.util.ODSConverter;
import com.ibm.wcm.ods.dao.ClientProfileAdsSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileCjSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileCsSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileHlthSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileLglSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileMedSrcDao;
import com.ibm.wcm.ods.dao.ClientProfileMhsSrcDao;
import com.ibm.wcm.ods.dao.ClientProfilePscSrcDao;
import com.ibm.wcm.ods.dao.CpAdsAbuseSrcDao;
import com.ibm.wcm.ods.dao.CpAdsEncounterSrcDao;
import com.ibm.wcm.ods.dao.CpAdsTestResultSrcDao;
import com.ibm.wcm.ods.dao.CpHlthInsSrcDao;
import com.ibm.wcm.ods.dao.CpHlthMedSrcDao;
import com.ibm.wcm.ods.dao.CpHlthMedStatusSrcDao;
import com.ibm.wcm.ods.dao.CpMhsEncounterSrcDao;
import com.ibm.wcm.ods.dto.ClientProfileAdsSrc;
import com.ibm.wcm.ods.dto.ClientProfileCjSrc;
import com.ibm.wcm.ods.dto.ClientProfileCsSrc;
import com.ibm.wcm.ods.dto.ClientProfileHlthSrc;
import com.ibm.wcm.ods.dto.ClientProfileLglSrc;
import com.ibm.wcm.ods.dto.ClientProfileMedSrc;
import com.ibm.wcm.ods.dto.ClientProfileMhsSrc;
import com.ibm.wcm.ods.dto.ClientProfilePscSrc;
import com.ibm.wcm.ods.dto.CpAdsAbuseSrc;
import com.ibm.wcm.ods.dto.CpAdsEncounterSrc;
import com.ibm.wcm.ods.dto.CpAdsTestResultSrc;
import com.ibm.wcm.ods.dto.CpHlthInsSrc;
import com.ibm.wcm.ods.dto.CpHlthMedSrc;
import com.ibm.wcm.ods.dto.CpHlthMedStatusSrc;
import com.ibm.wcm.ods.dto.CpMhsEncounterSrc;
import com.ibm.wcm.ods.vo.ClientProfileAdsSrcVO;
import com.ibm.wcm.ods.vo.ClientProfileCjSrcVo;
import com.ibm.wcm.ods.vo.ClientProfileCsSrcVo;
import com.ibm.wcm.ods.vo.ClientProfileHlthSrcVo;
import com.ibm.wcm.ods.vo.ClientProfileLglSrcVo;
import com.ibm.wcm.ods.vo.ClientProfileMedSrcVo;
import com.ibm.wcm.ods.vo.ClientProfileMhsSrcVo;
import com.ibm.wcm.ods.vo.ClientProfilePscSrcVo;

@RestController
@RequestMapping("/ODSController")
public class ODSController {

	@RequestMapping(value = "/getODSWithClientID/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileAdsSrcVO>> getODSWithClientID(@RequestBody ClientProfileAdsSrcVO vo) {
		System.out.println(":: Search::" + vo.getClientId());
		ClientProfileAdsSrcDao clientprofilecwsrcdao = new ClientProfileAdsSrcDao();
		ClientProfileAdsSrc dto = new ClientProfileAdsSrc();
		List<ClientProfileAdsSrc> dtolist = clientprofilecwsrcdao.getlistByClinetID(vo.getClientId());
		ODSConverter conv = new ODSConverter();

		List<ClientProfileAdsSrcVO> volist = conv.convertList(dtolist, vo);
		// System.out.println("::-- Cosdabaccontrolgroup --::" +
		// cosdabaccontrolgroupsVo.size());

		if (volist.isEmpty()) {
			return new ResponseEntity(new Message("..Data not found .."), HttpStatus.OK);

		}
		return new ResponseEntity<List<ClientProfileAdsSrcVO>>(volist, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfileLglSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileLglSrcVo>> getClientProfileLglSrcFromODS(
			@RequestBody ClientProfileLglSrcVo vo) {
		System.out.println(":: getClientProfileLglSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileLglSrcDao dao = new ClientProfileLglSrcDao();
		ClientProfileLglSrc dto = new ClientProfileLglSrc();
		List<ClientProfileLglSrc> dtoList = dao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		ODSConverter conv = new ODSConverter();

		List<ClientProfileLglSrcVo> voList = conv.convertList(dtoList);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfileLglSrcVo>>(voList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfileCsSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileCsSrcVo>> getClientProfileCsSrcFromODS(
			@RequestBody ClientProfileCsSrcVo vo) {
		System.out.println(":: getClientProfileCsSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileCsSrcDao dao = new ClientProfileCsSrcDao();
		ClientProfileCsSrc dto = new ClientProfileCsSrc();
		List<ClientProfileCsSrc> dtoList = dao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		ODSConverter conv = new ODSConverter();

		List<ClientProfileCsSrcVo> voList = conv.convertList(dtoList, vo);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfileCsSrcVo>>(voList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfilePscSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfilePscSrcVo>> getClientProfilePscSrcFromODS(
			@RequestBody ClientProfilePscSrcVo vo) {
		System.out.println(":: getClientProfilePscSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfilePscSrcDao dao = new ClientProfilePscSrcDao();
		ClientProfilePscSrc dto = new ClientProfilePscSrc();
		List<ClientProfilePscSrc> dtoList = dao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		ODSConverter conv = new ODSConverter();

		List<ClientProfilePscSrcVo> voList = conv.convertList(dtoList, vo);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfilePscSrcVo>>(voList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfileCjSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileCjSrcVo>> getClientProfileCjSrcFromODS(
			@RequestBody ClientProfileCjSrcVo vo) {

		System.out.println(":: getClientProfileCjSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileCjSrcDao dao = new ClientProfileCjSrcDao();
		ClientProfileCjSrc dto = new ClientProfileCjSrc();
		List<ClientProfileCjSrc> dtoList = dao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		ODSConverter conv = new ODSConverter();

		List<ClientProfileCjSrcVo> voList = conv.convertList(dtoList, vo);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfileCjSrcVo>>(voList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getClientProfileHlthSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileHlthSrcVo>> getClientProfileHlthSrcFromODS(
			@RequestBody ClientProfileHlthSrcVo vo) {

		System.out.println(":: getClientProfileHlthSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileHlthSrcDao clientProfileHlthSrcDao = new ClientProfileHlthSrcDao();
		ClientProfileHlthSrc clientProfileHlthSrcDto = new ClientProfileHlthSrc();
		List<ClientProfileHlthSrc> clientProfileHlthSrcDtoList = clientProfileHlthSrcDao
				.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		if (clientProfileHlthSrcDtoList.size() > 0) {
			CpHlthInsSrcDao cpHlthInsSrcDao = new CpHlthInsSrcDao();
			CpHlthInsSrc cpHlthInsSrcDto = new CpHlthInsSrc();
			List<CpHlthInsSrc> cpHlthInsSrcDtoList = cpHlthInsSrcDao
					.getCpHlthInsSrcByCpHlthSrcSeqNum(clientProfileHlthSrcDtoList.get(0).getClientProfileHlthSeqNum());
			if (cpHlthInsSrcDtoList.size() > 0) {
				Set<CpHlthInsSrc> cpHlthInsSrcs = new HashSet<CpHlthInsSrc>(0);
				for (CpHlthInsSrc cphi : cpHlthInsSrcDtoList) {
					cpHlthInsSrcs.add(cphi);
				}

				clientProfileHlthSrcDtoList.get(0).setCpHlthInsSrcs(cpHlthInsSrcs);
			}
			
			CpHlthMedStatusSrcDao cpHlthMedStatusSrcDao = new CpHlthMedStatusSrcDao();
			CpHlthMedStatusSrc cpHlthMedStatusSrcDto = new CpHlthMedStatusSrc();
			List<CpHlthMedStatusSrc> cpHlthMedStatusSrcDtoList = cpHlthMedStatusSrcDao
					.getCpHlthMedStatusSrcByCpHlthSrcSeqNum(clientProfileHlthSrcDtoList.get(0).getClientProfileHlthSeqNum());
			if (cpHlthMedStatusSrcDtoList.size() > 0) {
				Set<CpHlthMedStatusSrc> cpHlthMedStatusSrcs = new HashSet<CpHlthMedStatusSrc>(0);
				for (CpHlthMedStatusSrc cphms : cpHlthMedStatusSrcDtoList) {
					cpHlthMedStatusSrcs.add(cphms);
				}

				clientProfileHlthSrcDtoList.get(0).setCpHlthMedStatusSrcs(cpHlthMedStatusSrcs);
			}
			
			CpHlthMedSrcDao cpHlthMedSrcDao = new CpHlthMedSrcDao();
			CpHlthMedSrc cpHlthMedSrcDto = new CpHlthMedSrc();
			List<CpHlthMedSrc> CpHlthMedSrcDtoList = cpHlthMedSrcDao
					.getCpHlthMedSrcByCpHlthSrcSeqNum(clientProfileHlthSrcDtoList.get(0).getClientProfileHlthSeqNum());
			if (CpHlthMedSrcDtoList.size() > 0) {
				Set<CpHlthMedSrc> cpHlthMedSrcs = new HashSet<CpHlthMedSrc>(0);
				for (CpHlthMedSrc cphmed : CpHlthMedSrcDtoList) {
					cpHlthMedSrcs.add(cphmed);
				}

				clientProfileHlthSrcDtoList.get(0).setCpHlthMedSrcs(cpHlthMedSrcs);
			}
		}

		ODSConverter conv = new ODSConverter();

		List<ClientProfileHlthSrcVo> clientProfileHlthSrcVoList = conv.convertList(clientProfileHlthSrcDtoList, vo);

		if (clientProfileHlthSrcVoList.isEmpty()) {
			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<ClientProfileHlthSrcVo>>(clientProfileHlthSrcVoList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfileMedSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileMedSrcVo>> getClientProfileMedSrcFromODS(
			@RequestBody ClientProfileMedSrcVo vo) {

		System.out.println(":: getClientProfileMedSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileMedSrcDao dao = new ClientProfileMedSrcDao();
		ClientProfileMedSrc dto = new ClientProfileMedSrc();
		List<ClientProfileMedSrc> dtoList = dao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		ODSConverter conv = new ODSConverter();

		List<ClientProfileMedSrcVo> voList = conv.convertList(dtoList, vo);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfileMedSrcVo>>(voList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfileMhsSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileMhsSrcVo>> getClientProfileMhsSrcFromODS(
			@RequestBody ClientProfileMhsSrcVo vo) {

		System.out.println(":: getClientProfileMhsSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileMhsSrcDao clientProfileMhsSrcDao = new ClientProfileMhsSrcDao();
		ClientProfileMhsSrc clientProfileMhsSrcDto = new ClientProfileMhsSrc();
		List<ClientProfileMhsSrc> clientProfileMhsSrcDtoList = clientProfileMhsSrcDao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());
		
		if (clientProfileMhsSrcDtoList.size() > 0) {
			CpMhsEncounterSrcDao cpMhsEncounterSrcDao = new CpMhsEncounterSrcDao();
			CpMhsEncounterSrc cpMhsEncounterSrcDto = new CpMhsEncounterSrc();
			List<CpMhsEncounterSrc> cpMhsEncounterSrcDtoList = cpMhsEncounterSrcDao
					.getCpMhsEncounterSrcByClientProfileMhsSrcSeqNum(clientProfileMhsSrcDtoList.get(0).getClientProfileMhsSeqNum());
			if (cpMhsEncounterSrcDtoList.size() > 0) {
				Set<CpMhsEncounterSrc> cpMhsEncounterSrcs = new HashSet<CpMhsEncounterSrc>(0);
				for (CpMhsEncounterSrc cpme : cpMhsEncounterSrcDtoList) {
					cpMhsEncounterSrcs.add(cpme);
				}

				clientProfileMhsSrcDtoList.get(0).setCpMhsEncounterSrcs(cpMhsEncounterSrcs);
			}
						
		}
		
		ODSConverter conv = new ODSConverter();

		List<ClientProfileMhsSrcVo> voList = conv.convertList(clientProfileMhsSrcDtoList, vo);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfileMhsSrcVo>>(voList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getClientProfileAdsSrcFromODS/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<ClientProfileAdsSrcVO>> getClientProfileAdsSrcFromODS(
			@RequestBody ClientProfileAdsSrcVO vo) {

		System.out.println(":: getClientProfileAdsSrcFromODS ::");
		System.out.println(":: clientId::" + vo.getClientId());
		System.out.println(":: srcSystem::" + vo.getSourceSystemId());

		ClientProfileAdsSrcDao dao = new ClientProfileAdsSrcDao();
		ClientProfileAdsSrc dto = new ClientProfileAdsSrc();
		List<ClientProfileAdsSrc> clientProfileAdsSrcDtoList = dao.getMemberListByMemIDSrcCode(vo.getClientId(), vo.getSourceSystemId());

		if (clientProfileAdsSrcDtoList.size() > 0) {
			CpAdsEncounterSrcDao cpAdsEncounterSrcDao = new CpAdsEncounterSrcDao();
			CpAdsEncounterSrc cpAdsEncounterSrcDto = new CpAdsEncounterSrc();
			List<CpAdsEncounterSrc> cpAdsEncounterSrcDtoList = cpAdsEncounterSrcDao
					.getByCpAdsSrcSeqId(clientProfileAdsSrcDtoList.get(0).getClientProfileAdsSeqNum());
			if (cpAdsEncounterSrcDtoList.size() > 0) {
				Set<CpAdsEncounterSrc> cpAdsEncounterSrcs = new HashSet<CpAdsEncounterSrc>(0);
				for (CpAdsEncounterSrc cpae : cpAdsEncounterSrcDtoList) {
					cpAdsEncounterSrcs.add(cpae);
				}

				clientProfileAdsSrcDtoList.get(0).setCpAdsEncounterSrcs(cpAdsEncounterSrcs);
			}
			
			CpAdsTestResultSrcDao cpAdsTestResultSrcDao = new CpAdsTestResultSrcDao();
			CpAdsTestResultSrc cpAdsTestResultSrcDto = new CpAdsTestResultSrc();
			List<CpAdsTestResultSrc> cpAdsTestResultSrcDtoList = cpAdsTestResultSrcDao
					.getByCpAdsSrcSeqId(clientProfileAdsSrcDtoList.get(0).getClientProfileAdsSeqNum());
			if (cpAdsTestResultSrcDtoList.size() > 0) {
				Set<CpAdsTestResultSrc> cpAdsTestResultSrcs = new HashSet<CpAdsTestResultSrc>(0);
				for (CpAdsTestResultSrc cpatr : cpAdsTestResultSrcDtoList) {
					cpAdsTestResultSrcs.add(cpatr);
				}

				clientProfileAdsSrcDtoList.get(0).setCpAdsTestResultSrcs(cpAdsTestResultSrcs);
			}
			
			CpAdsAbuseSrcDao cpAdsAbuseSrcDao = new CpAdsAbuseSrcDao();
			CpAdsAbuseSrc cpAdsAbuseSrcDto = new CpAdsAbuseSrc();
			List<CpAdsAbuseSrc> cpAdsAbuseSrcDtoList = cpAdsAbuseSrcDao
					.getByCpAdsSrcSeqId(clientProfileAdsSrcDtoList.get(0).getClientProfileAdsSeqNum());
			if (cpAdsAbuseSrcDtoList.size() > 0) {
				Set<CpAdsAbuseSrc> cpAdsAbuseSrcs = new HashSet<CpAdsAbuseSrc>(0);
				for (CpAdsAbuseSrc cpas : cpAdsAbuseSrcDtoList) {
					cpAdsAbuseSrcs.add(cpas);
				}

				clientProfileAdsSrcDtoList.get(0).setCpAdsAbuseSrcs(cpAdsAbuseSrcs);
			}
						
		}

		ODSConverter conv = new ODSConverter();

		List<ClientProfileAdsSrcVO> voList = conv.convertList(clientProfileAdsSrcDtoList, vo);

		if (voList.isEmpty()) {

			return new ResponseEntity(new Message("NO_RECORDS_FOUND"), HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<List<ClientProfileAdsSrcVO>>(voList, HttpStatus.OK);
	}
}
