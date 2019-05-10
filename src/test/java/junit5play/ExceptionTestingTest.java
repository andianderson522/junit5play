package junit5play;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.condenasat.junit5play.Application;
import com.condenasat.junit5play.ExceptionThrower;

@SpringBootTest(classes = {Application.class})
final class ExceptionTestingTest {

  @Test
  @DisplayName("@Person#insert()")
  void assertThrowsE() {
    final ExceptionThrower et = new ExceptionThrower();
    final Throwable thrown = assertThrows(UnsupportedOperationException.class,
        () -> et.throwsAnException(), "Expected doThing() to throw, but it didn't");
    assertThat(thrown.getMessage(), equalTo("Testing"));
  }

  @Test
  void assertThrowsException() {
    final String str = null;
    assertThrows(IllegalArgumentException.class, () -> {
      Integer.valueOf(str);
    });
  }

  @Test
  void shouldThrowException() {
    final Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
      throw new UnsupportedOperationException("Not supported");
    });
    assertEquals(exception.getMessage(), "Not supported");
  }

}
