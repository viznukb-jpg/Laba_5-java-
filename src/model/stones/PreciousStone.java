package model.stones;

public abstract class PreciousStone extends Stone{
    protected int rarityLevel;

    protected PreciousStone(
            double caratWeight, double pricePerCarat, double transparency,int rarityLevel){
        super(caratWeight, pricePerCarat, transparency);
        this.type = "Precious";
        this.rarityLevel = rarityLevel;
    }

    public int getRarityLevel(){return this.rarityLevel;}
}