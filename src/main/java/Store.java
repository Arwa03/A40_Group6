
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rawan
 */
    
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author armo0
 */
public class Store {

    private String UserFirstName;
    private String UserLastName;
    private String UserPhoneNumber;
    private String UserEmail;
    private String StoreID;
    private String StoreName;
    private Product product;
    //  static  ArrayList <Product> ArrayAddProduct = new ArrayList <Product> ();

    public Store(String UserFirstName, String UserLastName, String UserPhoneNumber, String UserEmail, String StoreID, String StoreName) {
        this.UserFirstName = UserFirstName;
        this.UserLastName = UserLastName;
        this.UserPhoneNumber = UserPhoneNumber;
        this.UserEmail = UserEmail;
        this.StoreID = StoreID;
        this.StoreName = StoreName;
    }

 
    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String UserFirstName) {
        this.UserFirstName = UserFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String UserPhoneNumber) {
        this.UserPhoneNumber = UserPhoneNumber;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String StoreID) {
        this.StoreID = StoreID;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    

    @Override
    public String toString() {
        return "Store ID: " +  StoreID +"\tName: " + UserFirstName + " " + UserLastName ;
    }

   
 

  
    
    

   
    
}
