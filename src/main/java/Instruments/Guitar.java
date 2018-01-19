package Instruments;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(Type type, String model, String colour, String material, double buyPrice, double sellPrice, int strings) {
        super(type, model, colour, material, buyPrice, sellPrice);
        this.strings = strings;
    }


    public int getStrings() {
        return this.strings;
    }

    public String play(){
        return "Strumming away";
    }
}
