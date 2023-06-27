import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String longestSubstring = getLongestSubstring(input);
        System.out.println("Chuỗi con dài nhất và được sắp xếp: " + longestSubstring);
    }

    private static String getLongestSubstring(String input) {
        int maxLength = 0;
        String longestSubstring = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isSorted(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestSubstring = substring;
                }
            }
        }

        return longestSubstring;
    }

    private static boolean isSorted(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) > input.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
