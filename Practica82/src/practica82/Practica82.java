package practica82;
import java.util.Scanner;
/** @author Carlos Romeo*/
public class Practica82 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CambioMonedas c1 = new CambioMonedas();
        System.out.println("Este programa te descompone en la menor cantidad posible de billetes y monedas una cantidad de euros.");
        System.out.println("Dime una cantidad de euros.");
        c1.ObtenerBilletes(teclado.nextLong());
        long [] resultado = c1.GetObtenerBilletes();
        long [] billetes = c1.GetBilletes();
        for (int i = 0; resultado.length > i; i++){
            System.out.println(resultado[i]+" billetes de "+billetes[i]);
        }
    }
}

