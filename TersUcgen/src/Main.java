import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int satir;
        System.out.println("Satir sayisini girin.");
        satir = scan.nextInt();

        for(int i=satir; i >= 1; i--) {
            for(int j=1; j<= satir - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }


    }
}