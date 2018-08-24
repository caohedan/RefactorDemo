package rentalstore;

import java.util.Enumeration;

public class TxtStatement extends Statement{



    protected String getFooter(Customer customer, String result) {
        result += "Amount owed is" + String.valueOf(getTotalAmount(customer)) + "\n";
        result += "You earned" + String.valueOf(getTotalFrequentRenterPoints(customer)) + " frequent renter points";
        return result;
    }

    protected String getEachString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getThisAmount()) + "\n";
    }

    protected String getHeader(Customer customer) {
        return "Rental Record for " +customer.getName() + "\n";
    }


}
