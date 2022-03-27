package ArrayDeclaration;

public class Student 
{
  private int age;
  private String name;
  
  public int getAge() 
  {
	  return age;
  }
  
  public void setAge(int age) 
  {
	  this.age = age;
  }
  public void setName(String name) 
  {
		  this.name = name;
		  
  }
  public String getName() 
  {
		  return name;
  }
  

public static void main(String[] args)
{
	Student s = new Student();
	s.setName("Ranga");
	s.setAge(40);
	System.out.println("The Student name is: " +s.getName());
	System.out.println("the Student age is:" +s.getAge());
}
}



  
