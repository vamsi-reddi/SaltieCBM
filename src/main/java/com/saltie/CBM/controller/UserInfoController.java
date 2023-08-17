package com.saltie.CBM.controller;

import com.saltie.CBM.model.UserInfo;
import com.saltie.CBM.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/add")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String addUser(@RequestBody UserInfo userInfo) {

        return userInfoService.addUser(userInfo);
    }

}
