package pl.klugeradoslaw.winemakersapi.user;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.winemakersapi.user.dto.UserInfoDto;

import java.util.stream.Collectors;

@Service
public class UserDtoMapper {
    static UserInfoDto mapToUserInfoDto(User user) {
         return UserInfoDto.builder()
                 .email(user.getEmail())
                 .password(user.getPassword())
                 //.roles(user.getRole().stream().map(UserRole::getName).collect(Collectors.toList()))
                 .build();
    }
}
