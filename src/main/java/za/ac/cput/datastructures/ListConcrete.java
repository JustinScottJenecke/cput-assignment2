package za.ac.cput.datastructures;

/**
 *Author: Justin Jenecke 215163052
 * Mehtods for List concrete class
 * */

import java.util.ArrayList;
import java.util.List;

public class ListConcrete {

    //Adding integer to List
    public List<Integer> ListAdd(List<Integer> list, int e){

        list.add(e);

        return list;
    }

    //Adding integer to list at given index
    public List<Integer> ListAdd(List<Integer> list, int index, int e){

        list.add(index, e);

        return list;
    }

    //Removing integer value from List
    public List<Integer> ListRemove(List<Integer> list, int z) {

        list.remove(z);

        return list;
    }

    //Checks if given index is in list. If true returns value
    //at given index. Otherwise, returns -1.
    public Integer ListFind(List<Integer> list, int index) {

        int foundValue = -1;

        if (list.get(index) != null)
            foundValue = list.get(index);

        return foundValue;
    }

}
