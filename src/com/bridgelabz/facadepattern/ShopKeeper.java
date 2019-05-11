/**
 * 
 */
package com.bridgelabz.facadepattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public class ShopKeeper {

	private BookShop java;
	private BookShop sql;
	private BookShop ds;

	public ShopKeeper() {
		java = new JavaBook();
		sql = new SqlBook();
		ds = new DSBook();
	}

	public void javaSale() {
		java.bookName();
		java.bookPrice();
	}

	public void sqlSale() {
		sql.bookName();
		sql.bookPrice();
	}

	public void dsSale() {
		ds.bookName();
		ds.bookPrice();
	}

}
