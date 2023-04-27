package com.dal.piztask;


abstract class Pizzaa {
	protected String name;
	protected double cost;

	public Pizzaa(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public abstract void pizzaprice();
}

class Deluxeveggiepizza extends Pizzaa {
	public Deluxeveggiepizza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Deluxe Veg Pizza : " + cost);
	}
}

class Barbecuechickenpizza  extends Pizzaa {
	public Barbecuechickenpizza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Barbecue Chicken Pizza : " + cost);
	}
}

//Abstract factory interface
interface PizzaaFactory {
	public Pizzaa createPizza(String name, double cost);
}

//Concrete factory classes
class DeluxeveggiepizzaFactory implements PizzaaFactory {
	public Pizzaa createPizza(String name, double cost) {
		return new Deluxeveggiepizza(name, cost);
	}
}

class BarbecuechickenpizzaFactory implements PizzaaFactory {
	public Pizzaa createPizza(String name, double cost) {
		return new Barbecuechickenpizza(name, cost);
	}
}

//Client class
class PizzaPrice {
	private PizzaaFactory factory;

	public PizzaPrice(PizzaaFactory factory) {
		this.factory = factory;
	}

	public void pizzaprice(String name, double cost) {
		Pizzaa pizza = factory.createPizza(name, cost);
		pizza.pizzaprice();
	}
}

//Example usage
public class AbstractPizzaFactory {
	public static void main(String[] args) {
		PizzaaFactory DeluxeveggiepizzaFactory = new DeluxeveggiepizzaFactory();
		PizzaaFactory BarbecuechickenpizzaFactory = new BarbecuechickenpizzaFactory();

		PizzaPrice DeluxeveggiepizzaFactoryprice = new PizzaPrice(DeluxeveggiepizzaFactory);
		DeluxeveggiepizzaFactoryprice.pizzaprice("Deluxe Veggie Pizza", 550.0);

		PizzaPrice BarbecuechickenpizzaFactoryprice = new PizzaPrice(BarbecuechickenpizzaFactory);
		BarbecuechickenpizzaFactoryprice.pizzaprice("Barbecue Chicken Pizza", 950.0);
	}
}
