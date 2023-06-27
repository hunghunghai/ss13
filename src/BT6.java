import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BT6 {
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mang ngau nhien sap xep giam dan:");
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen can tim kiem: ");
        int num = scanner.nextInt();

        int index = binarySearch(arr, num);
        if (index != -1) {
            System.out.println("Tim thay " + num + " tai vi tri " + index);
        } else {
            System.out.println("Khong tim thay " + num);
        }
    }

    private static int binarySearch(Integer[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
