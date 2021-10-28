package ro.printecgrouptraining;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static void main(String ... args) {

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        arr.sort(Comparator.comparingInt(Integer::intValue));
        System.out.println(arr);
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++) {
            if(difference(arr.get(i),arr.get(i+1))<min) {
                min=difference(arr.get(i),arr.get(i+1));
            }
        }
        return min;
    }

    public static int difference(int a,int b) {
        return Math.abs(a-b);
    }
}
