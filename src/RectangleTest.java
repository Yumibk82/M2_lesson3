import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width ");
        double width=input.nextDouble();
        System.out.println("Enter the height ");
        double height=input.nextDouble();

        Rectangle rec=new Rectangle(width,height);
        System.out.println("Rectangle is "+ rec.display());
        System.out.println("Perimeter is "+rec.getPerimeter());
        System.out.println("Area is "+rec.getArea());
    }
}
