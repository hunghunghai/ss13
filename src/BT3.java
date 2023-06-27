import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        int[][] arr = getArr(); // Bước 2: Tạo mảng 2 chiều số nguyên ngẫu nhiên
        System.out.println("Mảng 2 chiều:");
        printArray(arr); // Bước 2: In ra mảng 2 chiều

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        boolean found = linearSearch(arr, target); // Bước 3: Tìm số trong mảng 2 chiều
        if (found) {
            System.out.println("Số " + target + " được tìm thấy trong mảng tại các vị trí sau:");
            List<Integer> rowIndices = new ArrayList<>();
            List<Integer> colIndices = new ArrayList<>();
            findIndices(arr, target, rowIndices, colIndices); // Bước 5: Tìm các vị trí số trong mảng 2 chiều
            for (int i = 0; i < rowIndices.size(); i++) {
                int rowIndex = rowIndices.get(i);
                int colIndex = colIndices.get(i);
                System.out.println("[" + rowIndex + "][" + colIndex + "]");
            }
        } else {
            System.out.println("Số " + target + " không được tìm thấy trong mảng.");
        }
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static boolean linearSearch(int[][] arr, int target) {
        for (int[] row : arr) {
            for (int num : row) {
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void findIndices(int[][] arr, int target, List<Integer> rowIndices, List<Integer> colIndices) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowIndices.add(i);
                    colIndices.add(j);
                }
            }
        }
    }
}
