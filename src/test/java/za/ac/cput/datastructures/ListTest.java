package za.ac.cput.datastructures;

/**
 * Author: Justin Jenecke 215163052
 * Test class for List methods
 * */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    //Initialize empty ArrayList
    List<Integer> list = new ArrayList<Integer>();

    //Populating List before each test
    @BeforeEach
    public void setup(){

        list.add(8);
        list.add(88);
        list.add(21);
        list.add(6);
        list.add(100);
        list.add(3);
    }

    //Adding item to ArrayList at specified input.
    //Test checks whether the size of List increased,
    // and whether the element was added at the right position
    @Test
    public void listAdd(){

        list.add(1,10);

        assertEquals(7, list.size());
        assertEquals(1, list.indexOf(10));

    }

    //Removing first element of Arraylist to test remove method
    // and testing whether the element at 0 has changed.
    @Test
    public void listRemove(){

        //System.out.println(list.get(0));
        list.remove(0);

        assertEquals(88,list.get(0));

    }

    //Find value inside ArrayList and testing whether it is
    //the value that is expected.
    @Test
    public void listFind(){

        int foundValue = -1;

        if (list.get(0) != null)
            foundValue = list.get(0);

        assertEquals(8, foundValue);
//        assertEquals(21,list.get(2));
//        assertEquals(3,list.get(5));

    }

}
