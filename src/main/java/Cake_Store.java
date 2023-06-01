
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

        //static Product[] ArrayProduct = new Product[5];
        static ArrayList<Store> AddStore = new ArrayList<Store>();
        static ArrayList<Customer> AddCustomer = new ArrayList<Customer>();
        //static int StoreCount=0;
        //static int CustomerCount=0;
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
                     //    StoreCount++;
                }
                else{
                        Customer(input, AddCustomer);
                        
                }
            
        }
           else
            System.out.println("Welcom Back");
        }while(!choose.equalsIgnoreCase("E"));
     
        System.out.println("");
        
      //  System.out.println(AddCustomer.get(0).toString() + "A");
       // System.out.println(AddStore.get(StoreCount).

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
        AddStore.add(storeinfo);
        System.out.println("Added Successfully ");
        System.out.println(storeinfo.toString());
        System.out.println("Please Enter Product information: ");
        Product(input, storeinfo);
        System.out.println(storeinfo.getProduct().toString());
        System.out.println("Added Successfully ");
        
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
        AddCustomer.add(customer);
        //CustomerCount++;
        System.out.println("Added Successfully ");
        showMenu(input);
        placeOrder(input,customer);
        System.out.println();
        
//        Payment(input);
    }
        
         public static void Product(Scanner input, Store store){
           System.out.println("Enter product name: ");
           String productName= input.next();
           System.out.println("Enter product price: ");
           double productPrice= input.nextDouble();
           System.out.println("Enter product size: ");
           String productSize= input.next();
           System.out.println("Enter product flavor: ");
           String productFlavor= input.next();
           Product productinfo=new Product( productName, productID, productPrice,  productSize,  productFlavor);
           store.setProduct(productinfo);
        
}
