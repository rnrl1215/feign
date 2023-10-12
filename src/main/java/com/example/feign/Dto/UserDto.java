package com.example.feign.Dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.service.annotation.GetExchange;

@Getter
public class UserDto {
    private String id;
    private String name;

    public UserDto() {
    }

    public UserDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
