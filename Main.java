import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("Bienvenido al Menú");
        System.out.println("1) Ingresar Datos");
        System.out.println("2) Mostrar sismos de mayor magnitud");
        System.out.println("3) Contar sismos mayores o iguales a 5.0");
        System.out.println("4) Enviar SMS por cada sismo mayor 0 igual  a 7.0");
        System.out.println("5) Salir (S/N");
    }

   /* public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los datos: ");
        String datos = scanner.nextLine();

    }*/
}