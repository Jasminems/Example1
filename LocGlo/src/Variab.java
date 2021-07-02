/*A Java program to understand the scope of local and global variables*/
public class Variab 
{
	int a=10;					//Declaring a Global variable				
	public void test() 
	{
		int b=15;				//Declaring a Local variable
		System.out.println(a);
		System.out.println(b);
	}
	public void test1()	
	{
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Variab v=new Variab();
		v.test();
		v.test1();

	}

}
