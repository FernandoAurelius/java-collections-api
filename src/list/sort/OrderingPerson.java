package list.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrderingPerson {
    private List<Person> people;

    public OrderingPerson(List<Person> people) {
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

    public List<Person> oderByHeight() {
        List<Person> aux = new ArrayList<>(people);
        aux.sort(new Person.HeightComparator());
        return aux;
    }
}
