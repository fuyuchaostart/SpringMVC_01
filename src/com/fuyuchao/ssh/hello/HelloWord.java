package com.fuyuchao.ssh.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author fycstart 邮箱: fycstart@126.com
 * @version 2017年09月27
 *          天变不足畏，祖宗不足法，人言不足恤
 */
@Controller
@RequestMapping(value = "user")
public class HelloWord {
    @RequestMapping(value = "hello", params = {"arg1=123", "agr2=321"}, headers = {"language=zh-CN"})
    public String helloWord() {
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        System.out.println("hello SpringMVC...");
        return "account";
    }

    @RequestMapping("params/id")
    public String paramsTest(@RequestParam(value = "id", required = false, defaultValue = "123") int id) {
        System.out.println(id);
        return "";
    }

    @RequestMapping("pathvariabler/{id}")
    public String getPathVariabler(@PathVariable("id") int id) {
        System.out.println(id);
        return "account";
    }

    @RequestMapping("requestheader")
    public String getHeader(@RequestHeader("Accept-Language") String language) {
        System.out.println(language);
        return "account";
    }

    @RequestMapping("cookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println(cookie);
        return "account";
    }

    @RequestMapping("beanTest")
    public String getBean() {
        return "account";
    }

    @RequestMapping("JOPO")
    public String getBean(User user) {
        System.out.println("-------" + user);
        return "account";
    }

}
