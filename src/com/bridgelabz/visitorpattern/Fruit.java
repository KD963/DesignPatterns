/**
 * 
 */
package com.bridgelabz.visitorpattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public class Fruit implements ItemElement {

	private int pricePerKg;
	private int weight;
	private String name;

	/**
	 * 
	 */
	public Fruit(int pricePerKg, int weight, String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	/**
	 * @return the priceperkg
	 */
	public int getPricePerKg() {
		return pricePerKg;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.visitorpattern.ItemElement#accept(com.bridgelabz.
	 * visitorpattern.ShoppingCartVisitor)
	 */
	@Override
	public int accept(ShoppingCartVisitor visitor) {

		return visitor.visit(this);
	}

}
