import org.example.Arithmetic;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ArithmeticTest {
    @BeforeMethod
    public void Start() {
        System.out.println("Запуск теста арифметических операций");
    }

    @AfterMethod
    public void Final() {
        System.out.println("Завершение теста арифметических операций");
    }

    @Test(description = "Проверка сложения")
    public void testAddition() {
        assertEquals(Arithmetic.sum(2, 3), 5);
    }

    @Test(description = "Проверка вычитания")
    public void testSubtraction() {
        assertEquals(Arithmetic.minus(3, 2), 1);
    }

    @Test(description = "Проверка умножения")
    public void testMultiplication() {
        assertEquals(Arithmetic.multiply(2, 3), 6);
    }

    @Test(description = "Проверка деления")
    public void testDivision() {
        assertEquals(Arithmetic.divide(4, 2), 2.0);
    }

    @Test(expectedExceptions = ArithmeticException.class, description = "Деление на ноль")
    public void testDivisionByZero() {
        Arithmetic.divide(4, 0);
    }

    @DataProvider
    public static Object[][] arithmetic(){
        return new Object[][]{
                {1, 2, 3},
                {0, 0, 0},
                {-1, -1, -2}
        };
    }

    @Test(dataProvider = "arithmetic", description = "Параметризованный тест сложения")
    public void testAddition(int a, int b, int expected) {
        assertEquals(Arithmetic.sum(a, b), expected);
    }
}
