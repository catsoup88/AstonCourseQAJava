import org.example.TriangleSquare;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TriangleSquareTest {
    @BeforeEach
    void Start() {
        System.out.println("Запуск теста площади треугольника");
    }

    @AfterEach
    void Final() {
        System.out.println("Завершение теста площади треугольника");
    }

    @Test
    @DisplayName("Площадь треугольника со сторонами 3, 4, 5")
    void Triangle() {
        Assertions.assertEquals(6.0, TriangleSquare.square(3, 4, 5));
    }

    @DisplayName("Получаем площадь треугольника для параметров")
    @ParameterizedTest(name = "Площадь для сторон {0}, {1}, {2}")
    @MethodSource("TriangleSquare")
    public void testTriangleSquareWithParameters(double param1, double param2, double param3, double expected) {
        if (param1 <= 0 || param2 <= 0 || param3 <= 0 ) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleSquare.square(param1, param2, param3));
        } else {
            Assertions.assertEquals(expected, TriangleSquare.square(param1, param2, param3));
        }
    }

    static Stream<Arguments> TriangleSquare() {
        return Stream.of(
                arguments(3, 4, 5, 6.0),
                arguments(6, 5, 5, 12.0),
                arguments(1, -1, 8, 0.0)
        );
    }
}
