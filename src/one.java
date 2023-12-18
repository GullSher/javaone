/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;
*/
///*

import java.applet.*;
import java.awt.*;
import java.awt.image.renderable.*;
import java.awt.color.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.image.*;
import java.awt.print.*;
import java.awt.geom.*;
import java.beans.*;
import java.text.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.jar.*;
import java.util.InputMismatchException;
import java.util.Scanner;

 //This is The Version One of Addition.. Numbers. 
 // The Aim of This class is to take a input from user and add the numbers and show the result.....
 public class one{
 public static void main(String arg[]){
 Scanner add1 =new Scanner(System.in);
 Scanner add2 =new Scanner(System.in);
 Scanner add3 =new Scanner(System.in);
 double add,secadd,total,thirdadd,tota3l;
 System.out.println("Please Enter Number Digit 1.first Addition.");
 add = add1.nextDouble();
 System.out.println("You Entered First Number."+add);
 System.out.println("Please Enter Second Digit 2.Second Adddion.");
 secadd=add2.nextDouble();
 System.out.println("You Entered Second Number."+secadd);
 total=add+secadd;
 System.out.println("The Total of Two Numbers You Entered is ..."+total);
 System.out.println("Please another Digit Number to add as Third Number.");
 thirdadd=add3.nextDouble();
 System.out.println("You Entered Thired Number for addition is.."+thirdadd);
 tota3l=total+thirdadd;
 System.out.println("Total addition of Three Number is.."+tota3l);
 }
 }
 //*/
/*

 //This is The Version Second of Addition.. Numbers.
 // The Aim of This class is to use single Scanner for input and adding Those digits...........
 
public class one{
 public static void main(String arg[]){
 Scanner add1=new Scanner(System.in);
 Double add,secadd,thirdadd,total,tota3;
 System.out.println("Please Enter Three Digits for Additon..");
 add=add1.nextDouble();
 System.out.println("You Entered Digit First .."+add);
 secadd=add1.nextDouble();
 System.out.println("You Entered Digit Sec ...."+secadd);
 total=add+secadd;
 System.out.println("The Total of Two Number is ."+total);
 thirdadd=add1.nextDouble();
 System.out.println("You Entered Third Number, is."+thirdadd);
 tota3=total+thirdadd;
 System.out.println("The Total of Three Number is ."+tota3);
 }
 }
 */
//This is The Version Third of Addition.. Numbers.
//The Aim of This Class is Input in loop,and Add those numbers as well as showing the result of those numbers.....
//Next Aim if user should decide the number of inputs and number of looping..........
//next Aim is when the user is asked if he want to add more number and how much number of loops he want to add..........
/*
  public class one {
	  
	/**
	 * @param ard
	 */
/*
   	 public static void main(String arg[]) throws InputMismatchException {
   	   Scanner add1 = new Scanner(System.in);
   	   Scanner input = new Scanner(System.in);
   	   //Scanner num1 =new Scanner(System.in);
		int n=1; String choice="yes";Double num,total = 0.0; // n+=1;
		try{
		System.out.println("Please Enter Your Desired NUmber of Digits to Have Addition ......");
			}catch(InputMismatchException z){
			System.out.println("Please Enter only Digits.");
			z.printStackTrace();
		}
		//n=num1.nextInt();
		while(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("no") ){
			System.out.println("Please Enter Digit ...  " + n+ "  number for addtions. ");
			do{	num = add1.nextDouble();
				try{
					}catch(InputMismatchException az){
				System.out.println("Enter Digits only num Exception");
				az.printStackTrace();
			}
				System.out.println("You Entered  " + num + "  as  " + n	+ "   number.");
				total = total + num;
				System.out.println("The Total of Numbers Till  " + n + "  is  "+ total);
				n++;
				//trying to use double pipe signs "||" which is equals to "OR" Sign Means One or Two. in while condition to check the condition
				//"/" Sign divids , Modulas sing="%" answers in "Remainder" after dividing two digits.and "&&" checks if both of two conditons are  true .
				/*Switch Statement is 
				//Switch(test){
				case 1 :
				statent;
				break;
				
				case 2:
				statent;
				break;
				
				..
				case x:
				statent;
				break;
		
				default:
				statent;
				break;
				*
				*
				*/
