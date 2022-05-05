import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila1 = new Pila();
        boolean salir = false;
        int numero;

        for (int i = 0; i < 2; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numero = sc.nextInt();
            sc.nextLine();
            pila1.push(numero);
        }

        while (salir == false) {
            System.out.println("Introduce la operación a realizar: ");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            int seleccion = sc.nextInt();
            sc.nextLine();

            switch (seleccion) {
                case 1:
                    System.out.println("El resultado de la suma de los números es: " + (pila1.pop() + pila1.pop()));
                    salir = true;
                    break;

                case 2:
                    System.out.println("El resultado de la resta de los números es: " + (pila1.pop() - pila1.pop()));
                    salir = true;
                    break;

                case 3:
                    System.out.println("El resultado de la multiplicación de los números es: " + (pila1.pop() * pila1.pop()));
                    salir = true;
                    break;

                case 4:
                    System.out.println("El resultado de la división de los números es: " + (pila1.pop() / pila1.pop()));
                    salir = true;
                    break;

                default:
                    System.out.println("Debes de introducir una opción valida");
            }
        }

    }
}
