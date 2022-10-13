import java.util.HashMap;
import java.util.Map;

public class Sample 
{
	HashMap<Integer,String>list1=new HashMap<Integer, String>();
	
	void get1()
	{
	   list1.put(1001,"azar");
	   list1.put(1002,"mohamed");
	   list1.put(1003,"raja");
	   list1.put(1004,"neha");
	   
	   for(Map.Entry h1:list1.entrySet())
	   {
		   System.out.println(h1.getKey());
		   System.out.println(h1.getValue());
	   }
	   System.out.println("Searching data is::"+list1.containsKey(1002));
	   System.out.println("Remove your data is::"+list1.remove(1003));
	   System.out.println("Size of the data is::"+list1.size());
	   System.out.println("Some data is::"+list1.get(1001));
	}

	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
