package org.solomon.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * UserDTO
 * 
 * @author likf
 *
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 7698862379923111158L;
    private Long id;
    private String username;
    private String password;

}
