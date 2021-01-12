import java.util.Scanner;
public class Bai_tap_2_AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num;
        int index;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number to add: ");
        num = input.nextInt();
        System.out.println("Please input position to add: ");
        do {
              System.out.println("Enter suitable number");
              index = input.nextInt();
        }while ((index<0)||(index>arr.length));
        for (int i = arr.length-1; i > index; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=num;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        }
    }
