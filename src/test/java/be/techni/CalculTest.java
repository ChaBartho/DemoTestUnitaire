package be.techni;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalculTest {
    private Calcul calcul = new Calcul();
    @Test
    void testerSiLeCalculDeLaSommeEstValide(){
        //Arrange
        int a = 5, b = 7;
        int expected = 12;
        //Act
        int result = calcul.somme(a, b);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void testerDivisionParZero_Invalide(){
        //Arrange
        int a = 10, b = 0;
        //Assert
        assertThrows(NumberFormatException.class, () -> {
            //Act
            calcul.division(a, b);
        });
    }
}
