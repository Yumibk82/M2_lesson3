import java.util.Scanner;
public class Bai_tap_4_findMaxIn2DArray {
    public static void main(String[] args) {
        float max;
        int m,n;
        int[][] arr={{1,3,5,7,9},{2,4,6,8,10},{12,31,23,12,11},{11,2,4,7,0}};
        max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                    System.out.println(max);
                    System.out.println(i+","+j);
                }
            }
        }
        System.out.println("Max is "+max);


    }
}
