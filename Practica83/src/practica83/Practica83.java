package practica83;
import java.util.Scanner;
/** @author Carlos Romeo */
public class Practica83 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        EcuacionSegundoGrado e1 = new EcuacionSegundoGrado();
        System.out.println("Este programa te calcula una ecuación de segundo grado.");
        System.out.println("Dime a: ");
        e1.SetA(teclado.nextDouble());
        System.out.println("Dime b: ");
        e1.SetB(teclado.nextDouble());
        System.out.println("Dime c: ");
        e1.SetC(teclado.nextDouble());
        e1.EcuacionSegundoGradoMas(e1.GetA(),e1.GetB(),e1.GetC());
        System.out.println("Resultado con + : "+e1.GetMas());
        e1.EcuacionSegundoGradoMenos(e1.GetA(),e1.GetB(),e1.GetC());
        System.out.println("Resultado con - : "+e1.GetMenos());
    }
    
}

