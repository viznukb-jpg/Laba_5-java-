package model.stones;

public abstract class Stone {
    protected double caratWeight;
    protected double pricePerCarat;
    protected double transparency;
    protected String type = "Undefined";

    protected Stone(double caratWeight, double pricePerCarat, double transparency) {
        this.caratWeight = caratWeight;
        this.pricePerCarat = pricePerCarat;
        this.transparency = transparency;
    }

    public double getCaratWeight() {return caratWeight;}
    public double getPricePerCarat() {return pricePerCarat;}
    public double getTransparency() {return  transparency;}
    public String getType() {return type;}


    public abstract double getTotalPrice();

}