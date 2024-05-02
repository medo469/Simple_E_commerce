import java.util.Scanner;
public class Cart {
	private int customerId;
    private int nProducts;
    private Product[] products;
    Scanner scanner = new Scanner(System.in);
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId); // Take absolute value
        this.nProducts = Math.abs(nProducts); // Take absolute value
        this.products = new Product[nProducts];
    }

    // Getters and setters for attributes
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = Math.abs(customerId);
	}

	public int getnProducts() {
		return nProducts;
	}

	public void setnProducts(int nProducts) {
		this.nProducts = Math.abs(nProducts);
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
    
    
    // ...

    public float calculatePrice() {
        float totalPrice = 0.0f;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    
    public void addProduct(Product product,int i) {
      
        // Add the product to the cart
        products[i] = product;
        nProducts++;
    }
    public void removeProduct(Product productToRemove) {
        for (int i = 0; i < nProducts; i++) {
            if (products[i] == productToRemove) {
                // Shift remaining products to fill the gap
                for (int j = i; j < nProducts - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[nProducts - 1] = null; // Clear the last slot
                nProducts--;
                System.out.println("Product removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }
    public String PlaceOrder(String  placeOrder) {
		return placeOrder;
    }
    
    
}
