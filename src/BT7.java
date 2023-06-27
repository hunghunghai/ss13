import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap danh sach chuoi (cach nhau boi dau cach): ");
        String input = scanner.nextLine();

        String[] stringArray = input.split(" ");
        for (String str : stringArray) {
            stringList.add(str);
        }

        System.out.print("Nhap chuoi can tim kiem: ");
        String searchStr = scanner.nextLine();

        boolean found = linearSearch(stringList, searchStr);
        if (found) {
            System.out.println("Tim thay chuoi '" + searchStr + "' trong danh sach.");
        } else {
            System.out.println("Khong tim thay chuoi '" + searchStr + "' trong danh sach.");
        }
    }

    private static boolean linearSearch(List<String> list, String searchStr) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(searchStr)) {
                System.out.println("Vi tri cua chuoi: " + i);
                return true;
            }
        }
        return false;
    }
}
