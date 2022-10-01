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
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo g1=new Demo();
		//g1.input();
		//g1.display();
		g1.relationOperator();

	}

}
