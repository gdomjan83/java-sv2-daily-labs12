package day01;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class Running {

    public double sumDistancesInMonth(String year, String month, Path path) {
        double sum = 0;
        for (String s : readFile(path)) {
            String[] line = parseLine(s);
            String[] date = parseDate(line[1]);
            String yearFromFile = date[0];
            String monthFromFile = date[1];
            double distance = getDistance(line[0]);
            if (year.equals(yearFromFile) && month.equals(monthFromFile)) {
                sum += distance;
            }
        }

        return Double.parseDouble(String.format(Locale.US, "%.1f", sum));
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        }
    }

    private String[] parseLine(String line) {
        return line.split(";");
    }

    private String[] parseDate(String date) {
        return date.split("-");
    }
    private double getDistance(String input) {
        return Double.parseDouble(input.split(" ")[0]);
    }
}
