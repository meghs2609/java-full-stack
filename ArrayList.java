import java.util.ArrayList;

public class Main 
{
    	public static void main(String[] args) 
	{
       		ArrayList<String> list = new ArrayList<>();
        	list.add("Apple");
        	list.add("Banana");
        	list.add("Cherry");
        	for (String fruit : list) 
		{
            		System.out.println(fruit);
        	}
    	}
}