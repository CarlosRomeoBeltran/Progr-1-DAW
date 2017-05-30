package practica91;
import java.util.Scanner;
/* @author carlos romeo*/
public class Practica91 {
    public static void main(String[] args) {
        System.out.println("Este programa es la gestión de una biblioteca.");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        Libro l3 = new Libro();
        Ejemplares e1 = new Ejemplares();
        Ejemplares e2 = new Ejemplares();
        Ejemplares e3 = new Ejemplares();
        Usuarios u1 = new Usuarios();
        Usuarios u2 = new Usuarios();
        
        do{
            System.out.println("");
            System.out.println("Elige una de estas opciones.");
            l1.MenuPrincipal();
            opcion = teclado.nextInt();            
            switch(opcion){
                case 1:                 /*Caso para los cambios*/
                    l1.MenuElegirCambio();
                    opcion = teclado.nextInt();
                    switch(opcion){
                        case 1:     /*Caso cambio libro*/
                            l1.MenuEligeLibro();
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1: /*Caso libro 1*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el ISBN del libro.");
                                            l1.setISBN(teclado.next());
                                            System.out.println("Introduce el código del libro.");
                                            l1.setCodigo(teclado.nextInt());
                                            System.out.println("Introduce el nombre del libro.");
                                            l1.setNombre(teclado.next());
                                            System.out.println("Introduce el autor del libro.");
                                            l1.setAutor(teclado.next());
                                            System.out.println("Introduce el número de ejemplares que hay.");
                                            l1.setNumero_ejemplares(teclado.nextInt());
                                            break;
                                            
                                        case 2: /*Caso cambios individuales*/
                                            l1.MenuCambiosIndividuales();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo ISBN:");
                                                    l1.setISBN(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo código:");
                                                    l1.setCodigo(teclado.nextInt());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro:");
                                                    l1.setNombre(teclado.next());
                                                    break;
                                                    
                                                case 4:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo autor del libro:");
                                                    l1.setAutor(teclado.next());
                                                    break;
                                                    
                                                case 5:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo número de ejemplares que hay:");
                                                    l1.setNumero_ejemplares(teclado.nextInt());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;
                                            }
                                        default:
                                            System.out.println("");
                                            System.out.println("Opción introducida incorrecta.");
                                            break;
                                    }
                                        break;
                                    
                                case 2: /*Caso libro 2*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el ISBN del libro.");
                                            l2.setISBN(teclado.next());
                                            System.out.println("Introduce el código del libro.");
                                            l2.setCodigo(teclado.nextInt());
                                            System.out.println("Introduce el nombre del libro.");
                                            l2.setNombre(teclado.next());
                                            System.out.println("Introduce el autor del libro.");
                                            l2.setAutor(teclado.next());
                                            System.out.println("Introduce el número de ejemplares que hay.");
                                            l2.setNumero_ejemplares(teclado.nextInt());
                                            break;
                                        case 2: /*Caso cambios individuales*/
                                            l1.MenuCambiosIndividuales();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo ISBN:");
                                                    l2.setISBN(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo código:");
                                                    l2.setCodigo(teclado.nextInt());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro:");
                                                    l2.setNombre(teclado.next());
                                                    break;
                                                    
                                                case 4:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo autor del libro:");
                                                    l2.setAutor(teclado.next());
                                                    break;
                                                    
                                                case 5:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo número de ejemplares que hay:");
                                                    l2.setNumero_ejemplares(teclado.nextInt());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;
                                            }
                                            break;
                                            
                                        default:
                                            System.out.println("");
                                            System.out.println("Opción introducida incorrecta.");
                                            break;
                                    }
                                    break;
                                    
                                case 3: /*Caso libro 3*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el ISBN del libro.");
                                            l3.setISBN(teclado.next());
                                            System.out.println("Introduce el código del libro.");
                                            l3.setCodigo(teclado.nextInt());
                                            System.out.println("Introduce el nombre del libro.");
                                            l3.setNombre(teclado.next());
                                            System.out.println("Introduce el autor del libro.");
                                            l3.setAutor(teclado.next());
                                            System.out.println("Introduce el número de ejemplares que hay.");
                                            l3.setNumero_ejemplares(teclado.nextInt());
                                            break;
                                            
                                        case 2: /*Caso cambios individuales*/
                                            l1.MenuCambiosIndividuales();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo ISBN:");
                                                    l3.setISBN(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo código:");
                                                    l3.setCodigo(teclado.nextInt());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro:");
                                                    l3.setNombre(teclado.next());
                                                    break;
                                                    
                                                case 4:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo autor del libro:");
                                                    l3.setAutor(teclado.next());
                                                    break;
                                                    
                                                case 5:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo número de ejemplares que hay:");
                                                    l3.setNumero_ejemplares(teclado.nextInt());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;      
                                            }
                                        break;
                                    default:
                                        System.out.println("");
                                        System.out.println("Opción introducida incorrecta.");
                                        break;
                                    }
                                    break;
                                    
                                default:
                                    System.out.println("");
                                    System.out.println("Opción introducida incorrecta.");
                                    break;  
                            }
                            break;
                            
