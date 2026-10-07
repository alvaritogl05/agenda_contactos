import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
             Sleccione la accion que quiere realizar
             1. Añadir Contacto
             2. Mostrar Contacto
             3. Buscar Contacto
             4. Salir""";
        String o1 = "Añadir Contacto";
        String o2 = "Mostrar Contacto";
        String o3 = "Buscar Contacto";
        String o4 = "Salir";
        int seleccion = 0;
        while (1==1) {
            System.out.println(menu);
            seleccion = sc.nextInt();
            if (seleccion == 1) System.out.println("\n \n" + "Ha seleccionado: " + o1);
            if (seleccion == 2) System.out.println("\n \n" + "Ha seleccionado: " + o2);
            if (seleccion == 3) System.out.println("\n \n" + "Ha seleccionado: " + o3 );
            if (seleccion < 1 || seleccion > 4) {
                System.out.println("Ha escogido una opcion no disponible reintente: ");
            }
            if (seleccion == 4) {
                break;
            }
        }
        System.out.println("Ha seleccionado: " + o4);
    }
}