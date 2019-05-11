/**
 * 
 */
package com.bridgelabz.adapterdesignpattern;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
