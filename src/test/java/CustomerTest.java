/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author armo0
 */
public class CustomerTest {

    /**
     * Test of AddCustomer method, of class Customer.
     */
    @Test
    public void testAddCustomer() {
        ArrayList<Customer> AddCustomer = new ArrayList<Customer>();
        Customer instance = new Customer ("Amal", "Ali", "0987654321",
                "AmalAli@gmail.com", "jeddah");
        instance.AddCustomer(AddCustomer, instance);
        assertNotNull(AddCustomer.get(0));
    }

    /**
     * Test of showMenu method, of class Customer.
     */
    @Test
    public void testShowMenu() {
        ArrayList<Store> AddStore = new ArrayList<Store>();
        Product product = new Product("VCake", 0, 23, "small", "V");
        Store storeinfo = new Store("jawaher", "Ahmad", "0987654321",
                "jawaherAhmad@gmail.com", "12", "Cake");
        storeinfo.setProduct(product);
        Customer instance = new Customer ("Amal", "Ali", "0987654321",
                "AmalAli@gmail.com", "jeddah");
        AddStore.add(storeinfo);
        String expResult = "\n"
        + "\n------------------------------------------------------------"
        + "\n                              CAKE STORE"
        + "\n------------------------------------------------------------\n"
        + "Store ID: " +  "12" +"\tName: " + "jawaher" + " " + "Ahmad"
            + "\tStore name: " +"Cake" + "\n"
            + "Product ID: "+"0"+ "  Product Name: " + "VCake" + "  Price: " + "23.0" + "  Size: " + "small" + "  flavor: " + "V"
            + "\n------------------------------------------------------------";
        
        assertEquals(expResult, instance.showMenu(AddStore));
    }

    /**
     * Test of POrder method, of class Customer.
     */
    @Test
    public void testPOrder() {
        ArrayList<Store> AddStore = new ArrayList<Store>();
        Store store = new Store("jawaher", "Ahmad", "0987654321",
                "jawaherAhmad@gmail.com", "12", "Cake");
        Product product = new Product("Cake", 0, 23, "small", "");
        store.setProduct(product);
        AddStore.add(store);
        String StoreID = "12";
        int productID = 0;
        int orderNo = 2;
        String date = "12-2";
        String time = "7:00";
        int quantity = 3;
        Customer instance = new Customer ("Amal", "Ali", "0987654321",
                "AmalAli@gmail.com", "jeddah");
        String result =  "orderNo: " + "2" + ", date: " + "12-2" + ", time: " + "7:00" + ", quantity: " + "3"
                + "\nThe order was recevied successfully\n";
        assertEquals(result, instance.POrder(AddStore, StoreID, productID, orderNo, instance, date, time, quantity));
    }  
}
