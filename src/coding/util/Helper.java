package coding.util;

import java.util.Scanner;

public class Helper {

    private static Scanner scanner = new Scanner(System.in);
    public static int scanInt(){
        int result = scanner.nextInt();
        return result;
    }

    public static String scanLine(){
        return scanner.nextLine();
    }

    public static double scanDouble(){
        Double result = scanner.nextDouble();
        return result;
    }


}
