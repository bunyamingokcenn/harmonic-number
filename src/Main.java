import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //formul --> 1 + (1/2) + (1/3) + (1/4) + (1/5) + (1/n)

        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int userInput = input.nextInt();
        double total=0;

        for (double i=1; i<=userInput ; i++ ){
            total += (1/i);
        }

        System.out.println("Harmonik sonuç: " + total);

    }
}