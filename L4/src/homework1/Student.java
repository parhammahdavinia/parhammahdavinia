package homework1;

public class Student {
    private String Student_Number;
    private String Name;
    private float Avg;

    public void setStudent_Number(String student_Number) {
        Student_Number = student_Number;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAvg(float avg) {
        Avg = avg;
    }

    public String getStudent_Number() {
        return Student_Number;
    }

    public String getName() {
        return Name;
    }

    public float getAvg() {
        return Avg;
    }
}
