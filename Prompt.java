import java.util.ArrayList;
import java.util.List;

public class Prompt {
    String Prompt;
    Category Cat;
    String id;
    String catID;
    //List<Integer> id = new ArrayList<>();
    public Prompt(String prompt, Category category){
        Prompt = prompt;
        Cat = category;
        id = getId();
        catID = Cat.genId();
    }
    public String getId(){

        String sPrompt = Prompt.replaceAll("\\s", "");
        char[] chars = sPrompt.toCharArray();
        List<Integer> code = new ArrayList<Integer>();
        for (char ch: chars) {
            if(ch == 'b' || ch == 'f' || ch == 'p' || ch == 'v')
            {
                code.add(1);
            }
            if(ch == 'c' || ch == 'g' || ch == 'j' || ch == 'k' || ch == 'q' || ch == 's' || ch == 'x' || ch == 'z'){
                code.add(2);
            }
            if(ch=='d' || ch == 't' ){
                code.add(3);
            }
            if(ch == 'l'){
                code.add(4);
            }
            if(ch=='m' || ch=='n'){
                code.add(5);
            }
            if(ch == 'r') {
                code.add(6);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : code) {
            sb.append(i);
        }
        return sb.toString();
    }

    public Category getCategory() {
        return Cat;
    }

    public String getPrompt() {
        return Prompt;
    }
    public String printId(){
        return id;
    }

    public String printCatId(){
        return catID;
    }

    public static void main(String[] args) {
        Category cat = new Category("Color");

        Prompt prom = new Prompt("Suggest a new color palette and share why you think it may work better.",cat);
        Prompt prom1 = new Prompt("Do objects in the composition move too quickly, too slowly, or just right?",cat);

        System.out.println("Prompt ID: " + prom.printId() + " Cat: " + prom.printCatId());
        System.out.println("Prompt ID: " + prom1.printId() + " Cat: " + prom.printCatId());



    }
}
