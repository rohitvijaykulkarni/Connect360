/*Licensed Materials - 
 Property of IBM
6949 - 67L
  Copyright IBM Corp. 2017, 2018 All Rights Reserved
*/

/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.auth.model.AbacUser;
import com.ibm.gbs.auth.security.service.AbacTokenGenerator;





@RestController
@RequestMapping("/token")
public class TokenController {
	
	private AbacTokenGenerator abacTokenGenerator;

    public TokenController(AbacTokenGenerator abacTokenGenerator) {
        this.abacTokenGenerator = abacTokenGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final AbacUser abacUser) {

        return abacTokenGenerator.generate(abacUser);

    }

}
