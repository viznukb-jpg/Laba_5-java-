package model;
import model.stones.*;
import java.util.List;
import java.util.ArrayList;

public class Necklace{
    private String name;
    private int capacity;
    private List<Stone> stones;

    public Necklace(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.stones = new ArrayList<>();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

    public List<Stone> getStones() {return new ArrayList<>(stones);}

    public double getGeneralCaratWeight() {return 1;}

    public double getGeneralTotalWeight() {return 1;}

    public List<Stone> sortByPrice() {return null;}

    public void addStone(Stone stoneObj) {return;}

    public boolean removeStone(Stone stoneObj) {
        return stones.remove(stoneObj);
    }

    public List<Stone> filterByTransparency(double doubleMin, double doubleMax) {return null;}
}