import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int pid,num1,num2;
	String pname;
	DataInputStream dis=new DataInputStream(System.in);
	
	void input() throws  IOException
	{
	   System.out.println("Enter the pid is::");
	   pid=Integer.parseInt(dis.readLine());
	   System.out.println("Enter the pname is::");
	   pname=dis.readLine();
	  
	}
	void display()
	{
		System.out.println("Your data is::"+pid+""+pname);
	}
	void relationOperator() throws NumberFormatException, IOException
	{
		  System.out.println("Enter the num1 and num2:::");
		   num1=Integer.parseInt(dis.readLine());
		   num2=Integer.parseInt(dis.readLine());
		   System.out.println("Lessthan::"+(num1<num2));
		   System.out.println("Greaterthan::"+(num1>num2));
	}
	void logicalOperator() throws IOException
	{
		int a1,b1;
		System.out.println("Enter the a1 and a2::");
		a1=Integer.parseInt(dis.readLine());
		b1=Integer.parseInt(dis.readLine());
		System.out.println("Your data is::"+a1+""+b1);
		System.out.println("LogicalAND::"+((a1<b1)&&(b1>a1)));
		System.out.println("LogicalOR::"+((a1>b1)||(b1>a1)));
	}
	void bitwiseOpeartor()
	{
		int a2=2,b2=3;
		//System.out.println("Bitwise AND Operator is::"+((a2&b2)));
		//System.out.println("Bitwise OR Operator is::"+((a2|b2)));
		//System.out.println("Bitwise XOR is::"+((a2^b2)));
		System.out.println("LeftBit::"+(a2<<1));
		System.out.println("RightBit::"+(a2>>1));
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo g1=new Demo();
		//g1.input();
		//g1.display();
		//g1.relationOperator();
		//g1.logicalOperator();
		g1.bitwiseOpeartor();

	}

}
