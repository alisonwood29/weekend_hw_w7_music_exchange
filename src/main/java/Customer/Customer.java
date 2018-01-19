package Customer;

import Instruments.Guitar;
import Instruments.IPlayable;
import Instruments.Instrument;
import Instruments.Type;
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
        ISellable guitar = new Guitar(Type.WOODWIND, "", "", "", 9.99, 9.99, 8);
        if (guitar instanceof Instrument) {

            Instrument instr = (Instrument) guitar;
            play(instr);
        }

        return instrument.play();
    }

}
