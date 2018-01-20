package Customer;

import Instruments.Guitar;
import Instruments.IPlayable;
import Instruments.Instrument;
import Instruments.Type;
import MusicShop.ISellable;
import MusicShop.MusicShop;

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
//        MusicShop.removeStock(item);
        if(getWallet() >= item.getSellPrice()) {
            this.shoppingBag.add(item);
            this.wallet -= item.getSellPrice();
        }
    }
//    In this method i was trying to use the item removed from stock array in music shop but get error.

    public String play(Instrument instrument) {
        return instrument.play();
    }


    public ArrayList<String> playBoughtInstruments() {
        ArrayList<String> instruments = new ArrayList<>();
        for(ISellable item: shoppingBag) {
            if (item instanceof Instrument) {
                Instrument instrument = (Instrument) item;
                instruments.add(play(instrument));
            }
        }
        return instruments;
    }

    public String playBoughtInstrument(Instrument instrument) {
        if(shoppingBag.contains(instrument)) {
           return play(instrument);
        }
        else{
            return "You do not own this instrument";
        }
    }
}
