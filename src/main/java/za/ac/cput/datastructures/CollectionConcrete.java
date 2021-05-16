package za.ac.cput.datastructures;

/**
 * Author: Justin Jenecke 215163052
 * Methods for Collection concrete class
 * */

import java.util.ArrayList;

public class CollectionConcrete {

    //Add element to ArrayList of integers
    public ArrayList<Integer> cListAdd(ArrayList<Integer> list, int e){

        list.add(e);

        return list;
    }

    //remove element from ArrayList of integers
    public ArrayList<Integer> cListRemove(ArrayList<Integer> list, int z) {

        list.remove(z);

        return list;
    }

    //Search through String Arraylist for given input.
    //The input is returned if it exists within the list, otherwise
    //-1 is returned
    public String cListFind(ArrayList<String> list, String input){
        if (list.contains(input))
            return input;
        else
            return "Input not found in given list";
    }

}

