package ro.printecgrouptraining;

import java.util.List;

public class BubbleSort {
    public static void main(String...args) {

    }

    public static void countSwaps (List<Integer> a) {
        int count=0;
        for (int i = 0; i < a.size();i++) {
            for (int j = 0; j < a.size()-1; j++) {
                if (a.get(j) > a.get(j+1)) {
                    swap(a,j,j+1);
                    count++;
                }
            }

        }

        int firstElement=a.get(0);
        int lastElement=a.get(a.size()-1);
        System.out.println("Array is sorted in " + count +" swaps.");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }

    public static void swap(List<Integer>list,int index1,int index2) {
       int aux=list.get(index2);
       list.set(index2,list.get(index1));
       list.set(index1,aux);
    }
}
