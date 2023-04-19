public class Ticket {
    private String ticketID;
    private Date soldDate;
    private int numSold;
    private String category;
    private double price;


    public String getTicketID() {
        return this.ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public Date getSoldDate() {
        return this.soldDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    public int getNumSold() {
        return this.numSold;
    }

    public void setNumSold(int numSold) {
        this.numSold = numSold;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}