public class Mammal extends Animal {
    private boolean hasFur;
    private int numLegs;

    public Mammal(String name, String species, double weight, boolean hasFur, int numLegs) {
        super(name, species, weight);
        this.hasFur = hasFur;
        this.numLegs = numLegs;
    }

    public boolean getHasFur() {
        return this.hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public int getNumLegs() {
        return this.numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
}