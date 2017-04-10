package org.solomon.service;

import java.util.List;

import org.solomon.dao.PersonMapper;
import org.solomon.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 * 
 * @author likf
 */
@Service
public class UserService {

    @Autowired
    private PersonMapper personMapper;

    public void insertUser(UserDTO userDTO) {
        personMapper.insertUser(userDTO);
    }

    public void deleteUserById(Long id) {
        personMapper.deleteUserById(id);
    }

    public void updatePasswordById(UserDTO userDTO) {
        personMapper.updatePasswordById(userDTO);
    }

    public UserDTO getUserById(Long id) {
        return personMapper.getUserById(id);
    }

    public List<UserDTO> findAllUsers() {
        return personMapper.findAllUsers();
    }

}
