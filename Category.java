import java.util.ArrayList;
import java.util.List;

public class Category {
    String Name;
    String id;

    public Category(String name){
        Name = name;
        id = genId();
    }

    public String getName() {
        return Name;
    }
    public String disId(){
        return id;
    }

    public String genId(){
        String sPrompt = Name.replaceAll("\\s", "");
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
}
