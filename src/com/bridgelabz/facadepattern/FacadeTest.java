/**
 * 
 */
package com.bridgelabz.facadepattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public class FacadeTest {

	public static void main(String[] args) {

		ShopKeeper shop = new ShopKeeper();
		shop.javaSale();
		shop.sqlSale();
		shop.dsSale();
	}

}
