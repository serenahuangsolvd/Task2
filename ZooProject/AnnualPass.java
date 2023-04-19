public class AnnualPass extends Ticket {
    private Date startDate;
    private Date endDate;

    public AnnualPass(String ticketID, Date soldDate, int numSold, String category, double price, Date startDate, Date endDate) {
        super(ticketID, soldDate, numSold, category, price);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}