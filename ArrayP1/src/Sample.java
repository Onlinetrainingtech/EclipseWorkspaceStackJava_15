import java.util.Scanner;

class Demo
{
	int empid[]=new int[5];
	int i,n,k;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Array value is::"+empid[i]);
		}
	}
	void indextovalue()
	{
		System.out.println("Enter the index value::");
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(empid[i]==k)
			{
				
			}
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.input();
		t1.display();

	}

}
