import java.util.Scanner;
public class introduction{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
    
        System.out.println("\n--- Introduction ---");
        System.out.println("Hello everyone! My name is "+ name + ". I am "+ age +" years old.Nice to meet you!");
        
        sc.close();

    }
}