public class Reptile extends Animal {
    private boolean hasLegs;

    public Reptile(String name, String species, double weight, boolean hasLegs) {
        super(name, species, weight);
        this.hasLegs = hasLegs;
    }

    public boolean getHasLegs() {
        return this.hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }
}