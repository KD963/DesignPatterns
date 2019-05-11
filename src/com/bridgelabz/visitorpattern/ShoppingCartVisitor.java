/**
 * 
 */
package com.bridgelabz.visitorpattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
