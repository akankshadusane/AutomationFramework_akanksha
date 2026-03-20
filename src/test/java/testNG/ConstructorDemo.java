package testNG;
public class ConstructorDemo {

//constructor name should be same as class name
//constructor do not have any return type
//constrcutor always executed firtst and then other method executed
//default and parameterized constructor

//page object model- pom
//parameterized constructor


ConstructorDemo(int a,int b)
{
	
	System.out.println("Addition "+(a+b));
}


public void sub()
{
	int a=10,b=10;
	
	System.out.println("Sub "+(a-b));
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	ConstructorDemo c=new ConstructorDemo(12,2);
	//call                 //constructor call
	c.sub();
	
	
	
	
	
}

}
