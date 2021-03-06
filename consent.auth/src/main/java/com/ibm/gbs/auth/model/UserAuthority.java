/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.model;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ibm.gbs.util.Constant;
/**
 * UserAuthority generated by hbm2java
 */
@Entity
@Table(name = "user_authority", schema = Constant.SCHEMANAME )
public class UserAuthority implements java.io.Serializable {

	private int userId;
	private Authority authority;
	private Usr usr;

	public UserAuthority() {
	}

	public UserAuthority(Usr usr) {
		this.usr = usr;
	}

	public UserAuthority(Authority authority, Usr usr) {
		this.authority = authority;
		this.usr = usr;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "usr"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "authority_id")
	public Authority getAuthority() {
		return this.authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Usr getUsr() {
		return this.usr;
	}

	public void setUsr(Usr usr) {
		this.usr = usr;
	}

}
