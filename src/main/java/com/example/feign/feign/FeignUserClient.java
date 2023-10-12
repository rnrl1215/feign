package com.example.feign.feign;

import com.example.feign.Dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "UserClient", url = "http://localhost:8080/v1/users")
public interface FeignUserClient {
    @PostMapping("/{id}")
    ResponseEntity<UserDto> findUserId(@PathVariable(name = "id") String id, @RequestBody String body);
}
