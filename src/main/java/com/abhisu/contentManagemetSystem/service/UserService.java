package com.abhisu.contentManagemetSystem.service;

import com.abhisu.contentManagemetSystem.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    List<UserDto> getUsers();
}
