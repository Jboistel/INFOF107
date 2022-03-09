import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguresTest {
   static Figures figures = new Figures();

    @BeforeAll
    static void beforeAll() {
        figures.circle.radius = 2;
        figures.rectangle.length = 3;
        figures.rectangle.width = 2;
        figures.triangle.side_a = 3;
        figures.triangle.side_b = 4;
        figures.triangle.side_c = 5;
        figures.pentagon.side = 2;
    }

    @Test
    void circle_area() {
        double actual_value = figures.circle_area();
        assertEquals(12.566370614359172, actual_value);
    }

    @Test
    void circle_perimeter() {
        double actual_value = figures.circle_perimeter();
        assertEquals(12.566370614359172, actual_value);
    }

    @Test
    void rectangle_area() {
        double actual_value = figures.rectangle_area();
        assertEquals(6, actual_value);
    }

    @Test
    void rectangle_perimeter() {
        double actual_value = figures.rectangle_perimeter();
        assertEquals(10, actual_value);
    }

    @Test
    void triangle_area() {
        double actual_value = figures.triangle_area();
        assertEquals(6, actual_value);
    }

    @Test
    void triangle_perimeter() {
        double actual_value = figures.triangle_perimeter();
        assertEquals(12, actual_value);
    }

    @Test
    void pentagon_area() {
        double actual_value = figures.
    }
}