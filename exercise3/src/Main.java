import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner s = new Scanner(System.in);

        // variables
        double n1, n2;

        // division
        try {
            System.out.println("Ingrese un dividendo: ");
            n1 = s.nextDouble();
            System.out.println("Ingrese el divisor: ");
            n2 = s.nextDouble();

            if (n2 == 0) throw new ArithmeticException("El divisor no puede ser 0");

            System.out.println("El resultado de la división es: " + n1/n2);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: " + e);
        } catch (RuntimeException e) {
            System.out.println("ERROR: Error desconocido");
        } finally {
            System.out.println("Fin del programa");
        }
    }
}
