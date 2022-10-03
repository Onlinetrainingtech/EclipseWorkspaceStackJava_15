class Demo
{
	void get1()
	{
		int a1=100;
		if(a1==100)
		{
			System.out.println("This is an equal...");
		}
	}
	void get2()
	{
		int pid=200;
		if(pid>=1001)
		{
			System.out.println("Your pid is::>1001-->"+pid);
			
		}
		else
		{
			System.out.println("Your pid is::<1001-->"+pid);
		}
	}
	void get3()
	{
		String uname="admin",pass="admin";
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			System.out.println("LoginSucess!!!");
		}
		else
		{
			System.out.println("LoginFail!!!");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
