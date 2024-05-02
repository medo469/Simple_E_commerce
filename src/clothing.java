
public class clothing extends Product {
	//variables
	private String size;
	private String fabric;

	
	   public clothing(int productId, String name, float price, String size, String fabric) {
	        super(productId, name, price);
	        this.size = size;
	        this.fabric = fabric;
	    }
	
	//setters and getters
		public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
}
