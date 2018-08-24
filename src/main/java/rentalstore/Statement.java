package rentalstore;

import java.util.Enumeration;

public abstract class Statement {
    String getResult(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeader(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getEachString(each);
        }
        result = getFooter(customer, result);
        return result;
    }

    protected abstract String getFooter(Customer customer, String result);

    protected abstract String getEachString(Rental each);

    protected abstract String getHeader(Customer customer);

    double getTotalAmount(Customer customer) {
        double result = 0;
        Enumeration rentals = customer.getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getThisAmount();
        }
        return result;
    }


    int getTotalFrequentRenterPoints(Customer customer) {
        int result = 0;
        Enumeration rentals = customer.getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;

    }
}
