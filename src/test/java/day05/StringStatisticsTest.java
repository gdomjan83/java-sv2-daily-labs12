package day05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;


class StringStatisticsTest {
    StringStatistics stringStatistics = new StringStatistics();

    @Test
    void testCountCharacter() {
        String input = "automata";
        Map<Character, Integer> result = stringStatistics.countCharacters(input);
        assertEquals(1, result.get('m'));
        assertEquals(3, result.get('a'));
        assertEquals(2, result.get('t'));
        assertEquals(1, result.get('u'));
        assertEquals(1, result.get('o'));
    }
}