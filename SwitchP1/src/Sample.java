import java.util.Scanner;


class Demo
{
	
	void addProduct()
	{
		System.out.println("AddProduct");
	}
	void addCategory()
	{
		System.out.println("AddCategory");
	}
	void viewDetails()
	{
		System.out.println("ViewDetails");
	}
	void choice()
	{
		int exp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice is::");
		System.out.println("1.Enter the addProduct..");
		System.out.println("2.Enter the addCategory..");
		System.out.println("3.Display the details..");
		System.out.println("4.Exit");
		exp=sc.nextInt();
		
		switch(exp)
		{
		case 1:
			//System.out.println("case-1");
			addProduct();
		     
			break;
		case 2:
			//System.out.println("case-2");
			addCategory();
			break;
		case 3:
			//System.out.println("case-3");
			viewDetails();
			break;
		default:
			System.out.println("Exit");
			//break;
		}
	}
}

public class Sample {

	
	public static void main(String[] args) 
	{
		
	   Demo f1=new Demo();
	   f1.choice();
		

	}

}
