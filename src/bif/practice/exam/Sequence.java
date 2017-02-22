package bif.practice.exam;

/*
 * TODO: make this class implement the LetterGetter interface, 
 * but assume you are not permitted to define any of the methods here.
 * What else do you have to do add to "public class Sequence" below to 
 * make the compiler accept your class 
 */
public class Sequence {
	
	//TODO: answer why is this declared static? what happens when this is made non-static?
	private static int id = 0;
	
	//DO NOT ALTER OR ADD TO THE CODE BELOW
	
	private int myId;
	private String description;
	
	protected Sequence(String description){
		myId = id++;
		this.description = description;
	}
	
	public int getId(){
		return myId;
	}
	
	public String getDescription(){
		return description;
	
	}

}
