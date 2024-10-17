import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*51);
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Choose Number");
            int sheyvanili = input.nextInt();
            if (sheyvanili == randomNum) {
                System.out.println("correct answer!");
                break;
            }

            else if (sheyvanili>randomNum) {
                System.out.println("Your number is high!");
            }
            else if (sheyvanili<randomNum) {
                System.out.println("Your number is to low!");
            }


        }


    }
}
