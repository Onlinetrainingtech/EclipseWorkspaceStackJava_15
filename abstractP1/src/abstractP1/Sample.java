package abstractP1;

abstract class Demo
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is the normal method..");
	}
	
}
class Sample1 extends Demo
{

	@Override
	void get1() {
		
		System.out.println("This is the abstract method");
		
	}
	
}

public class Sample {

	public static void main(String[] args) {
		
		Sample1 f1=new Sample1();
		f1.get1();
		f1.get2();

	}

}
