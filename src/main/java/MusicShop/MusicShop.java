package MusicShop;

import Instruments.Guitar;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISellable> stock;
    private double budget;

    public MusicShop(String name, double budget){
        this.name = name;
        this.stock = new ArrayList<>();
        this.budget = budget;
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addToStock(ISellable item) {
        if(item.getBuyPrice() <= getBudget()) {
            this.stock.add(item);
            this.budget -= item.getBuyPrice();
        }
    }

    public void removeStock(ISellable item) {
        this.stock.remove(item);
        this.budget += item.getSellPrice();
    }

//    public ISellable removeStock() {
//        ISellable item = this.stock.remove(0);
//        this.budget += item.getSellPrice();
//        return item;
//    }

    public double potentialProfit() {
        double profit = 0;
        for(ISellable item: this.stock){
            profit += item.calculateMarkUp();
        }
        return profit;
    }

    public double getBudget() {
        return this.budget;
    }
}
