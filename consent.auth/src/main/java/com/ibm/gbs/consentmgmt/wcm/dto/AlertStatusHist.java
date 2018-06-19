package com.ibm.gbs.consentmgmt.wcm.dto ;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ibm.gbs.util.Constant;
@Entity
@Table(name = "ALERT_STATUS_HIST", schema = Constant.SCHEMANAME )
public class AlertStatusHist implements java.io.Serializable {

	BigDecimal alertreqReqtID ;
	Date statusDate ;
	String status ;
	String statusUser ;	
	String statusComments ;
	
	
	public BigDecimal getAlertreqReqtID() {
		return alertreqReqtID;
	}
	public void setAlertreqReqtID(BigDecimal alertreqReqtID) {
		this.alertreqReqtID = alertreqReqtID;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusUser() {
		return statusUser;
	}
	public void setStatusUser(String statusUser) {
		this.statusUser = statusUser;
	}
	public String getStatusComments() {
		return statusComments;
	}
	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}
}
/*
 * -- Table: ALERT_STATUS_HIST
CREATE TABLE ALERT_STATUS_HIST (
    alertreqReqtID number(20Date statusDate ;,2)  NOT NULL,
    Date statusDate ;
    status varchar2(40)  NOT NULL,
    statusUser varchar2(40)  NOT NULL,
    statusComments varchar2(100)  NOT NULL
) ;

 */
