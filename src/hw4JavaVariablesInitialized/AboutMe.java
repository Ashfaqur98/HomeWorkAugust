package hw4JavaVariablesInitialized;

public class AboutMe {

	// Variable is declared here

	public String myCar;

	// Variable is initialized here
	public String myName = "Ashfaqur Rahman";
	public Byte myAge = 26;
	public short homeRent = 1800;
	public int salary = 90000;
	public long bankBalance = 3456787654567l;
	public float myheight = 2.5999f;
	public double grade = 3.83839;
	public char myGender = 'M';
	public boolean playvideogames = true;

	public AboutMe() {

		System.out.println(":----------its about myself---------:");

	}
		

	public void aboutMe() {
		System.out.println("My name is" + myName + "\nMy Age is " +myAge + "\nMy home rent  is "
				+ homeRent + "\nMy Monthly Salary is" + salary + "\nMy Bankbalance is "
				+ bankBalance + "\nMy Height is " + myheight + "\nMy Sc Grade is " +grade
				+ "\nMy Gender is " + myGender + "\n Am I playing videogames " + playvideogames);
	}

	

}

