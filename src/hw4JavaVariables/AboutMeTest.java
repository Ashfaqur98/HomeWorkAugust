package hw4JavaVariables;

import hw3JavaVariables.AboutMe;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor is initialized here

		// Variable is initialized here
		aboutMe.myName = "Ashfaqur Rahman";
		aboutMe.myAge = 45;
		aboutMe.homeRent = 31000;
		aboutMe.salary = 900;
		aboutMe.myheight = 23451246l;
		aboutMe.grade = 'M';
		aboutMe.playvideogames = true;

		aboutMe.aboutMe(); // Method is initialized here

		System.out.println(
				"\n-------------------------------------------------------------------------------------------");

		AboutMe aboutMe1 = new AboutMe(); // Constructor is initialized here

		// Variable is initialized here
		aboutMe1.myName = "Alex";
		aboutMe1.myAge = 41;
		aboutMe1.homeRent = 30000;
		aboutMe1.salary = 800;
		aboutMe1.myheight = 23423246l;
		aboutMe1.grade = 'M';
		aboutMe1.playvideogames = true;

		aboutMe1.aboutMe(); // Method is initialized here

	}
}
