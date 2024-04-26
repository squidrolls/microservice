package com.elaine.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
