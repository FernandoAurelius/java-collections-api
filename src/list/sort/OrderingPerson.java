package list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingPerson {
    @SuppressWarnings("FieldMayBeFinal")
    private List<Person> people;

    public OrderingPerson() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }
    
    public List<Person> orderByAge() {
        List<Person> aux = new ArrayList<>(people);
        Collections.sort(aux);
        return aux;
    }

    public List<Person> orderByHeight() {
        List<Person> aux = new ArrayList<>(people);
        aux.sort(new Person.HeightComparator());
        return aux;
    }

    public List<Person> getPeople() {
        return people;
    }

    public static void main(String[] args) {
        OrderingPerson order = new OrderingPerson();

        order.addPerson(new Person("Jonas", 17, 1.75));
        order.addPerson(new Person("Camille", 20, 1.63));
        order.addPerson(new Person("Hector Salamanca", 73, 1.54));

        System.out.println(order.orderByAge());
        System.out.println(order.orderByHeight());

        System.out.println(order.getPeople());
    }
}
