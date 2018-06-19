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


public class CosdproxypersonconsentVO   {

	private BigDecimal proxyconsentid;
	public BigDecimal getProxyconsentid() {
		return proxyconsentid;
	}
	public void setProxyconsentid(BigDecimal proxyconsentid) {
		this.proxyconsentid = proxyconsentid;
	}
	public long getCosdpersonconsent() {
		return cosdpersonconsent;
	}
	public void setCosdpersonconsent(long cosdpersonconsent) {
		this.cosdpersonconsent = cosdpersonconsent;
	}
	public BigDecimal getConcernroleid() {
		return concernroleid;
	}
	public void setConcernroleid(BigDecimal concernroleid) {
		this.concernroleid = concernroleid;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getProxyconsentreason() {
		return proxyconsentreason;
	}
	public void setProxyconsentreason(String proxyconsentreason) {
		this.proxyconsentreason = proxyconsentreason;
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
	private BigDecimal concernroleid;
	private Date startdate;
	private Date enddate;
	private String proxyconsentreason;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;

	
}
