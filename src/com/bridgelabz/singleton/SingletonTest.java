/**
 * 
 */
package com.bridgelabz.singleton;

/**
 * @author Kalyani Deobhankar
 *
 * 
 */
public class SingletonTest {

	public static void main(String[] args) {

		System.out.println("EagerInitializedSingleton");

		EagerInitializedSingleton eagerInitializedSingleton = null;
		EagerInitializedSingleton eagerInitializedSingleton2 = null;
		eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
		System.out.println(eagerInitializedSingleton.hashCode());
		eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
		System.out.println(eagerInitializedSingleton2.hashCode());

		System.out.println();

		System.out.println("StaticBlockSingleton");
		StaticBlockSingleton blockSingleton = null;
		StaticBlockSingleton blockSingleton2 = null;
		blockSingleton = StaticBlockSingleton.getInstance();
		System.out.println(blockSingleton.hashCode());
		blockSingleton2 = StaticBlockSingleton.getInstance();
		System.out.println(blockSingleton2.hashCode());

		System.out.println();

		System.out.println("LazyInitializedSingleton");
		LazyInitializedSingleton initializedSingleton = null;
		LazyInitializedSingleton initializedSingleton2 = null;
		initializedSingleton = LazyInitializedSingleton.getInstance();
		System.out.println(initializedSingleton.hashCode());
		initializedSingleton2 = LazyInitializedSingleton.getInstance();
		System.out.println(initializedSingleton2.hashCode());
		System.out.println();

		System.out.println("ThreadSafeSingleton");
		ThreadSafeSingleton safeSingleton = null;
		ThreadSafeSingleton safeSingleton2 = null;
		safeSingleton = ThreadSafeSingleton.getInstance();
		System.out.println(safeSingleton.hashCode());
		safeSingleton2 = ThreadSafeSingleton.getInstance();
		System.out.println(safeSingleton2.hashCode());
		System.out.println();

		System.out.println("BillPughSingleton");
		BillPughSingleton billPughSingleton = null;
		BillPughSingleton billPughSingleton2 = null;
		billPughSingleton = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton.hashCode());
		billPughSingleton2 = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton2.hashCode());
		System.out.println();

		System.out.println("");

	}

}
