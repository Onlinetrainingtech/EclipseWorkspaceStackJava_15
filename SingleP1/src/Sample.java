import java.util.Scanner;

class B
{
	int pid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the Pid is::");
		pid=sc.nextInt();
	}
}
class D1 extends B
{
	void get2()
	{
		System.out.println("Your Pid is::"+pid);
	}
}
public class Sample {

	public static void main(String[] args) {

		D1 f1=new D1();
		f1.get1();
		f1.get2();

	}

}
