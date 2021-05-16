package za.ac.cput.datastructures;


/**
 * Author: Justin Jenecke 215163052
 * Test class for Collection methods
 * */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {

    //Initialize two empty Arraylists
    Collection <Integer> list = new ArrayList();
    Collection <String> sList = new ArrayList();

    //Populate Integer list with values
    @BeforeEach
    public void setup(){

            list.add(8);
            list.add(88);
            list.add(21);
            list.add(6);
            list.add(100);
            list.add(3);

    }

    //Adding integer to ArrayList and Testing whether the size
    //of the list has increased as expected
    @Test
    public void cListAdd(){

        list.add(104);

        assertEquals(7, list.size());
    }

    //Removing three elements from ArrayList and testing the
    //size of the list has decreased as expected
    @Test
    public void cListRemove(){

        list.remove(21);
        list.remove(6);
        list.remove(100);

        assertEquals(3, list.size());

    }

    //Checks whether the value of input variable is within the list.
    //If it is found, it is stored in a variable and compared against
    //the expected outcome
    @Test
    public void cListFind(){

        sList.add("John");
        sList.add("Bob");
        sList.add("Jane");

        String input = "John";
        String returnValue = "";
        boolean x = false;

//      Iterator iterator = sList.iterator();
//      while (iterator.hasNext()){
//
//      }
        if (sList.contains(input))
            x = true;

        if (x == true)
            returnValue = input;


        assertTrue(x);
        assertEquals("John", returnValue);
    }

}
