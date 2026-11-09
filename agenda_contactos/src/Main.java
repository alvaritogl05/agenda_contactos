import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Nombre = new ArrayList<String>();
        ArrayList<String> Tlf = new ArrayList<String>();
        ArrayList<String> Agenda = new ArrayList<String>();
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
        while (true) {
            System.out.println("\n " + menu);
            int seleccion = sc.nextInt();
            sc.nextLine();
            switch (seleccion) {
                case 1 :
                    System.out.println("\nHa seleccionado: " + o1);
                    System.out.println("Introduzca el Nombre: ");
                    String contacto = sc.nextLine();
                    Nombre.add(contacto);
                    System.out.println("\n Introduzca el nº: ");
                    String tel = sc.nextLine();
                    Tlf.add(tel);
                    Agenda.add(contacto + " " + tel);
                    break;

                case (2) :
                    System.out.println("\n" + "Ha seleccionado: " + o2);
                    System.out.println(Agenda);
                    break;

                case 3:
                    System.out.println("\n " + "Ha seleccionado: " + o3);
                    System.out.println("Introduce el nombre del contacto que buscas:");
                    String buscar = sc.nextLine();
                    int posicion = Nombre.indexOf(buscar);
                    if (posicion > -1) {
                        System.out.println(Agenda.get(posicion));
                    } else {
                        System.out.println("Contacto no encontrado para añadirlo pulse 1: ");
                    }
                    break;

                case  4 :
                    System.out.println("Ha seleccionado: " + o4);
                    return;
                default:
                    System.out.println("Ha escogido una opcion no disponible reintente: ");
                    break;
            }
        }

    }

}
