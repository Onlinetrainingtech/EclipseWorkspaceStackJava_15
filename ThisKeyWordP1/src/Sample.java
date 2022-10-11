class Demo
{
	int cid;
	String cname;
	//int c1;
	//String c2;
	void get1(int c1,String c2)
	{
		this.cid=c1;
		this.cname=c2;
		System.out.println("your data is::"+c1+""+c2);
	}
	void display()
	{
		System.out.println("Display method is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"azar");
		f1.display();

	}

}
