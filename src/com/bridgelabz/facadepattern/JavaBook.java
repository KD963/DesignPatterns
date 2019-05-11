/**
 * 
 */
package com.bridgelabz.facadepattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public class JavaBook implements BookShop{

	/* (non-Javadoc)
	 * @see com.bridgelabz.facadepattern.BookShop#bookName()
	 */
	@Override
	public void bookName() {
		System.out.println("Java book");
		
	}

	/* (non-Javadoc)
	 * @see com.bridgelabz.facadepattern.BookShop#bookPrice()
	 */
	@Override
	public void bookPrice() {
		System.out.println("Price : $500");
		
	}

}
