/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author 1994784
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i =0;
       int num =0;
       String  primeNumbers = "";
       int n;
       System.out.print("Enter the Number:");
       Scanner myscan=new Scanner(System.in);
       n= myscan.nextInt();

 

       for (i = 1; i <= n; i++)         
       {                 
          int counter=0;       
          for(num =i; num>=1; num--)
      {
             if(i%num==0)
         {
         counter = counter + 1;
         }
      }
      if (counter ==2)
      {
         //Appended the Prime number to the String
         primeNumbers = primeNumbers + i + " ";
      }    
       }    
       System.out.println("Prime numbers from 1 to n are :");
       System.out.println(primeNumbers);
    }
    
}
