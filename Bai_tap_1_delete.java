import java.util.Scanner;
public class Bai_tap_1_delete {

    public static void main(String[] args) {
        int num;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to delete");
        num=input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                for (int j = i; j < arr.length-2; j++) {
                    arr[j]=arr[j+1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
