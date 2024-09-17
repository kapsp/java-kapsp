import java.util.ArrayList;
import java.util.List;

// Class to represent a Product
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

// Class to represent a Cart
class Cart {
    private List<Product> products;

    // Constructor
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    // Get list of products in cart
    public List<Product> getProducts() {
        return products;
    }

    // Display all products in cart
    public void displayCart() {
        System.out.println("Cart Contents:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}

// Class to represent a Customer
class Customer {
    private String name;
    private Cart cart;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    // Get customer's cart
    public Cart getCart() {
        return cart;
    }

    // Place an order based on current cart items
    public Order placeOrder() {
        if (cart.getProducts().isEmpty()) {
            System.out.println("Cart is empty, can't place order.");
            return null;
        } else {
            Order order = new Order(this, new ArrayList<>(cart.getProducts()));
            System.out.println("Order placed by " + name);
            return order;
        }
    }

    // Display customer details
    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}

// Class to represent an Order
class Order {
    private Customer customer;
    private List<Product> products;

    // Constructor
    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    // Display order details
    public void displayOrder() {
        customer.displayCustomer();
        System.out.println("Order Details:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}

// Main class to demonstrate functionality
public class ShoppingSystem {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 1500.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 200.00);

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Add products to the cart
        customer.getCart().addProduct(product1);
        customer.getCart().addProduct(product2);
        customer.getCart().addProduct(product3);

        // Display the cart
        customer.getCart().displayCart();

        // Customer places an order
        Order order = customer.placeOrder();

        // Display the order if it was placed successfully
        if (order != null) {
            order.displayOrder();
        }
    }
}
