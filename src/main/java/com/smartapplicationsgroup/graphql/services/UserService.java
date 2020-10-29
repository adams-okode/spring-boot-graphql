package com.smartapplicationsgroup.graphql.services;

import java.util.List;

import com.smartapplicationsgroup.graphql.data.User;
import com.smartapplicationsgroup.graphql.dtos.inputs.UserInput;
import com.smartapplicationsgroup.graphql.exceptions.UserNotFoundException;
import com.smartapplicationsgroup.graphql.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Get User By Id
     * 
     * @param id
     * @return
     */
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    /**
     * 
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * 
     * @param userRequest
     * @return
     */
    public User createUser(UserInput userInput) {
        User user = new User();
        user.setEmail(userInput.getEmail());
        user.setFirstName(userInput.getFirstName());
        userRepository.save(user);
        return user;
    }

    /**
     * Update User Entity
     * 
     * @param id
     * @param userInput
     * @return
     * @throws UserNotFoundException
     */
    public User updateUser(Long id, UserInput userInput) throws UserNotFoundException {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            throw new UserNotFoundException("User Cannot Be found");
        }
        user.setEmail(userInput.getEmail());
        user.setFirstName(userInput.getFirstName());
        userRepository.save(user);
        return user;
    }

    /**
     * Delete the user via Id
     * 
     * @param id
     */
    public Boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }

}
