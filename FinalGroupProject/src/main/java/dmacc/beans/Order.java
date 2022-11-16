package dmacc.beans;

public class Order {
	double totalPrice;
	double subTotal;
	
	/*
	 * these are the prices for pizza
	 */
	final double SMALLPRICE = 10.99;
	final double MEDPRICE = 12.99;
	final double LARGEPRICE = 13.99;
	final double SALESTAX = 0.07;
	
	
	Person customer = new Person();
	Pizza pizzas = new Pizza();
	/*
	 * pizza should be a list so that way you can have multiple kinds
	 * right now you can have different quantities but only 1 kind
	 */
	public Order() {
		super();
	}

	
	public Order(Person customer, Pizza pizzas) {
		super();
		this.customer = customer;
		this.pizzas = pizzas;
	}
	
	public Person getCustomer() {
		return customer;
	}
	
	public void setCustomer(Person customer) {
		this.customer = customer;
	}
	public Pizza getPizzas() {
		return pizzas;
	}
	public void setPizzas(Pizza pizzas) {
		this.pizzas = pizzas;
	}
	
	public double Total(Pizza pizzaFlavor) {/*once we make pizza list for multiple kinds of pizzas, 
	we can make it so this is in that class and the order class should take the pizzaList as a param instead of pizza
	*/
		double price;//all of the ||'s are unneeded because we can do that on input, but no harm in doing it here
		if (pizzaFlavor.getSize().equals("small") || pizzaFlavor.getSize().equals('s')) {//can type small or s
			price = SMALLPRICE;
		} else if (pizzaFlavor.getSize().equals("medium") || pizzaFlavor.getSize().equals("med")||pizzaFlavor.getSize().equals('m')){//can type medium or med or m
			price = MEDPRICE;
		}else {
			price = LARGEPRICE;
		}
		
		double subtotal = price * pizzas.getQuantity();
		double total = subtotal + (subtotal * SALESTAX);
		return total;	
				
	}
	
}
