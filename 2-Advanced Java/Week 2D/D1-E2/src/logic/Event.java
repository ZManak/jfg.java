package logic;

import java.time.LocalDate;

public class Event {
    private String name;
    private LocalDate date;
    private EventCategories category;

    public Event () {
    }

    public Event(String name, LocalDate date, EventCategories category) {
        this.name = name;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public EventCategories getCategory() {
        return category;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCategory(EventCategories category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }


}
