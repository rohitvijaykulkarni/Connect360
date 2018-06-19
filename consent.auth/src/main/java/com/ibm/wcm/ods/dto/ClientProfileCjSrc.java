package com.ibm.wcm.ods.dto;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClientProfileCjSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "CLIENT_PROFILE_CJ_SRC")
public class ClientProfileCjSrc implements java.io.Serializable {

	private BigDecimal clientProfileCjSeqNum;
	private String clientId;
	private String sourceSystemId;
	private Date admissionDate;
	private String episodeInvlvdDomAbuse;
	private String episodeInvlvdPhyAbuse;
	private String episodeInvlvdSexAbuse;
	private String cjStatus;
	private String numArrestPast30d;
	private String numArrestPast6m;
	private String numJailDaysPast30d;
	private String numPrisonDaysPast30d;
	private Date processTs;
	private String kwnSexOfndrInHh;
	private String felonyConviction;
	private String invlvdInDomAbuse;
	private String typeOfAbuse;
	private String abuserName;

	public ClientProfileCjSrc() {
	}

	public ClientProfileCjSrc(BigDecimal clientProfileCjSeqNum, String clientId, String sourceSystemId) {
		this.clientProfileCjSeqNum = clientProfileCjSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
	}

	public ClientProfileCjSrc(BigDecimal clientProfileCjSeqNum, String clientId, String sourceSystemId,
			Date admissionDate, String episodeInvlvdDomAbuse, String episodeInvlvdPhyAbuse,
			String episodeInvlvdSexAbuse, String cjStatus, String numArrestPast30d, String numArrestPast6m,
			String numJailDaysPast30d, String numPrisonDaysPast30d, Date processTs, String kwnSexOfndrInHh,
			String felonyConviction, String invlvdInDomAbuse, String typeOfAbuse, String abuserName) {
		this.clientProfileCjSeqNum = clientProfileCjSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
		this.admissionDate = admissionDate;
		this.episodeInvlvdDomAbuse = episodeInvlvdDomAbuse;
		this.episodeInvlvdPhyAbuse = episodeInvlvdPhyAbuse;
		this.episodeInvlvdSexAbuse = episodeInvlvdSexAbuse;
		this.cjStatus = cjStatus;
		this.numArrestPast30d = numArrestPast30d;
		this.numArrestPast6m = numArrestPast6m;
		this.numJailDaysPast30d = numJailDaysPast30d;
		this.numPrisonDaysPast30d = numPrisonDaysPast30d;
		this.processTs = processTs;
		this.kwnSexOfndrInHh = kwnSexOfndrInHh;
		this.felonyConviction = felonyConviction;
		this.invlvdInDomAbuse = invlvdInDomAbuse;
		this.typeOfAbuse = typeOfAbuse;
		this.abuserName = abuserName;
	}

	@Id

	@Column(name = "CLIENT_PROFILE_CJ_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientProfileCjSeqNum() {
		return this.clientProfileCjSeqNum;
	}

	public void setClientProfileCjSeqNum(BigDecimal clientProfileCjSeqNum) {
		this.clientProfileCjSeqNum = clientProfileCjSeqNum;
	}

	@Column(name = "CLIENT_ID", nullable = false, length = 60)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "SOURCE_SYSTEM_ID", nullable = false, length = 40)
	public String getSourceSystemId() {
		return this.sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ADMISSION_DATE", length = 10)
	public Date getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	@Column(name = "EPISODE_INVLVD_DOM_ABUSE", length = 256)
	public String getEpisodeInvlvdDomAbuse() {
		return this.episodeInvlvdDomAbuse;
	}

	public void setEpisodeInvlvdDomAbuse(String episodeInvlvdDomAbuse) {
		this.episodeInvlvdDomAbuse = episodeInvlvdDomAbuse;
	}

	@Column(name = "EPISODE_INVLVD_PHY_ABUSE", length = 256)
	public String getEpisodeInvlvdPhyAbuse() {
		return this.episodeInvlvdPhyAbuse;
	}

	public void setEpisodeInvlvdPhyAbuse(String episodeInvlvdPhyAbuse) {
		this.episodeInvlvdPhyAbuse = episodeInvlvdPhyAbuse;
	}

	@Column(name = "EPISODE_INVLVD_SEX_ABUSE", length = 256)
	public String getEpisodeInvlvdSexAbuse() {
		return this.episodeInvlvdSexAbuse;
	}

	public void setEpisodeInvlvdSexAbuse(String episodeInvlvdSexAbuse) {
		this.episodeInvlvdSexAbuse = episodeInvlvdSexAbuse;
	}

	@Column(name = "CJ_STATUS", length = 256)
	public String getCjStatus() {
		return this.cjStatus;
	}

	public void setCjStatus(String cjStatus) {
		this.cjStatus = cjStatus;
	}

	@Column(name = "NUM_ARREST_PAST30D", length = 256)
	public String getNumArrestPast30d() {
		return this.numArrestPast30d;
	}

	public void setNumArrestPast30d(String numArrestPast30d) {
		this.numArrestPast30d = numArrestPast30d;
	}

	@Column(name = "NUM_ARREST_PAST6M", length = 256)
	public String getNumArrestPast6m() {
		return this.numArrestPast6m;
	}

	public void setNumArrestPast6m(String numArrestPast6m) {
		this.numArrestPast6m = numArrestPast6m;
	}

	@Column(name = "NUM_JAIL_DAYS_PAST30D", length = 256)
	public String getNumJailDaysPast30d() {
		return this.numJailDaysPast30d;
	}

	public void setNumJailDaysPast30d(String numJailDaysPast30d) {
		this.numJailDaysPast30d = numJailDaysPast30d;
	}

	@Column(name = "NUM_PRISON_DAYS_PAST30D", length = 256)
	public String getNumPrisonDaysPast30d() {
		return this.numPrisonDaysPast30d;
	}

	public void setNumPrisonDaysPast30d(String numPrisonDaysPast30d) {
		this.numPrisonDaysPast30d = numPrisonDaysPast30d;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PROCESS_TS", length = 26)
	public Date getProcessTs() {
		return this.processTs;
	}

	public void setProcessTs(Date processTs) {
		this.processTs = processTs;
	}

	@Column(name = "KWN_SEX_OFNDR_IN_HH", length = 3)
	public String getKwnSexOfndrInHh() {
		return this.kwnSexOfndrInHh;
	}

	public void setKwnSexOfndrInHh(String kwnSexOfndrInHh) {
		this.kwnSexOfndrInHh = kwnSexOfndrInHh;
	}

	@Column(name = "FELONY_CONVICTION", length = 60)
	public String getFelonyConviction() {
		return this.felonyConviction;
	}

	public void setFelonyConviction(String felonyConviction) {
		this.felonyConviction = felonyConviction;
	}

	@Column(name = "INVLVD_IN_DOM_ABUSE", length = 3)
	public String getInvlvdInDomAbuse() {
		return this.invlvdInDomAbuse;
	}

	public void setInvlvdInDomAbuse(String invlvdInDomAbuse) {
		this.invlvdInDomAbuse = invlvdInDomAbuse;
	}

	@Column(name = "TYPE_OF_ABUSE", length = 30)
	public String getTypeOfAbuse() {
		return this.typeOfAbuse;
	}

	public void setTypeOfAbuse(String typeOfAbuse) {
		this.typeOfAbuse = typeOfAbuse;
	}

	@Column(name = "ABUSER_NAME", length = 50)
	public String getAbuserName() {
		return this.abuserName;
	}

	public void setAbuserName(String abuserName) {
		this.abuserName = abuserName;
	}

}
