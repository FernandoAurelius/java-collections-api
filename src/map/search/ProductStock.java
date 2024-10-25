package map.search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {

    @SuppressWarnings("FieldMayBeFinal")
    private Map<Integer, Product> stock;

    public ProductStock() {
        this.stock = new HashMap<>();
    }

    public void addProduct(Integer code, String name, Integer quantity, Double price) {
        stock.put(code, new Product(name, quantity, price));
    }

    public void showProducts() {
        System.out.println(stock);
    }

    public Double calculateTotalStockPrice() {
        Double sum = 0d;
        for (Product product : stock.values()) {
            sum += product.price();
        }
        return sum;
    }

    public Product getMostExpensiveProduct() {
        if (stock.isEmpty()) {
            return null;
        }
        Product mostExpensive = new Product("", 0, 0d);
        for (Product product : stock.values()) {
            if (product.price() > mostExpensive.price()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public Product getCheapierProduct() {
        if (stock.isEmpty()) {
            return null;
        }
        Product cheapierProduct = getMostExpensiveProduct();
        for (Product product : stock.values()) {
            if (product.price() < cheapierProduct.price()) {
                cheapierProduct = product;
            }
        }
        return cheapierProduct;
    }

    public Product getProductWithBiggerQuantity() {
        if (stock.isEmpty()) {
            return null;
        }
        Product biggerQuantity = new Product("", 0, 0d);
        for (Product product : stock.values()) {
            if (product.price() * product.quantity() > biggerQuantity.price() * biggerQuantity.quantity()) {
                biggerQuantity = product;
            }
        }
        return biggerQuantity;
    }

    public static void main(String[] args) {
        ProductStock ps = new ProductStock();
        
        ps.addProduct(1, "Smartphone", 1, 1000.0);
        ps.addProduct(2, "Notebook", 2, 1500.0);
        ps.addProduct(3, "Mouse", 1, 30.0);
        ps.addProduct(4, "Keyboard", 4, 50.0);

        ps.showProducts();

        System.out.println(ps.calculateTotalStockPrice());

        System.out.println(ps.getMostExpensiveProduct());

        System.out.println(ps.getCheapierProduct());

        System.out.println(ps.getProductWithBiggerQuantity());
    }

}
