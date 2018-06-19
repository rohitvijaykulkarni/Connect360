/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class AbacAuthenticationToken extends UsernamePasswordAuthenticationToken{

	private String token;
	
	public AbacAuthenticationToken(String token) {
		super(null, null);
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public Object getPrincipal() {
		return null;
	}
	@Override
	public Object getCredentials() {
		return null;
	}

}
