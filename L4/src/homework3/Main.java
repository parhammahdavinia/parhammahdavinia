package homework3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        student.setName(sc.nextLine());
        System.out.println("Enter your Student Number: ");
        student.setStudent_Number(sc.nextLine());
        System.out.println("Enter your father's name: ");
        student.setFather_Name(sc.nextLine());
        List<String> list = new ArrayList<>();
        System.out.println("Enter your scores");
        for(int i = 0 ; i < 5 ; i++){
            list.add(sc.nextLine());
        }
        System.out.println(list);
    }
}
