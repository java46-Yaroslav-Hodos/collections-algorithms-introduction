package telran.util;

public interface SortedSet<T> extends Set<T> {
	/**
	 * 
	 * @return reference to the last object
	 */
	T first();
	
	/**
	 * 
	 * @return reference 
	 */
	 T last();
	 
}
