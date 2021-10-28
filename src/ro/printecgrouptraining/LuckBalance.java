package ro.printecgrouptraining;

import java.util.Comparator;
import java.util.List;

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {

        int luckValue=0;

        contests.sort(listComparator);

        for(int i=0;i< contests.size();i++) {
            if(contests.get(i).get(1)==0) {
                luckValue+=contests.get(i).get(0);
            }
            else if(k>0) {
                luckValue+=contests.get(i).get(0);
                k--;
            }
            else {
                luckValue-=contests.get(i).get(0);
            }
        }
        System.out.println(contests);

        return luckValue;
    }

    public static Comparator<List<Integer>> listComparator = (list1, list2) -> {
        for (int i = 0; i < list1.size(); i++) {
            int value = Integer.compare(list2.get(i), list1.get(i));
            if (value != 0)
                return value;
        }
        return 0;
    };
}
