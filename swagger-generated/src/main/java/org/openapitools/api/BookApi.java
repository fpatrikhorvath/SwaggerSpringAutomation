/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.openapitools.model.GenericErrorResponse;

import org.openapitools.model.BookDTO;
import org.openapitools.model.CreateBookForUser404ResponseDTO;
import org.openapitools.model.CreateBookForUserRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
    public interface BookApi {

        /**
        * POST /users/{userId}/books : Create a book for a user
        *
            * @param userId ID of the user to create a book for (required)
            * @param createBookForUserRequestDTO  (required)
        * @return Book created successfully (status code 201)
            *         or User not found (status code 404)
            *         or Internal error (status code 500)
        */
        ResponseEntity<BookDTO> createBookForUser(
         @PathVariable("userId") Long userId,
         @RequestBody CreateBookForUserRequestDTO createBookForUserRequestDTO
        );

        /** Negative
        * POST /users/{userId}/books : Create a book for a user
        *
            * @param userId ID of the user to create a book for (required)
            * @param createBookForUserRequestDTO  (required)
        * @return Book created successfully (status code 201)
            *         or User not found (status code 404)
            *         or Internal error (status code 500)
        */
        ResponseEntity
        <GenericErrorResponse> createBookForUserNeg(
         @PathVariable("userId") Long userId,
         @RequestBody CreateBookForUserRequestDTO createBookForUserRequestDTO
            );


        /**
        * DELETE /users/{userId}/books/{bookId} : Delete a book for a user
        *
            * @param userId ID of the user to delete a book from (required)
            * @param bookId ID of the book to delete (required)
        * @return Book deleted successfully (status code 204)
        */
        ResponseEntity<Void> deleteBookForUser(
         @PathVariable("userId") Long userId,
         @PathVariable("bookId") Long bookId
        );

        /** Negative
        * DELETE /users/{userId}/books/{bookId} : Delete a book for a user
        *
            * @param userId ID of the user to delete a book from (required)
            * @param bookId ID of the book to delete (required)
        * @return Book deleted successfully (status code 204)
        */
        ResponseEntity
        <GenericErrorResponse> deleteBookForUserNeg(
         @PathVariable("userId") Long userId,
         @PathVariable("bookId") Long bookId
            );


        /**
        * GET /users/{userId}/books : Get all books for a user
        *
            * @param userId ID of the user to get books for (required)
        * @return List of books for the user (status code 200)
        */
        ResponseEntity<List<BookDTO>> getBooksForUser(
         @PathVariable("userId") Long userId
        );

        /** Negative
        * GET /users/{userId}/books : Get all books for a user
        *
            * @param userId ID of the user to get books for (required)
        * @return List of books for the user (status code 200)
        */
        ResponseEntity
        <GenericErrorResponse> getBooksForUserNeg(
         @PathVariable("userId") Long userId
            );

        }
