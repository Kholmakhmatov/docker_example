package kholmakhmatov.docker_example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kholmakhmatov on 14/05/2022 !
 **/
@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello(Model model) {
        System.out.println("hello spring boot");
        model.addAttribute("message", "greetings");
        return "hello";

    }
}

