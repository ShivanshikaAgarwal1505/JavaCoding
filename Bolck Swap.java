import java.io.*;

class BlockSwap {
    public static void leftRotate(int arr[], int d, int n) {
        int j, i;
        // no swap when swap number is 0 or equal to array
        if (d == 0 || d == n) {
            return;
        }

        if (d > n) {
            d = n % d;
        }

        i = d;
        j = n - d;
        while (i != j) {
            if (i < j) {
                swap(arr, d - i, j, d);
                j -= i;
            }
            else {
                swap(arr, d - i, d, j);
                i -= j;
            }
        }
        swap(arr, d - i, d, i);
    }

    public static void swap(int arr[], int fi, int si, int d) {
        int temp;

        for (int i = 0; i < d; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] arg) {
        int arr[] = {
            1,
            2,
            3,
            4,
            5,
            6,
            7
        };
        leftRotate(arr, 2, 7);
        printArray(arr, 7);
    }
}
