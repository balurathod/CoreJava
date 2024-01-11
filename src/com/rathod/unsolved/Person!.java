class  Person1
{
	String name="No Name";
	Public Person(String nm)
	{ name=nm;}
}
class Employee extends Person1
{
	String empID="0000";
	public EmployeeTest(String id)
	{
		empID=id;    //return type required
	}
}
public class EmployeeTest
	{

    public static void main(String[] args) 
	{
		 Employee e=new Employee("4321");
		System.out.println(e.empID);
	}
}
/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Person!.java
Person!.java:10: invalid method declaration; return type required
        public EmployeeTest(String id)
               ^
1 error

*/