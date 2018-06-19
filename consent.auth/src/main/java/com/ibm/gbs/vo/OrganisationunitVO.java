/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.vo;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class OrganisationunitVO   {

	private BigDecimal organisationunitid;
	public BigDecimal getOrganisationunitid() {
		return organisationunitid;
	}
	public void setOrganisationunitid(BigDecimal organisationunitid) {
		this.organisationunitid = organisationunitid;
	}
	public String getBusinesstypecode() {
		return businesstypecode;
	}
	public void setBusinesstypecode(String businesstypecode) {
		this.businesstypecode = businesstypecode;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public BigDecimal getDefaultprinterid() {
		return defaultprinterid;
	}
	public void setDefaultprinterid(BigDecimal defaultprinterid) {
		this.defaultprinterid = defaultprinterid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRecordstatus() {
		return recordstatus;
	}
	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}
	public String getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}
	public String getWebaddress() {
		return webaddress;
	}
	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}
	public String getReadsid() {
		return readsid;
	}
	public void setReadsid(String readsid) {
		this.readsid = readsid;
	}
	public String getMaintainsid() {
		return maintainsid;
	}
	public void setMaintainsid(String maintainsid) {
		this.maintainsid = maintainsid;
	}
	public String getCreateunitsid() {
		return createunitsid;
	}
	public void setCreateunitsid(String createunitsid) {
		this.createunitsid = createunitsid;
	}
	public BigDecimal getLocationid() {
		return locationid;
	}
	public void setLocationid(BigDecimal locationid) {
		this.locationid = locationid;
	}
	public String getUppername() {
		return uppername;
	}
	public void setUppername(String uppername) {
		this.uppername = uppername;
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
	public Date getLastwritten() {
		return lastwritten;
	}
	public void setLastwritten(Date lastwritten) {
		this.lastwritten = lastwritten;
	}
	private String businesstypecode;
	private String comments;
	private Date creationdate;
	private BigDecimal defaultprinterid;
	private String name;
	private String recordstatus;
	private String statuscode;
	private String webaddress;
	private String readsid;
	private String maintainsid;
	private String createunitsid;
	private BigDecimal locationid;
	private String uppername;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;
	private Date lastwritten;
	

	
	

}
