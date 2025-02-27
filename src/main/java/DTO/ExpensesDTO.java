package DTO;
import java.util.Date;

public class ExpensesDTO {

    private int expenseID;
    private String title;
    private String category;
    private double amount;
    private Date dateIncurred;

    public ExpensesDTO(int expenseID, String title, String category, double amount, Date dateIncurred) {
        this.expenseID = expenseID;
        this.title = title;
        this.category = category;
        this.amount = amount;
        this.dateIncurred = dateIncurred;
    }

    public ExpensesDTO() {}

    public int getExpenseID() {
        return expenseID;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDateIncurred() {
        return dateIncurred;
    }

    public void setExpenseID(int expenseID) {
        this.expenseID = expenseID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDateIncurred(Date dateIncurred) {
        this.dateIncurred = dateIncurred;
    }

    @Override
    public String toString() {
        return expenseID + ". " + title + " (" + category + ") - €" + amount + " (Incurred: " + dateIncurred + ")";
    }
}
