import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(2,2));
        assertEquals(3,Calculator.add(2,2),"Es geht mir gut ");
    }

    @Test
    void multiply() {
                assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                        () -> assertEquals(-4, Calculator.multiply(2, -2)),
                        () -> assertEquals(4, Calculator.multiply(-2, -2)),
                        () -> assertEquals(0, Calculator.multiply(1, 0)));}
    @Test
    void ntest(){

        assertNotEquals(5, Calculator.add(2,2));
        assertNotEquals(6, Calculator.add(2,2));


    }












}