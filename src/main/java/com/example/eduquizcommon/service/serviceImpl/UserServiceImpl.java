package com.example.eduquizcommon.service.serviceImpl;
import com.example.eduquizcommon.entity.User;
import com.example.eduquizcommon.repository.UserRepository;
import com.example.eduquizcommon.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
