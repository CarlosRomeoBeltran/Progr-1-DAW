package practica90;
import java.util.Scanner;
/** @author Carlos Romeo*/
public class Practica90 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NIF n1 = new NIF();
        System.out.println("Este programa te comprueba la letra del DNI que pases."+"\n");
        System.out.println("Dime el DNI.");
        n1.SetNIF(teclado.nextLine());
    }
    
}

