package repactoringEx01;

public class Movie {

	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private Price price;
	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
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

	public void setPriceCode(int arg) {

		switch (arg) {

		case REGULAR:
			this.price = new RegularPrice();
			break;
		case CHILDREN:
			this.price = new ChildrenPrice();
			break;
		case NEW_RELEASE:
			this.price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("incorrect Price Code");
		}

//		this.priceCode = priceCode;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
		
	}

}
