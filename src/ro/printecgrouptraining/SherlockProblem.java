package ro.printecgrouptraining;

import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


//Sherlock and the valid String
public class SherlockProblem {

        public static String isValid(String s) {
            Map<Character, Integer> frequency = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (frequency.containsKey(s.charAt(i))) {
                    int value = frequency.get(s.charAt(i)) + 1;
                    frequency.put(s.charAt(i), value);
                } else {
                    frequency.put(s.charAt(i), 1);
                }
            }

            Map<Integer, Integer> frequenciesOfFrequencies = new HashMap<>();

            for (Character frequencyKey : frequency.keySet()) {
                if (frequenciesOfFrequencies.containsKey(frequencyKey)) {
                    int value = frequenciesOfFrequencies.get(frequencyKey) + 1;
                    frequenciesOfFrequencies.put(frequency.get(frequencyKey), value);
                } else {
                    frequenciesOfFrequencies.put(frequency.get(frequencyKey), 1);
                }
            }

            List<Integer> frequencyValues = new ArrayList<>(frequency.values());
            Collections.sort(frequencyValues);
            System.out.println(frequencyValues);


            if (frequencyValues.size() > 2) {
                System.out.println(frequencyValues.get(0)+ "  "+frequencyValues.get(frequencyValues.size()-1));
                if(frequencyValues.get(0).equals(frequencyValues.get(frequencyValues.size()-1)))
                {
                    return "YES";
                }
                if (frequencyValues.get(frequencyValues.size() - 1) - frequencyValues.get(frequencyValues.size() - 2) == 1
                        && frequencyValues.get(frequencyValues.size() - 1) - frequencyValues.get(0) == 1) {
                    return "YES";

                }

                if (frequencyValues.get(0) == 1 && frequencyValues.get(frequencyValues.size() - 1).equals(frequencyValues.get(1))) {
                    return "YES";
                }

                else {
                    return "NO";
                }
            } else {
                return "YES";
            }
        }
}


            /* List<Integer> frequenciesOfFrequenciesList=new ArrayList(frequenciesOfFrequencies.values());

            Set<Integer> finalFrequencies=new HashSet<>(frequency.values());
            ArrayList <Integer> finalFrequenciesList=new ArrayList<>(finalFrequencies);
            if (finalFrequenciesList.size()==2&&(frequenciesOfFrequenciesList.get(0)==1&&frequenciesOfFrequenciesList.get(2)==1)){
                if(finalFrequenciesList.get(0)-finalFrequenciesList.get(1)==1||finalFrequenciesList.get(0)-finalFrequenciesList.get(1)==-1)
                {
                    System.out.println(frequenciesOfFrequenciesList);
                    return "YES";
                }
            }
            System.out.println(finalFrequenciesList);
            return "NO";*/


    class Solution {
        public static void main(String[] args) throws IOException {
            String s;
            Scanner sc=new Scanner(System.in);
            s=sc.nextLine();

            System.out.println(SherlockProblem.isValid(s));

        }
    }


