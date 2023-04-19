public class Animal {
    private String name;
    private String species;
    private double weight;

    public Animal(String name,String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getAnimalName() {
        return this.name;
    }

    public void setAnimalName(String name) {
        this.name = name;
    }
    public String getAnimalSpecies() {
        return this.species;
    }

    public void setAnimalSpecies(String species) {
        this.species = species;
    }

    public int getAnimalWeight() {
        return this.weight;
    }

    public void setAnimalWeight(double weight) {
        this.weight = weight;
    }
}
