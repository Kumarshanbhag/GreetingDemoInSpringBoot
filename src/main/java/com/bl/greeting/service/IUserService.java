package com.bl.greeting.service;

import com.bl.greeting.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    public List<User> getAllUser();
}