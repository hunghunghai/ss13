public class BT1 {
    public static void main(String[] args) {
        int[] arr = getArr(); // Bước 1: Tạo mảng số nguyên ngẫu nhiên
        System.out.println("Mảng số nguyên:");
        printArray(arr); // Bước 2: In ra mảng số nguyên

        int max = linearSearchMax(arr); // Bước 3: Tìm số lớn nhất bằng thuật toán tìm kiếm tuyến tính
        System.out.println("Số lớn nhất trong mảng: " + max); // Bước 4: In số lớn nhất ra
    }

    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int linearSearchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
