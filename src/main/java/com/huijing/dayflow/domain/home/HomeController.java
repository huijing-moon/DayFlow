package com.huijing.dayflow.domain.home;

import com.huijing.dayflow.domain.home.dto.HomeResponseDto;
import com.huijing.dayflow.global.auth.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home")
public class HomeController {

    private final HomeService homeService;

//    @GetMapping
//    public HomeResponseDto getHome(
//            @AuthenticationPrincipal CustomUserDetails userDetails
//    ) {
//        return homeService.getHomeData(userDetails.getUser());
//    }
}
