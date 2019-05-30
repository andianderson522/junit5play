package junit5play;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@DisplayName("Calculator tests")
final class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  void exists() {
    assertNotNull(this.calculator, "could not construct a calculator");
  }

  @DisplayName("add")
  @Nested
  @TestInstance(PER_CLASS)
  final class add {

    private Calculator calculator;

    @BeforeAll
    void setup() { // does not have to be static as test class is set to PER_CLASS
      this.calculator = new Calculator();
    }

    @DisplayName("simple addition works")
    @Test
    void canAdd() {
      assertEquals(2, this.calculator.add(1, 1));
    }

    @DisplayName("multiple arguments work")
    @Test
    void multipleParameterAddition() {
      assertEquals(3, this.calculator.add(1, 1, 1));
    }

    @DisplayName("handles 0's")
    @Test
    void allZeros() {
      assertEquals(0, this.calculator.add(0, 0, 0, 0));
    }

    @DisplayName("handles negative numbers")
    @Test
    void allNegativeNumbers() {
      assertEquals(-2, this.calculator.add(-1, -1));
    }

    @DisplayName("handles positive, negative and 0s")
    @Test
    void mixedNumbers() {
      assertEquals(1, this.calculator.add(-3, 0, 4, 0));
    }

  }

}
