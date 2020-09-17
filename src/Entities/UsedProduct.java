package Entities;

import java.util.Date;

public class UsedProduct extends product{
	public Date manufatureDate;

	public UsedProduct() {
		super();
		
	}

	public UsedProduct(String name, Double price, Date date) {
		super(name, price);
		this.manufatureDate = date;
	}

	public Date getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(Date manufatureDate) {
		this.manufatureDate = manufatureDate;
	}
	
	@Override
	public String priceTag() {
		return "\nproduct name=" + super.name +", price=" + price +", Manufature Date=" + manufatureDate;
	
	}
}
