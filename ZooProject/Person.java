public class Person {
    private String name;
    private String email;


    public Animal(String name,String email) {
        this.name = name;
        this.email = email;
    }

    public String getPersonName() {
        return this.name;
    }

    public void setPersonName(String name) {
        this.name = name;
    }
    public String getPersonEmail() {
        return this.email;
    }

    public void setPersonEmail(String email) {
        this.email = email;
    }

}