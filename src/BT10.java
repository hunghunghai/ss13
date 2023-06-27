import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BT10 {
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
        System.out.println("Mang da sap xep dao nguoc: ");
        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri min: ");
        int min = scanner.nextInt();

        System.out.print("Nhap gia tri max: ");
        int max = scanner.nextInt();

        int lowerIndex = findLowerBoundIndex(arr, min);
        int upperIndex = findUpperBoundIndex(arr, max);

        int count = upperIndex - lowerIndex - 1;

        System.out.println("So luong so tim thay: " + count);
        System.out.print("Cac so tim thay: ");
        for (int i = lowerIndex + 1; i < upperIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int findLowerBoundIndex(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static int findUpperBoundIndex(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid;
            }
        }

        return result;
    }

    private static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
