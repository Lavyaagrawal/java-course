// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class even {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("enter the size of array: ");
      int n= sc.nextInt();
      int []arr= new int [n];
      System.out.print("enter thr element");
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      int count =0;
      System.out.println("Even numbers are:");
      for(int i =0;i<n;i++){
         if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
            count++;


         }
      }
      System.out.println("\nTotal even numbers: " + count);
   sc.close();
}
}
