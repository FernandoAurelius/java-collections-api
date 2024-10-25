package map.sort;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class EventAgenda {

    @SuppressWarnings("FieldMayBeFinal")
    private Map<LocalDate, Event> events;

    public EventAgenda() {
        this.events = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String eventAttraction) {
        events.put(date, new Event(name, eventAttraction));
    }

    public void showAgenda() {
        System.out.println(events);
    }

    public Event getClosestEvent() {
        if (events.isEmpty()) {
            return null;
        }
        Event event = new Event("", "");
        int daysToEvent = 99999;
        for (Map.Entry<LocalDate, Event> entry : events.entrySet()) {
            if (entry.getKey().datesUntil(LocalDate.now()).toList().size() < daysToEvent) {
                daysToEvent = entry.getKey().datesUntil(LocalDate.now()).toList().size();
                event = entry.getValue();
            }
        }
        return event;
    }

    public static void main(String[] args) {
        EventAgenda eventAgenda = new EventAgenda();

        eventAgenda.addEvent(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia",
                "Palestrante renomado");
        eventAgenda.addEvent(LocalDate.of(2022, 7, 9), "Workshop de Programação",
                "Aula prática de desenvolvimento");
        eventAgenda.addEvent(LocalDate.of(2000, 1, 10), "Lançamento de Software",
                "Demonstração da nova versão");
        eventAgenda.addEvent(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação",
                "Competição de soluções criativas");
        eventAgenda.addEvent(LocalDate.of(2024, 9, 20),
                "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        eventAgenda.showAgenda();

        System.out.println(eventAgenda.getClosestEvent());
    }

}
