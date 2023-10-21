package com.example.feign.controller;

import com.example.feign.Dto.UserDto;
import com.example.feign.feign.FeignUserClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.apache.catalina.util.ToStringUtil;
import org.apache.coyote.Request;
import org.apache.coyote.http11.upgrade.UpgradeServletOutputStream;
import org.apache.tomcat.util.descriptor.InputSourceUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/users")
public class UserController {
    @PostMapping("/{id}")
    public ResponseEntity<UserDto> findUserById(@RequestHeader HttpHeaders httpHeaders,
                                                @PathVariable(name = "id") String userId,
                                                @RequestBody(required = false) String body) {
        UserDto dto = new UserDto("test", "name");
        return new ResponseEntity<UserDto>(dto, HttpStatus.OK);
    }
}

