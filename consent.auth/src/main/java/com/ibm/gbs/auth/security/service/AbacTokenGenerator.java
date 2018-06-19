/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.security.service;

import org.springframework.stereotype.Component;

import com.ibm.gbs.auth.model.AbacUser;
import com.ibm.gbs.auth.model.User360;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class AbacTokenGenerator {
	
	public String generate(AbacUser abacUser) {

		System.out.println("@@ Received data ::" + abacUser.getId() + ": Role :"  + abacUser.getRole());

        Claims claims = Jwts.claims()
                .setSubject(abacUser.getUserName());
        claims.put("userId", String.valueOf(abacUser.getId()));
        claims.put("role", abacUser.getRole());


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "sinu")
                .compact();
        
    }
	
	public String generate(User360 user) {

		System.out.println("@@ Received data :: User ::" + user.getUsername()+ ": Password :"  + user.getPassword());

        Claims claims = Jwts.claims()
                .setSubject(user.getUsername());
        claims.put("username", String.valueOf(user.getUsername()));
       // claims.put("role", abacUser.getRole()); 


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "sinu")
                .compact();
        
    }

}
