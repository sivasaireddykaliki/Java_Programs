// Program 6
package package1;

class Test
{
	static int counter;
	Test()
	{
		counter++;
	}
}

public class Instance_Count {

	public static void main(String[] args) {
		Test t1= new Test();
		Test t2 = new Test();
		Test t3=new Test();
		System.out.println("Number of Instances Created : "+Test.counter);

	}

}
