package ro.printecgrouptraining;

import java.util.*;

public class FrequencyQuery {

    public static void main(String... args) {

    }

    static List<Integer> freqQuery(List<List<Integer>> queries) {

        List<Integer> finalList=new ArrayList<>();
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<queries.size();i++) {
                if(queries.get(i).get(0)==1) {
                    add(map,queries.get(i).get(1));
                }
                else if(queries.get(i).get(0)==2) {
                    if(map.containsKey(queries.get(i).get(1))) {
                        delete(map, queries.get(i).get(1));
                    }
                }
                else {
                    if(!(queries.size()<queries.get(i).get(1))) {
                        finalList.add(print(map, queries.get(i).get(1)));
                    }
                    else {
                        finalList.add(0);
                    }
                }

        }
        return finalList;
    }

    public static void add(Map<Integer, Integer> map, int key) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }

    public static void delete(Map<Integer,Integer> map,int key) {
        if(map.containsKey(key)) {
            if(map.get(key)!=1) {
                map.put(key,map.get(key)-1);
            }
            else {
                map.remove(key);
            }
        }
    }

    public static int print(Map<Integer,Integer> map,int frequency) {

        if(map.containsValue(frequency)) {
            return 1;
        }
        return 0;
    }

}