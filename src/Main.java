public class Main {

    public static void main(String[] args) {
        // Create an instance of FoodOrder
        FoodOrder foodOrder = new FoodOrder();

        // Display the menu
        foodOrder.displayMenu();

        // Take orders until user chooses to exit
        foodOrder.order();
    }
}

