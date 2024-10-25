package map.basic;

import java.util.HashMap;
import java.util.Map;

public class ContactAgenda {

    @SuppressWarnings("FieldMayBeFinal")
    private Map<String, Integer> agenda;

    public ContactAgenda() {
        this.agenda = new HashMap<>();
    }

    public void addContact(String name, Integer phoneNumber) {
        agenda.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        if (agenda.isEmpty()) {
            return;
        }
        agenda.remove(name);
    }

    public void showContacts() {
        if (agenda.isEmpty()) {
            return;
        }
        System.out.println(agenda);
    }

    public void searchByName(String name) {
        if (agenda.isEmpty()) {
            return;
        }
        System.out.println(agenda.get(name));
    }

    public static void main(String[] args) {
        ContactAgenda contactAgenda = new ContactAgenda();

        contactAgenda.addContact("Miguel", 1);
        contactAgenda.addContact("Fernando", 2);
        contactAgenda.addContact("Flores", 3);

        contactAgenda.showContacts();

        contactAgenda.removeContact("Miguel");

        contactAgenda.showContacts();

        contactAgenda.searchByName("Flores");
    }
}
