import java.util.Scanner;

/**
 * two
 */
class Order {

    int OrderId;
    String productName;
    int quantity;
    double price;
    Order(){ //default order
        this.OrderId = 1;
        this.productName = "Default";
        this.quantity = 0;
        this.price = 0;

    }
    Order(int OrderId,String productName,double price){
        this.OrderId = OrderId;
        this.productName = productName;
        this.quantity = 1;
        this.price = price;
    }
    Order(int OrderId,String productName,int quantity,double price){
        this.OrderId = OrderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    double calculateTotal(){
        double subtotal = price*quantity;
        double tax = 0.18*subtotal;
        return subtotal + tax;
    }
    void displayRecipt(){
        System.out.println("\n--- Order Recipt---");  
        System.out.println("Order ID :"+OrderId);  
        System.out.println("Product Name :"+productName);  
        System.out.println("Price Before GST :"+price);  
        System.out.println("Quantity :" + quantity);  
        System.out.println("Price After GST :" + calculateTotal() );  
        System.out.println("----------");
    }
        
}
/**
 * two
 */
public class two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order defaultOrder = new Order();
        defaultOrder.displayRecipt();

        Order quickOrder = new Order();
        quickOrder.displayRecipt();

        System.out.println("Create a custom order ==>");
        System.out.println("Enter OrderId: ");
        int OrderId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Quantity: "); 
        int quantity = scanner.nextInt();

        System.out.print("Enter Unit Price: ");
        double price = scanner.nextDouble();

        Order customeOrder = new Order(OrderId,productName,quantity,price);
        customeOrder.displayRecipt();
        scanner.close();
    }
}
/// 24 mins 6.94 seconds