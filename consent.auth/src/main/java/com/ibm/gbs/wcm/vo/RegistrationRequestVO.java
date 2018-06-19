package com.ibm.gbs.wcm.vo ;
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

public class RegistrationRequestVO implements java.io.Serializable {

	BigDecimal reqReqtID ;
	BigDecimal cohortID ;
	BigDecimal ruleID ;
	String reasoncode ;
	String createdDate ;
	String createdByUser ;
	String sourceSys ;
	String sourceSysID ;
	String fName ;
	String lname ;
	
	String status ;
	String comments ;
	
	String targetName ;
	
	public String getTargetName() {
		return targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	public BigDecimal getReqReqtID() {
		return reqReqtID;
	}
	public void setReqReqtID(BigDecimal reqReqtID) {
		this.reqReqtID = reqReqtID;
	}
	
	
	public BigDecimal getCohortID() {
		return cohortID;
	}
	public void setCohortID(BigDecimal cohortID) {
		this.cohortID = cohortID;
	}
	
	
	public BigDecimal getRuleID() {
		return ruleID;
	}
	public void setRuleID(BigDecimal ruleID) {
		this.ruleID = ruleID;
	}
	
	
	public String getReasoncode() {
		return reasoncode;
	}
	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}
	
	
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name = "CREATEDBYUSER", nullable = false, length = 30)
	public String getCreatedByUser() {
		return createdByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	
	@Column(name = "SOURCESYS", nullable = false, length = 30)
	public String getSourceSys() {
		return sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}
	
	@Column(name = "SOURCESYSID", nullable = false, length = 30)
	public String getSourceSysID() {
		return sourceSysID;
	}
	public void setSourceSysID(String sourceSysID) {
		this.sourceSysID = sourceSysID;
	}
		
	@Column(name = "FNAME", nullable = false, length = 30)
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	@Column(name = "LNAME", nullable = false, length = 30)
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Column(name = "STATUS", nullable = false, length = 30)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "COMMENTS", nullable = false, length = 30)
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	String clientID ;
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
}


/*-- Table: Registration_request
CREATE TABLE Registration_request (
    REGREQTID number(25,2)  NOT NULL,
    cohortID number(25,2)  NOT NULL,
    ruleID number(19,2)  NOT NULL,
    reasoncode varchar2(40)  NOT NULL,
    createdDate date  NOT NULL,
    createdByUser varchar2(40)  NOT NULL,
    sourceSys varchar2(40)  NOT NULL,
    sourceSysID varchar2(40)  NOT NULL,
    fName varchar2(30)  NOT NULL,
    lName varchar2(40)  NOT NULL,
    status varchar2(40)  NOT NULL,
    comments varchar2(100)  NOT NULL,
    CONSTRAINT Registration_request_pk PRIMARY KEY (reqReqtID)
) ; */