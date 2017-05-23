package practica80;
import java.util.Scanner;
/** @author carlos romeo*/
public class Practica80 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cubo c1 = new Cubo();
        System.out.println("Este programa te calcula el area y volumen de un cubo."+"\n");
        System.out.println("Dime el arista: ");
        c1.SetArista(teclado.nextDouble());
        c1.Area(c1.GetArista());
        System.out.println("El area de tu cubo es: "+c1.GetArea());
        c1.Volumen(c1.GetArista());
        System.out.println("El volumen de tu cubo es: "+c1.GetVolumen());
    }
    
}
