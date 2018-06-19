package com.ibm.wcm.ods.dto;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MvVwcosdieClient generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "MV_VWCOSDIE_CLIENT")
public class MvVwcosdieClient implements java.io.Serializable {

	private MvVwcosdieClientId id;

	public MvVwcosdieClient() {
	}

	public MvVwcosdieClient(MvVwcosdieClientId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "soaProcessingSeq", column = @Column(name = "SOA_PROCESSING_SEQ", precision = 31, scale = 0)),
			@AttributeOverride(name = "sourceSysId", column = @Column(name = "SOURCE_SYS_ID", length = 18)),
			@AttributeOverride(name = "clientId", column = @Column(name = "CLIENT_ID", precision = 9, scale = 0)),
			@AttributeOverride(name = "privRec", column = @Column(name = "PRIV_REC", length = 3)),
			@AttributeOverride(name = "firstNm", column = @Column(name = "FIRST_NM", nullable = false, length = 75)),
			@AttributeOverride(name = "lastNm", column = @Column(name = "LAST_NM", nullable = false, length = 75)),
			@AttributeOverride(name = "middleNm", column = @Column(name = "MIDDLE_NM", length = 3)),
			@AttributeOverride(name = "dob", column = @Column(name = "DOB", nullable = false, length = 10)),
			@AttributeOverride(name = "ssn", column = @Column(name = "SSN", length = 33)),
			@AttributeOverride(name = "priEmailAdr", column = @Column(name = "PRI_EMAIL_ADR", length = 225)),
			@AttributeOverride(name = "altEmailAdr", column = @Column(name = "ALT_EMAIL_ADR", length = 75)),
			@AttributeOverride(name = "ethnicity", column = @Column(name = "ETHNICITY", length = 177)),
			@AttributeOverride(name = "gender", column = @Column(name = "GENDER", nullable = false, length = 3)),
			@AttributeOverride(name = "resStatus", column = @Column(name = "RES_STATUS", length = 3)),
			@AttributeOverride(name = "priLang", column = @Column(name = "PRI_LANG", length = 6)),
			@AttributeOverride(name = "priLangAbil", column = @Column(name = "PRI_LANG_ABIL", length = 50)),
			@AttributeOverride(name = "secLang", column = @Column(name = "SEC_LANG", length = 50)),
			@AttributeOverride(name = "secLangAbil", column = @Column(name = "SEC_LANG_ABIL", length = 50)),
			@AttributeOverride(name = "popType", column = @Column(name = "POP_TYPE", length = 50)),
			@AttributeOverride(name = "aliasNm", column = @Column(name = "ALIAS_NM", length = 25)),
			@AttributeOverride(name = "lastUpdDtm", column = @Column(name = "LAST_UPD_DTM", length = 10)) })
	public MvVwcosdieClientId getId() {
		return this.id;
	}

	public void setId(MvVwcosdieClientId id) {
		this.id = id;
	}

}
