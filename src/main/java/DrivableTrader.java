/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;

public class DrivableTrader<T> extends Trader<T>{
    /**
     * Construct a DrivableTrader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<T> inventory, List<T> wishlist, int money) {
        super(inventory, wishlist, money);
    }
    /**
     * Construct a DrivableTrader, giving them the given money + an empty inventory and wishlist.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money){
        super(money);
    }

    /**
     * Returns the selling price of the given object if it is Tradable.
     * If not, return Tradable.MISSING_PRICE.
     *
     * @param objecT object of type T to get the price and MaxSpeed of
     * @return The sum of the price and the MaxSpeed if it is Drivable, or Tradable.MISSING_PRICE if it is not.
     */
    @Override
    public int getSellingPrice(T objecT){
        if (objecT instanceof Tradable){
            return ((Tradable) objecT).getPrice() + ((Drivable) objecT).getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }
}