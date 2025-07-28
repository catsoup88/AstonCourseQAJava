import org.example.Arithmetic;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ArithmeticTest {
    @BeforeEach
    void Start() {
        System.out.println("Запуск теста арифметических операций");
    }

    @AfterEach
    void Final() {
        System.out.println("Завершение теста арифметических операций");
    }

    @Test
    @DisplayName("Проверка сложения")
    void testSum() {
        Assertions.assertEquals(2, Arithmetic.sum(1, 1));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testMin() {
        Assertions.assertEquals(1, Arithmetic.minus(7, 6));
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiplication() {
        Assertions.assertEquals(25, Arithmetic.multiply(5, 5));
    }

    @Test
    @DisplayName("Проверка деления")
    void testDivision() {
        Assertions.assertEquals(6.0, Arithmetic.divide(12, 2));
    }

    @Test
    @DisplayName("Деление на ноль вызывает исключение")
    void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Arithmetic.divide(11, 0));
    }

    @ParameterizedTest(name = "Сложение {0} + {1}")
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, -1, -2"})
    void testAdditionWithParameters(int a, int b, int expected) {
        Assertions.assertEquals(expected, Arithmetic.sum(a, b));
    }
}
