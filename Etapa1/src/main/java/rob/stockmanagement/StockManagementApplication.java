package rob.stockmanagement;

import rob.stockmanagement.service.StockManagementService;

public class StockManagementApplication {
    public static void main(String[] args) {
        StockManagementService stockManagementService = new StockManagementService();


        // Start Interaction Logic (choose an approach)
        startCommandLineInterface(stockManagementService);
    }

    // Placeholder method - Example for Command-Line Interaction
    private static void startCommandLineInterface(StockManagementService service) {
        // Implement logic to get input using Scanner, then call service methods
        // Example:
        // System.out.println("Enter product name: ");
        // Scanner input = new Scanner(System.in);
        // String productName = input.nextLine();
        // Product product = stockManagementService.findProductByName(productName);
    }
}

