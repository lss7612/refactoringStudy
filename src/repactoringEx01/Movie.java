package repactoringEx01;

public class Movie {
	
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	public double getCharge(int daysRented) {
			
			double eachAmount=0;
			
			switch (getPriceCode()) {
			case Movie.REGULAR:
				eachAmount += 2;
				if(daysRented>2)
					eachAmount += (daysRented-2)*1.5;
				break;
			case Movie.NEW_RELEASE:
				eachAmount += daysRented*3;
				break;
			case Movie.CHILDREN:
				eachAmount += 1.5;
				if(daysRented>3)
					eachAmount += (daysRented-3)*1.5;
				break;
		}
			
			return eachAmount;
		}
	
		public int getFrequentRenterPoints(int daysRented) {
			int result = 0;
			
			//포인트 추가
			result ++;
			
			//최신을 이틀 이상 대여하는 경우 추가 포인트 제공
			if((getPriceCode()==Movie.NEW_RELEASE && daysRented>1))
				result ++;
		
			return result;		
		}
	
		
	}

	
