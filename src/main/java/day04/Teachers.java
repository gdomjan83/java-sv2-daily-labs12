package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Teachers {
    public int getLessons(String teacherName, Path path) {
        try {
            List<String> input = Files.readAllLines(path);
            return cummulateLessons(input, teacherName);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        } catch (NumberFormatException nfe) {
            throw new IllegalStateException("Data is not a number.", nfe);
        }
    }

    private int cummulateLessons(List<String> input, String teacherName) {
        int result = 0;
        for (int i = 0; i < input.size(); i += 4) {
            if (teacherName.equals(input.get(i))) {
                result += Integer.parseInt(input.get(i + 3));
            }
        }
        return result;
    }
}
