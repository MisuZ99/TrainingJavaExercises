package ro.printecgrouptraining;

import java.util.*;

public class RansomNote {

    public static void main (String...args) {


    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
      /*for(String s:magazine) {
            if(note.contains(s)) {
                note.remove(s);
            }
        }

        if(note.isEmpty()) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }*/

        /*Map<String,Integer> magazineMap=new Hashtable<>();
        Map<String,Integer> noteMap=new Hashtable<>();

        for(String s:magazine) {
            magazineMap.putIfAbsent(s, Collections.frequency(magazine, s));
        }

        for(String s:note) {
            noteMap.putIfAbsent(s,Collections.frequency(note,s));
        }

        Set<String> keys=noteMap.keySet();

        for(String key :keys) {
            if(!magazineMap.containsKey(key)) {
                System.out.println("No");
                return;
            }

            else if(noteMap.get(key)>magazineMap.get(key)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");


    }*/
        for(int i=0;i<note.size();i++) {
            if(Collections.frequency(note,note.get(i))>Collections.frequency(magazine,note.get(i))) {
                System.out.println("No");
                return;
            }
            else {
                note.removeAll(Collections.singleton(note.get(i)));
            }
        }
        System.out.println("Yes");
}
}
