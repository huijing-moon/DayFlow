package com.huijing.dayflow.global.auth;

import com.huijing.dayflow.global.auth.dto.LoginRequest;
import com.huijing.dayflow.global.auth.dto.LoginResponse;
import com.huijing.dayflow.global.auth.dto.SignupRequest;
import com.huijing.dayflow.global.auth.dto.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public void signUp(@RequestBody SignupRequest request) {
        authService.signup(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        String token = authService.login(request);
        return new LoginResponse(token);
    }

}
