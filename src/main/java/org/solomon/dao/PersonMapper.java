package org.solomon.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.solomon.dto.UserDTO;

/**
 * PersonMapper
 * 
 * @author likf
 *
 */
@Mapper
public interface PersonMapper {

    Integer insertUser(UserDTO userDTO);

    Integer deleteUserById(Long id);

    Integer updatePasswordById(UserDTO userDTO);

    UserDTO getUserById(Long id);

    List<UserDTO> findAllUsers();

}
