
public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    public  Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId); // Take absolute value
        this.orderId = Math.abs(orderId); // Take absolute value
        this.setProducts(products);
        this.totalPrice = Math.abs(totalPrice); // Take absolute value
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Total Price: $" + totalPrice);
        for(Product product : products) {
        System.out.println("Items: " + product.name+" - "+product.price+" - "+product.productId);
        }
        // Print other order details
    }

    
	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}}
