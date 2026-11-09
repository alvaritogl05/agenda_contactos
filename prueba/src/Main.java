import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int c5 = sc.nextInt();
        int c6 = sc.nextInt();
        int c7 = sc.nextInt();
        int c8 = sc.nextInt();
        int c9 = sc.nextInt();
        if (c1 == c2 && c1 > 0){
            if (c1==c3 && (c1+c2+c3 == 3)){
                System.out.println("Jugador1");
            }
            else
                System.out.println("Jugador2");
        }
        else if (c1 == c5 && c1>0){
            if (c1 == c9 && (c5+c1+c9 == 3)){
                System.out.println("Jugador1");
            }
            else
                System.out.println("Jugador2");

        }
        else if (c1 == c4 && c1>0) {
            if (c1 == c7 && (c1 + c4 + c7 == 3)) {
                System.out.println("Jugador1");
            } else
                System.out.println("Jugador2");
        }
        else if (c3 == c6 && c3 == c9 && c3 > 0){
            if (c3 + c6 + c9 == 3) {
                System.out.println("Jugador1");
            } else
                System.out.println("Jugador2");
        }
        else
            System.out.println("Empate");
    }
}