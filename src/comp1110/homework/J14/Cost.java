package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cost {

    /*
        create a class `Cost`, that tracks the cost of items. Within `Cost`, create a
        public inner (non-static) class, `Item`, that includes the following:
        ~~~~
        public class Item {
            String name;
            int cost;   // in cents
            public Item(String n, int c) {
                name = n;
                cost = c;
            }
            public String toString() {
                return name + " " + cost;
            }
        }
        ~~~~

        * Modify your inner Item class so that it implements the `Comparable<Item>` interface.
        Items should be ordered based on the cost (lowest cost first). If two items cost the
        same amount then order these items alphabetically based on their name.

        * Add an instance data structure (`HashMap<String, Item>`) to your `Cost` class for
        storing items, using the item's name as the key.

        * Add an instance method `void addItem(String name, int cost)` to your `Cost` class that
        allows new items to be added, and a method `printCost()` that prints out all items sorted
        in the order described above, one item per line, with a single space separating the item
        name and its cost.

        * Suppose you are given a gift voucher for the above shop. Assume that the shop does not
        give change on gift vouchers, and you do not wish to spend any more than what is in the
        gift voucher. Add an instance method `int voucherWaste(int value)` to `Cost` which will
        return the difference between the value of the voucher (in cents) and what could be spent
        given the set of items in the shop. e.g. Say you had a voucher for $100 and the items in
        the shop were worth: $87, $20, $99, $12, then the most you could spend would be the full
        $100 (just buy 5 of the $20 item) so there would be zero waste, whereas, if the items in
        the shop were worth: $87, $22, $30, $45 then the most you could spend would be $97
        (remember that your method will express the voucher and the costs in the same units, cents).
     */
    int voucherWaste(int value) {
        // find all possible combinations of products
        // pick maximum combination whose total cost <= 100
        ArrayList<Item> a = new ArrayList<>();
        for (Map.Entry<String,Item> entry : items.entrySet()) a.add(entry.getValue());

        return 0;
    }

    void addItem(String name, int cost) {
        items.put(name,new Item(name,cost));
    }

    void printCost() {
        ArrayList<Item> a = new ArrayList<>();
        for (Map.Entry<String,Item> entry : items.entrySet()) a.add(entry.getValue());
        Collections.sort(a);
        for (Item i : a) System.out.println(i);
    }

    HashMap<String, Item> items = new HashMap<>();

    public static void main(String[] args) {

    }

    public class Item implements Comparable<Item> {

        String name;
        int cost;   // in cents

        public Item(String n, int c) {
            name = n;
            cost = c;
        }

        public String toString() {
            return name + " " + cost;
        }

        @Override
        public int compareTo(Item o) {
            if (this.cost == o.cost) {
                return this.name.compareTo(o.name);
            }
            else return this.cost-o.cost;
        }

    }

}
