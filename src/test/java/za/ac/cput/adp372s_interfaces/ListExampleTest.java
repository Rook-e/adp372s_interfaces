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

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListExampleTest {
    static ListExample list = new ListExample();
    
    public ListExampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() { 
        list = new ListExample();
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        list.add("Amber");
        list.add("Barry");
        list.add("Candice");

        assertEquals("Amber", list.getList().get(0));
        assertEquals("Barry", list.getList().get(1));
        assertEquals("Candice", list.getList().get(2));
    }
    
    @Test
    public void testRemove() {
        list.remove("Amber");

        assertTrue(list.getList().size() == 2);
        assertTrue(list.find("Amber") == false);
    }
    
    @Test
    public void testFind() {
        assertTrue(list.find("Barry"));
    }
    
}
