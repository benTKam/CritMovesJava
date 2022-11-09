import java.util.ArrayList;
import java.util.List;

public class Course {
    String Name;
    int Id;
    PromptBank Bank;
    List<Student> StudentList = new ArrayList<>();
    public Course(String name, int id, PromptBank bank){
        Name = name;
        Id = id;
        Bank = bank;
    }
    public PromptBank getCourseBank(){
        return Bank;
    }
    public void createStudents(List<Student> studentImport){
        StudentList.addAll(studentImport);
    }
}
