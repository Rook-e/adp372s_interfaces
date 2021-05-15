/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp372s_interfaces;

import java.util.Collection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ajmit
 */
public class CollectionExampleTest {
    static CollectionExample collection = new CollectionExample();
    
    public CollectionExampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
        collection = new CollectionExample();
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        
        collection.add("A");
        collection.add("B");
        collection.add("C");
        
        assertEquals("A", collection.getLetters().toArray()[0]);
        assertEquals("B", collection.getLetters().toArray()[1]);
        assertEquals("C", collection.getLetters().toArray()[2]);
        
    }

    @Test
    public void testRemove() {
        
        collection.remove("C");

        assertTrue(collection.getLetters().size() == 2);
        assertTrue(collection.find("C") == false);
    }

    @Test
    public void testFind() {
        assertTrue(collection.find("A"));
    }
    
    
}
