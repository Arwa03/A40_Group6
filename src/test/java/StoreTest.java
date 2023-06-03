/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
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
public class StoreTest {

    /**
     * Test of AddStore method, of class Store.
     */
    @Test
    public void testAddStore() {
        ArrayList<Store> AddStore = new ArrayList<Store>();
        Store instance = new Store("jawaher", "Ahmad", "0987654321", "jawaherAhmad@gmail.com", "12", "Cake");
        instance.AddStore(AddStore, instance);
        assertNotNull(instance);
    }
}
