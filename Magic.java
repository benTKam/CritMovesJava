import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Magic {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sn = new Scanner(new File("src/Book1.csv"));
        sn.useDelimiter(",");
        String category = "";
        List<Prompt> prompts = new ArrayList<>();
        int count = 0;
        Category cat = new Category(sn.next());
        while(sn.hasNext()){
                Prompt prom = new Prompt(sn.next(), cat);
                prompts.add(prom);
            }
//        for (Prompt prom: prompts) {
//            System.out.println("Prompt: " + prom.getPrompt() + "ID: " + prom.getId());
//        }
        PromptBank bank = new PromptBank(prompts);
        Course course = new Course("Pottery 1", 1234, bank);

        Student student1 = new Student("Ben", "Kamide");
        Student student2 = new Student("Will", "Oswald");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        course.createStudents(students);


        List<Prompt> fromCourse = new ArrayList<>(course.getCourseBank().getPrompts());

        for(Prompt prom: fromCourse){
            System.out.println("From Course Prompt: " + prom.getPrompt() + " ID: " + prom.getId());
        }
        Random rand = new Random();
        int size = fromCourse.size();
            for (int i = 0; i < size; i++) {
                for (Student stu : course.StudentList) {
                    for (int j = 0; j <= 2; j++) {
                        int randomIndex = rand.nextInt(fromCourse.size());
                        System.out.println(fromCourse.get(randomIndex).getPrompt());
                        stu.Prompts[j] = fromCourse.get(randomIndex);
                        fromCourse.remove(randomIndex);

                        if(fromCourse.size() == 0){
                            System.out.println("Break!");
                            i = size;
                        }
                    }
                }
            }
            System.out.println(course.StudentList.get(0).Prompts[0].getPrompt());
    }
}

