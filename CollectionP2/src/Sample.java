import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Sample 
{
    //HashSet<Integer>list1=new HashSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
    void get1()
    {
    	list1.add(1001);
    	list1.add(1002);
    	list1.add(1003);
    	list1.add(1003);
    	
    	Iterator<Integer>k1=list1.iterator();
    	while(k1.hasNext())
    	{
    		System.out.println("Inside the loop::"+k1.next());
    	}
    	System.out.println("Searching the data::"+list1.contains(1001));
    	//System.out.println("Remove the data is::"+list1.remove(1001));
    	System.out.println("After Removing the data is::"+list1.contains(1002));
    	System.out.println("Your size of the data is::"+list1.size());
    	
    	System.out.println("Your data is::"+list1);
    }
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();

	}

}
