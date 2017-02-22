package bif.practice.exam;

/**
 * this interface is a little silly, but imagine that your database or some other very
 * important piece of software requires it. Stranger things have happened....
 * @author marek
 *
 */
public interface LetterGetter {
	/**
	 * the implementing class is assumed to have a gene sequence (someplace)
	 * it will return the letter at the specified position
	 * @throws IllegalArgumentException if position is outside the bounds of the underlying representation
	 * @param position indicates the desired position of a letter
	 * @return the letter at the indicated position
	 */
	public char getLetter(int position) throws IllegalArgumentException;
	/**
	 * gets the minimum index that is valid (will not throw exception)
	 * will return a disjoint set in conjunction with getMax() if there is no valid index
	 * @return minimum valid index
	 */
	public long getMin();
	/**
	 * gets the maximim index that is valid (will not throw exception)
	 * will return a disjoint set in conjunction with getMin() if there is no valid index
	 * @return maximim valid index
	 */
	public long getMax();

}
