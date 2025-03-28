import java.time.LocalDate;

public class Perishable extends Product{

    // Expiry date
    private LocalDate expiryDate;

    // Getter & setter for expiryDate
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Default constructor, sets default date to Jan 1st 1970
    public Perishable() {
        super();
        this.expiryDate = LocalDate.of(1970, 1, 1);
    }
    
    public Perishable() {

    }
}
