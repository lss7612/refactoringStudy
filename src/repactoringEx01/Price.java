package repactoringEx01;

abstract class Price {

	abstract int getPriceCode();

	abstract double getCharge(int daysRented);
	
	int getFrequentRenterPoints(int daysRented) {
		int result = 0;

		// 포인트 추가
		result++;

		// 최신을 이틀 이상 대여하는 경우 추가 포인트 제공
		if ((getPriceCode() == Movie.NEW_RELEASE && daysRented > 1))
			result++;

		return result;
		
	}
}
