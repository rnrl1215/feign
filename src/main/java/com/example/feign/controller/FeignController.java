package com.example.feign.controller;

import com.example.feign.Dto.UserDto;
import com.example.feign.feign.FeignUserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/users")
public class FeignController {

    private final FeignUserClient feignUserClient;

    @GetMapping("/test")
    public ResponseEntity<UserDto> test() {
        ResponseEntity<UserDto> test = feignUserClient.findUserId("123", "test");
        return test;
    }
}

