/*
 * Welcome to ShapeGenerator.java! This program prompts for the user to enter a number between 1-5, and depending on the response, draws a shape
 * based on the values and dimensions they give. However, if the answer or dimension they give is out of range, the program will continuously prompt
 * the user until a valid answer or dimension is given. At the end, the program will ask the user to if they want to continue. If they answer 
 * 'y' or 'Y', for yes, the program will repeat itself, if they answer 'n' or 'N', for no, the program will exit, displaying statistics on screen. 
 * 
 * Author : Smit Bhavsar
 * Date : November 21, 2017
 * Class : ICS3U1-12
 * 
 */
import java.util.Scanner;

public class ShapeGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int length = 0;
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		int ans = 0;
		int high = 0, wide = 0, triHei = 0;
		char res = 'y';
		// Greets user
		System.out.println("Welcome to Shape Generator!!!\n");
		do {
			// gives the user a variety of options from 1-5, whichever they choose, it will be drawn
			System.out.println("What would you like to draw? (Negative number to exit)");
			System.out.println("1. Horizontal Line");
			System.out.println("2. Vertical Line");
			System.out.println("3. Rectangle");
			System.out.println("4. Right-angle Triangle");
			System.out.println("5. Isoceles Triangle");
			System.out.print("Answer (1-5) : ");
			ans = Integer.parseInt(input.nextLine());
			
			// However, if they answer out of the range from 1-5, the program will constantly ask the user to correct themselves
			while (ans < 1 || ans > 5) {
				System.out.println("Invalid choice! Must be within 1-5.");
				System.out.print("Answer (1-5) : ");
				ans = Integer.parseInt(input.nextLine());
			}

			if (ans == 1) {
				// Asks the user how many pixels horizontally they want 
				System.out.print("How many pixels would you like the horizontal line? (1-20) : ");
				length = Integer.parseInt(input.nextLine());
				// However, if they answer out of the range from 1-20, the program will constantly ask the user to correct themselves
				while (length < 1 || length > 20) {
					System.out.println("\nInvalid dimension. Must be within 1-20 inclusive.");
					System.out.print("How many pixels would you like the horizontal line? (1-20) : ");
					length = Integer.parseInt(input.nextLine());
				}
				// Now, it draws the horizontal line based on the values the user gave
				System.out.println("Here is your Horizontal Line : ");
				for (int i = 1; i <= length; i++) {
					System.out.print("*");
				}
				System.out.println(" ");
				// Adds one to count variable to signify that the user has done this selection 
				count1++;

			} else if (ans == 2) {
				// Asks the user how many pixels vertically they want 
				System.out.print("How many pixels would you like the vertical line? (1-20) : ");
				length = Integer.parseInt(input.nextLine());
				// However, if they answer out of the range from 1-20, the program will constantly ask the user to correct themselves
				while (length < 1 || length > 20) {
					System.out.println("\nInvalid dimension. Must be within 1-20 inclusive.");
					System.out.print("How many pixels would you like the vertical line? (1-20) : ");
					length = Integer.parseInt(input.nextLine());
				}
				// Now, it draws the vertical line based on the values the user gave
				System.out.println("Here is your Vertical Line : ");
				for (int i = 1; i <= length; i++) {
					System.out.println("*");
				}
				// Adds one to count variable to signify that the user has done this selection 
				count2++;

			} else if (ans == 3) {
				// Asks the user how many pixels vertically they want for the rectangles height 
				System.out.print("What height would you like rectangle? (1-20) : ");
				high = Integer.parseInt(input.nextLine());
				// However, if they answer out of the range from 1-20, the program will constantly ask the user to correct themselves
				while (high < 1 || high > 20) {
					System.out.println("\nInvalid dimension. Must be within 1-20 inclusive.");
					System.out.print("What height would you like the rectangle? (1-20) : ");
					high = Integer.parseInt(input.nextLine());
				}
				// Asks the user how many pixels horizontally they want for the rectangles width
				System.out.print("How wide would you like rectangle? (1-20) : ");
				wide = Integer.parseInt(input.nextLine());
				// However, if they answer out of the range from 1-20, the program will constantly ask the user to correct themselves
				while (wide < 1 || wide > 20) {
					System.out.println(" ");
					System.out.println("\nInvalid dimension. Must be within 1-20 inclusive.");
					System.out.print("How high would you like the rectangle? (1-20) : ");
					wide = Integer.parseInt(input.nextLine());
				}
				// Now, it draws the rectangle with the values given by user
				System.out.println("Here is your Rectangle");
				for (int i = 1; i <= high; i++) {
					for (int j = 1; j <= wide; j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
				// Adds one to count variable to signify that the user has done this selection 
				count3++;

			} else if (ans == 4) {
				// Asks the user how many pixels horizontally they want for the rectangles width
				System.out.print("How high do you want your right-angle triangle? (1-20) : ");
				triHei = Integer.parseInt(input.nextLine());
				// However, if they answer out of the range from 1-20, the program will constantly ask the user to correct themselves
				while (triHei < 1 || triHei > 20) {
					System.out.println("\nInvalid dimension. Must be within 1-20 inclusive.");
					System.out.print("How high do you want your right-angle triangle? (1-20) : ");
					triHei = Integer.parseInt(input.nextLine());
				}
				// INSERT CODE HERE \\
				// Adds one to count variable to signify that the user has done this selection 
				count4++;
				
			} else if (ans == 5) {
				// Asks the user how tall they want to make this isoceles triangle
				System.out.print("What do you want height of isoceles triangle? (1-20) : ");
				triHei = Integer.parseInt(input.nextLine());
				// However, if they answer out of the range from 1-20, the program will constantly ask the user to correct themselves
				while (triHei < 1 || triHei > 20) {
					System.out.println("\nInvalid dimension. Must be within 1-20 inclusive.");
					System.out.print("What do you want height of isoceles triangle? (1-20) : ");
					triHei = Integer.parseInt(input.nextLine());
				}
				// Now, it draws the isoceles triangle with the given values
				for (int i = 0; i < triHei; i++) {
					for (int k = 0; k < triHei - i; k++) {
						System.out.print(" ");
					}
					for (int j = 0; j < (i * 2 + 1); j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
				// Adds one to count variable to signify that the user has done this selection 
				count5++;
				
				// If the user had entered any number less than 0, in other words, a negative number, the program will exit the do-while loop
			} else {
				break;
			}
			// Asks the user if they want to re-start the program
			System.out.print("Would you like to enter another? (Y / N) : ");
			res = (input.nextLine()).charAt(0);
			// if the user entered 'n' or 'N', for no, the program will exit the do-while loop and go straight to the end
			if (res == 'n' || res == 'N') {
				break;
			}
			// if the user enters a letter other than the choices that were given, the program will keep asking user until a valid letter is entered
			while (res != 'y' && res != 'n' && res != 'N' && res != 'Y') {
				System.out.println("Invalid input! Must answer y or n!");
				System.out.print("Would you like to enter another? (Y / N) : ");
				res = (input.nextLine()).charAt(0);
			}
			// if the response at the end was 'y' or 'Y', the programs re-runs and the user starts the program all over from the beginning
		} while (res == 'y' || res == 'Y');
		// Displays the statistics of what the user has done in the do-while loop
		System.out.println("\n-----------------------");
		System.out.println("Here are the stats.....");
		System.out.println("Horizontal Lines : " + count1);
		System.out.println("Vertical Lines : " + count2);
		System.out.println("Rectangles : " + count3);
		System.out.println("Right-Angle Triangles : " + count4);
		System.out.println("Isoceles Triangles : " + count5);
		System.out.println("\nThank you for using Shape Generator! Bye.");
	}
}
