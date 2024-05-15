package Com.java.model;

public class Electronics extends Product {
	String brand;
	int warrantyPeriod;
	
	Electronics(){
		super();
	}
    public Electronics(int productId, String productName, String description, double price, int quantityInStock, String type, String brand, int warrantyPeriod) {
        super(productId, productName, description, price, quantityInStock, type); 
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	
}
