public class BT2 {
    public static void main(String[] args) {
        int[] arr = getArr(); // Bước 1: Tạo mảng số nguyên ngẫu nhiên
        System.out.println("Mảng số nguyên:");
        printArray(arr); // Bước 2: In ra mảng số nguyên

        findSmallestAndSecondSmallest(arr); // Bước 3: Tìm số lớn nhất bằng thuật toán tìm kiếm tuyến tính
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

    private static int findSmallestAndSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Số nhỏ nhất trong mảng: " + smallest);
        System.out.println("Số nhỏ thứ hai trong mảng: " + (secondSmallest == smallest ? "Không tồn tại" : secondSmallest));
        return smallest;
    }
}


