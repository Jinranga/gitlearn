package ArrayDeclaration;

import java.util.Arrays;
import java.util.List;

public class ArrayindexOut 
{
  public static void main(String[] args)
  {
	List<Integer> l = Arrays.asList(10,20,30,40,50,30);
	l.stream().distinct().forEach(System.out::println);

  }
}
