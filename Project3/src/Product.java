
class Sample
{
	String pname="apple";//class or instance variable
	void addProduct()
	{
		int pid=1001;//local variable
		System.out.println("Welcome to AddProduct Modules"+pid);
	}
	void viewProduct()
	{
		System.out.println("Welcome to viewProduct Modules"+pname);
	}
}


public class Product
{
	public static void main(String[] args)
	{
		
          Sample p1=new Sample();//object creations
          p1.addProduct();
          p1.viewProduct();
	}

}
