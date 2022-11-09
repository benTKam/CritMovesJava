import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
        for (Prompt prom: prompts) {
            System.out.println("Prompt: " + prom.getPrompt());
        }

        }


}

