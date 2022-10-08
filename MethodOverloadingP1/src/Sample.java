class Demo
{
	void get1(int cid,String cname)
	{
		System.out.println("Your cid is::"+cid+""+cname);
	}
	void get1(int empid)
	{
		System.out.println("Your empid is::"+empid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(100,"mobile");
		f1.get1(201);

	}

}
