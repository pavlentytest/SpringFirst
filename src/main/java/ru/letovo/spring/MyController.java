package ru.letovo.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping(path="/")
    public String index() {
        return "index";
    }

    @RequestMapping(path="/about")
    public String about() {
        return "about";
    }

    @GetMapping(path="/hello")
    public String hello(@RequestParam(name="name",required = false,defaultValue = "Ivan") String name, User user) {
        user.setName(name);
        return "hello";
    }

    class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
