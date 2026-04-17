import java.util.Scanner;
public class passwoed {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your pasword");
        String pasword=sc.nextLine();
        if(pasword=="1234"){
            System.out.println("Login successful");
        }else{
            System.out.println("Login failed");
        }
        sc.close();

    }
    
}
