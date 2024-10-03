package list.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumbersSum {
    private final List<Integer> numbers = new ArrayList<>();

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public Integer sum() {
        return numbers.stream().reduce(0, Integer::sum);
    }

    public Integer findMax() {
        return numbers.stream().max(Comparator.naturalOrder()).get();
    }

    public Integer findMin() {
        return numbers.stream().min(Comparator.naturalOrder()).get();
    }

    public static void main(String[] args) {
        NumbersSum numbersSum = new NumbersSum();

        numbersSum.addNumber(10);
        numbersSum.addNumber(20);
        numbersSum.addNumber(30);
        numbersSum.addNumber(40);

        System.out.println(numbersSum.sum());
        System.out.println(numbersSum.findMax());
        System.out.println(numbersSum.findMin());
    }
}
