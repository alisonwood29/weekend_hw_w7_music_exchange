package Instruments;

public class Saxophone extends Instrument {

    String size;

    public Saxophone(Type type, String model, String colour, String material, double buyPrice, double sellPrice, String size) {
        super(type, model, colour, material, buyPrice, sellPrice);
        this.size = size;
    }


    public String getSize() {
        return this.size;
    }

    public String play(){
        return "Puffing away";
    }
}
