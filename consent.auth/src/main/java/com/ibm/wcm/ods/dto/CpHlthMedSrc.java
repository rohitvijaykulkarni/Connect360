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
 * CpHlthMedSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "CP_HLTH_MED_SRC")
public class CpHlthMedSrc implements java.io.Serializable {

	private BigDecimal cpHlthMedSeqNum;
	private ClientProfileHlthSrc clientProfileHlthSrc;
	private String medName;
	private String medType;
	private Date prescDate;

	public CpHlthMedSrc() {
	}

	public CpHlthMedSrc(BigDecimal cpHlthMedSeqNum, ClientProfileHlthSrc clientProfileHlthSrc) {
		this.cpHlthMedSeqNum = cpHlthMedSeqNum;
		this.clientProfileHlthSrc = clientProfileHlthSrc;
	}

	public CpHlthMedSrc(BigDecimal cpHlthMedSeqNum, ClientProfileHlthSrc clientProfileHlthSrc, String medName,
			String medType, Date prescDate) {
		this.cpHlthMedSeqNum = cpHlthMedSeqNum;
		this.clientProfileHlthSrc = clientProfileHlthSrc;
		this.medName = medName;
		this.medType = medType;
		this.prescDate = prescDate;
	}

	@Id

	@Column(name = "CP_HLTH_MED_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getCpHlthMedSeqNum() {
		return this.cpHlthMedSeqNum;
	}

	public void setCpHlthMedSeqNum(BigDecimal cpHlthMedSeqNum) {
		this.cpHlthMedSeqNum = cpHlthMedSeqNum;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT_PROFILE_HLTH_SEQ_NUM", nullable = false)
	public ClientProfileHlthSrc getClientProfileHlthSrc() {
		return this.clientProfileHlthSrc;
	}

	public void setClientProfileHlthSrc(ClientProfileHlthSrc clientProfileHlthSrc) {
		this.clientProfileHlthSrc = clientProfileHlthSrc;
	}

	@Column(name = "MED_NAME", length = 105)
	public String getMedName() {
		return this.medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	@Column(name = "MED_TYPE", length = 1)
	public String getMedType() {
		return this.medType;
	}

	public void setMedType(String medType) {
		this.medType = medType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PRESC_DATE", length = 10)
	public Date getPrescDate() {
		return this.prescDate;
	}

	public void setPrescDate(Date prescDate) {
		this.prescDate = prescDate;
	}

}
