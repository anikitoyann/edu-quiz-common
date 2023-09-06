package com.example.eduquizcommon.mapper.mapper;
import com.example.eduquizcommon.dto.CreateUserRequestDto;
import com.example.eduquizcommon.dto.UserDto;
import com.example.eduquizcommon.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(CreateUserRequestDto dto);

    UserDto mapToDto(User entity);

}