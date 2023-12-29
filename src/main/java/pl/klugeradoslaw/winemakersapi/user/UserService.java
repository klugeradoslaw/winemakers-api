package pl.klugeradoslaw.winemakersapi.user;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.winemakersapi.user.dto.UserInfoDto;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserInfoDto> findUserInfoByEmail(String email) {
        return userRepository.findByEmail(email).map(UserDtoMapper::mapToUserInfoDto);

    }
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
