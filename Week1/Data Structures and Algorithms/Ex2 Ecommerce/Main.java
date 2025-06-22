import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + category;
    }
}

class Search {
    static Product linearSearch(Product[] productsArr, int id) {
        for (Product product : productsArr) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    static Product binarySearch(Product[] productsArr, int id) {
        int left = 0, right = productsArr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (productsArr[mid].productId == id) {
                return productsArr[mid];
            } else if (productsArr[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] productsArr = {
            new Product(1, "Laptop", "Electronics"),
            new Product(8, "Mobile", "Electronics"),
            new Product(2, "Watch", "Fashion"),
            new Product(12, "Pen", "Stationery"),
            new Product(4, "Facewash", "Health")
        };
        Product linearResult = Search.linearSearch(productsArr, 4);
        Arrays.sort(productsArr, Comparator.comparingInt(p -> p.productId));
        Product binaryResult = Search.binarySearch(productsArr, 4);

        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not found"));
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found"));
    }
}
