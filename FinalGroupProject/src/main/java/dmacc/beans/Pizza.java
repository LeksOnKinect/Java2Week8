package dmacc.beans;

public class Pizza {
	String topping;//pepperoni, cheese, sausage
	String size;//small, medium, large
	boolean delivery;//true=delivery, false=pickup
	int quantity;// how many pizzas they want
	
	public Pizza() {
		super();
	}
	
	public Pizza(String topping, String size, boolean delivery, int quantity) {
		super();
		this.topping = topping;
		this.size = size;
		this.delivery = delivery;
		this.quantity = quantity;
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isDelivery() {
		return delivery;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
