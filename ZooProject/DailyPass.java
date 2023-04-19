public class DailyPass extends Ticket {
    private Date expirationDate;

    public DailyPass(String ticketID, Date soldDate, int numSold, String category, double price, LocalDate expirationDate) {
        super(ticketID, soldDate, numSold, category, price);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}