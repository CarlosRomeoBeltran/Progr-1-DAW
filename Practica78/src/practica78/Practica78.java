package practica78;
import java.util.Scanner;
/** @author carlos*/
public class Practica78 {
    public static void main(String[] args) {
        double base, altura;
        Scanner teclado = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        System.out.println("Este programa calcula el area de un triangulo.");
        System.out.println("Dime la base: ");
        base = teclado.nextDouble();
        t1.SetBase(base);
        System.out.println("Dime la altura: ");
        altura = teclado.nextDouble();
        t1.SetAltura(altura);
        System.out.println("El area es "+t1.GetArea());

    }
    
}
