package rentalstore;

import java.util.Enumeration;

public class TxtStatement {

    public String  getResult(Customer customer){
        Enumeration rentals = customer.getRentals().elements();
        String result = "Rental Record for " +customer.getName() + "\n";
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getThisAmount()) + "\n";
        }
        //add footer lines
        result += "Amount owed is" + String.valueOf(customer.getTotalAmount()) + "\n";
        result += "You earned" + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }


}
