package za.ac.cput.datastructures;
/**
 * Author: Justin Jenecke 215163052
 * Methods for Map concrete class
 * */
import java.util.HashMap;
import java.util.Map;

public class MapConcrete {

    //Add object to hashmap
    public Map mapAdd(HashMap map, Object key, Object value){

        map.put(key, value);

        return map;
    }

    //Remove object from hashmap
    public Map mapRemove(HashMap map, Object key) {

        System.out.println("removed " + map.get(key));
        map.remove(key);

        return map;
    }

    //Takes in a key and returns the corresponding object, if it is
    //found within the hashmap. Return -1 if key is not found.
    public Object mapFind(HashMap map, Object key) {

        Object value = "-1";

        if (map.containsKey(key))
            value = map.get(key);

        return value;

    }




}
