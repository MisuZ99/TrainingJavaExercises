package ro.printecgrouptraining;

import java.util.ArrayList;
import java.util.List;

public class MarkAndToys {

    public static void main(String ... args ){
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(maximumToys(arrayList,7));
    }

    public static int maximumToys(List<Integer> prices,int k) {
        prices.sort(Integer::compareTo);
        int count=0;
        int step=0;
        while(k>=0&&step<prices.size()) {
            k=k-prices.get(step);
            step++;
            if(k>=0) {
                System.out.println(k);
                count++;
            }

        }
        return step;
    }
}
