package model.stones;

public class Diamond extends PreciousStone{
    private String cutGrade;

    public Diamond(
            double caratWeight, double pricePerCarat, double transparency,int rarityLevel, String cutGrade) {
        super(caratWeight, pricePerCarat, transparency,rarityLevel);
        this.cutGrade = cutGrade;
    }

    public String getCutGrade() {return cutGrade;}

    @Override
    public double getTotalPrice() {return 1;}
}