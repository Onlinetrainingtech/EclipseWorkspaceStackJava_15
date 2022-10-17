class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIn");
			System.out.println("ThreadName is::"+currentThread().getName());
			System.out.println("ThreadPriority::"+currentThread().getPriority());
			for(int i=0;i<=5;i++)
			{
				System.out.println("I value is::"+i);
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();
		t1.setName("mohamed");
		t1.setPriority(Thread.MAX_PRIORITY);

	}

}
