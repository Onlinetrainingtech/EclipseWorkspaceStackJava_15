import java.util.Scanner;

class Demo
{
	int empid;
	String empname;
	char c1;
	Scanner sc1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid is::");
		empid=sc1.nextInt();
		System.out.println("Enter the empname is::");
		empname=sc1.next();
		System.out.println("Enter the character is::");
		c1=sc1.next().charAt(0);
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname+""+c1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
