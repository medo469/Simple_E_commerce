
public class Customer  {
	//variables
	private int customerId=23011666;
	private String name="mohammed osman ibrahim osman";
	private String address="al_smouha";
	
	  public Customer(int customerId, String name, String address) {
	        this.customerId = Math.abs(customerId); // Take absolute value
	        this.name = name;
	        this.address = address;
	    }
	
	//setters and getters
	public int getCustomerid() {
		return customerId;
	}
	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	
}
