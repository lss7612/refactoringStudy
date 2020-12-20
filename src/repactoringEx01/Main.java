package repactoringEx01;

public class Main {

	public static void main(String[] args) {

		Movie bbong = new Movie("bbong", Movie.NEW_RELEASE);
		Movie dulrie = new Movie("dulrie",Movie.CHILDREN);
		
		Rental rental01 = new Rental(bbong, 4);
		Rental rental02 = new Rental(dulrie,5);
		
		Customer john = new Customer("john");
		System.out.println(john.getRentals());
		System.out.println(rental01.getCharge());
		System.out.println(rental02.getCharge());
		
		System.out.println(john.statement());
		
	}
	
}
