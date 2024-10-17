import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sheiyvanet dadebiti ricxvi");

        int N = input.nextInt();
        int sawyisi =0;
        int jami = 0;

        if (N<0){
            System.out.println("ricxvi ar aris dadebiti");
        }



        while (sawyisi<= N){
           if (sawyisi % 2==0){
               jami+=sawyisi;
           }

            sawyisi++;
        }
        System.out.println(jami);

    }
}
