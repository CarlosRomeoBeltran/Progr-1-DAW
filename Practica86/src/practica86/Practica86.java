package practica86;
import java.util.Scanner;
/**
 *
 * @author carlos romeo
 */
public class Practica86 {

    public static void main(String[] args) {
        int op;         /*Variable para manejar las opciones*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa maneja un contador.");
        System.out.println("");
        System.out.println("Introduce una cantidad para tu contador.");
        Contador c1 = new Contador(teclado.nextInt());
        
        do{
            c1.Menu();
            op = teclado.nextInt();
            switch(op){
                case 0:
                    System.out.println("");
                    System.out.println("Dime la cantidad: ");
                    c1.SetContador(teclado.nextInt());
                    break;
                
                case 1: 
                    System.out.println("");
                    System.out.println("Dime la cantidad: ");
                    op = teclado.nextInt();
                    c1.Incrementar(op);
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.println("Dime la cantidad: ");
                    op = teclado.nextInt();
                    c1.Decrementar(op);
                    break;
                
                case 3:
                    System.out.println("");
                    System.out.println("Tu contador es: "+c1.GetContador());
                    break;
                    
                case 4:
                    op = 4;
                    System.out.println("");
                    System.out.println("Finalizando programa...");
                    break;
                
                default:
                    System.out.println("");
                    System.out.println("Opción introducida incorrecta.");
                    System.out.println("Vuelve a introducir una opción, por favor.");
                    break;
            }
        }while(op!=4);     
            
    }
    
}
