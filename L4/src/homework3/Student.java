package homework3;

public class Student <name,student_number,father_name>{
    private name Name;
    private student_number Student_Number;
    private father_name Father_Name;

    public void setName(name name) {
        Name = name;
    }

    public void setStudent_Number(student_number student_Number) {
        Student_Number = student_Number;
    }

    public void setFather_Name(father_name father_Name) {
        Father_Name = father_Name;
    }

    public name getName() {
        return Name;
    }

    public student_number getStudent_Number() {
        return Student_Number;
    }

    public father_name getFather_Name() {
        return Father_Name;
    }
}
