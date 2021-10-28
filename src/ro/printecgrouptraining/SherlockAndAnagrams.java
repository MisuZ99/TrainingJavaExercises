package ro.printecgrouptraining;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SherlockAndAnagrams {
    public static void main(String...args) {
        System.out.println(isAnagram("abb","bbac"));
        System.out.println(createAllSubstrings("sdadgsgsdf"));
        System.out.println(sherlockAndAnagrams("abba"));
    }

    public static int sherlockAndAnagrams(String s) {
        int count=0;
        List<String> strings=new ArrayList<>(createAllSubstrings(s));
        strings.sort(Comparator.comparingInt(String::length));
        for(int i=0;i< strings.size();i++) {
            for(int j=i+1;j<strings.size()&&strings.get(j).length()==strings.get(i).length();j++) {
                if(isAnagram(strings.get(i), strings.get(j))) {
                    count++;
                }
            }
        }
        return count;

    }

    public static List<String> createAllSubstrings(String s) {
        List<String> strings=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            String subString=new String(String.valueOf(s.charAt(i)));
            strings.add(subString);
            for(int j=i+1;j<s.length();j++) {
                subString=subString+(String.valueOf(s.charAt(j)));
                strings.add(subString);
            }
        }
        return strings;
    }

    public static boolean isAnagram(String s1,String s2) {
        if(s1.length()!=s2.length()) {
            return false;
        }
        List<Character> characters=new ArrayList<>();
        for(int i=0;i<s1.length();i++) {
            characters.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++) {
            if(characters.contains(s2.charAt(i))) {
                characters.remove(characters.indexOf(s2.charAt(i)));

            }
        }

        if(characters.isEmpty()) {
            return true;
        }
        return false;
    }
}
