
public class Sandwich {
	
	static String mainIngred;
	static String breadType;
	static double price;
	
	public String getMainIngred() {
		return mainIngred;
		
	}
	
	public String getBreadType() {
		return breadType;
	}

	public double getPrice() {
		return price;
	}
	
	public void setMainIngred(String newMainIngred) {
		mainIngred = newMainIngred;
	}
	
	public void setBreadType(String newBreadType) {
		breadType = newBreadType;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
}
