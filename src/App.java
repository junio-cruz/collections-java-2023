import scheduleEvents.Scheduler;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        Scheduler schedulerEvents = new Scheduler();

        schedulerEvents.addEvent("RAP FESTIVAL", LocalDate.of(2023, Month.OCTOBER, 15), "RAP SHOW");
        schedulerEvents.addEvent("LIVE SHOW", LocalDate.of(2023, Month.OCTOBER, 15), "FELIPE RET");
        schedulerEvents.addEvent("TECH FESTIVAL", LocalDate.of(2023, Month.OCTOBER, 15), "BUZZY PY TECH");

        schedulerEvents.displaySchedule();
        schedulerEvents.getNextEvent();
    }
}