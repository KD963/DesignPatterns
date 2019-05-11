/**
 * 
 */
package com.bridgelabz.visitorpattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public class Book implements ItemElement {

	private int price;
	private String isbnNumber;

	/**
	 * 
	 */
	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
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
