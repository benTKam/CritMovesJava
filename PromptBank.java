import java.util.ArrayList;
import java.util.List;

public class PromptBank {
    List<Prompt> PromptList;

    public PromptBank(List<Prompt> promptList){
        PromptList = promptList;

    }
    public List<Prompt> getPrompts(){
        return PromptList;
    }

}
