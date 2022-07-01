package com.abhisu.contentManagemetSystem.serviceImpl;

import com.abhisu.contentManagemetSystem.dto.UserDto;
import com.abhisu.contentManagemetSystem.mapper.UserMapper;
import com.abhisu.contentManagemetSystem.repository.UserRepository;
import com.abhisu.contentManagemetSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDto> getUsers() {
        return userMapper.toUserDtos(userRepository.findAll());
    }
}
