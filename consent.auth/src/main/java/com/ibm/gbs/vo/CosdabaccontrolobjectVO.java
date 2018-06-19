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


public class CosdabaccontrolobjectVO   {
	         
	private BigDecimal controlobjectid;
	public BigDecimal getControlobjectid() {
		return controlobjectid;
	}

	public void setControlobjectid(BigDecimal controlobjectid) {
		this.controlobjectid = controlobjectid;
	}

	public BigDecimal getCosdabacconstraintiD() {
		return cosdabacconstraintiD;
	}

	public void setCosdabacconstraintiD(BigDecimal cosdabacconstraintiD) {
		this.cosdabacconstraintiD = cosdabacconstraintiD;
	}

	public BigDecimal getCosdabaccontrolgroupiD() {
		return cosdabaccontrolgroupiD;
	}

	public void setCosdabaccontrolgroupiD(BigDecimal cosdabaccontrolgroupiD) {
		this.cosdabaccontrolgroupiD = cosdabaccontrolgroupiD;
	}

	public BigDecimal getCosdabactransactioniD() {
		return cosdabactransactioniD;
	}

	public void setCosdabactransactioniD(BigDecimal cosdabactransactioniD) {
		this.cosdabactransactioniD = cosdabactransactioniD;
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

	private BigDecimal cosdabacconstraintiD;
	private BigDecimal cosdabaccontrolgroupiD;
	private BigDecimal cosdabactransactioniD;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;

	public CosdabaccontrolobjectVO() {
	}

	public CosdabaccontrolobjectVO(BigDecimal controlobjectid) {
		this.controlobjectid = controlobjectid;
	}

	

	
}
