package list.sort;

import java.util.Comparator;

public record Person(String name, int age, double height) implements Comparable<Person>{
    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age(), p.age());
    }

    static class HeightComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p1.height(), p2.height());
        }
    }
}
