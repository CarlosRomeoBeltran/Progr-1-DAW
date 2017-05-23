package practica87;
import java.util.Scanner;
/** @author carlos romeo*/
public class Practica87 {
    public static void main(String[] args) {
        int opcion, prestados, devueltos, eleccion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa regula los datos de dos libros.");
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        
        do{
            l1.MenuPrincipal();
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("");
                    l1.MenuEligeLibro();
                    if(l1.GetMenuEligeLibro()==1){
                        l1.Alta();
                    }else if(l1.GetMenuEligeLibro()==2){
                        l2.Alta();
                    }
                    break;
                    
                case 2:
                    l1.MenuEligeLibro();
                    if(l1.GetMenuEligeLibro()==1){
                        l1.Baja();
                    }else if(l1.GetMenuEligeLibro()==2){
                        l2.Baja();
                    }
                    break;
                    
                case 3:
                    System.out.println("¿Qué cantidad de libros se prestan?");
                    prestados = teclado.nextInt();
                    l1.MenuEligeLibro();
                    if(l1.GetMenuEligeLibro()==1){
                        l1.Prestamo(prestados);
                    }else if(l1.GetMenuEligeLibro()==2){
                        l2.Prestamo(prestados);
                    }
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("¿Qué cantidad de libros se devuelven?");
                    devueltos = teclado.nextInt();
                    l1.MenuEligeLibro();
                    if(l1.GetMenuEligeLibro()==1){
                        l1.Devolucion(devueltos);
                    }else if(l1.GetMenuEligeLibro()==2){
                        l2.Devolucion(devueltos);
                    }
                    break;
                
                case 5:
                    l1.MenuEligeLibro();
                    if(l1.GetMenuEligeLibro()==1){
                        l1.MostrarLibro();
                    }else if(l1.GetMenuEligeLibro()==2){
                        l2.MostrarLibro();
                    }
                    break;
                    
                case 6:
                    opcion = 6;
                    System.out.println("Finalizando programa...");
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println("Opción introducida incorrecta.");
                    System.out.println("Por favor, vuelva a introducir una opción.");
                    break;               
            }
        }while(opcion!=6);
            
    }
    
}
