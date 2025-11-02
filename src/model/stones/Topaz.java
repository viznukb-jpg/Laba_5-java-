package model.stones;

public class Topaz extends SemiPreciousStone{
    private String tradeName;

    public Topaz(
            double caratWeight, double pricePerCarat,
            double transparency, String treatmentType, String tradeName){

        super(caratWeight, pricePerCarat, transparency, treatmentType);
        this.tradeName = tradeName;
    }

    public String getTradeName() {return tradeName;}

    @Override
    public double getTotalPrice() {return 1;}
}