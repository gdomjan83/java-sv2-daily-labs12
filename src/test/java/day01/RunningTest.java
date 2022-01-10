package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {
    Running running = new Running();

    @Test
    void testSumDistancesInMonth() {
        assertEquals(25.9, running.sumDistancesInMonth("2022", "01", Paths.get("src/test/resources/running.csv")));
    }

    @Test
    void testReadError() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> running.sumDistancesInMonth("2022", "01", Paths.get("src/test/resources/runn11ing.csv")));
        assertEquals("Can not read file.", iae.getMessage());
    }
}