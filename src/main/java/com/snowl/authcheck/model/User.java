package com.snowl.authcheck.model;

public record User(
    Long id,
    String username,
    String password,
    String email,
    String firstName,
    String lastName,
    String role
) { }
