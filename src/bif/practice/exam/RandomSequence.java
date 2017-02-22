package bif.practice.exam;

/**
 * TODO: extend Sequence and implement all methods required to make this class
 * concrete - that is, so we can instantiate it. Unlike BasicSequence, this class
 * always returns a random letter no matter what index is provided to getLetter
 * @author marek
 *
 */
public class RandomSequence {
	/**
	 * no instance fields to save on memory! Might be useful for testing...
	 */
	
	private static final String letters = "ACGT";
	
	private char getRandomLetter(){
		return letters.charAt((int)(Math.random()*4));
	}

}
