package org.solomon.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HelloWorldController
 * 
 * @author likf
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("index", "Hello Home Page");
        return "/index";
    }

    @RequestMapping(value = "/say/{say}", method = RequestMethod.GET)
    @ResponseBody
    public String sayHelloWorld(@PathVariable String say) {
        return say;
    }

    @RequestMapping(value = "/listMap", method = RequestMethod.GET)
    @ResponseBody
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
