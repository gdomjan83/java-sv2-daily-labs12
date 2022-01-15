package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TeachersTest {
    Teachers teachers = new Teachers();

    @Test
    void testGetLessons() {
        assertEquals(24, teachers.getLessons("Albatrosz Aladin", Paths.get("src/test/resources/beosztas.txt")));
    }

    @Test
    void testGetLessonsFileReadError() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> teachers.getLessons("Albatrosz Aladin", Paths.get("src/test/resources/beoszdfdtas.txt")));
        assertEquals("Can not read file.",iae.getMessage());
    }

//    @Test
//    void testGetLessonsWrongInputFormat() {
//        IllegalStateException ise = assertThrows(IllegalStateException.class,
//                () -> teachers.getLessons("Albatrosz Aladin", Paths.get("src/test/resources/beosztas.txt")));
//        assertEquals("Data is not a number.", ise.getMessage());
//    }
}