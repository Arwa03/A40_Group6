/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author armo0
 */
public class paymentTest {
    
    /**
     * Test of printBill method, of class payment.
     */
    @Test
    public void testPrintBill() {
        Product product = new Product("Cake", 0, 23, "small", "V");
        Order order = new Order (1, null, "12-3", "7:00", 3, product);
        payment instance = new payment("VCake", "Amal", "Ahmed", order);
        assertNotNull(instance.printBill());
    }

    /**
     * Test of subTotal method, of class payment.
     */
    @Test
    public void testSubTotal() {
        Product product = new Product("Cake", 0, 23, "small", "V");
        Order order = new Order (1, null, "12-3", "7:00", 3, product);
        payment instance = new payment("VCake", "Amal", "Ahmed", order);
        double expResult = 69.0;
        double result = instance.subTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculateTax method, of class payment.
     */
    @Test
    public void testCalculateTax() {
        double subtotal = 69;
        double expResult = 10.35;
        double result = payment.calculateTax(subtotal);
        assertEquals(expResult, result, 0);
    }
    
}
