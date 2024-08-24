package StringQ;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "itanva";
        String str2 = "Avanti";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();;
        if (str1.length() == str2.length()) {

            Arrays.sort(arr2);
            Arrays.sort(arr1);
            boolean result = Arrays.equals(arr1, arr2);
            if (result) {
                System.out.println(str1 + " " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " " + str2 + " are not anagrams lkk");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : arr2) {
            System.out.print(c + " ");
        }

    }
}
