package coding;

import coding.util.Helper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstChar("ccvvbbnn"));




        // Scanner scan = new Scanner(System.in);
        // int numb = scan.nextInt();
        //
        // int i = 0;
        // for (i = 0; i < numb; i++) {
        //     for (int j = numb - i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println(i);
        int[] numb = new int[]{12,23,34,46,57,57};
        // number(numb);

        // System.out.println(numb[7]);

        List<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(14);
        ints.add(112);

        ints.remove(1);
        System.out.println(ints.get(1));

        for (Integer x: ints) {
            System.out.println(x);
        }

        ints.forEach(System.out::println);



        // Arrays.stream(numb).filter(x -> (x % 2)!= 0).mapToObj(x -> x + " bananas").forEach(System.out::println);


    }


    public static void number(int[] numbArr){
        for (int i = 0; i < numbArr.length; i++) {
            if (numbArr[i] % 2 != 0) {
                numbArr[i] = numbArr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(numbArr));
    }

    public static char firstChar(String str) {
        char temp = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[i] == charArr[j] && i != j) {
                    break;
                }
                if (j == charArr.length - 1) {
                    return charArr[i];

                }
            }
        }
        return '\u0000';
    }
}