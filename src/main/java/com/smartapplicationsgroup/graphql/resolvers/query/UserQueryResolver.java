package com.smartapplicationsgroup.graphql.resolvers.query;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.smartapplicationsgroup.graphql.data.User;
import com.smartapplicationsgroup.graphql.exceptions.UserNotFoundException;
import com.smartapplicationsgroup.graphql.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private UserService userService;

    /**
     * 
     * @param id
     * @return
     * @throws UserNotFoundException
     */
    public User findOneUser(Long id) throws UserNotFoundException {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * 
     * @param id
     * @return
     */
    public Boolean deleteUser(Long id) {
        return userService.deleteUser(id);
    }

}