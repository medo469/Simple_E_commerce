
public class Electronics extends Product{
	//variables
	private String brand;
	private int warranty;

	 public Electronics(int productId, String name, float price, String brand, int warrantyPeriod) {
	        super(productId, name, price);
	        this.brand = brand;
	        this.warranty = Math.abs(warrantyPeriod); // Take absolute value
	    }
	//setters and getters
		public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
}
