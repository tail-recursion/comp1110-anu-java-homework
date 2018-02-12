package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    /*
    maintains information about the inventory of a shop.

    * Create an instance method, `void addItem(String name, int stock, int price)`
    which is used to add to an internal data structure an item, how many of that
    item are in the shop, and how much each costs, in cents.
    * Create another instance method, `int totalStockValue()`, which uses the internal
    data structure to return the sum of the value of all stock, as an `int`, in cents.
    * Implement another instance method `void addItem(String name, int stock, int price,
    int rate, int reorderdays)` which allows you to store not only the item name, stock
    level and price, but also the rate (in items per day) that the item is usually sold,
    and the number of days it takes to reorder the stock.
    * Implement another instance method `HashMap reorder()` which returns a hash map
    listing the name (key) and number (value) of all of the items that need to be reordered
    today in order to ensure that the expected number of stock is always at least one
    (ie sufficient to last until the order arrives, assuming average sales). Whenever an
    item is ordered, seven days worth of average sales minus the current stock of that
    item is always ordered.
     */
    class Item {

        String name;
        Integer stock, price, rate, reorderdays;

        Item(String name, int stock, int price) {
            this.name=name;
            this.stock=stock;
            this.price=price;
        }

        Item(String name, int stock, int price, int rate, int reorderdays) {
            this.name=name;
            this.stock=stock;
            this.price=price;
            this.rate=rate;
            this.reorderdays=reorderdays;
        }
    }

    ArrayList<Item> items = new ArrayList<>();

    int totalStockValue() {
        int total=0;
        for (Item item : items) {
            total+=item.price*item.stock;
        }
        return total;
    }

    void addItem(String name, int stock, int price) {
        items.add(new Item(name,stock,price));
    }

    void addItem(String name, int stock, int price, int rate, int reorderdays) {
        items.add(new Item(name,stock,price,rate,reorderdays));
    }

    HashMap reorder() {
        /*
            reorderdays - # days to reorder stock
            rate - items per day sold
            returns a hash map
            listing the name (key) and number (value) of all of the items that need to be reordered
            today in order to ensure that the expected number of stock is always at least one
            (ie sufficient to last until the order arrives, assuming average sales). Whenever an
            item is ordered, seven days worth of average sales minus the current stock of that
            item is always ordered.
         */
        HashMap<String,Integer> reorder = new HashMap<>();
        for (Item item : items) {
            if (item.reorderdays != null && item.rate != null) {
                if (item.reorderdays*item.rate > item.stock)
                    reorder.put(item.name,item.rate*7-item.stock);
            }
        }
        return reorder;
    }
}
