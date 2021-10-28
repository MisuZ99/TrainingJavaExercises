package ro.printecgrouptraining;

import java.util.ArrayList;
import java.util.List;

public class SpecialStringAgain {

    public static long substrCount(int n, String s) {
        long finalCount=0;

        List<Pair> pairList=new ArrayList<>();
        for (int i=0;i<s.length();i++) {
            int j=i+1;
            while(j<s.length()&&s.charAt(j)==s.charAt(i)) {
                j++;
                pairList.add(new Pair(s.charAt(i),j-1));
                i=j-1;
            }
        }

        for(int i=0;i<pairList.size();i++) {
            Pair pair=pairList.get(i);
            finalCount+=(1+pair.count)*pair.count/2;
            if (pair.count == 1 && i > 0 && i < pairList.size() - 1) {
                System.out.println(finalCount);
                Pair pre = pairList.get(i - 1);
                Pair next = pairList.get(i + 1);
                if (pre.character == next.character) {
                    finalCount += Math.min(pre.count, next.count);
                }
            }
        }


        return finalCount;
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

    public static class Pair {
        char character;
        long count;

        public Pair(char character, long count) {
            this.character = character;
            this.count = count;
        }
    }
}
