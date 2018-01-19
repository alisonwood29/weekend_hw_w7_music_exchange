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

    public String getType() {
        return this.type;
    }

    public int getNumberInBox() {
        return this.numberInBox;
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
