package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    MathAlgorithms math = new MathAlgorithms();

    @Test
    void testFindHighestCommonDivider() {
        assertEquals(8, math.findHighestCommonDivider(16, 24));
        assertEquals(12, math.findHighestCommonDivider(36, 48));
        assertEquals(9, math.findHighestCommonDivider(27, 9));
        assertEquals(1, math.findHighestCommonDivider(1, 2));
        assertEquals(1, math.findHighestCommonDivider(9, 25));
    }
}