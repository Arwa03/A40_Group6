/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author rawan
 */
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armo0
 */
public class Customer {
    private String CustomerFirstName;
    private String CustomerLastName;
    private String CustomerPhoneNumber;
    private String CustomerEmail;
    private String CustomerLocation;
    private Order order;
    static payment payment;

    public Customer(String CustomerFirstName, String CustomerLastName, String CustomerPhoneNumber, String CustomerEmail, String CustomerLocation) {
        this.CustomerFirstName = CustomerFirstName;
        this.CustomerLastName = CustomerLastName;
        this.CustomerPhoneNumber = CustomerPhoneNumber;
        this.CustomerEmail = CustomerEmail;
        this.CustomerLocation = CustomerLocation;
    }

    public String showMenu(ArrayList<Store> AddStore){
        String expResult = "\n"
        + "\n------------------------------------------------------------"
        + "\n                              CAKE STORE"
        + "\n------------------------------------------------------------";
       
        for(int i=0; i<AddStore.size(); i++){
             expResult  += AddStore.get(i).toString()
            + "Store name:" +AddStore.get(i).getStoreName()
            + AddStore.get(i).getProduct().toString()
            + "\n------------------------------------------------------------";
        }
        return expResult;
    }
    
    public void POrder(ArrayList <Store> AddStore, String StoreID, int productID, int orderNo, Customer customer, String date, String time, int quantity){
        Product product = null;
        Store store = null;
        for(int i = 0; i < AddStore.size(); i++){
            if(AddStore.get(i).getStoreID().equalsIgnoreCase(StoreID)
                    && AddStore.get(i).getProduct().getProductID()==productID){
                product = AddStore.get(i).getProduct();
                store = AddStore.get(i);
            }
        }
        
        order=new Order(orderNo, customer, date, time, quantity, product);   
        customer.setOrder(order);
        System.out.println(customer.getOrder().toString());
        System.out.println("The order was recevied successfully");
        
        payment(store, order);
    }
    
    public void payment(Store store, Order order){
         payment = new payment(store.getStoreName(),
                order.getCustomer().getCustomerFirstName(),
                order.getCustomer().getCustomerLastName(), order);
         
         payment.printBill();
    }
    
    public String getCustomerFirstName() {
        return CustomerFirstName;
    }

    public void setCustomerFirstName(String CustomerFirstName) {
        this.CustomerFirstName = CustomerFirstName;
    }

    public String getCustomerLastName() {
        return CustomerLastName;
    }

    public void setCustomerLastName(String CustomerLastName) {
        this.CustomerLastName = CustomerLastName;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String CustomerPhoneNumber) {
        this.CustomerPhoneNumber = CustomerPhoneNumber;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public String getCustomerLocation() {
        return CustomerLocation;
    }

    public void setCustomerLocation(String CustomerLocation) {
        this.CustomerLocation = CustomerLocation;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
   
}