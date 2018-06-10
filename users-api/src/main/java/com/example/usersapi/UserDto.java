package com.example.usersapi;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.*;
import javax.validation.constraints.*;

public class UserDto {
    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    private String email;
}
