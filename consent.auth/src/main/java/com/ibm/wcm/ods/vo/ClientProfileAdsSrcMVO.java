package com.ibm.wcm.ods.vo;

import java.util.List;


public class ClientProfileAdsSrcMVO {

	ClientProfileAdsSrcVO profileADdata ;
	
	List<CpAdsAbuseSrcVo> cpAdsAbuseSrcs = null ;
	List<CpAdsEncounterSrcVo> cpAdsEncounterSrcs = null ;
	
		
	public ClientProfileAdsSrcVO getProfileADdata() {
		return profileADdata;
	}
	public void setProfileADdata(ClientProfileAdsSrcVO profileADdata) {
		this.profileADdata = profileADdata;
	}
	public List<CpAdsAbuseSrcVo> getCpAdsAbuseSrcs() {
		return cpAdsAbuseSrcs;
	}
	public void setCpAdsAbuseSrcs(List<CpAdsAbuseSrcVo> cpAdsAbuseSrcs) {
		this.cpAdsAbuseSrcs = cpAdsAbuseSrcs;
	}
	public List<CpAdsEncounterSrcVo> getCpAdsEncounterSrcs() {
		return cpAdsEncounterSrcs;
	}
	public void setCpAdsEncounterSrcs(List<CpAdsEncounterSrcVo> cpAdsEncounterSrcs) {
		this.cpAdsEncounterSrcs = cpAdsEncounterSrcs;
	}
	

}
