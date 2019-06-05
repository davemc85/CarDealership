package carComponents;

public class Body extends CarComponents{

    public Body(String name, double unitCost) {
        super(name, unitCost);
    }

    public String getName () {
        return name;
    }

    public double getUnitCost () {
        return unitCost;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setUnitCost (double unitCost) {
        this.unitCost = unitCost;
    }
}
