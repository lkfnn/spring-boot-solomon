package org.solomon.controller;

import java.util.List;

import org.solomon.dto.UserDTO;
import org.solomon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 * 
 * @author likf
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public List<UserDTO> findUserList() {
        List<UserDTO> list = userService.findAllUsers();
        return list;
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public void insertUser(UserDTO userDTO) {
        userService.insertUser(userDTO);
    }

    @RequestMapping(value = "/deleteUserById", method = RequestMethod.DELETE)
    public void deleteUserById(Long id) {
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/updatePasswordById", method = RequestMethod.PUT)
    public void updatePasswordById(UserDTO userDTO) {
        userService.updatePasswordById(userDTO);
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public UserDTO getUserById(Long id) {
        return userService.getUserById(id);
    }

}
