package practica81;
import java.util.Scanner;
/** @author carlos romeo*/
public class Practica81 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Esfera e1 = new Esfera();
        System.out.println("Este programa te calcula el area y volumen de una esfera."+"\n");
        System.out.println("Dime el radio: ");
        e1.SetRadio(teclado.nextDouble());
        e1.SetArea(e1.GetRadio());
        System.out.println("El area de tu esfera es: "+e1.GetArea());
        e1.SetVolumen(e1.GetRadio());
        System.out.println("El volumen de tu esfera es: "+e1.GetVolumen());
    }
}

