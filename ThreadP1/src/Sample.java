class Demo implements Runnable
{
	public void run()
	{
		System.out.println("this is a thread method..");
		get1();
	}
	void get1()
	{
		System.out.println("this is normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo t1=new Demo();
		Thread s1=new Thread(t1);
		s1.start();

	}

}
