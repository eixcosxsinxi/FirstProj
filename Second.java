public class Second
{
	First test = new First();

	public static void main(String args[])
	{
		test.setNames("Wesley");
		System.out.println(test.getNames());
	}
}
