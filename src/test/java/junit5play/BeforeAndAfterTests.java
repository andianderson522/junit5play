package junit5play;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public final class BeforeAndAfterTests {

  @BeforeAll
  static void setup() {
    System.out.println("@BeforeAll - executes once before all test methods in this class");
  }

  @BeforeEach
  void init() {
    System.out.println("@BeforeEach - executes before each test method in this class");
  }

  @AfterEach
  void tearDown() {
    System.out.println("@AfterEach - executed after each test method.");
  }

  @AfterAll
  static void done() {
    System.out.println("@AfterAll - executed after all test methods.");
  }

  @DisplayName("Single test successful")
  @Test
  void testSingleSuccessTest() {
    System.out.println("Success");
  }

  @Test
  @Disabled("Not implemented yet")
  void testShowSomething() {
  }

  @Test
  void anotherTest() {
    System.out.println("another success"); // FIXME remove or make log statement
  }

}
