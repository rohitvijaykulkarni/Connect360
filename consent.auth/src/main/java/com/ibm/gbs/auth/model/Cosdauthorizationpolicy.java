/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ibm.gbs.util.Constant;

@Entity
@Table(name = "cosdauthorizationpolicy", schema = Constant.SCHEMANAME )
public class Cosdauthorizationpolicy {
	
	private BigDecimal authorizationpolicyid;
	private Cosdauthorizationpolicyset cosdauthorizationpolicyset;
	private Cosdauthorizationgroup cosdauthorizationgroup;
	private String policyComments ;
	
	// authorizationpolicyid , authorizationgroupid , 
	// policysetid ,policyComments
	
	public Cosdauthorizationpolicy() {
	}

	public Cosdauthorizationpolicy(BigDecimal authorizationpolicyid) {
		this.authorizationpolicyid = authorizationpolicyid;
	}
	
	public Cosdauthorizationpolicy(BigDecimal authorizationpolicyid ,Cosdauthorizationpolicyset cosdauthorizationpolicyset , Cosdauthorizationgroup cosdauthorizationgroup ,String policyComments ) {
		
		this.authorizationpolicyid = authorizationpolicyid ;
		this.cosdauthorizationpolicyset =cosdauthorizationpolicyset ;
		this.cosdauthorizationgroup = cosdauthorizationgroup ;
		this.policyComments = policyComments ;
	}
	
	@Id
	@SequenceGenerator(name = "authPolicySeq", sequenceName = "authPolicySeq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="authPolicySeq")
	@Column(name = "authorizationpolicyid", unique = true, nullable = false, scale = 0)	
	public BigDecimal getAuthorizationpolicyid() {
		return authorizationpolicyid;
	}
	public void setAuthorizationpolicyid(BigDecimal authorizationpolicyid) {
		this.authorizationpolicyid = authorizationpolicyid;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "policysetid")
	public Cosdauthorizationpolicyset getCosdauthorizationpolicyset() {
		return cosdauthorizationpolicyset;
	}
	public void setCosdauthorizationpolicyset(Cosdauthorizationpolicyset cosdauthorizationpolicyset) {
		this.cosdauthorizationpolicyset = cosdauthorizationpolicyset;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "authorizationgroupid")
	public Cosdauthorizationgroup getCosdauthorizationgroup() {
		return cosdauthorizationgroup;
	}
	public void setCosdauthorizationgroup(Cosdauthorizationgroup cosdauthorizationgroup) {
		this.cosdauthorizationgroup = cosdauthorizationgroup;
	}
	
	@Column(name = "policyComments", length = 64)
	public String getPolicyComments() {
		return policyComments;
	}
	public void setPolicyComments(String policyComments) {
		this.policyComments = policyComments;
	}
	
	
}
