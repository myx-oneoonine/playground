package allinoneconverter;

public class Unit {

    private String unitName;
    private double value;

    public Unit(String unitName, double value) {
        this.unitName = unitName;
        this.value = value;
    }

    public String getUnitName() {
        return unitName;
    }

    public double getValue() {
        return value;
    }

}
