
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            if (this.stocks.get(product) - 1 >= 0) {
                this.stocks.put(product, this.stocks.get(product) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<String>();

        for (String string : this.prices.keySet()) {
            set.add(string);
        }
        return set;
    }
}