/*								
			  }while (n <= 5 || choice.equalsIgnoreCase("yes"));
				System.out.println("Do you Want to add More Number Enter a for NO Please... ");
			try{
				choice = input.next();
			}catch(InputMismatchException e){
			System.out.println("Please Enter Only Digits.");
				e.printStackTrace();
			if(choice.equals("yes")){
				n=1;
				}
		} 
	}
}
}
*/
/*
//An Example From http://stackoverflow.com/questions/12838346/possible-exception-if-user-enters-string-instead-of-int
 * Contains Error of Exceptions.
   import java.util.Scanner;
    public class DigitSum {la

    public static void main(String[] args) {

    Scanner newScan = new Scanner(System.in);

        System.out.println("Enter a 3 digit number: ");
        int digit = newScan.nextInt();

        while(digit > 1000 || digit < 100)
            {           
             System.out.println("Error! Please enter a 3 digit number: ");
             digit = newScan.nextInt();
            }

        System.out.println(digit);
       }
    }
*/

/*
 *  1 down vote accepted
	

How about this?

public class Sample {
    public static void main (String[] args) {
        Scanner newScan = new Scanner (System.in);

        System.out.println ("Enter a 3 digit number: ");
        String line = newScan.nextLine ();
        int digit;
        while (true) {
            if (line.length () == 3) {
                try {
                    digit = Integer.parseInt (line);
                    break;
                }
                catch (NumberFormatException e) {
                    // do nothing.
                }
            }

            System.out.println ("Error!(" + line + ") Please enter a 3 digit number: ");
            line = newScan.nextLine ();
        }

        System.out.println (digit);
    }
}
*/
/*
//regexp version:

public class Sample {
    public static void main (String[] args) {
        Scanner newScan = new Scanner (System.in);

        System.out.println ("Enter a 3 digit number: ");
        String line = newScan.nextLine ();
        int digit;

        while (true) {
            if (Pattern.matches ("\\d{3}+", line)) {
                digit = Integer.parseInt (line);
                break;
            }

            System.out.println ("Error!(" + line + ") Please enter a 3 digit number: ");
            line = newScan.nextLine ();
        }

        System.out.println (digit);
    }
}


 * 
 * 
 */



/*
 * While Statement 13 Do While Statement 13 For Loop if statement using Multiple
 * Classes 14 useing Methods with Parameters.15
 */
//public class one extends java.applet{
/*
 //This is The Version Zero of Addition.. Numbers. taken from internet........
 public class one {
 public static void main(String arg[]){		
 Scanner in = new Scanner(System.in);
 int n;
 System.out.print("Enter a your number: ");
 n = in.nextInt();   
 int sum = 0;          
 while (n != 0) {
 sum += n % 10;
 n /= 10;
 }
 System.out.println("Sum: " + sum);
 }
 }
 */

/*
//Downloaded From Internet Example for Writting in a File.
	 * package com.mkyong;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
public static void main(String[] args) {
try {

String content = "This is the content to write into file";
File file = new File("/users/mkyong/filename.txt");
// if file doesnt exists, then create it
if (!file.exists()) {
	file.createNewFile();
}
FileWriter fw = new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);
bw.write(content);
bw.close();
System.out.println("Done");
} catch (IOException e) {
e.printStackTrace();
}
}
}
*/
/*
 /*
  * Assuming we have a text file c:/test.txt, which has the following content. This file will be used as an input for our example program:

ABCDE

Let us compile and run the above program, this will produce the following result:

A
B
C
D
E
   
  *  downloaded from internet example of Buffered REader  is java.io.BufferedReader.read() 
  */
 /*
  
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
   public static void main(String[] args) throws Exception {
      
      InputStream is = null; 
      InputStreamReader isr = null;
      BufferedReader br = null;

      try{
         // open input stream test.txt for reading purpose.
         is = new FileInputStream("c:/test.txt");
         
         // create new input stream reader
         isr = new InputStreamReader(is);
         
         // create new buffered reader
         br = new BufferedReader(isr);
      
         int value=0;
         
         // reads to the end of the stream 
         while((value = br.read()) != -1)
         {
            // converts int to character
            char c = (char)value;
            import java.applet.*;
import java.awt.*;
import java.awt.image.renderable.*;
import java.awt.color.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.image.*;
import java.awt.print.*;
import java.awt.geom.*;
import java.beans.*;
import java.text.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.jar.*;
import java.util.InputMismatchException;
import java.util.Scanner;

*/
/* This is Version Four of Java One Class Trying to use arrays in user input and Writing it to the file.... */
/**
 * Demonstrates several Java array examples, including a
 * Java int array, and a Java String array.
 * Created by Alvin Alexander, <a href="http://alvinalexander.com" title="http://alvinalexander.com">http://alvinalexander.com</a>.
 */
/*
//public class JavaArrayExample{
public class one{
	public static void main(String[] args)
	{
		new JavaArrayExample();
	}
	/**
	 * Create an int array, then populate the array,
	 * and finally print each element in the int array.
	 */
