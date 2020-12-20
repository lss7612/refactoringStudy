package repactoringEx01;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	double getCharge(int daysRented) {
		double result = 0;
		result += daysRented*3;
		return result;
	}

}
