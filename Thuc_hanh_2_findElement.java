import java.util.Scanner;
public class Thuc_hanh_2_findElement {
    public static void main(String[] args) {
        String[] student={"Hang","Bao","Tung","Tam"};
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name's student: ");
        String name=input.nextLine();

        boolean isExist=false;
        for (int i = 0; i < student.length; i++) {
            if(student[i].equals(name)){
                System.out.println("Position of the student in the list "+i+" "+name);
                isExist=true;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found "+name+" in the list");
    }
}
