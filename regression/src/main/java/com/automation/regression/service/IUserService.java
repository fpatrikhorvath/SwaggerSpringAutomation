package com.automation.regression.service;

import com.automation.regression.rest.model.ContextUser;
import org.openapitools.model.CreateUser201Response;
import org.openapitools.model.User;
import org.springframework.http.ResponseEntity;

//@Component
//@ScenarioScope
public interface IUserService {

    ContextUser initContextUser(String contextId, String statusString);

    ResponseEntity<CreateUser201Response> registerUser(User user);
}
