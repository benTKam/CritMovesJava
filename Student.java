import java.util.List;

public class Student {
    Prompt[] Prompts = new Prompt[3];
    String First;
    String Last;
    public Student(String first, String last){
        First = first;
        Last = last;
    }
    public Prompt[] getStuPrompts(){
        return Prompts;
    }
}
