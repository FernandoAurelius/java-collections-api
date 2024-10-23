package set.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegister {

    @SuppressWarnings("FieldMayBeFinal")
    private Set<Product> products;

    public ProductRegister() {
        this.products = new HashSet<>();
    }

    public void addProduct(String name, Integer code, Double price, Integer quantity) {
        products.add(new Product(name, code, price, quantity));
    }

    public void showProductsByName() {
        Set<Product> aux = new TreeSet<>(new ProductNameComparator());
        aux.addAll(products);
        System.out.println(aux);
    }

    public void showProductsByPrice() {
        Set<Product> aux = new TreeSet<>(new ProductPriceComparator());
        aux.addAll(products);
        System.out.println(aux);
    }

    public static void main(String[] args) {
        ProductRegister productRegister = new ProductRegister();
        
        productRegister.addProduct("Smartphone", 1, 1000.0, 10);
        productRegister.addProduct("Notebook", 2, 1500.0, 5);
        productRegister.addProduct("Mouse", 1, 30.0, 20);
        productRegister.addProduct("Keyboard", 4, 50.0, 15);

        productRegister.showProductsByName();
        System.out.println("\n\n\n");
        productRegister.showProductsByPrice();
    }

}
