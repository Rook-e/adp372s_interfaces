/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * author: AJ Mitchell
 * student nr.: 219024979
 * date: 12/05/2021
 * project description: using java collections
 */
package za.ac.cput.adp372s_interfaces;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MapExampleTest {
    static MapExample map = new MapExample();
    
    public MapExampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
        map = new MapExample();
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        map.getMap().put(1, "Nike");
        map.getMap().put(2, "Adidas");
        map.getMap().put(3, "Apple");

        assertTrue(map.getMap().size() == 3);
    }
    
    @Test
    public void testRemove() {
        map.remove(1);

        assertTrue(map.getMap().size() == 2);
        assertTrue(map.find("Nike") == false);
    }
    
    @Test
    public void testFind() {
        
        assertTrue(map.find("Apple"));
    }
    
}
