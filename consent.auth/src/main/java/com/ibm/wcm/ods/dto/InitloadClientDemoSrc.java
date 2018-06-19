package com.ibm.wcm.ods.dto;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

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

/**
 * InitloadClientDemoSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "INITLOAD_CLIENT_DEMO_SRC")
public class InitloadClientDemoSrc implements java.io.Serializable {

	private BigDecimal clientDemoSeqNum;
	private InitloadClientSrc initloadClientSrc;
	private String maritalStatus;
	private String militaryStatus;
	private String immigrationStatus;
	private String alienRegNum;
	private String foreignAddr;
	private Date dateOfDeath;
	private String educationLevel;
	private String isHsGrad;
	private String enrolledSchool;
	private String isLiterate;
	private String employmentStatus;
	private String numPaidWorkDaysPast30d;
	private String enrolledJobTrain;
	private String emgncyCntctFirstName;
	private String emgncyCntctLastName;
	private String emgncyCntctPhone;
	private String emgncyCntctPhoneExt;
	private String emgncyCntctPhone2;
	private String emgncyCntctPhone2Ext;
	private String emgncyCntctRelation;
	private String livesAtPrimaryAddr;
	private String residenceType;
	private String rentOrOwn;
	private String livesWithRelative;
	private String curLivingArrangement;
	private String numChldU18;
	private String numChldU5;
	private String curWorkExp;
	private Date dateLastWorked;
	private String deathCircumstance;
	private String spokenLang;
	private String pregStatus;
	private Date dueDate;
	private String histOfViolence;
	private String histOfSelfInj;
	private String interpreter;
	private String citizenship;
	private String citizenshipStatus;
	private String veteranStatus;
	private String tribe;
	private String visaType;
	private String schoolName;

	public InitloadClientDemoSrc() {
	}

	public InitloadClientDemoSrc(BigDecimal clientDemoSeqNum, InitloadClientSrc initloadClientSrc) {
		this.clientDemoSeqNum = clientDemoSeqNum;
		this.initloadClientSrc = initloadClientSrc;
	}

	public InitloadClientDemoSrc(BigDecimal clientDemoSeqNum, InitloadClientSrc initloadClientSrc, String maritalStatus,
			String militaryStatus, String immigrationStatus, String alienRegNum, String foreignAddr, Date dateOfDeath,
			String educationLevel, String isHsGrad, String enrolledSchool, String isLiterate, String employmentStatus,
			String numPaidWorkDaysPast30d, String enrolledJobTrain, String emgncyCntctFirstName,
			String emgncyCntctLastName, String emgncyCntctPhone, String emgncyCntctPhoneExt, String emgncyCntctPhone2,
			String emgncyCntctPhone2Ext, String emgncyCntctRelation, String livesAtPrimaryAddr, String residenceType,
			String rentOrOwn, String livesWithRelative, String curLivingArrangement, String numChldU18,
			String numChldU5, String curWorkExp, Date dateLastWorked, String deathCircumstance, String spokenLang,
			String pregStatus, Date dueDate, String histOfViolence, String histOfSelfInj, String interpreter,
			String citizenship, String citizenshipStatus, String veteranStatus, String tribe, String visaType,
			String schoolName) {
		this.clientDemoSeqNum = clientDemoSeqNum;
		this.initloadClientSrc = initloadClientSrc;
		this.maritalStatus = maritalStatus;
		this.militaryStatus = militaryStatus;
		this.immigrationStatus = immigrationStatus;
		this.alienRegNum = alienRegNum;
		this.foreignAddr = foreignAddr;
		this.dateOfDeath = dateOfDeath;
		this.educationLevel = educationLevel;
		this.isHsGrad = isHsGrad;
		this.enrolledSchool = enrolledSchool;
		this.isLiterate = isLiterate;
		this.employmentStatus = employmentStatus;
		this.numPaidWorkDaysPast30d = numPaidWorkDaysPast30d;
		this.enrolledJobTrain = enrolledJobTrain;
		this.emgncyCntctFirstName = emgncyCntctFirstName;
		this.emgncyCntctLastName = emgncyCntctLastName;
		this.emgncyCntctPhone = emgncyCntctPhone;
		this.emgncyCntctPhoneExt = emgncyCntctPhoneExt;
		this.emgncyCntctPhone2 = emgncyCntctPhone2;
		this.emgncyCntctPhone2Ext = emgncyCntctPhone2Ext;
		this.emgncyCntctRelation = emgncyCntctRelation;
		this.livesAtPrimaryAddr = livesAtPrimaryAddr;
		this.residenceType = residenceType;
		this.rentOrOwn = rentOrOwn;
		this.livesWithRelative = livesWithRelative;
		this.curLivingArrangement = curLivingArrangement;
		this.numChldU18 = numChldU18;
		this.numChldU5 = numChldU5;
		this.curWorkExp = curWorkExp;
		this.dateLastWorked = dateLastWorked;
		this.deathCircumstance = deathCircumstance;
		this.spokenLang = spokenLang;
		this.pregStatus = pregStatus;
		this.dueDate = dueDate;
		this.histOfViolence = histOfViolence;
		this.histOfSelfInj = histOfSelfInj;
		this.interpreter = interpreter;
		this.citizenship = citizenship;
		this.citizenshipStatus = citizenshipStatus;
		this.veteranStatus = veteranStatus;
		this.tribe = tribe;
		this.visaType = visaType;
		this.schoolName = schoolName;
	}

	@Id

	@Column(name = "CLIENT_DEMO_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientDemoSeqNum() {
		return this.clientDemoSeqNum;
	}

	public void setClientDemoSeqNum(BigDecimal clientDemoSeqNum) {
		this.clientDemoSeqNum = clientDemoSeqNum;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT_TRANSACTION_SEQ_NUM", nullable = false)
	public InitloadClientSrc getInitloadClientSrc() {
		return this.initloadClientSrc;
	}

	public void setInitloadClientSrc(InitloadClientSrc initloadClientSrc) {
		this.initloadClientSrc = initloadClientSrc;
	}

	@Column(name = "MARITAL_STATUS", length = 30)
	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "MILITARY_STATUS", length = 256)
	public String getMilitaryStatus() {
		return this.militaryStatus;
	}

	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
	}

	@Column(name = "IMMIGRATION_STATUS", length = 30)
	public String getImmigrationStatus() {
		return this.immigrationStatus;
	}

	public void setImmigrationStatus(String immigrationStatus) {
		this.immigrationStatus = immigrationStatus;
	}

	@Column(name = "ALIEN_REG_NUM", length = 30)
	public String getAlienRegNum() {
		return this.alienRegNum;
	}

	public void setAlienRegNum(String alienRegNum) {
		this.alienRegNum = alienRegNum;
	}

	@Column(name = "FOREIGN_ADDR", length = 512)
	public String getForeignAddr() {
		return this.foreignAddr;
	}

	public void setForeignAddr(String foreignAddr) {
		this.foreignAddr = foreignAddr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_DEATH", length = 10)
	public Date getDateOfDeath() {
		return this.dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	@Column(name = "EDUCATION_LEVEL", length = 30)
	public String getEducationLevel() {
		return this.educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	@Column(name = "IS_HS_GRAD", length = 30)
	public String getIsHsGrad() {
		return this.isHsGrad;
	}

	public void setIsHsGrad(String isHsGrad) {
		this.isHsGrad = isHsGrad;
	}

	@Column(name = "ENROLLED_SCHOOL", length = 30)
	public String getEnrolledSchool() {
		return this.enrolledSchool;
	}

	public void setEnrolledSchool(String enrolledSchool) {
		this.enrolledSchool = enrolledSchool;
	}

	@Column(name = "IS_LITERATE", length = 50)
	public String getIsLiterate() {
		return this.isLiterate;
	}

	public void setIsLiterate(String isLiterate) {
		this.isLiterate = isLiterate;
	}

	@Column(name = "EMPLOYMENT_STATUS", length = 256)
	public String getEmploymentStatus() {
		return this.employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	@Column(name = "NUM_PAID_WORK_DAYS_PAST30D", length = 256)
	public String getNumPaidWorkDaysPast30d() {
		return this.numPaidWorkDaysPast30d;
	}

	public void setNumPaidWorkDaysPast30d(String numPaidWorkDaysPast30d) {
		this.numPaidWorkDaysPast30d = numPaidWorkDaysPast30d;
	}

	@Column(name = "ENROLLED_JOB_TRAIN", length = 30)
	public String getEnrolledJobTrain() {
		return this.enrolledJobTrain;
	}

	public void setEnrolledJobTrain(String enrolledJobTrain) {
		this.enrolledJobTrain = enrolledJobTrain;
	}

	@Column(name = "EMGNCY_CNTCT_FIRST_NAME", length = 35)
	public String getEmgncyCntctFirstName() {
		return this.emgncyCntctFirstName;
	}

	public void setEmgncyCntctFirstName(String emgncyCntctFirstName) {
		this.emgncyCntctFirstName = emgncyCntctFirstName;
	}

	@Column(name = "EMGNCY_CNTCT_LAST_NAME", length = 50)
	public String getEmgncyCntctLastName() {
		return this.emgncyCntctLastName;
	}

	public void setEmgncyCntctLastName(String emgncyCntctLastName) {
		this.emgncyCntctLastName = emgncyCntctLastName;
	}

	@Column(name = "EMGNCY_CNTCT_PHONE", length = 40)
	public String getEmgncyCntctPhone() {
		return this.emgncyCntctPhone;
	}

	public void setEmgncyCntctPhone(String emgncyCntctPhone) {
		this.emgncyCntctPhone = emgncyCntctPhone;
	}

	@Column(name = "EMGNCY_CNTCT_PHONE_EXT", length = 100)
	public String getEmgncyCntctPhoneExt() {
		return this.emgncyCntctPhoneExt;
	}

	public void setEmgncyCntctPhoneExt(String emgncyCntctPhoneExt) {
		this.emgncyCntctPhoneExt = emgncyCntctPhoneExt;
	}

	@Column(name = "EMGNCY_CNTCT_PHONE2", length = 40)
	public String getEmgncyCntctPhone2() {
		return this.emgncyCntctPhone2;
	}

	public void setEmgncyCntctPhone2(String emgncyCntctPhone2) {
		this.emgncyCntctPhone2 = emgncyCntctPhone2;
	}

	@Column(name = "EMGNCY_CNTCT_PHONE2_EXT", length = 100)
	public String getEmgncyCntctPhone2Ext() {
		return this.emgncyCntctPhone2Ext;
	}

	public void setEmgncyCntctPhone2Ext(String emgncyCntctPhone2Ext) {
		this.emgncyCntctPhone2Ext = emgncyCntctPhone2Ext;
	}

	@Column(name = "EMGNCY_CNTCT_RELATION", length = 50)
	public String getEmgncyCntctRelation() {
		return this.emgncyCntctRelation;
	}

	public void setEmgncyCntctRelation(String emgncyCntctRelation) {
		this.emgncyCntctRelation = emgncyCntctRelation;
	}

	@Column(name = "LIVES_AT_PRIMARY_ADDR", length = 30)
	public String getLivesAtPrimaryAddr() {
		return this.livesAtPrimaryAddr;
	}

	public void setLivesAtPrimaryAddr(String livesAtPrimaryAddr) {
		this.livesAtPrimaryAddr = livesAtPrimaryAddr;
	}

	@Column(name = "RESIDENCE_TYPE", length = 30)
	public String getResidenceType() {
		return this.residenceType;
	}

	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}

	@Column(name = "RENT_OR_OWN", length = 30)
	public String getRentOrOwn() {
		return this.rentOrOwn;
	}

	public void setRentOrOwn(String rentOrOwn) {
		this.rentOrOwn = rentOrOwn;
	}

	@Column(name = "LIVES_WITH_RELATIVE", length = 50)
	public String getLivesWithRelative() {
		return this.livesWithRelative;
	}

	public void setLivesWithRelative(String livesWithRelative) {
		this.livesWithRelative = livesWithRelative;
	}

	@Column(name = "CUR_LIVING_ARRANGEMENT", length = 256)
	public String getCurLivingArrangement() {
		return this.curLivingArrangement;
	}

	public void setCurLivingArrangement(String curLivingArrangement) {
		this.curLivingArrangement = curLivingArrangement;
	}

	@Column(name = "NUM_CHLD_U18", length = 256)
	public String getNumChldU18() {
		return this.numChldU18;
	}

	public void setNumChldU18(String numChldU18) {
		this.numChldU18 = numChldU18;
	}

	@Column(name = "NUM_CHLD_U5", length = 256)
	public String getNumChldU5() {
		return this.numChldU5;
	}

	public void setNumChldU5(String numChldU5) {
		this.numChldU5 = numChldU5;
	}

	@Column(name = "CUR_WORK_EXP", length = 60)
	public String getCurWorkExp() {
		return this.curWorkExp;
	}

	public void setCurWorkExp(String curWorkExp) {
		this.curWorkExp = curWorkExp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_LAST_WORKED", length = 10)
	public Date getDateLastWorked() {
		return this.dateLastWorked;
	}

	public void setDateLastWorked(Date dateLastWorked) {
		this.dateLastWorked = dateLastWorked;
	}

	@Column(name = "DEATH_CIRCUMSTANCE", length = 20)
	public String getDeathCircumstance() {
		return this.deathCircumstance;
	}

	public void setDeathCircumstance(String deathCircumstance) {
		this.deathCircumstance = deathCircumstance;
	}

	@Column(name = "SPOKEN_LANG", length = 50)
	public String getSpokenLang() {
		return this.spokenLang;
	}

	public void setSpokenLang(String spokenLang) {
		this.spokenLang = spokenLang;
	}

	@Column(name = "PREG_STATUS", length = 60)
	public String getPregStatus() {
		return this.pregStatus;
	}

	public void setPregStatus(String pregStatus) {
		this.pregStatus = pregStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DUE_DATE", length = 10)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "HIST_OF_VIOLENCE", length = 3)
	public String getHistOfViolence() {
		return this.histOfViolence;
	}

	public void setHistOfViolence(String histOfViolence) {
		this.histOfViolence = histOfViolence;
	}

	@Column(name = "HIST_OF_SELF_INJ", length = 60)
	public String getHistOfSelfInj() {
		return this.histOfSelfInj;
	}

	public void setHistOfSelfInj(String histOfSelfInj) {
		this.histOfSelfInj = histOfSelfInj;
	}

	@Column(name = "INTERPRETER", length = 50)
	public String getInterpreter() {
		return this.interpreter;
	}

	public void setInterpreter(String interpreter) {
		this.interpreter = interpreter;
	}

	@Column(name = "CITIZENSHIP", length = 50)
	public String getCitizenship() {
		return this.citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@Column(name = "CITIZENSHIP_STATUS", length = 50)
	public String getCitizenshipStatus() {
		return this.citizenshipStatus;
	}

	public void setCitizenshipStatus(String citizenshipStatus) {
		this.citizenshipStatus = citizenshipStatus;
	}

	@Column(name = "VETERAN_STATUS", length = 50)
	public String getVeteranStatus() {
		return this.veteranStatus;
	}

	public void setVeteranStatus(String veteranStatus) {
		this.veteranStatus = veteranStatus;
	}

	@Column(name = "TRIBE", length = 20)
	public String getTribe() {
		return this.tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	@Column(name = "VISA_TYPE", length = 30)
	public String getVisaType() {
		return this.visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	@Column(name = "SCHOOL_NAME", length = 40)
	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
