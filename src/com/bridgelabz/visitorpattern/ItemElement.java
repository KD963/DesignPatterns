/**
 * 
 */
package com.bridgelabz.visitorpattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
