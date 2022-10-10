class Demo
{
	Demo()
	{
		System.out.println("This is Default Constructor");
	}
	Demo(int pid,String pname)
	{
		System.out.println("Param constructor..."+pid+""+pname);
	}
	void get1()
	{
		System.out.println("This is the Normal function..."); 
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		new Demo(1001,"apple");
		t1.get1();

	}

}
