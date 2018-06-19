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
@Table(name = "API_HIST", schema = Constant.SCHEMANAME )
public class ApiHist implements java.io.Serializable {

	BigDecimal targetID ;
	Date sendDate ;
	String sendStatus ;
	BigDecimal targetTransID ;
	public BigDecimal getTargetID() {
		return targetID;
	}
	public void setTargetID(BigDecimal targetID) {
		this.targetID = targetID;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public String getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public BigDecimal getTargetTransID() {
		return targetTransID;
	}
	public void setTargetTransID(BigDecimal targetTransID) {
		this.targetTransID = targetTransID;
	}
	
}

/*
 
-- Table: API_HIST
CREATE TABLE API_HIST (
    targetID number(19,2)  NOT NULL,
    sendDate date  NOT NULL,
    sendStatus varchar2(40)  NOT NULL,
    targetTransID number(20,2)  NOT NULL
) ; */
