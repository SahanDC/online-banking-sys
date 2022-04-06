package org.trb.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.trb.model.User;
import org.trb.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}