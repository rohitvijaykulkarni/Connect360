/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.security.service;

import com.ibm.gbs.auth.model.Users;

public interface UserService {
    void save(Users user);

    Users findByUsername(String username);
}
