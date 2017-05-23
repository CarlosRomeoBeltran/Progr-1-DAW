package practica79;
import java.util.Scanner;
/**@author carlos romeo*/
public class Practica79 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pentagono p1 = new Pentagono();
        System.out.println("Este programa te calcula el area de un pentágono."+"\n");
        System.out.println("Dime el apotema: ");
        p1.SetApotema(teclado.nextDouble());
        System.out.println("Dime el perimetro: ");
        p1.SetPerimetro(teclado.nextDouble());
        p1.SetArea(p1.GetApotema(), p1.GetPerimetro());
        System.out.println("El area de tu pentágono es: "+p1.GetArea());
    }
    
}

