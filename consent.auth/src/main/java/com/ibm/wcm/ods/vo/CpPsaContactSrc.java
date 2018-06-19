package com.ibm.wcm.ods.vo;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CpPsaContactSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
//  @Entity
//  @Table(schema = Constant.SCHEMANAME_ODS , name = "CP_PSA_CONTACT_SRC")
public class CpPsaContactSrc  {   // implements  java.io.Serializable {

	private BigDecimal cpPsaContactSeqNum;
	private ClientProfilePsaSrc clientProfilePsaSrc;
	private String suspAbsrFirstName;
	private String suspAbsrLastName;
	private String suspAbsrRelationship;

	public CpPsaContactSrc() {
	}

	public CpPsaContactSrc(BigDecimal cpPsaContactSeqNum, ClientProfilePsaSrc clientProfilePsaSrc) {
		this.cpPsaContactSeqNum = cpPsaContactSeqNum;
		this.clientProfilePsaSrc = clientProfilePsaSrc;
	}

	public CpPsaContactSrc(BigDecimal cpPsaContactSeqNum, ClientProfilePsaSrc clientProfilePsaSrc,
			String suspAbsrFirstName, String suspAbsrLastName, String suspAbsrRelationship) {
		this.cpPsaContactSeqNum = cpPsaContactSeqNum;
		this.clientProfilePsaSrc = clientProfilePsaSrc;
		this.suspAbsrFirstName = suspAbsrFirstName;
		this.suspAbsrLastName = suspAbsrLastName;
		this.suspAbsrRelationship = suspAbsrRelationship;
	}

	//  @Id

	//  @Column(name = "CP_PSA_CONTACT_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getCpPsaContactSeqNum() {
		return this.cpPsaContactSeqNum;
	}

	public void setCpPsaContactSeqNum(BigDecimal cpPsaContactSeqNum) {
		this.cpPsaContactSeqNum = cpPsaContactSeqNum;
	}

	//  @ManyToOne(fetch = FetchType.LAZY)
	//  @JoinColumn(name = "CLIENT_PROFILE_PSA_SEQ_NUM", nullable = false)
	public ClientProfilePsaSrc getClientProfilePsaSrc() {
		return this.clientProfilePsaSrc;
	}

	public void setClientProfilePsaSrc(ClientProfilePsaSrc clientProfilePsaSrc) {
		this.clientProfilePsaSrc = clientProfilePsaSrc;
	}

	//  @Column(name = "SUSP_ABSR_FIRST_NAME", length = 35)
	public String getSuspAbsrFirstName() {
		return this.suspAbsrFirstName;
	}

	public void setSuspAbsrFirstName(String suspAbsrFirstName) {
		this.suspAbsrFirstName = suspAbsrFirstName;
	}

	//  @Column(name = "SUSP_ABSR_LAST_NAME", length = 50)
	public String getSuspAbsrLastName() {
		return this.suspAbsrLastName;
	}

	public void setSuspAbsrLastName(String suspAbsrLastName) {
		this.suspAbsrLastName = suspAbsrLastName;
	}

	//  @Column(name = "SUSP_ABSR_RELATIONSHIP", length = 32)
	public String getSuspAbsrRelationship() {
		return this.suspAbsrRelationship;
	}

	public void setSuspAbsrRelationship(String suspAbsrRelationship) {
		this.suspAbsrRelationship = suspAbsrRelationship;
	}

}