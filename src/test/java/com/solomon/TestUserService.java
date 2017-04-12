package com.solomon;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.solomon.dto.UserDTO;
import org.solomon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Log
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testfindAllUsers() {

        List<UserDTO> list = userService.findAllUsers();
        log.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
    }

}
