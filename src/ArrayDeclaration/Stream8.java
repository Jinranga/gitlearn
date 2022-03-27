package ArrayDeclaration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Stream8 
{
  public static void main(String[] args)
  {
	  HashMap<Integer,String> map = new HashMap<Integer,String>();
	  
	  map.put(1, "ranga");
	  map.put(2, "ramesh");
	  map.put(3, "radhika");
	  Iterator itr = map.entrySet().iterator();
	  while(itr.hasNext())
	  {
		  Map.Entry me = (Map.Entry)itr.next();
		  System.out.println("The key is:" + me.getKey() + " the VAlue is :" +me.getValue());
	  }
	  System.out.println("-----------------------");
	  for(Map.Entry me2 : map.entrySet() )
	  {
		  System.out.println("The key is:" +me2.getKey()+ " The value is :" +me2.getValue());
	  }
	  
  }
}
