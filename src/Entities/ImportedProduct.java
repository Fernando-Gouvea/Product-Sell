package Entities;

public class ImportedProduct extends product  {
	public Double CustomFee;

	public ImportedProduct() {
		super();
		
	}

	public ImportedProduct(String name, Double price, Double CustomFee) {
		super(name, price);
		this.CustomFee = CustomFee;
	}

	public Double getCustomFee() {
		return CustomFee;
	}

	public void setCustomFee(Double customFee) {
		CustomFee = customFee;
	}
	public Double totalPrice() {
		return super.price + CustomFee;
	}
	
	@Override
	public String priceTag() {
		return "\nproduct name=" + super.name +", price=" + totalPrice() + ", Custons="+ CustomFee;
	}
	
}
