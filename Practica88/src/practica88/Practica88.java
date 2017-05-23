package practica88;
import java.util.ArrayList;
import java.util.Scanner;

/* @author Carlos Romeo*/
public class Practica88 {

    public static void main(String[] args) {
        int opcion, prestados, devueltos, eleccion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa regula los datos de dos libros.");
        ArrayList<Libro> ArrayLibros = new ArrayList <Libro>();
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        ArrayLibros.add(l1);
        ArrayLibros.add(l2);
        
        do{
            l1.MenuPrincipal();
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("");
                    l1.MenuEligeLibro();
                    if(ArrayLibros.get(0).GetMenuEligeLibro()==1){
                        ArrayLibros.get(0).Alta();
                    }else if(l1.GetMenuEligeLibro()==2){
                        ArrayLibros.get(1).Alta();
                    }
                    break;
                    
                case 2:
                    l1.MenuEligeLibro();
                    if(ArrayLibros.get(0).GetMenuEligeLibro()==1){
                        ArrayLibros.get(0).Baja();
                    }else if(l1.GetMenuEligeLibro()==2){
                        ArrayLibros.get(1).Baja();
                    }
                    break;
                    
                case 3:
                    System.out.println("¿Qué cantidad de libros se prestan?");
                    prestados = teclado.nextInt();
                    l1.MenuEligeLibro();
                    if(ArrayLibros.get(0).GetMenuEligeLibro()==1){
                        ArrayLibros.get(0).Prestamo(prestados);
                    }else if(l1.GetMenuEligeLibro()==2){
                        ArrayLibros.get(1).Prestamo(prestados);
                    }
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("¿Qué cantidad de libros se devuelven?");
                    devueltos = teclado.nextInt();
                    l1.MenuEligeLibro();
                    if(ArrayLibros.get(0).GetMenuEligeLibro()==1){
                        ArrayLibros.get(0).Devolucion(devueltos);
                    }else if(ArrayLibros.get(0).GetMenuEligeLibro()==2){
                        ArrayLibros.get(1).Devolucion(devueltos);
                    }
                    break;
                
                case 5:
                    l1.MenuEligeLibro();
                    if(ArrayLibros.get(0).GetMenuEligeLibro()==1){
                        ArrayLibros.get(0).MostrarLibro();
                    }else if(ArrayLibros.get(0).GetMenuEligeLibro()==2){
                        ArrayLibros.get(1).MostrarLibro();
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
