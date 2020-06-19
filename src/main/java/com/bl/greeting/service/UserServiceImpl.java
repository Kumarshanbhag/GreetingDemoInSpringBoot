package com.bl.greeting.service;

import com.bl.greeting.model.User;
import com.bl.greeting.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id, User user) {
        System.out.println("Hello");
        User userUpdates = userRepository.findById(id).get();
        System.out.println(userUpdates.getUsername()+ userUpdates.getEmailid()+ userUpdates.getPassword());
        userUpdates.setUsername(user.getUsername());
        userUpdates.setPassword(user.getPassword());
        userUpdates.setEmailid(user.getEmailid());
        return userRepository.save(userUpdates);
    }
}
