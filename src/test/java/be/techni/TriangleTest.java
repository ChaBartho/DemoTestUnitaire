package be.techni;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    public void testerEquilateral() {
        assertEquals("équilatéral", triangle.validerTriangle(3, 3, 3));
    }
    @Test
    public void testerIso() {
        assertEquals("isocèle", triangle.validerTriangle(3, 3, 4));
    }
    @Test
    public void testerQuelconque() {
        assertEquals("quelconque", triangle.validerTriangle(3, 4, 5));
    }
    @Test
    public void testNegativeSide() {
     assertEquals("invalide", triangle.validerTriangle(-6, 6, 6));
    }
    @Test
    public void testInvalidTriangle() {
      assertEquals("invalide", triangle.validerTriangle(1, 2, 3));
    }

}
