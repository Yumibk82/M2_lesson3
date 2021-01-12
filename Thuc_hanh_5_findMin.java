import java.util.Scanner;
public class Thuc_hanh_5_findMin {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 18, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: "+min);
        System.out.println("The position of smallest element in the array is: "+arr[]);
    }
    public static int minValue(int[] array) {
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
