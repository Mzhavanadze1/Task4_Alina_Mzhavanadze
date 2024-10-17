import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("sheiyvano aso:");

        String Asoebi= input.nextLine();

        switch (Asoebi ) {
            case "a":
            case "i":
            case "u":
            case "e":
            case "o":
                System.out.println("es khmovania");
                break;

            default:
                System.out.println("es tankhmovania");



        }
    }
}
