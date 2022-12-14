/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */
    /**
     * If the ID string does not appear as a key in drivable_map,adds the given Drivable object with
     * the given id String to drivable_map
     *
     * @param theID The id to map the object to in the map, if not in use.
     * @param objectD Drivable object being added to the map if id is not in use.
     * @return Boolean of if item was added to drivable_map.
     */
    public boolean addDrivable (String theID, Drivable objectD){
        if(drivable_map.keySet().contains(theID)){
            return false;
        }
        drivable_map.put(theID, objectD);
        return true;
    }


    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    /**
     * Returns if there is an item of equal speed or greater in the Map.
     *
     * @param speed The speed being comapred with.
     * @return Boolean of if there is an item of equal speed or greater in the Map.
     */
    public boolean hasFasterThan (int speed){
        for(Drivable d : drivable_map.values()){
            if(d.getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }




    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    /**
     * Returns a list containing all of the Tradable item in drivable_map.
     *
     * @return A List object containing all of the Tradable item in drivable_map.
     */
    public List<Tradable> getTradable(){
        List<Tradable> tradeList = new ArrayList<>();
        for(Drivable value : drivable_map.values()){
            if(value instanceof Tradable){
                tradeList.add((Tradable) value);
            }
        }
        return tradeList;
    }



    
}