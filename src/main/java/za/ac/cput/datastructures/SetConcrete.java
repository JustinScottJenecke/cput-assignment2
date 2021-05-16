package za.ac.cput.datastructures;

/**
 * Author: Justin Jenecke 215163052
 * concrete class for Set methods
 * */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetConcrete {

    //Add String to end of Set.

    public Set<String> ListAdd(HashSet<String> setList, String e){

        setList.add(e);

        return setList;
    }

    //Remove String from Set.

    public Set<String> ListRemove(HashSet<String> setList, String z) {

        setList.remove(z);

        return setList;
    }

    //Takes in a String variable as an input and returns it if it exists inside
    // the set. Returns -1 if input is not found in Set

    public String ListFind(HashSet<String> setList, String input) {

        String foundValue = "-1";
        boolean contain = false;

        if (setList.contains(input))
            contain = true;

        if (contain)
            foundValue = input;


        return foundValue;
    }

}
