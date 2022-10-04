import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value is::");
		n=sc.nextInt();
		i=0;
		for(;i<=n;)
		{
			if(i%2==0)
			{
				System.out.println("Even::"+i);
			}
			else
			{
				System.out.println("Odd::"+i);
			}
			
			i++;
		}

	}

}
