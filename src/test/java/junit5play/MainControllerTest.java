package junit5play;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import com.condenasat.junit5play.Application;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = {Application.class})
public class MainControllerTest {

  @LocalServerPort
  private Integer port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void greetingShouldReturnDefaultMessage() throws Exception {
    System.out.println("PORT: " + this.port); // FIXME remove or make log statement
    assertTrue(this.restTemplate.getForObject("/", String.class).contains("Hello Controller"));
  }


}
