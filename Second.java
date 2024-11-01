import java.util.Scanner;

public class Second
{
	public static void main(String args[])
	{
		First test = new First();
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter you name: ");
		String name = scan.next();

		test.setName(name);

		System.out.println("This is a test to see if my code can return what you just entered");
		System.out.println(test.getName());
	}
}
