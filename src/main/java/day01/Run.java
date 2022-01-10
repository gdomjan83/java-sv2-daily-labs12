package day01;

import java.time.LocalDate;

public class Run {
    private double distance;
    private LocalDate date;

    public Run(double distance, LocalDate date) {
        this.distance = distance;
        this.date = date;
    }

    public double getDistance() {
        return distance;
    }

    public LocalDate getDate() {
        return date;
    }
}
