package com.smartapplicationsgroup.graphql.dtos.inputs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class UserInput {
    
    private String firstName;

    private String email;

    private String lastName;
}
