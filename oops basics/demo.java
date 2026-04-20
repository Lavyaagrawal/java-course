import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("enter the array: ");
        for(int i=0;i<n;i++){
            

            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(num%2!=0){
                if (num % 7 == 0) {
                    System.out.println("hi");
                } 
                else if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("hello");
                } 
                else {
                    System.out.println("odd number");
                }
            }
            
        }
        sc.close();

    }
}
