import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacion=0;
        int x = 0;
        int y = 0;




        while (operacion != 5) {

            System.out.println("+------------------------------------+");
            System.out.println("Ingrese la operación");
            System.out.println("1: suma");
            System.out.println("2: resta");
            System.out.println("3: multiplicación");
            System.out.println("4: división");
            System.out.println("5: salir");
            System.out.println("+------------------------------------+");


            operacion = scanner.nextInt();

            if (operacion == 5) {
                System.out.println("Saliendo...");
            } else if (operacion <= 5 && operacion >= 1) { // else if (operacion <6  && operacion > 0)
                System.out.print("Ingrese el primer número: ");
                x = scanner.nextInt();

                System.out.print("Ingrese el segundo número: ");
                y = scanner.nextInt();
            }else {
                System.out.println("Input incorrecto");
            }



            if (operacion == 1) {
                suma(x, y);
            } else if (operacion == 2) {
                resta(x, y);
            } else if (operacion == 3) {
                multiplicacion(x, y);
            } else if (operacion == 4) {
                division(x, y);
            } else {
                if (operacion != 5){
                    System.out.println("Operación no válida");
                };
            }

        }while (operacion != 5)
            scanner.close();

    }
    public static void suma(int uno, int dos) {
        System.out.println("Resultado de la suma: " + (uno + dos));
    }

    public static void resta(int x, int y) {
        System.out.println("Resultado de la resta: " + (x - y));
    }

    public static void multiplicacion(int x, int y) {
        System.out.println("Resultado de la multiplicación: " + (x * y));
    }

    public static void division(int divsor, int dividendo) {
        if (dividendo == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("Resultado de la división: " + ((double)divsor / dividendo));
        }
    }
}