package ro.printecgrouptraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String... args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String stringToAdd = sc.nextLine();
            if (!stringToAdd.equals("")) {
                stringList.add(stringToAdd);
            } else {
                i--;
            }
        }

        for (String string : stringList) {
            System.out.println(isBalanced(string));
        }
    }

    public static String isBalanced(String s) {
        Stack<Character> openingBrackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpeningBracket(s.charAt(i))) {
                openingBrackets.push(s.charAt(i));
            } else if (isClosingBracket(s.charAt(i))) {
                if (!openingBrackets.isEmpty()) {
                    if (isOpenedAndClosedBracket(openingBrackets.peek(), s.charAt(i))) {
                        openingBrackets.pop();
                    } else {
                        return "NO";
                    }
                } else {
                    return "NO";
                }
            }
        }

        System.out.println(openingBrackets);
        if (openingBrackets.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static boolean isOpeningBracket(char c) {
        if (String.valueOf("{[(").contains(String.valueOf(c))) {
            return true;
        }
        return false;
    }

    public static boolean isClosingBracket(char c) {
        if (String.valueOf("}])").contains(String.valueOf(c))) {
            return true;
        }
        return false;
    }

    public static boolean isOpenedAndClosedBracket(char openingBracket, char endingBracket) {
        if (String.valueOf(openingBracket).equals("{") && String.valueOf(endingBracket).equals("}")) {
            return true;
        } else if (String.valueOf(openingBracket).equals("[") && String.valueOf(endingBracket).equals("]")) {
            return true;
        } else if (String.valueOf(openingBracket).equals("(") && String.valueOf(endingBracket).equals(")")) {
            return true;
        } else {
            return false;
        }
    }
}
