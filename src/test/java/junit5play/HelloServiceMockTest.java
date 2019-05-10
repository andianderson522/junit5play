package junit5play;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.condenasat.junit5play.Application;
import com.condenasat.junit5play.HelloRepository;
import com.condenasat.junit5play.HelloService;
import com.condenasat.junit5play.HelloServiceImpl;

@SpringBootTest(classes = {Application.class})
final class HelloServiceMockTest {

  @Mock
  private HelloRepository helloRepository;

  @InjectMocks // auto inject helloRepository
  private final HelloService helloService = new HelloServiceImpl();

  @BeforeEach
  void setMockOutput() {
    when(this.helloRepository.get()).thenReturn("Hello Mockito From Repository");
  }

  @DisplayName("Test Mock helloService + helloRepository")
  @Test
  void testGet() {
    assertEquals("Hello Mockito From Repository", this.helloService.get());
  }
}
