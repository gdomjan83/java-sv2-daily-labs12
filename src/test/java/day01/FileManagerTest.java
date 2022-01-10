package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    FileManager fileManager = new FileManager();

    @Test
    void testSumDistancesInMonth() {
        assertEquals(25.9, fileManager.sumDistancesInMonth(2022, 1, Paths.get("src/test/resources/running.csv")));
    }

    @Test
    void testReadError() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> fileManager.sumDistancesInMonth(2022, 1, Paths.get("src/test/resources/runn11ing.csv")));
        assertEquals("Can not read file.", iae.getMessage());
    }
}