import java.util.Scanner;
public class Bai_tap_3_CombineArray {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr = new int[6];

        Scanner input = new Scanner(System.in);
        System.out.println("Please input element of array 1: ");
        int i = 0;
        while (i < arr1.length) {
            arr1[i] = input.nextInt();
            i++;
        }
        System.out.print("Elements in array: ");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }
        System.out.println("Please input element of array 2: ");
        int k = 0;
        while (k < arr2.length) {
            arr2[k] = input.nextInt();
            k++;
        }
        System.out.print("Elements in array: ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }
        for (int j = 0; j < arr.length - arr2.length; j++) {
            arr[j] = arr1[j];
        }
        for (int j = arr1.length; j < arr.length; j++) {
            arr[j] = arr2[j - arr1.length];
        }
        System.out.print("Elements in array arr: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
