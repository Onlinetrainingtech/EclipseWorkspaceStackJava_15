import java.util.Scanner;

class Demo
{
	int empid[][]=new int[2][2];
	int i,j,m,n;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				empid[i][j]=sc.nextInt();
			}
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your array value is::"+empid[i][j]);
			}
		}
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
