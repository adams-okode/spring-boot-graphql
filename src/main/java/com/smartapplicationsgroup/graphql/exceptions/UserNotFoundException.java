package com.smartapplicationsgroup.graphql.exceptions;

import java.util.List;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class UserNotFoundException extends RuntimeException implements GraphQLError {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(String message) {
        super(message);
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

}
