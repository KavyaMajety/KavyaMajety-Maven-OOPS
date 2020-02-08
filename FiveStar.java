package epamHT.HomeTask2;

public class FiveStar extends MilkChocolate{
	int quantity;
	float weight, price;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public FiveStar(int quantity, float weight, float price) {
		super();
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
	}
	public FiveStar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	float calculateWeight(float weight, int quanity) {
		// TODO Auto-generated method stub
		return super.calculateWeight(weight, quanity);
	}
		
	

}
