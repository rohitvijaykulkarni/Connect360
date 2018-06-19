package com.ibm.wcm.ods.dto;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

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

/**
 * ClientProfileMhsSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "CLIENT_PROFILE_MHS_SRC")
public class ClientProfileMhsSrc implements java.io.Serializable {

	private BigDecimal clientProfileMhsSeqNum;
	private String clientId;
	private String sourceSystemId;
	private Date admissionDate;
	private String num24hrPsyFacStayPast30d;
	private String numOpEmgncyMhsPast30d;
	private String mentalHealthMedsPast30d;
	private String mentalIllnessDiagnosed;
	private String numSuicideAttempt;
	private Date processTs;
	private String histOfSuicide;
	private Set<CpMhsEncounterSrc> cpMhsEncounterSrcs = new HashSet<CpMhsEncounterSrc>(0);
	private Set<CpMhsInfoSrc> cpMhsInfoSrcs = new HashSet<CpMhsInfoSrc>(0);

	public ClientProfileMhsSrc() {
	}

	public ClientProfileMhsSrc(BigDecimal clientProfileMhsSeqNum, String clientId, String sourceSystemId) {
		this.clientProfileMhsSeqNum = clientProfileMhsSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
	}

	public ClientProfileMhsSrc(BigDecimal clientProfileMhsSeqNum, String clientId, String sourceSystemId,
			Date admissionDate, String num24hrPsyFacStayPast30d, String numOpEmgncyMhsPast30d,
			String mentalHealthMedsPast30d, String mentalIllnessDiagnosed, String numSuicideAttempt, Date processTs,
			String histOfSuicide, Set<CpMhsEncounterSrc> cpMhsEncounterSrcs, Set<CpMhsInfoSrc> cpMhsInfoSrcs) {
		this.clientProfileMhsSeqNum = clientProfileMhsSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
		this.admissionDate = admissionDate;
		this.num24hrPsyFacStayPast30d = num24hrPsyFacStayPast30d;
		this.numOpEmgncyMhsPast30d = numOpEmgncyMhsPast30d;
		this.mentalHealthMedsPast30d = mentalHealthMedsPast30d;
		this.mentalIllnessDiagnosed = mentalIllnessDiagnosed;
		this.numSuicideAttempt = numSuicideAttempt;
		this.processTs = processTs;
		this.histOfSuicide = histOfSuicide;
		this.cpMhsEncounterSrcs = cpMhsEncounterSrcs;
		this.cpMhsInfoSrcs = cpMhsInfoSrcs;
	}

	@Id

	@Column(name = "CLIENT_PROFILE_MHS_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientProfileMhsSeqNum() {
		return this.clientProfileMhsSeqNum;
	}

	public void setClientProfileMhsSeqNum(BigDecimal clientProfileMhsSeqNum) {
		this.clientProfileMhsSeqNum = clientProfileMhsSeqNum;
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

	@Column(name = "NUM_24HR_PSY_FAC_STAY_PAST30D", length = 256)
	public String getNum24hrPsyFacStayPast30d() {
		return this.num24hrPsyFacStayPast30d;
	}

	public void setNum24hrPsyFacStayPast30d(String num24hrPsyFacStayPast30d) {
		this.num24hrPsyFacStayPast30d = num24hrPsyFacStayPast30d;
	}

	@Column(name = "NUM_OP_EMGNCY_MHS_PAST30D", length = 256)
	public String getNumOpEmgncyMhsPast30d() {
		return this.numOpEmgncyMhsPast30d;
	}

	public void setNumOpEmgncyMhsPast30d(String numOpEmgncyMhsPast30d) {
		this.numOpEmgncyMhsPast30d = numOpEmgncyMhsPast30d;
	}

	@Column(name = "MENTAL_HEALTH_MEDS_PAST30D", length = 5)
	public String getMentalHealthMedsPast30d() {
		return this.mentalHealthMedsPast30d;
	}

	public void setMentalHealthMedsPast30d(String mentalHealthMedsPast30d) {
		this.mentalHealthMedsPast30d = mentalHealthMedsPast30d;
	}

	@Column(name = "MENTAL_ILLNESS_DIAGNOSED", length = 512)
	public String getMentalIllnessDiagnosed() {
		return this.mentalIllnessDiagnosed;
	}

	public void setMentalIllnessDiagnosed(String mentalIllnessDiagnosed) {
		this.mentalIllnessDiagnosed = mentalIllnessDiagnosed;
	}

	@Column(name = "NUM_SUICIDE_ATTEMPT", length = 256)
	public String getNumSuicideAttempt() {
		return this.numSuicideAttempt;
	}

	public void setNumSuicideAttempt(String numSuicideAttempt) {
		this.numSuicideAttempt = numSuicideAttempt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PROCESS_TS", length = 26)
	public Date getProcessTs() {
		return this.processTs;
	}

	public void setProcessTs(Date processTs) {
		this.processTs = processTs;
	}

	@Column(name = "HIST_OF_SUICIDE", length = 25)
	public String getHistOfSuicide() {
		return this.histOfSuicide;
	}

	public void setHistOfSuicide(String histOfSuicide) {
		this.histOfSuicide = histOfSuicide;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientProfileMhsSrc")
	public Set<CpMhsEncounterSrc> getCpMhsEncounterSrcs() {
		return this.cpMhsEncounterSrcs;
	}

	public void setCpMhsEncounterSrcs(Set<CpMhsEncounterSrc> cpMhsEncounterSrcs) {
		this.cpMhsEncounterSrcs = cpMhsEncounterSrcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientProfileMhsSrc")
	public Set<CpMhsInfoSrc> getCpMhsInfoSrcs() {
		return this.cpMhsInfoSrcs;
	}

	public void setCpMhsInfoSrcs(Set<CpMhsInfoSrc> cpMhsInfoSrcs) {
		this.cpMhsInfoSrcs = cpMhsInfoSrcs;
	}

}
