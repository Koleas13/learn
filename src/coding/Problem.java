package coding;

import java.util.LinkedList;

public class Problem {

    public static void main(String[] args) {
        System.out.println(getUniqueChar("dhkdgjh"));
    }

    public static Character getUniqueChar(String s) {

        char[] charArray = s.toCharArray();
        LinkedList<Character> result = new LinkedList<>();

        for (char c : charArray) {
            if (result.contains(c)) {
                result.remove(result.indexOf(c));
            } else {
                result.add(c);
            }
        }

        return result.get(0);
    }
}
