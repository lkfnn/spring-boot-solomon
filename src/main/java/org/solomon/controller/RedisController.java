package org.solomon.controller;

import org.solomon.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RedisController
 * 
 * @author likf
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisKeyValueTemplate redisKeyValueTemplate;

    @RequestMapping(value = "/putString", method = RequestMethod.PUT)
    public void redisPutString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @RequestMapping(value = "/getString", method = RequestMethod.GET)
    public String redisGetString(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @RequestMapping(value = "/insertPerson", method = RequestMethod.PUT)
    public void insertPerson(PersonDTO personDTO) {
        redisKeyValueTemplate.insert(personDTO);
    }

    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public PersonDTO getPersonById(String id) {
        return redisKeyValueTemplate.findById(id, PersonDTO.class);
    }

}
