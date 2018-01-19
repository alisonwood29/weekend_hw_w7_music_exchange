package Customer;

import Instruments.Instrument;
import MusicShop.ISellable;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISellable> shoppingBag;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.shoppingBag = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public int shoppingBagCount() {
        return this.shoppingBag.size();
    }

    public void addToShoppingBag(ISellable item) {
        if(getWallet() >= item.getSellPrice()) {
            this.shoppingBag.add(item);
            this.wallet -= item.getSellPrice();
        }
    }

    public String play(Instrument instrument) {
        return instrument.play();
    }
}
