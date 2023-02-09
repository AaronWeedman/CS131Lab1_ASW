import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Aaron Weedman
 * @version 1.0
 * Lab1
 * Spring 2023
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;//assigned to the character to see if they're active or not
	private String intelligenceType;//assigned to the character to determine type of intelligence
	
	/*
	 * Setter for active
	 * @param aActive is being set to active
	 */
	protected void setActive(boolean aActive) {
		active=aActive;
	}//end setActive
	
	/*
	 * getter for active
	 * @return active
	 */
	protected boolean getActive() {
		return active;
	}//end getActive
	
	/*
	 * setter for intelligenceType
	 * @param aIntelligenctType is being set to intelligenceType
	 */
	protected void setIntelligenceType(String aIntelligenceType) {
		intelligenceType=aIntelligenceType;
	}//end setIntelligenceType
	
	/*
	 * getter for intelligenceType
	 * @return intelligenceType
	 */
	protected String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType

	/*
	 * The following is an empty-argument constructor where the super constructor is called
	 * and active is set to false and intelligenctType is set to Average using their setters
	 */
	public NonPlayerCharacter() {
		
		super();
		
		setActive(false);
		setIntelligenceType("Average");
	}//end NonPlayerCharacter
	
	/*
	 * The following is a preferred constructor from the UML diagram where the super constructor
	 * is called and active and intelligenceType are set
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String IntelligenceType) {
		
		super();
		setActive(active);
		setIntelligenceType(intelligenceType);	
	}//end NonPlayerCharacter
	
	/*
	 * The reportStructure() method calls the superclass reportStructure() method
	 * and adds to it using string builder
	 * @return toString
	 */
	public String reportStructure() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.reportStructure()+"\n");
        sb.append("          Active: " + getActive()+"\n");
        sb.append("\n         Intelligence: " + getIntelligenceType()+"\n");
        sb.append("\n==================================");
        return sb.toString();
	}//end reportStructure
	
	/*
	 *The introduce() method returns "Hello my name is" followed by the uniqueID
	 *@return "Hello my name is " + uniqueID
	 */
	public String introduce() {
		return "Hello my name is " + getUniqueID();
	}//end introduce
	
	
	String [] phraseArray = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
	Random r = new Random();
	
	/*
	 * the exclaim() method picks a random string from the phraseArray above
	 * using the random function and returns that phrase
	 * @return phraseArray[index]
	 */
	public String exclaim() {
		int index = r.nextInt(5);
		return phraseArray[index];
	}//end exclaim
	
}//end class