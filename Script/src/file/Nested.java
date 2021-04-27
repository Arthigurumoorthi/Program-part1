package file;

public class Nested {

	public static void main(String[] args) {
		int marks=1000;
		if(marks<35)
		{
			System.out.println("Fail");
		}
		else if (marks<=50)
		{
			System.out.println("A grade");
		}
		else if(marks==100) {
			System.out.println("D grade");
		}
		else
		{
			System.out.println("Invalid!");
		}

	}

}
