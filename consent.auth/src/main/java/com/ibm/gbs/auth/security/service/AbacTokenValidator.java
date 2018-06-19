/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.security.service;

import org.springframework.stereotype.Component;

import com.ibm.gbs.auth.model.AbacUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;


@Component
public class AbacTokenValidator {
	
	private String secret = "sinu";
	
	public AbacUser validate(String token){
		
		AbacUser abacUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            abacUser = new AbacUser();

            abacUser.setUserName(body.getSubject());
            abacUser.setId(Long.parseLong((String) body.get("userId")));
            abacUser.setRole((String) body.get("role"));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return abacUser; 
	}

}
