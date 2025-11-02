package model.stones;

public class Ruby  extends PreciousStone{
    private String origin;

    public Ruby(
            double caratWeight, double pricePerCarat, double transparency,int rarityLevel, String origin) {
        super(caratWeight, pricePerCarat, transparency,rarityLevel);
        this.origin = origin;
    }

    public String getOrigin() {return origin;}

    @Override
    public double getTotalPrice(){return 1;}
}