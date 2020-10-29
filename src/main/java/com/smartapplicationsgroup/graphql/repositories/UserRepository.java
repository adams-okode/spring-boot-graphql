package com.smartapplicationsgroup.graphql.repositories;

import com.smartapplicationsgroup.graphql.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
