/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dto;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ibm.gbs.util.Constant;

/**
 * Usr generated by hbm2java
 */
@Entity
@Table(name = "usr", schema = Constant.SCHEMANAME )
public class Usr implements java.io.Serializable {

	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private Boolean enabled;
	private Date lastpasswordresetdate;
	private UserAuthority userAuthority;

	public Usr() {
	}

	public Usr(int id) {
		this.id = id;
	}

	public Usr(int id, String username, String password, String firstname, String lastname, String email,
			Boolean enabled, Date lastpasswordresetdate, UserAuthority userAuthority) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.enabled = enabled;
		this.lastpasswordresetdate = lastpasswordresetdate;
		this.userAuthority = userAuthority;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "username", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 150)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "firstname", length = 50)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", length = 50)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastpasswordresetdate", length = 29)
	public Date getLastpasswordresetdate() {
		return this.lastpasswordresetdate;
	}

	public void setLastpasswordresetdate(Date lastpasswordresetdate) {
		this.lastpasswordresetdate = lastpasswordresetdate;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "usr")
	public UserAuthority getUserAuthority() {
		return this.userAuthority;
	}

	public void setUserAuthority(UserAuthority userAuthority) {
		this.userAuthority = userAuthority;
	}

}
