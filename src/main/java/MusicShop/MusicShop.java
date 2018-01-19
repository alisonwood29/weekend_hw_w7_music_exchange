package MusicShop;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISellable> stock;

    public MusicShop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }
}
