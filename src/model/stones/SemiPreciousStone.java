package model.stones;

public abstract class SemiPreciousStone extends Stone{
    protected String treatmentType;

    protected SemiPreciousStone(
            double caratWeight, double pricePerCarat, double transparency,String treatmentType){
        super(caratWeight, pricePerCarat, transparency);
        this.type = "Semi-precious";
        this.treatmentType = treatmentType;
    }

    public String getTreatmentType(){return this.treatmentType;}
}