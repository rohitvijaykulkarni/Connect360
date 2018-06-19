package com.ibm.gbs.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.ibm.wcm.ods.vo.CpAdsAbuseSrcVo;
import com.ibm.wcm.ods.vo.CpAdsEncounterSrcVo;
import com.ibm.wcm.ods.vo.CpAdsTestResultSrcVo;
import com.ibm.wcm.ods.vo.CpHlthInsSrcVo;
import com.ibm.wcm.ods.vo.CpHlthMedSrcVo;
import com.ibm.wcm.ods.vo.CpHlthMedStatusSrcVo;
import com.ibm.wcm.ods.vo.CpMhsEncounterSrcVo;

public class ODSConverter {
	
	public ClientProfileLglSrcVo convertToVo(ClientProfileLglSrc obj) {
		ClientProfileLglSrcVo voObj = new ClientProfileLglSrcVo();

		try {			
			
			voObj.setClientProfileLglSeqNum(obj.getClientProfileLglSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setHasPwrOfAttrny(obj.getHasPwrOfAttrny());
			voObj.setLglGrdianFirstName(obj.getLglGrdianFirstName());
			voObj.setLglGrdianLastName(obj.getLglGrdianLastName());
			voObj.setLglGrdianRel(obj.getLglGrdianRel());
			voObj.setPwrOfAttrnyName(obj.getPwrOfAttrnyName());
			voObj.setProcessTs(obj.getProcessTs());
			voObj.setGuardian(obj.getGuardian());
			voObj.setConservator(obj.getConservator());
			voObj.setConservatorRel(obj.getConservatorRel());
			voObj.setDecisionMaker(obj.getDecisionMaker());
			voObj.setDecisionMakerRel(obj.getDecisionMakerRel());
			voObj.setConservatorStatus(obj.getConservatorStatus());
			voObj.setPrimaryCareGiver(obj.getPrimaryCareGiver());
			voObj.setAuthRep(obj.getAuthRep());
			
			
		} catch (Exception ex) {

		}
		return voObj;
	}
		
	public List<ClientProfileCsSrcVo> convertList(List<ClientProfileCsSrc> list, ClientProfileCsSrcVo vo) {
		List<ClientProfileCsSrcVo> voList = new ArrayList<ClientProfileCsSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfileCsSrcVo convertToVo(ClientProfileCsSrc obj) {
		ClientProfileCsSrcVo voObj = new ClientProfileCsSrcVo();

		try {			
			
			voObj.setClientProfileCsSeqNum(obj.getClientProfileCsSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setChldSupCasePayee(obj.getChldSupCasePayee());
			voObj.setChldSupCasePayor(obj.getChldSupCasePayor());
			voObj.setAbsntParentName(obj.getAbsntParentName());
			voObj.setAbsntParentRel(obj.getAbsntParentRel());
			voObj.setProcessTs(obj.getProcessTs());			
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public List<ClientProfilePscSrcVo> convertList(List<ClientProfilePscSrc> list, ClientProfilePscSrcVo vo) {
		List<ClientProfilePscSrcVo> voList = new ArrayList<ClientProfilePscSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfilePscSrcVo convertToVo(ClientProfilePscSrc obj) {
		ClientProfilePscSrcVo voObj = new ClientProfilePscSrcVo();

		try {			
			
			voObj.setClientProfilePscSeqNum(obj.getClientProfilePscSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setNumChldLwseDueToPrbt(obj.getNumChldLwseDueToPrbt());
			voObj.setNumChldLwseDueToCpo(obj.getNumChldLwseDueToCpo());
			voObj.setProcessTs(obj.getProcessTs());			
			voObj.setLivesWithParents(obj.getLivesWithParents());
			voObj.setCaseWorker(obj.getCaseWorker());			
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public List<ClientProfileCjSrcVo> convertList(List<ClientProfileCjSrc> list, ClientProfileCjSrcVo vo) {
		List<ClientProfileCjSrcVo> voList = new ArrayList<ClientProfileCjSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfileCjSrcVo convertToVo(ClientProfileCjSrc obj) {
		ClientProfileCjSrcVo voObj = new ClientProfileCjSrcVo();

		try {			
			
			voObj.setClientProfileCjSeqNum(obj.getClientProfileCjSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setAdmissionDate(obj.getAdmissionDate());
			voObj.setEpisodeInvlvdDomAbuse(obj.getEpisodeInvlvdDomAbuse());				
			voObj.setEpisodeInvlvdPhyAbuse(obj.getEpisodeInvlvdPhyAbuse());
			voObj.setEpisodeInvlvdSexAbuse(obj.getEpisodeInvlvdSexAbuse());		
			voObj.setCjStatus(obj.getCjStatus());
			voObj.setNumArrestPast30d(obj.getNumArrestPast30d());
			voObj.setNumArrestPast6m(obj.getNumArrestPast6m());
			voObj.setNumJailDaysPast30d(obj.getNumJailDaysPast30d());
			voObj.setNumPrisonDaysPast30d(obj.getNumPrisonDaysPast30d());
			voObj.setProcessTs(obj.getProcessTs());	
			voObj.setKwnSexOfndrInHh(obj.getKwnSexOfndrInHh());
			voObj.setFelonyConviction(obj.getFelonyConviction());
			voObj.setInvlvdInDomAbuse(obj.getInvlvdInDomAbuse());
			voObj.setTypeOfAbuse(obj.getTypeOfAbuse());
			voObj.setAbuserName(obj.getAbuserName());
				
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public List<ClientProfileHlthSrcVo> convertList(List<ClientProfileHlthSrc> list, ClientProfileHlthSrcVo vo) {
		List<ClientProfileHlthSrcVo> voList = new ArrayList<ClientProfileHlthSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfileHlthSrcVo convertToVo(ClientProfileHlthSrc obj) {
		ClientProfileHlthSrcVo voObj = new ClientProfileHlthSrcVo();

		try {			
			
			voObj.setClientProfileHlthSeqNum(obj.getClientProfileHlthSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setDisabilities(obj.getDisabilities());
			voObj.setSmokerStatus(obj.getSmokerStatus());			
			voObj.setNumTobacNicUsePast30d(obj.getNumTobacNicUsePast30d());
			voObj.setProcessTs(obj.getProcessTs());	
			voObj.setDisabilityStatus(obj.getDisabilityStatus());	
			voObj.setCaseWorker(obj.getCaseWorker());
			voObj.setCwPhoneNum(obj.getCwPhoneNum());
			
			Set<CpHlthInsSrcVo> cpHlthInsSrcVoList = convertSet(obj.getCpHlthInsSrcs(), new CpHlthInsSrcVo());			
			voObj.setCpHlthInsSrcs(cpHlthInsSrcVoList);
			
			Set<CpHlthMedStatusSrcVo> cpHlthMedStatusSrcVoList = convertSet(obj.getCpHlthMedStatusSrcs(), new CpHlthMedStatusSrcVo());			
			voObj.setCpHlthMedStatusSrcs(cpHlthMedStatusSrcVoList);
			
			Set<CpHlthMedSrcVo> cpHlthMedSrcVoList = convertSet(obj.getCpHlthMedSrcs(), new CpHlthMedSrcVo());			
			voObj.setCpHlthMedSrcs(cpHlthMedSrcVoList);
				
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public Set<CpHlthInsSrcVo> convertSet(Set<CpHlthInsSrc> set, CpHlthInsSrcVo vo) {
		Set<CpHlthInsSrcVo> voSet = new HashSet<CpHlthInsSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpHlthInsSrcVo convertToVo(CpHlthInsSrc obj) {
		CpHlthInsSrcVo voObj = new CpHlthInsSrcVo();

		try {			
			
			voObj.setCpHlthInsSeqNum(obj.getCpHlthInsSeqNum());
			voObj.setGuarantorInsPayor(obj.getGuarantorInsPayor());
			voObj.setEpisCareDate(obj.getEpisCareDate());
			voObj.setInsProvider(obj.getInsProvider());			
			voObj.setInsType(obj.getInsType());
			voObj.setGuarantor(obj.getGuarantor());				
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public Set<CpHlthMedStatusSrcVo> convertSet(Set<CpHlthMedStatusSrc> set, CpHlthMedStatusSrcVo vo) {
		Set<CpHlthMedStatusSrcVo> voSet = new HashSet<CpHlthMedStatusSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpHlthMedStatusSrcVo convertToVo(CpHlthMedStatusSrc obj) {
		CpHlthMedStatusSrcVo voObj = new CpHlthMedStatusSrcVo();

		try {			
			
			voObj.setCpHlthMedStatusSeqNum(obj.getCpHlthMedStatusSeqNum());
			voObj.setMedCondition(obj.getMedCondition());
			voObj.setImmunization(obj.getImmunization());
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public Set<CpHlthMedSrcVo> convertSet(Set<CpHlthMedSrc> set, CpHlthMedSrcVo vo) {
		Set<CpHlthMedSrcVo> voSet = new HashSet<CpHlthMedSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpHlthMedSrcVo convertToVo(CpHlthMedSrc obj) {
		CpHlthMedSrcVo voObj = new CpHlthMedSrcVo();

		try {			
			
			voObj.setCpHlthMedSeqNum(obj.getCpHlthMedSeqNum());
			voObj.setMedName(obj.getMedName());
			voObj.setMedType(obj.getMedType());
			voObj.setPrescDate(obj.getPrescDate());
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public List<ClientProfileMedSrcVo> convertList(List<ClientProfileMedSrc> list, ClientProfileMedSrcVo vo) {
		List<ClientProfileMedSrcVo> voList = new ArrayList<ClientProfileMedSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfileMedSrcVo convertToVo(ClientProfileMedSrc obj) {
		ClientProfileMedSrcVo voObj = new ClientProfileMedSrcVo();

		try {			
			
			voObj.setClientProfileMedSeqNum(obj.getClientProfileMedSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setAdmissionDate(obj.getAdmissionDate());
			voObj.setNumHospOvrnitePast30d(obj.getNumHospOvrnitePast30d());		
			voObj.setNumEmgncyRmPast30d(obj.getNumEmgncyRmPast30d());			
			voObj.setLastHospDate(obj.getLastHospDate());
			voObj.setDoctorName(obj.getDoctorName());
			voObj.setDoctorType(obj.getDoctorType());
			voObj.setMedProviderPhone(obj.getMedProviderPhone());
			voObj.setHepC(obj.getHepC());
			voObj.setStd(obj.getStd());
			voObj.setTb(obj.getTb());
			voObj.setLastTbTestDate(obj.getLastTbTestDate());
			voObj.setProcessTs(obj.getProcessTs());	
				
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
		
	public List<ClientProfileMhsSrcVo> convertList(List<ClientProfileMhsSrc> list, ClientProfileMhsSrcVo vo) {
		List<ClientProfileMhsSrcVo> voList = new ArrayList<ClientProfileMhsSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfileMhsSrcVo convertToVo(ClientProfileMhsSrc obj) {
		ClientProfileMhsSrcVo voObj = new ClientProfileMhsSrcVo();

		try {			
			
			voObj.setClientProfileMhsSeqNum(obj.getClientProfileMhsSeqNum());
			voObj.setClientId(obj.getClientId());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setAdmissionDate(obj.getAdmissionDate());
			voObj.setNum24hrPsyFacStayPast30d(obj.getNum24hrPsyFacStayPast30d());	
			voObj.setNumOpEmgncyMhsPast30d(obj.getNumOpEmgncyMhsPast30d());		
			voObj.setMentalHealthMedsPast30d(obj.getMentalHealthMedsPast30d());
			voObj.setMentalIllnessDiagnosed(obj.getMentalIllnessDiagnosed());
			voObj.setNumSuicideAttempt(obj.getNumSuicideAttempt());
			voObj.setHistOfSuicide(obj.getHistOfSuicide());
			voObj.setProcessTs(obj.getProcessTs());	
			
			Set<CpMhsEncounterSrcVo> cpMhsEncounterSrcVoList = convertSet(obj.getCpMhsEncounterSrcs(), new CpMhsEncounterSrcVo());			
			voObj.setCpMhsEncounterSrcs(cpMhsEncounterSrcVoList);
				
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public Set<CpMhsEncounterSrcVo> convertSet(Set<CpMhsEncounterSrc> set, CpMhsEncounterSrcVo vo) {
		Set<CpMhsEncounterSrcVo> voSet = new HashSet<CpMhsEncounterSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpMhsEncounterSrcVo convertToVo(CpMhsEncounterSrc obj) {
		CpMhsEncounterSrcVo voObj = new CpMhsEncounterSrcVo();

		try {			
			
			voObj.setCpMhsEncounterSeqNum(obj.getCpMhsEncounterSeqNum());
			voObj.setServiceDate(obj.getServiceDate());
			voObj.setServiceType(obj.getServiceType());
			voObj.setMhsProvider(obj.getMhsProvider());		
			voObj.setProviderContact(obj.getProviderContact());
			voObj.setDiagnosis(obj.getDiagnosis());			
			voObj.setDiagnosisActiveDate(obj.getDiagnosisActiveDate());
			voObj.setDiagnosisInactiveDate(obj.getDiagnosisInactiveDate());	
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}

	public List<ClientProfileAdsSrcVO> convertList(List<ClientProfileAdsSrc> list, ClientProfileAdsSrcVO vo) {
		List<ClientProfileAdsSrcVO> voList = new ArrayList<ClientProfileAdsSrcVO>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
	
	public ClientProfileAdsSrcVO convertToVo(ClientProfileAdsSrc obj) {
		ClientProfileAdsSrcVO voObj = new ClientProfileAdsSrcVO();

		try {			
			
			voObj.setTerRouteOfAdmin(obj.getTerRouteOfAdmin());
			voObj.setTerNumDaysUsedPast30d(obj.getTerNumDaysUsedPast30d());
			voObj.setTerAgeFirstUse(obj.getTerAgeFirstUse());
			voObj.setTerDrugType(obj.getTerDrugType());
			voObj.setTerDrugName(obj.getTerDrugName());
			voObj.setSecRouteOfAdmin(obj.getSecRouteOfAdmin());
			voObj.setSecNumDaysUsedPast30d(obj.getSecNumDaysUsedPast30d());
			voObj.setSecAgeFirstUse(obj.getSecAgeFirstUse());
			voObj.setSecDrugType(obj.getSecDrugType());
			voObj.setSecDrugName(obj.getSecDrugName());
			voObj.setPriRouteOfAdmin(obj.getPriRouteOfAdmin());
			voObj.setPriNumDaysUsedPast30d(obj.getPriNumDaysUsedPast30d());
			voObj.setPriAgeFirstUse(obj.getPriAgeFirstUse());
			voObj.setPriDrugType(obj.getPriDrugType());
			voObj.setPriDrugName(obj.getPriDrugName());
			voObj.setDischargeStatus(obj.getDischargeStatus());
			voObj.setNumDaysIvUsedPast30d(obj.getNumDaysIvUsedPast30d());
			voObj.setUsedNeedlesPast12m(obj.getUsedNeedlesPast12m());
			voObj.setInjectionDrugUser(obj.getInjectionDrugUser());
			voObj.setNumNoAlcoholDaysPast30d(obj.getNumNoAlcoholDaysPast30d());
			voObj.setNumAlcoholUsedDaysPast30d(voObj.getNumAlcoholUsedDaysPast30d());
			voObj.setNumPriorAdmission(voObj.getNumPriorAdmission());
			voObj.setAdmissionType(voObj.getAdmissionType());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setClientId(obj.getClientId());
			voObj.setClientProfileAdsSeqNum(obj.getClientProfileAdsSeqNum());
			
			Set<CpAdsEncounterSrcVo> cpAdsEncounterSrcVoList = convertSet(obj.getCpAdsEncounterSrcs(), new CpAdsEncounterSrcVo());			
			voObj.setCpAdsEncounterSrcVo(cpAdsEncounterSrcVoList);
			
			Set<CpAdsTestResultSrcVo> cpAdsTestResultSrcVoList = convertSet(obj.getCpAdsTestResultSrcs(), new CpAdsTestResultSrcVo());			
			voObj.setCpAdsTestResultSrcVo(cpAdsTestResultSrcVoList);
			
			Set<CpAdsAbuseSrcVo> cpAdsAbuseSrcVoList = convertSet(obj.getCpAdsAbuseSrcs(), new CpAdsAbuseSrcVo());			
			voObj.setCpAdsAbuseSrcVo(cpAdsAbuseSrcVoList);
			
		} catch (Exception ex) {

		}
		return voObj;
	}
	
	public Set<CpAdsEncounterSrcVo> convertSet(Set<CpAdsEncounterSrc> set, CpAdsEncounterSrcVo vo) {
		Set<CpAdsEncounterSrcVo> voSet = new HashSet<CpAdsEncounterSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpAdsEncounterSrcVo convertToVo(CpAdsEncounterSrc obj) {
		CpAdsEncounterSrcVo voObj = new CpAdsEncounterSrcVo();

		try {
			voObj.setCpAdsEncounterSeqNum(obj.getCpAdsEncounterSeqNum());
			voObj.setServiceAds(obj.getServiceAds());
			voObj.setDiagnosisForService(obj.getDiagnosisForService());	
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}

	public Set<CpAdsTestResultSrcVo> convertSet(Set<CpAdsTestResultSrc> set, CpAdsTestResultSrcVo vo) {
		Set<CpAdsTestResultSrcVo> voSet = new HashSet<CpAdsTestResultSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpAdsTestResultSrcVo convertToVo(CpAdsTestResultSrc obj) {
		CpAdsTestResultSrcVo voObj = new CpAdsTestResultSrcVo();

		try {
			voObj.setCpAdsTestResultSeqNum(obj.getCpAdsTestResultSeqNum());
			voObj.setDrugTest(obj.getDrugTest());
			voObj.setTestResultDate(obj.getTestResultDate());
			voObj.setTestResultType(obj.getTestResultType());
			voObj.setSpecimenNum(obj.getSpecimenNum());
			voObj.setTestConfirmedPos(obj.getTestConfirmedPos());
			voObj.setTestUnconfirmedPos(obj.getTestUnconfirmedPos());
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}

	public Set<CpAdsAbuseSrcVo> convertSet(Set<CpAdsAbuseSrc> set, CpAdsAbuseSrcVo vo) {
		Set<CpAdsAbuseSrcVo> voSet = new HashSet<CpAdsAbuseSrcVo>();
		set.forEach(obj -> voSet.add(convertToVo(obj)));

		return voSet;
	}
	
	public CpAdsAbuseSrcVo convertToVo(CpAdsAbuseSrc obj) {
		CpAdsAbuseSrcVo voObj = new CpAdsAbuseSrcVo();

		try {
			voObj.setCpAdsAbuseSeqNum(obj.getCpAdsAbuseSeqNum());
			voObj.setItemAbusedPriority(obj.getAbuseHistory());
			voObj.setAbuseHistory(obj.getAbuseHistory());
			
		} catch (Exception ex) {

		}
		
		return voObj;
	}
	
	public ClientProfileAdsSrc convertTo(ClientProfileAdsSrcVO obj) {
		
		ClientProfileAdsSrc voObj = new ClientProfileAdsSrc();

		try {

			voObj.setTerRouteOfAdmin(obj.getTerRouteOfAdmin());
			voObj.setTerNumDaysUsedPast30d(obj.getTerNumDaysUsedPast30d());
			voObj.setTerAgeFirstUse(obj.getTerAgeFirstUse());
			voObj.setTerDrugType(obj.getTerDrugType());
			voObj.setTerDrugName(obj.getTerDrugName());
			voObj.setSecRouteOfAdmin(obj.getSecRouteOfAdmin());
			voObj.setSecNumDaysUsedPast30d(obj.getSecNumDaysUsedPast30d());
			voObj.setSecAgeFirstUse(obj.getSecAgeFirstUse());
			voObj.setSecDrugType(obj.getSecDrugType());
			voObj.setSecDrugName(obj.getSecDrugName());
			voObj.setPriRouteOfAdmin(obj.getPriRouteOfAdmin());
			voObj.setPriNumDaysUsedPast30d(obj.getPriNumDaysUsedPast30d());
			voObj.setPriAgeFirstUse(obj.getPriAgeFirstUse());
			voObj.setPriDrugType(obj.getPriDrugType());
			voObj.setPriDrugName(obj.getPriDrugName());
			voObj.setDischargeStatus(obj.getDischargeStatus());
			voObj.setNumDaysIvUsedPast30d(obj.getNumDaysIvUsedPast30d());
			voObj.setUsedNeedlesPast12m(obj.getUsedNeedlesPast12m());
			voObj.setInjectionDrugUser(obj.getInjectionDrugUser());
			voObj.setNumNoAlcoholDaysPast30d(obj.getNumNoAlcoholDaysPast30d());
			voObj.setNumAlcoholUsedDaysPast30d(obj.getNumAlcoholUsedDaysPast30d());
			voObj.setNumPriorAdmission(obj.getNumPriorAdmission());
			voObj.setAdmissionType(obj.getAdmissionType());
			voObj.setSourceSystemId(obj.getSourceSystemId());
			voObj.setClientId(obj.getClientId());
			voObj.setClientProfileAdsSeqNum(obj.getClientProfileAdsSeqNum());
			

		} catch (Exception ex) {

		}
		return voObj;
	}

	public List<ClientProfileLglSrcVo> convertList(List<ClientProfileLglSrc> list) {
		List<ClientProfileLglSrcVo> voList = new ArrayList<ClientProfileLglSrcVo>();
		list.forEach(obj -> voList.add(convertToVo(obj)));

		return voList;
	}
}
