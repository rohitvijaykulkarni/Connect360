/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.security.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
