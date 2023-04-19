public class Visitor extends Person {
    private String visitorID;

    public Visitor(String name, String email, String visitorID) {
        super(name, email);
        this.visitorID = visitorID;
    }

    public String getVisitorID() {
        return this.visitorID;
    }

    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }
}