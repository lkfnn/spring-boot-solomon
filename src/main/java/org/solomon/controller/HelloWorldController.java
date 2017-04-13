package org.solomon.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloWorldController
 * 
 * @author likf
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("say", "Hello World");
        return mav;
    }

    @RequestMapping(value = "/say/{say}", method = RequestMethod.GET)
    public String sayHelloWorld(@PathVariable String say) {
        return say;
    }

    @RequestMapping(value = "/listMap", method = RequestMethod.GET)
    public List<LinkedHashMap<String, String>> listMap() {
        List<LinkedHashMap<String, String>> list = new ArrayList<LinkedHashMap<String, String>>();

        LinkedHashMap<String, String> map1 = new LinkedHashMap<String, String>();
        map1.put("id", "1");
        map1.put("name", "张三");
        map1.put("age", "14");
        list.add(map1);

        LinkedHashMap<String, String> map2 = new LinkedHashMap<String, String>();
        map2.put("id", "2");
        map2.put("name", "李四");
        map2.put("age", "18");
        list.add(map2);

        LinkedHashMap<String, String> map3 = new LinkedHashMap<String, String>();
        map3.put("id", "3");
        map3.put("name", "王五");
        map3.put("age", "20");
        list.add(map3);

        return list;
    }

}
