package labxx.sict.must.edu.mn;

/**
 * Энгийн тооны машин.
 *
 * <p>Дараах үндсэн үйлдлүүдийг дэмжинэ:
 * add, subtract, multiply, divide.</p>
 */
public class Calculator {

  /** a + b */
  public double add(double a, double b) {
    return a + b;
  }

  /** a − b */
  public double subtract(double a, double b) {
    return a - b;
  }

  /** a × b */
  public double multiply(double a, double b) {
    return a * b;
  }

  /**
   * a ÷ b.<br>
   * b = 0 үед {@link IllegalArgumentException} шиднэ.
   */
  public double divide(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
    }
    return a / b;
  }
}
