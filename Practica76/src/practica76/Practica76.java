package practica76;
import java.util.Scanner;
/** @author carlos romeo*/
public class Practica76 {
    public static void main(String[] args) {
        int apagar=1, operador=1;
        Scanner teclado = new Scanner(System.in);
        Calculadora c1 = new Calculadora();
        System.out.println("Este programa es una calculadora."+"\n");   
        while(operador!=0){ 
            System.out.println("Dame el primer número: ");
            int x = teclado.nextInt();
            System.out.println("Dame el segundo número: ");
            int y= teclado.nextInt();
            System.out.println("");
            System.out.println("Dime un operador de esta lista: ");
            System.out.println("1) Suma.");
            System.out.println("2) Resta.");
            System.out.println("3) Multiplicacion.");
            System.out.println("4) Division.");
            System.out.println("5) Resto.");      
            operador=teclado.nextInt();
            System.out.println("");
            switch(operador){
                case 1:                   
                    c1.SetSuma(x, y);
                    System.out.println("El resultado es: "+c1.GetResultado());
                    break;
                case 2:
                    c1.SetResta(x, y);
                    System.out.println("El resultado es: "+c1.GetResultado());
                    break;
                case 3:
                    c1.SetMultiplicacion(x, y);
                    System.out.println("El resultado es: "+c1.GetResultado());
                    break;
                case 4:
                    c1.SetDivision(x, y);
                    System.out.println("El resultado es: "+c1.GetResultado());
                    break;
                case 5:
                    c1.SetResto(x, y);
                    System.out.println("El resultado es: "+c1.GetResultado());
                    break;
                default:
                    System.out.println("Operador introducido incorrecto.");
                    break;
            }
            System.out.println("¿Quieres apagar la calculadora?(teclea '0' para apagar, cualquier número para continuar");
            operador=teclado.nextInt();
        }       
    }
}
    
