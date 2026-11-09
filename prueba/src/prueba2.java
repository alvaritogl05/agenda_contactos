import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minuto = sc.nextInt();
        int recorrer = 1;
        float precio = 0f;
        sc.nextLine();
        String dia = sc.nextLine();
        String turno = sc.nextLine();
        while (recorrer<=minuto){
            if (recorrer <= 5){
                precio ++;
            }
            else if (recorrer <= 8 ){
                precio += 0.80f;
            }
            else if (recorrer <= 10 ){
                precio += 0.70f;
            }
            else if (recorrer >10){
                precio += 0.50f;
            }
            recorrer ++;
        }
        float impuesto = 0f;
        if (dia.equals("domingo")){
            impuesto = (precio * 3)/100;
        }
        else {
            if (turno.equals("manana")){
                impuesto = (precio * 15)/100;
            }
            else if (turno.equals("tarde")) {
                impuesto = (precio * 10)/100;
            }
        }
        System.out.printf("%.2f%n", precio);
        System.out.printf("%.2f%n", impuesto);
        System.out.printf("%.2f%n", impuesto+precio);
    }
}