
public class JavaArrayExample {

	public static void main(String[] args)
	{
		new JavaArrayExample();
	}
	/**
	 * Create an int array, then populate the array,
	 * and finally print each element in the int array.
	 */
	//public void intArrayExample()
	private void intArrayExample()
	{
		int[] intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		System.out.println("intArray output");
		for (int i=0; i<intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
	}
	public JavaArrayExample()
	{
		intArrayExample();
		//stringArrayExample();
		//intArrayExample2();
	}


}
