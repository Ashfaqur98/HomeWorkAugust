package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor is initialized here

		System.out.println("My name is" + aboutMe.myName + "\nMy Age is " + aboutMe.myAge + "\nMy home rent  is "
				+ aboutMe.homeRent + "\nMy Monthly Salary is" + aboutMe.salary + "\nMy Bankbalance is "
				+ aboutMe.bankBalance + "\nMy Height is " + aboutMe.myheight + "\nMy Sc Grade is " + aboutMe.grade
				+ "\nMy Gender is " + aboutMe.myGender + "\n Am I playing videogames " + aboutMe.playvideogames);

		// aboutMe.aboutMe(); // Method is initialized here

	}

}
