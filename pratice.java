import java.util.Scanner;
public class pratice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your pasword");
        String pasword=sc.nextLine();
        if(pasword.equals ("1234")){
            System.out.println("Login successful");
        }else{
            System.out.println("Login failed");
        }
        sc.close();

    }
    
}
