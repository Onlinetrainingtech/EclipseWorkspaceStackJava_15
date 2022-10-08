import java.util.Scanner;

class B
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid value is::");
		empid=sc.nextInt();
	}
}
class D1 extends B
{
	String empname;
	int salary;
	void get2()
	{
		System.out.println("Enter the empname and salary::");
		empname=sc.next();
		salary=sc.nextInt();
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your empid is::"+empid);
		System.out.println("Your empname and salary i::"+empname+""+salary);
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
