package set.sort;

import java.util.Comparator;

public record Product(String name, Integer code, Double price, Integer quantity) {

    @Override
    public String toString() {
        return "Product[" +
                "name=" + name + ", " +
                "code=" + code + ", " +
                "price=" + price + ", " +
                "quantity=" + quantity + ']';
    }

}

class ProductNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.name().compareTo(p2.name());
    }
}

class ProductPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.price().compareTo(p2.price());
    }
}
