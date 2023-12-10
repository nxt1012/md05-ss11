package com.rikkeiacademy.service.user;

import com.rikkeiacademy.model.User;
import com.rikkeiacademy.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}