package Entities;

public class product {
	public String name;
	public Double price;
	
	
	public product() {
		
		}


	public product(String name, Double price) {
		
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return "\nproduct name= " + this.name +", price=" + price;
	}


	

	
	

	
}
