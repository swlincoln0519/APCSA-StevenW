import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    static int totalItems;
    static Item[] items;
    static NumberFormat formatter;
    
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Tiger Shop.");
        System.out.println("");
        totalItems = getNumberOfItems("How many items do you want to buy? ");
        items = new Item[totalItems];
        formatter = NumberFormat.getCurrencyInstance(Locale.US);
        
        int count = 0;
        while (count < totalItems) {
            getItemDetails(count);
            count++;
        }
        displayCart();
    }
    
    
    private static void displayCart() {
        
        formatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("###############################################");
        System.out.println("Shopping Cart Information");
        System.out.println("###############################################");

        for (int i = 0; i < totalItems; i++) {
            showLineItem(i);
        }
        System.out.println("###############################################");
        double subtotal = calculateSubtotal();
        double tax = subtotal * .0975;
        double total = subtotal + tax;
        
        System.out.println("Subtotal: " + formatter.format(subtotal));
        System.out.println("Sales Tax @ 9.75%: " + formatter.format(tax));
        System.out.println("Total Cost: " + formatter.format(total));
        System.out.println("Average Cost of All Items: " + formatter.format(subtotal / getTotalItems()));
        System.out.println("Thank You for Shopping with Us!"); 
        System.out.print("Please Come Again!");
    }
    
    
    private static double calculateSubtotal() {
        double total = 0;
        for (int i = 0; i < totalItems; i++) {
        total += items[i].getPrice() * items[i].getQuantity();
        }
        return total;
    } 
    
    
    private static void showLineItem(int index) {
        String quantityText = items[index].getQuantity() + "  --  " + items[index].getName();
        String priceText = formatter.format(items[index].getPrice()) + " = " + formatter.format(items[index].getPrice() * items[index].getQuantity());        
        System.out.format("%-25s %20s%n", quantityText, priceText);
    }
    
    
    private static void getItemDetails(int index) {
        String itemName = getItemName("What is the name of item #" + (index + 1) + "? ");
        double itemPrice = getItemPrice("What is the price of " + itemName + "? ");
        int itemQuantity = getNumberOfItems("How many of " + itemName + " do you want to buy? ");
        
        items[index] = new Item(itemName, itemPrice, itemQuantity);
        System.out.println("");
    }
    
    private static int getTotalItems() {
        int sum = 0;
        for (Item item : items)
            sum += item.getQuantity();
            
        return sum; 
    }
    
    private static String getItemName(String m) {
        System.out.print(m);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static double getItemPrice(String m) {
        System.out.print(m);
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    
    private static int getNumberOfItems(String m) {
        System.out.print(m);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
}
    
class Item {
    private String name;
    private double price;
    private int quantity;
        
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
        
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public double getPrice() {
        return price;
    }
        
    public void setPrice(double price) {
        this.price = price;
    }
        
    public int getQuantity() {
        return quantity;
    }
        
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + '}';
    }
}