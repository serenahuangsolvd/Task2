public class Bird extends Animal {
    private boolean canFly;
    private String color;

    public Bird(String name, String species, double weight, boolean canFly, String color) {
        super(name, species, weight);
        this.canFly = canFly;
        this.color = color;
    }

    public boolean getCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}