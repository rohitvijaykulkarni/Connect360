/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;

import java.util.List;

public class ViewPolicyAuthGroup {
	
	private List<CosdauthorizationgroupVO> authGroups ;
	private CosdauthorizationpolicysetVO policyset ;
	
    public List<CosdauthorizationgroupVO> getAuthGroups() {
		return authGroups;
	}
	public void setAuthGroups(List<CosdauthorizationgroupVO> authGroups) {
		this.authGroups = authGroups;
	}
	public CosdauthorizationpolicysetVO getPolicyset() {
		return policyset;
	}
	public void setPolicyset(CosdauthorizationpolicysetVO policyset) {
		this.policyset = policyset;
	}
	
       
}
