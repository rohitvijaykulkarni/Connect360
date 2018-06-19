/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class CosdabacorganisationVO   {

	private BigDecimal organisationid;
	public BigDecimal getOrganisationid() {
		return organisationid;
	}
	public void setOrganisationid(BigDecimal organisationid) {
		this.organisationid = organisationid;
	}
	public BigDecimal getOrganisationunitid() {
		return organisationunitid;
	}
	public void setOrganisationunitid(BigDecimal organisationunitid) {
		this.organisationunitid = organisationunitid;
	}
	public BigDecimal getParentorganisationunitid() {
		return parentorganisationunitid;
	}
	public void setParentorganisationunitid(BigDecimal parentorganisationunitid) {
		this.parentorganisationunitid = parentorganisationunitid;
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
	private BigDecimal organisationunitid;
	private BigDecimal parentorganisationunitid;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;

	

}
