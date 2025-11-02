package model.stones;

public class Aquamarine extends SemiPreciousStone{
    private boolean inclusions;

    public Aquamarine(
            double caratWeight, double pricePerCarat,
            double transparency, String treatmentType, boolean inclusions){

        super(caratWeight, pricePerCarat, transparency, treatmentType);
        this.inclusions = inclusions;
    }

    public boolean hasInclusions() {return this.inclusions;}

    @Override
    public double getTotalPrice() {return 1;}
}