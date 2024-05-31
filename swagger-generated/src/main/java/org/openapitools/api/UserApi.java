/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.openapitools.model.GenericErrorResponse;

import org.openapitools.model.CreateUser201ResponseDTO;
import org.openapitools.model.CreateUserRequestDTO;
import org.openapitools.model.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
    public interface UserApi {

        /**
        * POST /users : Create a user
        *
            * @param createUserRequestDTO  (required)
        * @return User created successfully (status code 201)
        */
        ResponseEntity<CreateUser201ResponseDTO> createUser(
         @RequestBody CreateUserRequestDTO createUserRequestDTO
        );

        /** Negative
        * POST /users : Create a user
        *
            * @param createUserRequestDTO  (required)
        * @return User created successfully (status code 201)
        */
        ResponseEntity
        <GenericErrorResponse> createUserNeg(
         @RequestBody CreateUserRequestDTO createUserRequestDTO
            );


        /**
        * DELETE /users/{userId} : Delete a user
        *
            * @param userId ID of the user to delete (required)
        * @return User deleted successfully (status code 204)
        */
        ResponseEntity<Void> deleteUser(
         @PathVariable("userId") Long userId
        );

        /** Negative
        * DELETE /users/{userId} : Delete a user
        *
            * @param userId ID of the user to delete (required)
        * @return User deleted successfully (status code 204)
        */
        ResponseEntity
        <GenericErrorResponse> deleteUserNeg(
         @PathVariable("userId") Long userId
            );


        /**
        * GET /users : Get all users
        *
        * @return List of users (status code 200)
        */
        ResponseEntity<List<UserDTO>> getUsers(
        
        );

        /** Negative
        * GET /users : Get all users
        *
        * @return List of users (status code 200)
        */
        ResponseEntity
        <GenericErrorResponse> getUsersNeg(
        
            );

        }
