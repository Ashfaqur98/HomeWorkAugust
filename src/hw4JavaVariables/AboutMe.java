package hw4JavaVariables;

public class AboutMe {

	public String myName;
	public Byte myAge;
	public short homeRent;
	public int salary;
	public float myheight;
	public double grade;
	public char myGender;
	public boolean playvideogames;

	public AboutMe() {

		System.out.println("This is all about us:");
	}

	public void aboutMe() {
		System.out.println("My name is" + myName + "\nMy Age is " + myAge + "\nMy home rent  is " + homeRent
				+ "\nMy Monthly Salary is" + salary + "\nMy Height is " + myheight + "\nMy Sc Grade is " + grade
				+ "\nMy Gender is " + myGender + "\n Am I playing videogames " + playvideogames);

	}
}
