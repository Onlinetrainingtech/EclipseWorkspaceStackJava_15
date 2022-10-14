class Demo
{
	
	void get1()
	{
		try
		{
	      int a=100/2;
	      String name=null;
	      System.out.println("Your value is::"+a);
	      System.out.println("Length of the data is::"+name.length());
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check Your data"+t);
		}
		catch(NullPointerException t2)
		{
			System.out.println("NullPointerPlease"+t2);
		}
		finally
		{
			System.out.println("Finally block..");
		}
	   get2();
	}
	void get2()
	{
		int empid=1001;
		System.out.println("Your value is::"+empid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		
	}

}
