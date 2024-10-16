import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sheiyvane ricxvi");

        int ricxvi= input.nextInt();


        if (ricxvi<60){
            System.out.println("Pasuxi: F");
        } else if (ricxvi>=60 && ricxvi <= 69) {
            System.out.println("Pasuxi: D");

        } else if (ricxvi>=70 && ricxvi<=79) {
            System.out.println("Pasuxi: C");

        } else if (ricxvi>=80 && ricxvi<=89) {
            System.out.println("Pasuxi: B");

        } else if (ricxvi>=90 && ricxvi<=100) {
            System.out.println("Pasuxi: A");

        }else {
            System.out.println("Araswori ricxvi");
        }

    }
}
