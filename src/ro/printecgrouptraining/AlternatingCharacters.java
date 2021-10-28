package ro.printecgrouptraining;

import javax.xml.parsers.SAXParser;
import java.util.Stack;

public class AlternatingCharacters {

    public static void main(String... args) {
    }

    public static int alternatingCharacters(String s) {
        int deleteCount=0;
        Stack <Character> characterStack=new Stack<>();
        characterStack=buildStack(s);
        deleteCount=s.length()-characterStack.size();
        return deleteCount;
    }

    public static Stack<Character> buildStack(String s) {
        Stack<Character> characterStack=new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(characterStack.isEmpty()) {
                characterStack.push(s.charAt(i));
            }
            else if(s.charAt(i)!=characterStack.peek()) {
                characterStack.push(s.charAt(i));
            }
        }
        return characterStack;
    }
}
