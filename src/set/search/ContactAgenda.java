package set.search;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ContactAgenda {

    @SuppressWarnings("FieldMayBeFinal")
    private Set<Contact> contacts;

    public ContactAgenda() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void showContacts() {
        contacts.forEach(c -> System.out.println("Name: " + c.getName() + " | Phone: " + c.getPhoneNumber()));
    }

    public Set<Contact> searchByName(String name) {
        return contacts.stream().filter(c -> c.getName().equalsIgnoreCase(name)).collect(Collectors.toSet());
    }

    public void updatePhoneContact(String name, String number) {
        Optional<Contact> aux = contacts.stream().filter(c -> c.getName().equalsIgnoreCase(name)).findFirst();
        if (aux.isEmpty()) {
            return;
        }
        for (Contact contact : contacts) {
            if (aux.get().getName().equalsIgnoreCase(contact.getName())) {
                contact.setPhoneNumber(number);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ContactAgenda contacts = new ContactAgenda();

        contacts.addContact("Miguel", "+55(61)994304737");

        contacts.showContacts();

        System.out.println(contacts.searchByName("Miguel"));

        contacts.updatePhoneContact("Miguel", "61981457250");
        
        contacts.showContacts();
    }

}
