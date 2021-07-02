/*A Java program to create a class*/
class Classom 
{					
	public int add(int a,int b)			//Method declaration and its signature
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		Classom obj=new Classom();			//Creating an object for the class
		int c=obj.add(10,20);
		System.out.println(c);

	}

}
