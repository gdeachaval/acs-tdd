public class Speed {

    private Unit unit;
    private double magnitude;

    public Speed(Unit unit, double magnitude) {
        this.unit = unit;
        this.magnitude = magnitude;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public void increasePercentage(double percentage) {
        this.magnitude += this.magnitude * percentage;
    }
}
