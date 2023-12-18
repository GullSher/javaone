/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaone;
import java.util.Scanner;

/**
 *
 * @author GullSher
 */
public class Javaone {
   /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
// TODO code application logic here
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



//====================
