public class Decaf extends Beverage {
    public Decaf() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
