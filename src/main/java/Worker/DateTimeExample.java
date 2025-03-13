package Worker;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
* LocalDate: Represents a date without time (year, month, day).
* LocalTime: Represents a time without date (hours, minutes, seconds).
* LocalDateTime: Represents both date and time without time zone.
* Instant: Represents a timestamp in UTC.
* ZonedDateTime: Represents a date and time with a specific time zone.
* */

public class DateTimeExample {
    public static void main(String[] args) {
        // LocalDate - Represents a date without time
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // LocalTime - Represents a time without date
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // LocalDateTime - Represents a date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // ZonedDateTime - Represents a date and time with time zone
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current date and time in New York: " + currentZonedDateTime);

        // Parsing date-time string
        String dateTimeString = "2024-02-22T15:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString);
        System.out.println("Parsed date-time: " + parsedDateTime);

        // Formatting date-time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date-time: " + formattedDateTime);

        // Adding/subtracting days to a date
        LocalDate futureDate = currentDate.plus(7, ChronoUnit.DAYS);
        System.out.println("Date after adding 7 days: " + futureDate);

        // Period - Represents a date-based amount of time
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthday, now);
        System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months");

        // Duration - Represents a time-based amount of time
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 30);
        Duration workHours = Duration.between(startTime, endTime);
        System.out.println("Work hours: " + workHours.toHours() + " hours " + workHours.toMinutesPart() + " minutes");
    }
}

