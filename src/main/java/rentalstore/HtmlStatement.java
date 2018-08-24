package rentalstore;

import java.util.Enumeration;

public class HtmlStatement extends Statement {


    protected String getHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    protected String getEachString(Rental each) {
        return each.getMovie().getTitle() + ": " + String.valueOf(each.getThisAmount()) + "<BR>\n";

    }

    protected String getFooter(Customer customer, String result) {
        result += "<P>You owe<EM>" + String.valueOf(getTotalAmount(customer)) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints(customer)) +
                "</EM> frequent renter points<P>";
        return result;
    }
}
