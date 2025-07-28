import org.example.CompareNumbers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CompareNumbersTest {
    @BeforeEach
    void Start() {
        System.out.println("Запуск теста сравнения чисел");
    }

    @AfterEach
    void Final() {
        System.out.println("Завершение теста сравнения чисел");
    }

    @ParameterizedTest
    @MethodSource("compareNumbersData")
    public void testCompareWithParameters(int a, int b, String expected){
        Assertions.assertEquals(expected, CompareNumbers.compare(a, b));
    }

    static Stream<Arguments> compareNumbersData(){
        return Stream.of(
                arguments(10, 2, "a больше чем b"),
                arguments(1, 6, "a меньше чем b"),
                arguments(2, 2, "a равно b"),
                arguments(-7, 2, "a меньше чем b"),
                arguments(6, -1, "a больше чем b")
        );
    }
}
