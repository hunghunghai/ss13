import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String sortedSubstring = getSortedSubstring(input);
        System.out.println("Chuỗi ký tự con được sắp xếp tăng dần: " + sortedSubstring);
    }

    private static String getSortedSubstring(String input) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            substrings.add(input.substring(i, i + 1));
        }

        Collections.sort(substrings);

        StringBuilder sb = new StringBuilder();
        for (String substring : substrings) {
            sb.append(substring);
        }

        return sb.toString();
    }
}
