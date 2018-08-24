package rentalstore;

import java.util.Enumeration;

public class HtmlStatement {
    public  String getResult(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getThisAmount()) + "<BR>\n";
        }
        //add footer lines
        result += "<P>You owe<EM>" + String.valueOf(customer.getTotalAmount()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }
}
