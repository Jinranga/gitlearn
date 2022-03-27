package DuplicateCharacters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DupliCharacter
{
  public static void main(String[] args)
  {
	  
	  
	  
		  List<String> list = new ArrayList<String>();
		  list.add("Ramesh");
		  list.add("Radhika");
		  list.add("Suresh");
		  List l= list.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
		   List<String> l1 =  list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		   long c  = list.stream().count();
		  System.out.println("The array list is :" +list);
		  System.out.println("The starting letter of r is :" +l);
		  System.out.println("The number of elements are:" + c);
		  System.out.println("The Upper case elements are:" +l1);
	  }
  }

