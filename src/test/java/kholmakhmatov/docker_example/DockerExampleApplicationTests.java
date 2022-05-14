package kholmakhmatov.docker_example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerExampleApplicationTests {
    @Autowired
    WebController webController;

    @Test
    void contextLoads() {
        Assertions.assertThat(webController).isNotNull();
    }

}
