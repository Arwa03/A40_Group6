
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
        System.out.println(customer.showMenu(AddStore));
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
    
//    public static void showMenu(Scanner input){
//        System.out.println("");
//        System.out.println("------------------------------------------------------------");
//        System.out.println("                              CAKE STORE");
//        System.out.println("------------------------------------------------------------");
//       
//        for(int i=0; i<AddStore.size(); i++){
//            System.out.println(AddStore.get(i).toString());
//            System.out.println("Store name:"+AddStore.get(i).getStoreName());
//            System.out.println(AddStore.get(i).getProduct().toString());
//            System.out.println("------------------------------------------------------------");
//        } 
        
        
//    }
    
           
    
        
    
    
    public static void placeOrder(Scanner input, Customer customer){
        System.out.println("Enter the store ID you want");
        String StoreID= input.next();
        System.out.println("Enter the productID you want");
        int productID= input.nextInt();
//        Product product = null;
//        Store store = null;
//        for(int i = 0; i < AddStore.size(); i++){
//            if(AddStore.get(i).getStoreID().equalsIgnoreCase(StoreID)
//                    && AddStore.get(i).getProduct().getProductID()==productID){
//                product = AddStore.get(i).getProduct();
//                store = AddStore.get(i);
//            }
//        }
        System.out.println("Enter the quantity you want");
        int quantity= input.nextInt();
        System.out.println("Enter the order delivery date in format dd-mm : ");
        String date= input.next();
        System.out.println("Enter the order delivery time in format hh : ");
        String time= input.next();
        
        customer.POrder(AddStore, StoreID, productID, orderNo, customer, date, time, quantity);

//        Order order=new Order(orderNo, customer, date, time, quantity, product);   
//        customer.setOrder(order);
//        System.out.println(customer.getOrder().toString());
//        System.out.println("The order was recevied successfully");

//         customer.POrder(AddStore, StoreID, productID, orderNo, customer, date, time, quantity);
          
//         System.out.print("Enter Payment Taype:\n "
//                + "1- For Card \n 2- For cash");
//        int op = input.nextInt();
//        if(op == 1)
//            customer.payment.setPaymentOption("Card");
//        else
//            customer.payment.setPaymentOption("Cash");
        
    }
    
//    public static void Payment(Scanner input, Order order, Store store){
//        payment payment = new payment(store.getStoreName(),
//                order.getCustomer().getCustomerFirstName(),
//                order.getCustomer().getCustomerLastName(), order);
//        
//        System.out.print("Enter Payment Taype:\n "
//                + "1- For Card \n 2- For cash");
//        int op = input.nextInt();
//        if(op == 1)
//            payment.setPaymentOption("Card");
//        else
//            payment.setPaymentOption("Cash");
//        
//        
//       payment.printBill();
//    }
}


