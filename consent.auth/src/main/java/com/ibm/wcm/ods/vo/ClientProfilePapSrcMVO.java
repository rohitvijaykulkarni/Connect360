package com.ibm.wcm.ods.vo;

import java.util.List;

public class ClientProfilePapSrcMVO {

	
	ClientProfilePapSrcVO ClientProfilePapSrcVO ;
	List<CpPapEligSrcVO> listCpPapEligSrc = null ;
	
	public ClientProfilePapSrcVO getClientProfilePapSrcVO() {
		return ClientProfilePapSrcVO;
	}

	public void setClientProfilePapSrcVO(ClientProfilePapSrcVO clientProfilePapSrcVO) {
		ClientProfilePapSrcVO = clientProfilePapSrcVO;
	}

	public List<CpPapEligSrcVO> getListCpPapEligSrc() {
		return listCpPapEligSrc;
	}

	public void setListCpPapEligSrc(List<CpPapEligSrcVO> listCpPapEligSrc) {
		this.listCpPapEligSrc = listCpPapEligSrc;
	}

	
	
	
}
