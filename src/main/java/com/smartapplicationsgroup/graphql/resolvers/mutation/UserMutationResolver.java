package com.smartapplicationsgroup.graphql.resolvers.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.smartapplicationsgroup.graphql.data.User;
import com.smartapplicationsgroup.graphql.dtos.inputs.UserInput;
import com.smartapplicationsgroup.graphql.exceptions.UserNotFoundException;
import com.smartapplicationsgroup.graphql.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private UserService userService;

    /**
     * 
     * @param userRequest
     * @return
     */
    public User createUser(UserInput userInput) {
        return userService.createUser(userInput);
    }

    /**
     * 
     * @param userRequest
     * @return
     * @throws UserNotFoundException
     */
    public User updateUser(Long id, UserInput userInput) {
        return userService.updateUser(id, userInput);
    }
}