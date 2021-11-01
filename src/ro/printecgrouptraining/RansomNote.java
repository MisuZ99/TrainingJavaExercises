package ro.printecgrouptraining;

import java.util.*;

public class RansomNote {

    public static void main (String...args) {
        List<String> magazine=new ArrayList<>();
        List<String> note=new ArrayList<>();

        magazine.add("Salut");
        magazine.add("buna");
        magazine.add("ziua");

        note.add("Salut");
        note.add("ziua");
        note.add("buna");

        checkMagazine(magazine,note);

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

        Map<String, Integer> magazineMap = new HashMap<>();
        for (String s : magazine) {
            if (!magazineMap.containsKey(s)) {
                magazineMap.put(s, 1);
            } else {
                magazineMap.put(s, magazineMap.get(s) + 1);
            }
        }

        for (int i = 0; i < note.size(); i++) {
            if (!magazineMap.containsKey(note.get(i))) {
                System.out.println("NO");
                return;
            } else if (magazineMap.get(note.get(i)) == 1) {
                magazineMap.remove(note.get(i));
            } else if (magazineMap.get(note.get(i)) > 1) {
                magazineMap.put(note.get(i), magazineMap.get(note.get(i)) - 1);
            }
        }
        System.out.print("YES");

    }

        /*Map<String,Integer> magazineMap=new Hashtable<>();
        Map<String,Integer> noteMap=new Hashtable<>();

        for(String s:magazine) {
            magazineMap.putIfAbsent(s, Collections.frequency(magazine, s));
        }

        for(String s:note) {
            noteMap.putIfAbsent(s,Collections.frequency(note,s));
        }

        Set<String> keys=noteMap.keySet();
        System.out.println(magazineMap.size()+" "+noteMap.size());

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


    } /*
       /* for(int i=0;i<note.size();i++) {
            if(Collections.frequency(note,note.get(i))>Collections.frequency(magazine,note.get(i))) {
                System.out.println("No");
                return;
            }
            else {
                note.removeAll(Collections.singleton(note.get(i)));
            }
        }
        System.out.println("Yes");*/
}