                        case 2:     /*Caso cambio ejemplares*/
                            e1.MenuEligeEjemplares();
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1: /*Caso ejemplar 1*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el nombre del libro.");
                                            e1.setNombre_libro(teclado.next());
                                            System.out.println("Introduce el código del ejemplar.");
                                            e1.setCod_ejemplar(teclado.next());
                                            System.out.println("Introduce el ISBN.");
                                            e1.setISBN(teclado.next());
                                            System.out.println("Introduce la fecha de prestamo.");
                                            e1.setFecha_sacada(teclado.next());
                                            System.out.println("Introduce la fecha de devolución.");
                                            e1.setFecha_devolucion(teclado.next());
                                            break;
                                            
                                        case 2: /*Caso cambios individuales*/
                                            e1.MenuCambioEjemplares();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro.");
                                                    e1.setNombre_libro(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo código del ejemplar:");
                                                    e1.setCod_ejemplar(teclado.next());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo ISBN:");
                                                    e1.setISBN(teclado.next());
                                                    break;
                                                    
                                                case 4:
                                                    System.out.println("");
                                                    System.out.println("Introduce la nueva fecha de préstamo:");
                                                    e1.setFecha_sacada(teclado.next());
                                                    break;
                                                    
                                                case 5:
                                                    System.out.println("");
                                                    System.out.println("Introduce la nueva fecha de devolución:");
                                                    e1.setFecha_devolucion(teclado.next());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;
                                            }
                                        default:
                                            System.out.println("");
                                            System.out.println("Opción introducida incorrecta.");
                                            break;
                                    }
                                        break;
                                    
                                case 2: /*Caso ejemplares 2*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el nombre del libro.");
                                            e2.setNombre_libro(teclado.next());
                                            System.out.println("Introduce el código del ejemplar.");
                                            e2.setCod_ejemplar(teclado.next());
                                            System.out.println("Introduce el ISBN.");
                                            e2.setISBN(teclado.next());
                                            System.out.println("Introduce la fecha de prestamo.");
                                            e2.setFecha_sacada(teclado.next());
                                            System.out.println("Introduce la fecha de devolución.");
                                            e2.setFecha_devolucion(teclado.next());
                                            break;
                                        case 2: /*Caso cambios individuales*/
                                            e1.MenuCambioEjemplares();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro.");
                                                    e2.setNombre_libro(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo código del ejemplar:");
                                                    e2.setCod_ejemplar(teclado.next());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo ISBN:");
                                                    e2.setISBN(teclado.next());
                                                    break;
                                                    
                                                case 4:
                                                    System.out.println("");
                                                    System.out.println("Introduce la nueva fecha de préstamo:");
                                                    e2.setFecha_sacada(teclado.next());
                                                    break;
                                                    
                                                case 5:
                                                    System.out.println("");
                                                    System.out.println("Introduce la nueva fecha de devolución:");
                                                    e2.setFecha_devolucion(teclado.next());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;
                                            }
                                            break;
                                            
                                        default:
                                            System.out.println("");
                                            System.out.println("Opción introducida incorrecta.");
                                            break;
                                    }
                                    break;
                                    
                                case 3: /*Caso ejemplares 3*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el nombre del libro.");
                                            e3.setNombre_libro(teclado.next());
                                            System.out.println("Introduce el código del ejemplar.");
                                            e3.setCod_ejemplar(teclado.next());
                                            System.out.println("Introduce el ISBN.");
                                            e3.setISBN(teclado.next());
                                            System.out.println("Introduce la fecha de prestamo.");
                                            e3.setFecha_sacada(teclado.next());
                                            System.out.println("Introduce la fecha de devolución.");
                                            e3.setFecha_devolucion(teclado.next());
                                            break;
                                            
                                        case 2: /*Caso cambios individuales*/
                                            e1.MenuCambioEjemplares();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro.");
                                                    e3.setNombre_libro(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo código del ejemplar:");
                                                    e3.setCod_ejemplar(teclado.next());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo ISBN:");
                                                    e3.setISBN(teclado.next());
                                                    break;
                                                    
                                                case 4:
                                                    System.out.println("");
                                                    System.out.println("Introduce la nueva fecha de préstamo:");
                                                    e3.setFecha_sacada(teclado.next());
                                                    break;
                                                    
                                                case 5:
                                                    System.out.println("");
                                                    System.out.println("Introduce la nueva fecha de devolución:");
                                                    e3.setFecha_devolucion(teclado.next());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;      
                                            }
                                            break;
                                default:
                                    System.out.println("");
                                    System.out.println("Opción introducida incorrecta.");
                                    break;
                                }
                                break;
                                    
                                default:
                                    System.out.println("");
                                    System.out.println("Opción introducida incorrecta.");
                                    break;  
                            }
                            break;
                            
                        case 3:     /*Caso cambio usuarios*/
                            u1.MenuEligeUsuario();
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1: /*Caso usuarios 1*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el NIF.");
                                            u1.setNIF(teclado.next());
                                            System.out.println("Introduce el nombre.");
                                            u1.setNombre(teclado.next());
                                            System.out.println("Introduce el nombre del libro que se le ha prestado.");
                                            u1.setNombre_libro(teclado.next());
                                            break;
                                            
                                        case 2: /*Caso cambios individuales*/
                                            u1.MenuCambioUsuarios();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo NIF:");
                                                    u1.setNIF(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre:");
                                                    u1.setNombre(teclado.next());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro que se le ha prestado:");
                                                    u1.setNombre_libro(teclado.next());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;
                                            }
                                        default:
                                            System.out.println("");
                                            System.out.println("Opción introducida incorrecta.");
                                            break;
                                    }
                                    break;
                                    
                                case 2: /*Caso usuarios 2*/
                                    l1.MenuCambioEnteroIndividual();    /*Cambio individual o entero*/
                                    opcion = teclado.nextInt();
                                    switch(opcion){
                                        case 1:     /*Caso cambios desde cero*/
                                            System.out.println("");
                                            System.out.println("Introduce el NIF.");
                                            u1.setNIF(teclado.next());
                                            System.out.println("Introduce el nombre.");
                                            u1.setNombre(teclado.next());
                                            System.out.println("Introduce el nombre del libro que se le ha prestado.");
                                            u1.setNombre_libro(teclado.next());
                                            break;
                                            
                                        case 2: /*Caso cambios individuales*/
                                            u1.MenuCambioUsuarios();
                                            opcion = teclado.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo NIF:");
                                                    u1.setNIF(teclado.next());
                                                    break;
                                                    
                                                case 2:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre:");
                                                    u1.setNombre(teclado.next());
                                                    break;
                                                    
                                                case 3:
                                                    System.out.println("");
                                                    System.out.println("Introduce el nuevo nombre del libro que se le ha prestado:");
                                                    u1.setNombre_libro(teclado.next());
                                                    break;
                                                
                                                default:
                                                    System.out.println("");
                                                    System.out.println("Opción introducida incorrecta.");
                                                    break;
                                            }
                                            break;
                                            
                                        default:
                                            System.out.println("");
                                            System.out.println("Opción introducida incorrecta.");
                                            break;
                                    }
                                    break;
                                    
                                default:
                                    System.out.println("");
                                    System.out.println("Opción introducida incorrecta.");
                                    break;
                            }
                            break;
                }
                break;
                
                case 2:     /*Caso préstamos*/
                    if (u1.getNombre_libro().equals(e1.getNombre_libro()) ){    /*Comprobacion de si el usuario 1 tiene alguno de los 3 ejemplares en préstamo*/
                        System.out.println("");
                        System.out.println("El usuario "+u1.getNombre()+" tiene el préstamo de "+e1.getNombre_libro());
                        System.out.println("");
                        System.out.println("Desde la fecha:"+e1.getFecha_sacada()+" hasta "+e1.getFecha_devolucion());
                    }else if(u1.getNombre_libro().equals(e2.getNombre_libro())){
                        System.out.println("El usuario "+u1.getNombre()+" tiene el préstamo de "+e2.getNombre_libro());
                        System.out.println("");
                        System.out.println("Desde la fecha:"+e2.getFecha_sacada()+" hasta "+e2.getFecha_devolucion());
                    }else if(u1.getNombre_libro().equals(e3.getNombre_libro())){
                        System.out.println("");
                        System.out.println("Desde la fecha:"+e3.getFecha_sacada()+" hasta "+e3.getFecha_devolucion());                       
                        System.out.println("El usuario "+u1.getNombre()+" tiene el préstamo de "+e3.getNombre_libro());
                    }
                    
                    if (u2.getNombre_libro().equals(e1.getNombre_libro()) ){    /*Comprobacion de si el usuario 2 tiene alguno de los 3 ejemplares en préstamo*/
                        System.out.println("");
                        System.out.println("El usuario "+u2.getNombre()+" tiene el préstamo de "+e1.getNombre_libro());
                        System.out.println("");
                        System.out.println("Desde la fecha:"+e1.getFecha_sacada()+" hasta "+e1.getFecha_devolucion());
                    }else if(u2.getNombre_libro().equals(e2.getNombre_libro())){
                        System.out.println("El usuario "+u2.getNombre()+" tiene el préstamo de "+e2.getNombre_libro());
                        System.out.println("");
                        System.out.println("Desde la fecha:"+e2.getFecha_sacada()+" hasta "+e2.getFecha_devolucion());
                    }else if(u2.getNombre_libro().equals(e3.getNombre_libro())){
                        System.out.println("");
                        System.out.println("Desde la fecha:"+e3.getFecha_sacada()+" hasta "+e3.getFecha_devolucion());                       
                        System.out.println("El usuario "+u2.getNombre()+" tiene el préstamo de "+e3.getNombre_libro());
                    }
                    
                    break;
                    
                case 3:     /*Caso consultar datos*/
                    l1.MenuElegirCambio();
                    opcion=teclado.nextInt();
                    switch(opcion){
                        case 1:     /*Caso elegir libro*/
                            l1.MenuEligeLibro();
                            switch(opcion){
                                case 1:     /*Caso libro 1*/
                                    System.out.println("");
                                    l1.MostrarDatosLibros();
                                    break;
                                    
                                case 2:     /*Caso libro 2*/
                                    System.out.println("");
                                    l2.MostrarDatosLibros();
                                    break;
                                    
                                case 3:     /*Caso libro 3*/
                                    System.out.println("");
                                    l3.MostrarDatosLibros();
                                    break;
                                    
                                default:
                                    System.out.println("");
                                    System.out.println("Opcion introducida incorrecta.");
                                    break;
                            }
                            break;
                        
                        case 2:     /*Caso elegir ejemplares*/
                            e1.MenuEligeEjemplares();
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1: /*Caso mostrar datos ejemplares 1*/
                                    e1.MostrarDatosEjemplar();
                                    break;
                                case 2: /*Caso mostrar datos ejemplares 2*/
                                    e2.MostrarDatosEjemplar();
                                    break;
                                case 3: /*Caso mostrar datos ejemplares 3*/
                                    e3.MostrarDatosEjemplar();
                                    break;   
                                    
                                default:
                                    System.out.println("");
                                    System.out.println("Opción introducida incorrecta.");
                                    break;
                            }
                            break;
                        
                        case 3:     /*Caso elegir usuarios*/
                            u1.MenuEligeUsuario();
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1: /*Caso mostrar datos ejemplares 1*/
                                    u1.MostrarDatosUsuario();
                                    break;
                                    
                                case 2: /*Caso mostrar datos ejemplares 2*/
                                    u2.MostrarDatosUsuario();
                                    break;
                          
                                default:
                                    System.out.println("");
                                    System.out.println("Opción introducida incorrecta.");
                                    break;
                            }
                            break;
                        
                        default:
                            System.out.println("");
                            System.out.println("Opción introducida incorrecta.");
                            break;
                    }
                    break;
                    
                case 4:     /*Caso finalizar programa*/
                    opcion = 4;
                    System.out.println("");
                    System.out.println("Finalizando programa...");
                    break;
                
                default:
                    System.out.println("");
                    System.out.println("Opción introducida incorrecta.");
                    break;
                    
            }
 
        }while(opcion !=4);
       
        
    }
    
    
    
}
