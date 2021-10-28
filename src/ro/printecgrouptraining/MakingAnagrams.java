package ro.printecgrouptraining;

import java.util.ArrayList;
import java.util.List;

public class MakingAnagrams {

    public static void main (String...args) {

        int deleteCount=makeAnagram("abbc","aac");
        System.out.println(deleteCount);
    }

    public static int makeAnagram (String a, String b) {
        List<Character> listA=new ArrayList<>();
        for(int i=0;i<a.length();i++) {
            listA.add(a.charAt(i));
        }

        List<Character> listB=new ArrayList<>();
        for(int i=0;i<b.length();i++) {
            listB.add(b.charAt(i));
        }

        for(int i=0;i<listA.size()&&!listB.isEmpty();i++) {
            if(listB.contains(listA.get(i))) {
                listB.remove(listA.get(i));
                listA.remove(i);
                i--;
            }
        }
        return listA.size()+listB.size();
    }
}
