package Instruments;

public class Trombone extends Instrument {

    private int valves;

    public Trombone(Type type, String model, String colour, String material, double buyPrice, double sellPrice, int valves) {
        super(type, model, colour, material, buyPrice, sellPrice);
        this.valves = valves;
    }

    public int getValves() {
        return this.valves;
    }

    public String play(){
        return "Sliding up and down";
    }
}
