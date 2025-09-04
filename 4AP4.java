public class FoodOrder {
    private String customerName;
    private String foodItem;
    private int quantity;
    private double price;

    // Fixed rate per item
    private static final double FIXED_RATE = 150.0;

    // 1. Default constructor → "Unknown" order
    public FoodOrder() {
        this.customerName = "Unknown";
        this.foodItem = "Unknown";
        this.quantity = 0;
        this.price = 0.0;
    }

    // 2. Constructor with food item → quantity = 1, price = default
    public FoodOrder(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = 1;
        this.price = FIXED_RATE;
    }

    // 3. Constructor with food item and quantity → price = quantity × fixedRate
    public FoodOrder(String customerName, String foodItem, int quantity) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = quantity * FIXED_RATE;
    }

    // Method to print bill
    public void printBill() {
        System.out.println("\n=== FOOD ORDER BILL ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: ₹" + price);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("🍔 FOOD DELIVERY SYSTEM 🍔");

        // Order 1: Default constructor
        FoodOrder order1 = new FoodOrder();

        // Order 2: Food item only
        FoodOrder order2 = new FoodOrder("Alice", "Burger");

        // Order 3: Food item + quantity
        FoodOrder order3 = new FoodOrder("Bob", "Pizza", 3);

        // Print bills
        order1.printBill();
        order2.printBill();
        order3.printBill();
    }
}
