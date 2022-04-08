package homework2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        User user0 = new User();
        User user1 = null;
        User user2 = null;
        User user3 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username:");
        user0.Username = sc.nextLine();
        try {
            user1 = (User) user0.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }try {
            user2 = (User) user0.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }try {
            user3 = (User) user0.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
        System.out.println(user0);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user0.Username);
        System.out.println(user1.Username);
        System.out.println(user2.Username);
        System.out.println(user3.Username);
    }
}
