/**
 * This is the Application object that will launch our application
 * @author Aaron Weedman
 * @version 1.0
 * Lab1 
 * Spring 2023
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		
		System.out.println(npc.reportStructure());//prints the reportStructure method from the NonPlayerCharacter class
		System.out.println(npc.introduce());//prints the introduce method from the NonPlayerCharacter class
		System.out.println(npc.exclaim());//prints the exclaim method from the NonPlayerCharacter class

		//System.out.println(npc.getActive());
		//System.out.println(npc.getIntelligenceType());
	}//end main

}//end class