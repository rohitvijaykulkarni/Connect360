/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/

/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.security.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.DelegatingFilterProxyRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.google.gson.Gson;
import com.ibm.gbs.auth.model.User360;
import com.ibm.gbs.auth.model.Users;


public class AbacAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter{

	private boolean postOnly = true;
	
  
	
	public AbacAuthenticationTokenFilter() {
	        super("/rest/**");
	    }
	 
	
	 @Override
	 public Authentication attemptAuthentication(HttpServletRequest request,
				HttpServletResponse response) throws AuthenticationException, IOException {
			if (postOnly && !request.getMethod().equals("POST")) {
				throw new AuthenticationServiceException(
						"Authentication method not supported: " + request.getMethod());
			}
			BufferedReader reader = request.getReader();
			Gson gson = new Gson();

			Users user = gson.fromJson(reader, Users.class); 

			String username = user.getUsername();
			String password = user.getPassword();

			if (username == null) {
				username = "";
			}

			if (password == null) {
				password = "";
			}

			username = username.trim();

			UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
					username, password);
			
			/*UserDetailsServiceImpl userdetailsserviceimpl = new UserDetailsServiceImpl();
			//UserDetails userdetails = userdetailsserviceimpl.loadUserByUsername(username); */
			// Allow subclasses to set the "details" property
			AbacTokenGenerator abtoken = new AbacTokenGenerator();
			User360 user360 = new User360();
			user360.setUsername(username);
			user360.setPassword(password);
			String key = abtoken.generate(user360);
			
			 //String s = "rohit" ;
		
			
			 System.out.println(":: Generated Key ::" + key );
			 Cookie ck= new Cookie("JwtToknen",key); 
		     HttpSession session = request.getSession() ;
		     session.setMaxInactiveInterval(70*60);
		     
		     session.setAttribute("Username", username);
		     session.setAttribute("Password", password);
		        
		     System.out.println("@@## After Cookies -" + username + "--" + password);
		     response.addCookie(ck);

			// Allow subclasses to set the "details" property
			setDetails(request, authRequest);

			return this.getAuthenticationManager().authenticate(authRequest);
		}
	 
	 protected void setDetails(HttpServletRequest request,
				UsernamePasswordAuthenticationToken authRequest) {
			authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
		}
	
	 
/*	 @Override
	 protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
	        super.successfulAuthentication(request, response, chain, authResult);
	        System.out.println("authResult.getName():" + authResult.getName());
	        chain.doFilter(request, response);
	    }*/
	
		
}

	

