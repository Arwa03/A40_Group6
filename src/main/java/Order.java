
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 96655
 */
public class Order {
     private int orderNo;
   private Customer customer;
   private String date;
   private String time;
   private int quantity;
  private Product product;
  ArrayList<Store> AddStore;

    public Order(int orderNo, Customer customer, String date, String time, int quantity, Product product) {
        this.orderNo = orderNo;
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.quantity = quantity;
        this.product= product;
        orderNo++;
    }
    
    public static void showMenu(ArrayList<Store> AddStore){
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.println("                              CAKE STORE");
        System.out.println("------------------------------------------------------------");
       
        for(int i=0; i<AddStore.size(); i++){
            System.out.println(AddStore.get(i).toString());
            System.out.println("Store name:"+AddStore.get(i).getStoreName());
            System.out.println(AddStore.get(i).getProduct().toString());
            System.out.println("------------------------------------------------------------");
        } 
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNo=" + orderNo + ", date=" + date + ", time=" + time + ", quantity=" + quantity + '}';
    }
    
    
   
   
   
   
    
}
