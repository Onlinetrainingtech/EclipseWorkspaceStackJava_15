class Demo
{
	void get1(int pid,String pname)
	{
		System.out.println("Your data is::"+pid+""+pname);
	}
	void get2(int cid,String cname)
	{
		System.out.println("Your data is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		f1.get1(1001,"apple");
		f1.get2(2001,"mobile");

	}

}
