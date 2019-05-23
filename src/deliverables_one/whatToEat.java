/*Author: Tia Steele
 * Java Bootcamp prework deliverable_one:What to Eat
 * Date: 5/23/2019
 */

package deliverables_one;

import java.util.Scanner;

public class whatToEat {

	public static void main(String args[]) {
		// Variable Declarations and Initialization of Default values
		Scanner in = new Scanner(System.in);// Allows user input
		String eventType = "casual"; // Default event type
		int partySize = 1; // Default party size
		String foodType = "sandwiches"; // Default food type
		String cookType = "in the microwave"; // Default cook instructions
		// Stores calculated result, initialized with default beginning sentence
		String result = "Since you're hosting a ";
		// Stores user choice in menu
		int choice = 1;
		// flare to break up screen space for users
		String flare = "**************************************************";

		// User experience: Explaining purpose of program to user
		System.out.println("This program is to assist you in " + "\npreparing for hosting a dinner party."
				+ "\nPlease Select options below: \n");
		System.out.println(flare);

		// Create menu output to control user choice options
		System.out.println("What type of dinner party are you having:" + "\n\t 1. Casual" + "\n\t 2. Semi-Formal"
				+ "\n\t 3. Formal");

		// Accept user input
		choice = in.nextInt();

		// Determine selection and set values for eventType and foodType
		if (choice == 1) {
			eventType = "casual";
			foodType = "sandwiches";
		} else if (choice == 2) {
			eventType = "semi-formal";
			foodType = "fried chicken";
		} else if (choice == 3) {
			eventType = "formal";
			foodType = "chicken parmesan";
		} else
			System.out.println("Invalid Choice, Option 1 was selected as default.");

		// Add eventType to output String
		result += eventType;

		// Get user input for partySize
		System.out.println("What is the size of your party?");
		partySize = in.nextInt();

		// Add partySize and text to output String
		result += " event for " + partySize;

		// Set cookType and determine the correct use of participant,
		// also added newline to maintain formating
		if (partySize == 1) {
			result += "\nparticipant, you should serve ";
			cookType = "in the microwave";
		} else if (partySize >= 2 & partySize <= 12) {
			result += "\nparticipants, you should serve ";
			cookType = "in your kitchen";
		} else {
			result += "\nparticipants, you should serve ";
			cookType = "by your caterer";
		}

		// Add last variables to results and added newline to maintain formating
		result += foodType + "\nprepared " + cookType + ".";

		// Display results to user and separated statement for readability with flare
		System.out.println(flare + "\n");
		System.out.println(result);
		System.out.println("\n" + flare);

	}

}
