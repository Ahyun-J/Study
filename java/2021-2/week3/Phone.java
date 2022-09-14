package week3;

public class Phone {
	  private String maker;

	  private int price;

	 

	  public Phone() {
	    this("None", 0);

	  }

	  public Phone(String m, int p) {
	    this.maker = m;
	    this.price = p;

	  }

	  public String getMaker() {
	    return this.maker;

	  }

	  public void setMaker(String maker) {
	    this.maker = maker;

	  }

	  public int getPrice() {
	    return this.price;

	  }

	  public void setPrice(int price) {
	    this.price = price;

	  }

	  @Override
	  public String toString() {
	    return "Phone[maker=" + maker + ", price=" + price + "]";

	  }

}
