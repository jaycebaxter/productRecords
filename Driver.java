import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;


public class Driver {
    public static void main(String[] args) {

        // Initializing list of objects
        ArrayList<Product> productArray = new ArrayList<Product>();
        
        // Non-perishable products
        // Canned Beans
        Product cannedBeans = new Product(100629175, "Canned Beans", 5.99, 16, 3, "BE CAREFUL!!!!!!!!!!!!!!");

        // Canned Corn
        Product cannedCorn = new Product(100838575, "Canned Corn", 4.50, 5, 15, "Gorn lol");

        // Canned Tuna
        Product cannedTuna = new Product(100738939, "Canned Tuna", 2.99, 16, 5, "N/A");

        // Perishables
        // Milk
        Perishable baggedMilk = new Perishable(100834784, "Bag of Milk", 7.00, 10, 8, "N/A", LocalDate.of(2025, 3, 31));

        // Blueberries
        Perishable blueberries = new Perishable(100837913, "Blueberries", 16.99, 8, 15, "N/A", LocalDate.of(2025, 3, 29));

        // Bread
        Perishable breadLoaf = new Perishable(100717939, "Loaf of Bread", 4.00, 15, 10, "N/A", LocalDate.of(2025, 4, 3));

        // Adding all products to productArray arraylist
        productArray.add(cannedBeans);
        productArray.add(cannedCorn);
        productArray.add(cannedTuna);
        productArray.add(baggedMilk);
        productArray.add(blueberries);
        productArray.add(breadLoaf);

        // https://www.w3schools.com/java/java_howto_loop_through_arraylist.asp
        for (Product product : productArray) {
            System.out.println("");
            product.display();
        }
    }
}
