
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author armo0
 */
public class Cake_Store {
        
        static ArrayList<Store> AddStore = new ArrayList<Store>();
        static ArrayList<Customer> AddCustomer = new ArrayList<Customer>();
        static int orderNo = 1;
        static int productID = 1;
        
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         String choose = null;
        do{
            System.out.print("Choose L for Login and S for signup or E for exit: ");
            choose=input.next();
        if(choose.equalsIgnoreCase("S")){
            System.out.print("Choose C for Customer and S for Store: ");
            String choose1 = input.next();
                if(choose1.equalsIgnoreCase("S")){
                        Store (input, AddStore);
                }
                else{
                        Customer(input, AddCustomer); 
                }
        }
        else if(choose.equalsIgnoreCase("L"))
            System.out.println("Welcom Back");
        
        else
            System.out.println("Thank you, visit us again");
        }while(!choose.equalsIgnoreCase("E"));
     
        System.out.println("");

    }
    
    public static void Store(Scanner input, ArrayList AddStore){
        System.out.print("Enter owner First name: ");
        String UserFirstName = input.next();
        System.out.print("Enter owner last name: ");
        String UserLastName = input.next();
        System.out.print("Enter store name: ");
        String StoreName = input.next();
        System.out.print("Enter store ID: ");
        String StoreID = input.next();
        System.out.print("Enter onwe PhoneNumber: ");
        String UserPhoneNumber = input.next();
        System.out.print("Enter store Email: ");
        String UserEmail = input.next();
        Store storeinfo = new Store(UserFirstName, UserLastName, UserPhoneNumber, UserEmail, StoreID, StoreName);
        storeinfo.AddStore(AddStore, storeinfo);
        System.out.println("Please Enter Product information: ");
        Product(input, storeinfo);
        System.out.println(storeinfo.getProduct().toString());
        System.out.println("Added Successfully \n");
        
    }
    
    public static void Customer(Scanner input, ArrayList AddCustomer){
        System.out.print("Enter your First name: ");
        String CustomerFirstName = input.next();
        System.out.print("Enter your last name: ");
        String CustomerLastName = input.next();
        System.out.print("Enter your PhoneNumber: ");
        String CustomerPhoneNumber = input.next();
        System.out.print("Enter your Email: ");
        String CustomerEmail = input.next();
        System.out.print("Enter your location: ");
        String CustomerLocation = input.next();
        Customer customer = new Customer(CustomerFirstName, CustomerLastName, CustomerPhoneNumber, CustomerEmail, CustomerLocation);
        customer.AddCustomer(AddCustomer, customer);
        System.out.println(customer.showMenu(AddStore));
        placeOrder(input,customer);
        System.out.println();
    }
    
//****************************************************************************** 
    
    public static void Product(Scanner input, Store store){
           System.out.print("Enter product name: ");
           String productName= input.next();
           System.out.print("Enter product price: ");
           double productPrice= input.nextDouble();
           System.out.print("Enter product size: ");
           String productSize= input.next();
           System.out.print("Enter product flavor: ");
           String productFlavor= input.next();
           Product productinfo=new Product( productName, productID, productPrice,  productSize,  productFlavor);
           store.setProduct(productinfo);
           
    }
        
//****************************************************************************** 
    
    public static void placeOrder(Scanner input, Customer customer){
             System.out.print("Enter the store ID you want: ");
        String StoreID= input.next();
        System.out.print("Enter the productID you want: ");
        int productID= input.nextInt();
        System.out.print("Enter the quantity you want: ");
        int quantity= input.nextInt();
        System.out.print("Enter the order delivery date in format dd-mm: ");
        String date= input.next();
        System.out.print("Enter the order delivery time in format hh: ");
        String time= input.next();
        
        System.out.println(customer.POrder(AddStore, StoreID, productID, orderNo, customer, date, time, quantity));
    }
}


