package ro.printecgrouptraining;

import java.util.List;

public class MaxMin {

    public static void main(String ... args) {

    }

    public static int maxMin(int k, List<Integer> arr) {
        arr.sort(Integer::compareTo);
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-k+1;i++) {
            if(difference(arr.get(i+k-1),arr.get(i))<min) {
                min=difference(arr.get(i+k-1),arr.get(i));
            }
        }

        return min;
    }

    public static int difference(int a,int b) {
        return a-b;
    }
}
