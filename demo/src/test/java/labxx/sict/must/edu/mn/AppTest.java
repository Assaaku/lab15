package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Calculator классын 100 % branch coverage‑тай тест.
 */
class CalculatorTest {

  private final Calculator calc = new Calculator();

  // --- add ----------------------------------------------------------

  @Test
  @DisplayName("add: эерэг тоо")
  void testAddPositive() {
    assertEquals(5.0, calc.add(2.0, 3.0));
  }

  @Test
  @DisplayName("add: сөрөг тоо")
  void testAddNegative() {
    assertEquals(-1.0, calc.add(2.0, -3.0));
  }

  // --- subtract -----------------------------------------------------

  @Test
  @DisplayName("subtract: энгийн")
  void testSubtract() {
    assertEquals(4.0, calc.subtract(7.0, 3.0));
  }

  // --- multiply -----------------------------------------------------

  @Test
  @DisplayName("multiply: тэгээр үржүүлэх")
  void testMultiplyZero() {
    assertEquals(0.0, calc.multiply(123.45, 0.0));
  }

  // --- divide -------------------------------------------------------

  @Test
  @DisplayName("divide: хэвийн хуваах")
  void testDivideNormal() {
    assertEquals(2.5, calc.divide(5.0, 2.0));
  }

  @Test
  @DisplayName("divide: тэгээр хуваахад exception")
  void testDivideByZero() {
    assertThrows(IllegalArgumentException.class, () -> calc.divide(1.0, 0.0));
  }
}
