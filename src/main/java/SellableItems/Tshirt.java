package SellableItems;

import MusicShop.ISellable;

public class Tshirt implements ISellable{

    private String size;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Tshirt(String size, String description, double buyPrice, double sellPrice){
        this.size = size;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getSize() {
        return this.size;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
