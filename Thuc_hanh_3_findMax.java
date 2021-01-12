import java.util.Scanner;
public class Thuc_hanh_3_findMax {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("enter size of array");
            size=input.nextInt();
            if(size>20){
                System.out.println("size should not exceed 20");
            }
        }while (size>20);
        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=input.nextInt();
            i++;
        }
        System.out.println("Array list ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }
        int max=arr[0];
        int index=1;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>max){
                max=arr[j];
                index=j+1;
            }
        }
        System.out.println(max);
    }
}
