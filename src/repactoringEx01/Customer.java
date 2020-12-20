package repactoringEx01;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector<Rental> rentals = new Vector<>();
	
	public Customer(String name) {
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected Vector<Rental> getRentals() {
		return rentals;
	}
	
	public String statement() {
		Enumeration<Rental> rental = rentals.elements();
		String result = "Rental Record for "+ getName() + "\n";
		
		while(rental.hasMoreElements()) {
			Rental each = (Rental)rental.nextElement();
			result += "\t"+each.getMovie().getTitle()+"\t"+each.getCharge()+"\n";
			
		}
		result += "Amount owed is" + getTotalCharge() + "\n";
		result += "You earned " + getFrequentRenterPoints() + "frequent renter points";
		return result;
	}
	
	public int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		Enumeration<Rental> rental = rentals.elements();
		while(rental.hasMoreElements()) {
			Rental each = (Rental)rental.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints();
		}
		return frequentRenterPoints;
	}
	
	public double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rental = rentals.elements();
		while(rental.hasMoreElements()) {
			Rental each = (Rental) rental.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
}











