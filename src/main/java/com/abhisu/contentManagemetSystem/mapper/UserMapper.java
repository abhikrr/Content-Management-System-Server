package com.abhisu.contentManagemetSystem.mapper;

import com.abhisu.contentManagemetSystem.dto.UserDto;
import com.abhisu.contentManagemetSystem.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface UserMapper {

    User toUser(UserDto userDto);
    List<User> toUsers(List<UserDto> userDtos);
    UserDto toUserDto(User user);
    List<UserDto> toUserDtos(List<User> users);
}
