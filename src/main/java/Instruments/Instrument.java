package Instruments;

import MusicShop.ISellable;

public abstract class Instrument implements IPlayable, ISellable{

    private Type type;
    private String model;
    private String colour;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public Instrument(Type type, String model, String colour, String material, double buyPrice, double sellPrice){
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public Type getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.buyPrice;
    }
}
