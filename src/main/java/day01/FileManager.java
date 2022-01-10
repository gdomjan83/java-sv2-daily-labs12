package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class FileManager {
    private List<Run> runs = new ArrayList<>();

    public double sumDistancesInMonth(int year, int month, Path path) {
        readData(path);
        double sum = 0;
        for (Run r : runs) {
            if (year == r.getDate().getYear() && month == r.getDate().getMonthValue()) {
                sum += r.getDistance();
            }
        }
        double result = Double.parseDouble(String.format(Locale.US, "%.1f", sum));
        return result;
    }

    private void readData(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                runs.add(createRun(line));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        }
    }

    private Run createRun(String line) {
        double distance = Double.parseDouble(splitData(line)[0]);
        LocalDate date = LocalDate.parse(splitData(line)[1]);
        return new Run(distance, date);
    }

    private String[] splitData(String line) {
        return line.split(" km;");
    }

}
