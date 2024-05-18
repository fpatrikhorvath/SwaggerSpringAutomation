package com.automation.regression.stepdef;

import com.automation.regression.TestCore;
import com.automation.regression.service.IUserService;
import com.automation.regression.stores.UserLayerContextStore;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openapitools.model.CreateUser201Response;
import org.openapitools.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserSteps extends TestCore {
    private static final Logger logger = LogManager.getLogger(UserSteps.class);

    public UserSteps(UserLayerContextStore userLayerContextStore) {
        super(userLayerContextStore);
    }


    @Given("create a new user of status {word} and store it as {word} - {}")
    public void createANewUserOfTypeAndStoreItAs(final String statusString, final String id, final HttpStatus httpStatus) {
        User.StatusEnum status = User.StatusEnum.valueOf(statusString);
        //Todo: encapsulation
        User user = new User();
        user.setName("sdfqdq");
        user.setEmail("rsadad@wdqwd.com");
        user.setStatus(status);

        ResponseEntity<CreateUser201Response> response = getUserService().createUser(user);
    }
}
