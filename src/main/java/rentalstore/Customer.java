package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
       return new TxtStatement().getResult(this);
    }

    public String htmlStatement() {
       return new HtmlStatement().getResult(this);
    }

    public Vector getRentals() {
        return rentals;
    }

    public void setRentals(Vector rentals) {
        this.rentals = rentals;
    }
}
