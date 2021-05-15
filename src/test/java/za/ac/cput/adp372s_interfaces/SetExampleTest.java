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

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Iterator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SetExampleTest {
    static SetExample set = new SetExample();
    
    public SetExampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
        set = new SetExample();
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        set.add("apple");
        set.add("thesis");
        set.add("banana");

        assertTrue(set.getSet().size() == 3);
    }
    
    @Test
    public void testRemove() {
        set.remove("banana");

        assertTrue(set.getSet().size() == 2);
        assertTrue(set.find("banana") == false);
    }
    
    @Test
    public void testFind() {
        
        assertTrue(set.find("apple"));
    }
    
}
