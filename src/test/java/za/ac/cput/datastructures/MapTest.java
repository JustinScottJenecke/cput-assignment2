package za.ac.cput.datastructures;

/**
 * Author: Justin Jenecke 215163052
 * Test class for Map methods
 * */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    //Initialize empty hashmap and populating it before each test

    Map list = new HashMap();

    @BeforeEach
    public void setup(){
        list.put("easy","HTML&CSS");
        list.put("medium","JavaScript");
        list.put("hard","Java");
        list.put("veryHard","C");

    }

    //Add object to map and checking that the size has increased.
    @Test
    public void mapAdd(){

        list.put("alt","Swift");

        assertEquals(5, list.size());

    }

    //Removing object inside map by referencing it by its key.
    //Checking that the size of the map has decreased.
    @Test
    public void mapRemove(){

        list.remove("alt");

        assertEquals(4, list.size());

    }

    //Find object in map by searching for its key and checking
    // whether the found object is, what it is expected to be.
    @Test
    public void mapFind(){

        Object x = new Object();
        if (list.containsKey("easy")){
            x = list.get("easy");
        }

        System.out.println(x);

        assertEquals("HTML&CSS", x);
    }

}
