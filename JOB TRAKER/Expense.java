import java.util.Date;

public class Expense {
    private String description;
    private double amount;
    private Date date;
    private Participant paidBy;

    public Expense(String description, double amount, Date date, Participant paidBy) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.paidBy = paidBy;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public Participant getPaidBy() {
        return paidBy;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPaidBy(Participant paidBy) {
        this.paidBy = paidBy;
    }
}
