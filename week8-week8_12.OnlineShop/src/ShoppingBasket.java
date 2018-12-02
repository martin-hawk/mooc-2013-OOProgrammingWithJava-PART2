
import java.util.HashMap;
import java.util.Map;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
           this.basket.get(product).increaseAmount();
        } else {        
        this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        for (String string : this.basket.keySet()) {
            totalPrice += this.basket.get(string).price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (String string : this.basket.keySet()) {
            System.out.println(this.basket.get(string));
        }
    }
}
