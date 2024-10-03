package list.basic;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();

    public void addItem(String name, Double price, Integer quantity) {
        items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        try {
            items.removeIf(i -> i.getName().equalsIgnoreCase(name));
        } catch (NullPointerException e) {
            System.out.println("No item found for this name");
        }
    }

    public Double calculateTotalPrice() {
        double totalValue = 0.0;
        for (Item item : items) {
            totalValue += item.getPrice() * item.getQuantity();
        }
        return totalValue;
    }

    public void showItems() {
        items.forEach(i -> System.out.println("Item name: " + i.getName() + " | Item price: " + i.getPrice()
                + " | Item quantity: " + i.getQuantity()));
    }

    public static void main(String[] args) {
        var shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Banana", 3.5, 2);
        shoppingCart.addItem("Apple", 2.0, 3);

        shoppingCart.removeItem("Apple");
        shoppingCart.addItem("Carrot", 2.0, 5);

        System.out.println("Total value: " + shoppingCart.calculateTotalPrice());
        shoppingCart.showItems();
    }

}
