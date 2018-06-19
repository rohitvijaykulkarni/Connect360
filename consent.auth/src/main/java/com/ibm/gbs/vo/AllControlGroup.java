/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;

import java.util.List;

import com.ibm.gbs.consentmgmt.dto.Cosdabacconstraint;

public class AllControlGroup {
	
	CosdabaccontrolgroupVO controlGroup ;	 
	public CosdabaccontrolgroupVO getControlGroup() {
		return controlGroup;
	}
	public void setControlGroup(CosdabaccontrolgroupVO controlGroup) {
		this.controlGroup = controlGroup;
	}
	public List<ATTCosdabactransactionVO> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<ATTCosdabactransactionVO> transaction) {
		this.transaction = transaction;
	}
	List<ATTCosdabactransactionVO>  transaction ;
}
