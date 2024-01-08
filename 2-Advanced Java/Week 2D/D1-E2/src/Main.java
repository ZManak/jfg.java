import logic.Event;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static logic.EventCategories.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Event> events = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        events.add(new Event("Team meeting", LocalDate.parse("01/01/2024", formatter), MEETING));
        events.add(new Event("Jose evaluation", LocalDate.parse("02/01/2024", formatter), MEETING));
        events.add(new Event("Team building", LocalDate.parse("10/03/2024", formatter), WORKSHOP));
        events.add(new Event("Relevant milestones in Industry", LocalDate.parse("15/03/2024", formatter), CONFERENCE));
        events.add(new Event("Java 8 features", LocalDate.parse("15/03/2024", formatter), WORKSHOP));

        System.out.println("Events for day 10/03/2024: ");
        events.stream()
            .filter(e -> e.getDate().equals(LocalDate.parse("10/03/2024", formatter)))
            .forEach(e -> System.out.println(e.getName()));

        System.out.println("Events grouped by category: ");
        events.stream()
            .collect(Collectors.groupingBy(Event::getCategory))
            .forEach((k, v) -> System.out.println(k + ": " + v.size()));

        System.out.println("Closest event: ");
        Optional<Event> closestEvent = events.stream()
            .min((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
        closestEvent.ifPresent(e -> System.out.println(e.getName()));

    }
}
