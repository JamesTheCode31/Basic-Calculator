/*
James Arnold S. Nieves
September 20, 2024
Basic Calculator
*/

import java.util.Scanner;

public class BasicCalcu {
    public static void main(String[] args) {
       Scanner ac= new Scanner(System.in);
       
       //User put nujmber to calculate
       System.out.print("Enter First Number:");
       int fNum = ac.nextInt();
       System.out.print("Enter Second Number:");
       int sNum = ac.nextInt();
       
       //formula
       int sum, diff, pro, quo, rem;
       sum = fNum + sNum;
       diff= fNum - sNum;
       pro = fNum * sNum;
       quo = fNum / sNum;
       rem = fNum % sNum;
       
       // The calculate asnwer of number
       System.out.println("\nThe sum is " + sum );
       System.out.println("The dieffrence is " + diff );
       System.out.println("The product is " + pro );
       System.out.println("The quotient is " + quo );
       System.out.println("The reminder is " + rem );
       
       //Challenge
       System.out.println("\nThe sum of  " + fNum + " and " + sNum + " is " + sum + ".");
       System.out.println("The diffrence of " + fNum + " and " + sNum + " is " + diff + ".");
       System.out.println("The product of " + fNum + " and " + sNum + " is " + pro + "." );
       System.out.println("The quotient of " + fNum + " and " + sNum + " is " + quo + ".");
       System.out.println("The reminder of " + fNum + " and " + sNum + " is " + rem + ".");
    } 
    
}