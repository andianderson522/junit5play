package junit5play;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.condenasat.junit5play.Application;
import com.condenasat.junit5play.HelloService;

@SpringBootTest(classes = {Application.class})
class HelloServiceTest {

  @Autowired
  HelloService helloService;

  @DisplayName("Test Spring @Autowired Integration")
  @Test
  void testGet() {
    assertEquals("Hello JUnit 5", this.helloService.get());
  }

}
