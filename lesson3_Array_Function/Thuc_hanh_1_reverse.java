package lesson3_Array_Function;
import java.util.Scanner;
public class Thuc_hanh_1_reverse {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size=input.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        } while (size>20);

        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Enter element "+(i+1)+": ");
            array[i]=input.nextInt();
            i++;
        }
        System.out.print("%-20s%s"+","+"Elements in array: "+",");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        for (int j = 0; j < array.length; j++) {
            int temp=array[j];
            array[j]=array[size-j-1];
            array[size-j-1]=temp;
        }
        System.out.println("new array");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
    }
}
