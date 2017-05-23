package practica78;
import java.util.Scanner;
/** @author carlos*/
public class Practica78 {
    public static void main(String[] args) {
        double radio, altura;
        Scanner teclado = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        System.out.println("Este programa calcula el area de un triangulo.");
        System.out.println("Dime el radio: ");
        radio = teclado.nextDouble();
        System.out.println("Dime la altura: ");
        altura = teclado.nextDouble();
        t1.SetArea(radio, altura);
        System.out.println("El area es "+t1.GetArea());

    }
    
}