/*
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
		stringArrayExample();
		intArrayExample2();
	}
} 
*/
  /*
   * Create a String array, then populate the array,
   * and finally print each element in the int array.
   */
 /* private void stringArrayExample()
  {
    String[] stringArray = new String[3];
    stringArray[0] = "a";
    stringArray[1] = "b";
    stringArray[2] = "c";
    System.out.println("stringArray output");
    for (int i=0; i<stringArray.length; i++)
    {
      System.out.println(stringArray[i]);
    }
  }
 
  /**
   * Create a Java int array and populate it in one step.
   * Then get the array length and print each element in the array.
   */
  /*
  private void intArrayExample2()
  {
    int[] intArray = new int[] {4,5,6,7,8};
    System.out.println("intArray output (version 2)");
    for (int i=0; i<intArray.length; i++)
    {
      System.out.println(intArray[i]);
    }
  }
 
}
  */
  
//}
/*

public class one{
	public static void main(String arg[]){
		try{
			String abc ="This is my File Which i wnat to to copy from an Existed file.\t\t\n\b\t";
			//File file =Exception e){ //some thig is problem in this line as "=" whould be changed with "("
			File file= 
					(Exception e){ //some thig is problem in this line as "=" whould be changed with "("
			 e.printStackTrace();
			}
	}   // prints character
    //System.out.println(c);
 //}
 
//}
	catch({
// releases resources associated with the streams
 if(is!=null)
    is.close();
 if(isr!=null)
    isr.close();
 if(br!=null)
    br.close();
})IOException ecatch({
	e.printStackTrace();
}finallyNew File("/home/gull/Desktop/Copy3.txt");
if(!file.exists()){
	file.createNewFile();
}
FileWriter fw =new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);
for(int i=0;i<=6;i++){
	bw.write(abc);
	fw.close();
	System.out.println("Done3");
}	}	}		
*/
//============
/*
import java.util.Scanner;

public class one {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("I am in System.out.println.");
		double[] x = new double[5];
		for (int b = 0; b <= 4; b++) {
			//String input=null;
			System.out.println("Please Enter the value of x at b now...");			
			String input = in.nextLine();
			System.out.println("you Entered ...." + input);
			// user Input Scanner input =new Scanner(System.in);
			//input=System.in.read();
			x[b]=b;
			System.out.println("The Value of b is now..." + b +"	the value of x is now ." + x  );
			System.out.println("I am in array of x and b am now . " + b);
			
		}
	}
}
*/
//======

/*
public static void main(String[] args) {
System.out.println("The super insano calculator");
System.out.println("enter the corrosponding number:");
System.out.println("1. Add | 2. Subtract | 3. Divide | 4.Multiply");
String input = null;
//get user input for string

int a = 0, b = 0;
System.out.println("Enter the first number");
//get user input for a
System.out.println("Enter the second number");
//get user input for b

switch (Integer.parseInt(input.trim())){
    case 1: System.out.println(a + " plus " + b + " equals " + add(a, b));          break;
    case 2: System.out.println(a + " minus " + b + " equals " + subtract(a, b));    break;
    case 3: System.out.println(a + " divided by " + b + " equals " + divide(a, b)); break;
    case 4: System.out.println(a + " times " + b + " equals " + multiply(a, b));    break;
    default: System.out.println("your input is invalid!");                          break;
}
}
public static int add(int first, int second) {
    return first + second;
}
public static int subtract(int first, int second) {
    return first - second;
}
public static int divide(int first, int second) {
    return first / second;
}
public static int multiply(int first, int second) {
    return first * second;
}
*/
//=================================
// Test 3 Q#10
/*
int factorial(int n){
	if(n==1) return 1;
	else return n*factorial(n-1);
}
//Assume that it is called with a very large integer
void printMe(Object[] oa){
	for((int i=0;i<=oa.length;i==)
			System.out.println(oa.[i]);
}
//Assume that it is call as such: println(null);
Object m1(){
	return new Object();
}
void m2(){
	String s = (String)m1();
}
//=========================                          
*/
/*
//Q#1
class one{
	public static void main(String[] arg){
int value = 1000000; //1
switch(value){
case 1_000_000: System.out.println("A million 1");//1
break;
case 1000000: System.out.print("A million 2");//3
break;
}
}
}
*/
/*

class one{
	public static void main(String arg[]){
		int i=2 ;
		switch(i){
		default:System.out.println("in default");
		case 0: System.out.println("zero");
		case 1: System.out.println("One");  
		case 2: System.out.println("two")continue;
		//continue;
		
		case 3: System.out.println("three");
		case 4: System.out.println("four"); 
		case 5: System.out.println("five");
		
		//break;
		}
		
		
	}
}


*/