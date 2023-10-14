package scheduleEvents;

import java.time.LocalDate;
import java.util.*;

public class Scheduler {
    private Map<LocalDate, Event> scheduledEvents;
    public Scheduler() {
        this.scheduledEvents = new HashMap<>();
    }

    public void addEvent(String name, LocalDate date, String attraction) {
        this.scheduledEvents.put(date, new Event(name, attraction));
    }

    public void displaySchedule() {
        Map<LocalDate, Event> events = new TreeMap<>(this.scheduledEvents);
        System.out.println("EVENTS " + events);
    }

    public void getNextEvent() {
        Set<LocalDate> eventData = this.scheduledEvents.keySet();
        Collection<Event> values = this.scheduledEvents.values();
        LocalDate currentDate = LocalDate.now();
        Map<LocalDate, Event> events = new TreeMap<>(this.scheduledEvents);

        for (Map.Entry<LocalDate, Event> entry: events.entrySet()) {
            if (entry.getKey().equals(currentDate) || entry.getKey().isAfter(currentDate)) {
                System.out.println("THE NEXT EVENT: " + entry.getValue() + " WILL BE " + entry.getKey());
                break;
            }
        }
    }
}
