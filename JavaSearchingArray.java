/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
/**
 *
 * @author Mirza ahmad
 */
import java.util.Scanner;
public class JavaApplication39 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner is=new Scanner(System.in);
        int size,c,r=0;
        int pos=0;
        System.out.println("Enter the size of the array:");
        size=is.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<array.length; i++)
        {
            array[i]=is.nextInt();
        }
        System.out.println("Enter the element to check whether that it is present in the array:");
        c=is.nextInt();
        for(int i=0; i<array.length; i++)
        {
          if(array[i]==c)
          {
          r=1;
          pos=i+1;
          break;
          }
        }
          if(r==0)
          {
          System.out.println("This element is not present in the array:");
          }
          else if(r==1)
          {
          System.out.println("element"+ c+ "is present in the array at location "+ pos);
          }
    }
}