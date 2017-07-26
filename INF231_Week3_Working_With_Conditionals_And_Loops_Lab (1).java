import static java.lang.System.out;
import java.util.Scanner;

public class AveragingGrades {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double TestScore1;
		double TestScore2;
		double TestScore3;
		String name1;
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Please enter your name:");
		name1 = Keyboard.nextLine();
		System.out.println("Please enter test score 1");
		TestScore1 = Keyboard.nextInt();
		System.out.println("Please enter test score 2");
		TestScore2 = Keyboard.nextInt();
		System.out.println("Please enter test score 3");
		TestScore3 = Keyboard.nextInt();
		double average = ((TestScore1 + TestScore2 + TestScore3)/3);
		out.println(name1);
		out.println("The average score of the 3 tests is: " + average);
		if (average > 90)
		{
			System.out.println("You got an A");
		}
		else if (average>=80)
		{
			System.out.println("You got a B");
		}
		else if (average >=70)
		{
			System.out.println("You got a C");
		}
		else if (average >=60)
		{
			System.out.println("You got a D");
		}
		else if (average<60)
		{
			System.out.println("You got an F");
		}
	}
}


