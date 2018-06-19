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


public class CosdconsentexceptionVO   {

	private BigDecimal consentexceptionid;
	public BigDecimal getConsentexceptionid() {
		return consentexceptionid;
	}
	public void setConsentexceptionid(BigDecimal consentexceptionid) {
		this.consentexceptionid = consentexceptionid;
	}
	public long getCosdconsentgroup() {
		return cosdconsentgroup;
	}
	public void setCosdconsentgroup(long cosdconsentgroup) {
		this.cosdconsentgroup = cosdconsentgroup;
	}
	public long getCosdpersonconsent() {
		return cosdpersonconsent;
	}
	public void setCosdpersonconsent(long cosdpersonconsent) {
		this.cosdpersonconsent = cosdpersonconsent;
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
	public Date getLastupdatedo() {
		return lastupdatedo;
	}
	public void setLastupdatedo(Date lastupdatedo) {
		this.lastupdatedo = lastupdatedo;
	}
	private long cosdconsentgroup;
	private long cosdpersonconsent;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedo;
	private String  consentstatus;
	
	public String getConsentstatus() {
		return consentstatus;
	}

	public void setConsentstatus(String consentstatus) {
		this.consentstatus = consentstatus;
	}
}
