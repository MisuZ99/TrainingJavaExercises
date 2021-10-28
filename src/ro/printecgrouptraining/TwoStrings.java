package ro.printecgrouptraining;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoStrings {

    public static void main(String...args) {

    }

    public static String twoStrings(String s1, String s2) {
        Set<Character> firstSet=new HashSet<>();
        Set<Character> secondSet=new HashSet<>();

        for(int i=0;i<s1.length();i++)
        {
            firstSet.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++)
        {
            secondSet.add(s2.charAt(i));
        }
        /*for(int i=0;i<s1.length();i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                return "Yes";
            }*/

        Set<Character>thirdSet=new HashSet<>(firstSet);
        thirdSet.addAll(secondSet);
        if(thirdSet.size()<firstSet.size()+secondSet.size()) {
            return "NO";
        }
        else {
            return "YES";
        }

    }
}
