package homework1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter you name:");
        student.setName(sc.nextLine());
        System.out.println("Enter your student number:");
        student.setStudent_Number(sc.nextLine());
        System.out.println("Enter your average score:");
        student.setAvg(sc.nextFloat());
        Map map = new HashMap();
        map.put("Name",student.getName());
        map.put("Student_Number",student.getStudent_Number());
        map.put("Avg",student.getAvg());
        System.out.println("Name: "+map.get("Name"));
        System.out.println("Student Number: "+map.get("Student_Number"));
        System.out.println("Average score: "+map.get("Avg"));
    }
}
