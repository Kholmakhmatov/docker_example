package kholmakhmatov.docker_example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kholmakhmatov on 14/05/2022 !
 **/
@RestController
public class WebServicesController {
        @GetMapping("/rest")
        public String sayRest() {
            return "hello Anvar";
        }
}
