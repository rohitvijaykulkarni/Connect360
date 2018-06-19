/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dto;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ibm.gbs.util.Constant;

/**
 * Cosdauthorizationgroup generated by hbm2java
 */
@Entity
@Table(name = "cosdauthorizationgroup", schema = Constant.SCHEMANAME )
public class Cosdauthorizationgroup implements java.io.Serializable {

	private BigDecimal authorizationgroupid;
	private Cosdabaccontrolgroup cosdabaccontrolgroup;
	private Organisationunit organisationunit;
	private Securityrole securityrole;
	private Users users;
	private BigDecimal jobid;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;
	private String authGroupName;
	private Set<Cosdauthorizationpolicy> cosdauthorizationpolicy = new HashSet<Cosdauthorizationpolicy>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cosdauthorizationgroup")
	public Set<Cosdauthorizationpolicy> getCosdauthorizationpolicy() {
		return cosdauthorizationpolicy;
	}

	public void setCosdauthorizationpolicy(Set<Cosdauthorizationpolicy> cosdauthorizationpolicy) {
		this.cosdauthorizationpolicy = cosdauthorizationpolicy;
	}

	public Cosdauthorizationgroup() {
	}

	public Cosdauthorizationgroup(BigDecimal authorizationgroupid, Cosdabaccontrolgroup cosdabaccontrolgroup) {
		this.authorizationgroupid = authorizationgroupid;
		this.cosdabaccontrolgroup = cosdabaccontrolgroup;
	}

	public Cosdauthorizationgroup(BigDecimal authorizationgroupid, Cosdabaccontrolgroup cosdabaccontrolgroup,
			Organisationunit organisationunit, Securityrole securityrole, Users users, BigDecimal jobid,
			String createdby, Date createdon, String lastupdatedby, Date lastupdatedon,String authGrpName , Set<Cosdauthorizationpolicy> cosdauthorizationpolicy) {
		this.authorizationgroupid = authorizationgroupid;
		this.cosdabaccontrolgroup = cosdabaccontrolgroup;
		this.organisationunit = organisationunit;
		this.securityrole = securityrole;
		this.users = users;
		this.jobid = jobid;
		this.createdby = createdby;
		this.createdon = createdon;
		this.lastupdatedby = lastupdatedby;
		this.lastupdatedon = lastupdatedon;
		this.cosdauthorizationpolicy = cosdauthorizationpolicy ;
		this.authGroupName = authGrpName ;
	}

	@Id
	@SequenceGenerator(schema = Constant.SCHEMANAME ,name  = "AuthGrpSeq", sequenceName = "AuthGrpSeq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AuthGrpSeq")
	@Column(name = "authorizationgroupid", unique = true, nullable = false, scale = 0)
	public BigDecimal getAuthorizationgroupid() {
		return this.authorizationgroupid;
	}

	public void setAuthorizationgroupid(BigDecimal authorizationgroupid) {
		this.authorizationgroupid = authorizationgroupid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "controlgroupid", nullable = false)
	public Cosdabaccontrolgroup getCosdabaccontrolgroup() {
		return this.cosdabaccontrolgroup;
	}

	public void setCosdabaccontrolgroup(Cosdabaccontrolgroup cosdabaccontrolgroup) {
		this.cosdabaccontrolgroup = cosdabaccontrolgroup;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "organisationunitid")
	public Organisationunit getOrganisationunit() {
		return this.organisationunit;
	}

	public void setOrganisationunit(Organisationunit organisationunit) {
		this.organisationunit = organisationunit;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rolename")
	public Securityrole getSecurityrole() {
		return this.securityrole;
	}

	public void setSecurityrole(Securityrole securityrole) {
		this.securityrole = securityrole;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "username")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "jobid", scale = 0)
	public BigDecimal getJobid() {
		return this.jobid;
	}

	public void setJobid(BigDecimal jobid) {
		this.jobid = jobid;
	}

	@Column(name = "createdby", length = 64)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "createdon", length = 13)
	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	@Column(name = "lastupdatedby", length = 64)
	public String getLastupdatedby() {
		return this.lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "lastupdatedon", length = 13)
	public Date getLastupdatedon() {
		return this.lastupdatedon;
	}

	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}
    
	@Column(name = "authgroupname", length = 64)
	public String getAuthGroupName() {
		return authGroupName;
	}

	public void setAuthGroupName(String authGroupName) {
		this.authGroupName = authGroupName;
	}
}
