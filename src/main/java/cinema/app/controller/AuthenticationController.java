package cinema.app.controller;

import cinema.app.dto.request.UserRequestDto;
import cinema.app.dto.response.UserResponseDto;
import cinema.app.model.User;
import cinema.app.service.AuthenticationService;
import cinema.app.service.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    private final UserMapper userMapper;

    public AuthenticationController(AuthenticationService authService, UserMapper userMapper) {
        this.authService = authService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register-user")
    public UserResponseDto registerUser(@RequestBody @Valid UserRequestDto requestDto) {
        User user = authService.registerUser(requestDto.getEmail(), requestDto.getPassword());
        return userMapper.mapToDto(user);
    }

    @PostMapping("/register-admin")
    public UserResponseDto registerAdmin(@RequestBody @Valid UserRequestDto requestDto) {
        User user = authService.registerAdmin(requestDto.getEmail(), requestDto.getPassword());
        return userMapper.mapToDto(user);
    }
}
