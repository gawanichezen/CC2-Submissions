
public class Retail1DInventory {

    public static void main(String[] args) {
        
        //Name of the Convenience Store and Separator
        System.out.println("\t\tChezen's Convenience Store Stock");
        System.out.println("-------------------------------------------------------------------");
        
        
        // Naming products and also saving order
        String[] products = {
            "Water Bottle",
            "Noodles",
            "Chocolate",
            "Potato Chips",
            "Soap Bar",
            "Loaf Bread",
            "Shampoo",
            "Coffee Pack",
            "Toothpaste",
            "Eggs"
        };
        
        //quantity and price of the products
        int[] quantity = {60,10,20,5,40,10,50,30,5,20};
        double[] price = {15.0,24.0,35.0,12.0,22.0,52.0,9.0,8.0,12.0,10.0};
        
        
        //This will store the total worth of all products and it's 0 because we still havent added anything
        double totalValue = 0;
        
        
        // Display inventory and calculate total stock value
        System.out.println("Product\t\tQuantity\t\tPrice\t\tTotal Value");
        System.out.println("-------------------------------------------------------------------");
        
        
        //Loop for printing the product, quantity, price, and total value
        for(int i=0; i < products.length; i++) {
            
         double productValue = quantity[i] * price[i];
         totalValue = totalValue + productValue;
            
            //Prints the loop
            System.out.printf("%-15s %8d\t\tP%.2f\t\tP%.2f\n", products[i], quantity[i], price[i], productValue);

        }
            //Separator and print the total total value
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("Total Stock Value: P%.2f", totalValue);
    }
}
