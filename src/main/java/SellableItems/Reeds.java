package SellableItems;

public class Reeds {

    private String type;
    private int numberInBox;
    private double buyPrice;
    private double sellPrice;

    public Reeds(String type, int numberInBox, double buyPrice, double sellPrice){
        this.type = type;
        this.numberInBox = numberInBox;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
