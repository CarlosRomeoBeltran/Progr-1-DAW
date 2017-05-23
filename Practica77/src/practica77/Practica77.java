package practica77;
import java.util.Scanner;
/**
 *
 * @author carlos
 */
public class Practica77 {
    public static void main(String[] args) {
        double radio;
        Scanner teclado = new Scanner(System.in);
        Circulo c1 = new Circulo();
        System.out.println("Este programa calcula el area y la longitud de una circunferencia.");
        System.out.println("Dime el radio: ");
        radio = teclado.nextDouble();
        c1.SetArea(radio);
        System.out.println("El area es "+c1.GetArea());
        c1.SetLongitud(radio);
        System.out.println("La longitud es: "+c1.GetLongitud());
    }
    
}
