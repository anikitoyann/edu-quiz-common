package com.example.eduquizcommon.service;


import com.example.eduquizcommon.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    Optional<User> findByEmail(String email);

    void save(User user);
}
