import org.example.CompareNumbers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareNumbersTest {
    @BeforeMethod
    public void Start() {
        System.out.println("Запуск теста сравнения чисел");
    }

    @AfterMethod
    public void Final() {
        System.out.println("Завершение теста сравнения чисел");
    }

    @Test(dataProvider = "compareNumbers", description = "Сравниваем два целых числа")
    public void testCompare(int a, int b, String expected){
        assertEquals(CompareNumbers.compare(a, b), expected);
    }

    @DataProvider
    public static Object[][] compareNumbers(){
        return new Object[][]{
                {8, 7, "a больше чем b"},
                {1, 5, "a меньше чем b"},
                {2, 2, "a равно b"},
                {-6, 5, "a меньше чем b"},
                {0, -2, "a больше чем b"}
        };
    }
}
