public class Zoo {
    
    private String name;
    private String address;
    private ArrayList<Aminal> animals;
    private ArrayList<Person> person;
    private ArrayList<Ticket> tickets;
    
    public Zoo(String name, String address,ArrayList<Aminal> animals, ArrayList<Person> person, ArrayList<Ticket> tickets) {
        this.name = name;
        this.address = address;
        this.animals = animals;
        this.person = person;
        this.tickets = tickets;
    }
    
    public String getZooName(){
        return name;
    }
    public void setZooName(String name) {
        this.name = name;
    }

    public String getZooAddress() {
        return address;
    }

    public void setZooAddress(String address) {
        this.address = address;
    }
    
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    
    public ArrayList<Person> getPerson() {
        return Person;
    }
    
    public void setAnimals(ArrayList<Person> person) {
        this.person = person;
    }
    
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    
    public void setAnimals(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    
    
    
    
    
}