
public class Product {
	//variables
protected int productId ;
protected String name;
protected float price;

public Product(int productId, String name, float price) {
    this.productId = Math.abs(productId); // Take absolute value
    this.name = name;
    this.price = Math.abs(price); // Take absolute value
}

//setters and getters
public int getProductid() {
	return productId;
}
public void setProductid(int productid) {
	this.productId = productid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float calculatePrice() {
	return price;
	// TODO Auto-generated method stub
	
}

}
