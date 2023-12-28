package pl.klugeradoslaw.winemakersapi.user.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserInfoDto {
    private final String email;
    private final String password;
    private final List<String> roles;

    public UserInfoDto(String email, String password, List<String> roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}

