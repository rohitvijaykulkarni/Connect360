/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class CosdpersonconsenthistoryVO   {

	private BigDecimal consenthistoryid;
	public BigDecimal getConsenthistoryid() {
		return consenthistoryid;
	}
	public void setConsenthistoryid(BigDecimal consenthistoryid) {
		this.consenthistoryid = consenthistoryid;
	}
	public long getCosdpersonconsent() {
		return cosdpersonconsent;
	}
	public void setCosdpersonconsent(long cosdpersonconsent) {
		this.cosdpersonconsent = cosdpersonconsent;
	}
	public String getActiontype() {
		return actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
	public String getCancelreason() {
		return cancelreason;
	}
	public void setCancelreason(String cancelreason) {
		this.cancelreason = cancelreason;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	public String getLastupdatedby() {
		return lastupdatedby;
	}
	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	public Date getLastupdatedon() {
		return lastupdatedon;
	}
	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}
	private long cosdpersonconsent;
	private String actiontype;
	private String cancelreason;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;

	
}
