package Customer;

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

}
