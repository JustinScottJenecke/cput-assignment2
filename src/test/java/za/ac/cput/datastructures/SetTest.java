package za.ac.cput.datastructures;

/**
 * Author: Justin Jenecke 215163052
 * Test Cases for Set concrete class
 * */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    Set<String> list = new HashSet<String>();

    //Data added to list before each test
    @BeforeEach
    public void setup(){
        list.add("a125");
        list.add("b175");
        list.add("g054");
    }

    //Testing adding to Set, and displaying that you cannot add duplicate values to Set
    @Test
    public void setAdd(){

        list.add("b189");
        list.add("b175");

        assertEquals(4, list.size());
    }

    //Testing remove functionality
    @Test
    public void setRemove(){

        list.remove("b175");
        assertEquals(2, list.size());

    }

    //Test case for checking finding value inside set. Returns true if it is found.
    @Test
    public void setFind(){

        boolean contain = false;

        if (list.contains("b175"))
            contain = true;

        assertEquals(true, contain);
    }
}
