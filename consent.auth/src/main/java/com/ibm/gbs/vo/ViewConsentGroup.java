/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;

import java.util.List;



public class ViewConsentGroup {
	
	private CosdconsentgroupVO consentGroup ;
	
	public CosdconsentgroupVO getConsentGroup() {
		return consentGroup;
	}

	public void setConsentGroup(CosdconsentgroupVO consentGroup) {
		this.consentGroup = consentGroup;
	}

	public List<CosdabactransactionVO> getTransList() {
		return transList;
	}

	public void setTransList(List<CosdabactransactionVO> transList) {
		this.transList = transList;
	}

	private List<CosdabactransactionVO> transList ;
	

}
