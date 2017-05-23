package practica84;
import java.util.Scanner;
/**
 * @author carlos romeo
 */
public class Practica84 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int op; 
        double cantidad;
        Cuenta c1 = new Cuenta("Carlos","Romeo", "Beltran", "35161601J", 56, "Universitaria", 1.02, 200);
        Cuenta c2 = new Cuenta("Luis","Gordo", "Cobain", "89872030J", 57, "Normal", 5, 50);
        System.out.println("Este programa realiza diferentes operaciones sobre cuentas bancarias.");
        do{
            c1.Menu();
            op = teclado.nextInt();
            switch(op){
                
                case 1:     /*Peticion de cambio de campo individual*/
                    c1.MenuElige();
                    op = teclado.nextInt();   
                    if (op!=1 && op!=2){
                        System.out.println("Opción de cuenta introducida incorrecta, vuelva a introducir otra opción, por favor: ");
                        break;
                    }
                    if (op==1){
                        c1.MenuCambios();
                        op = teclado.nextInt();
                        switch(op){
                            
                            case 1:
                                System.out.println("¿Qué nuevo nombre quieres introducir?"); 
                                c1.setNombre(teclado.next());
                                break;
                                
                            case 2:                               
                                System.out.println("¿Qué nuevo primer apellido quieres introducir?");
                                c1.setApellido1(teclado.next());
                                break;
                                
                            case 3:
                                System.out.println("¿Qué nuevo segundo apellido quieres introducir?");
                                c1.setApellido2(teclado.next());
                                break;
                                
                            case 4:
                                System.out.println("¿Qué nuevo DNI quieres introducir?");          
                                c1.setDni(teclado.next());
                                break;
                                
                            case 5:
                                System.out.println("¿Qué nuevo número de cuenta quieres poner?");
                                c1.setNum_cuenta(teclado.nextLong());
                                break;
                                
                            case 6:
                                System.out.println("¿Qué tipo quieres poner?");
                                c1.setTipo(teclado.next());
                                break;
                                
                            case 7:
                                System.out.println("¿Qué nuevo interés quieres darle?");
                                c1.setInteres(teclado.nextInt());
                                break;
                             
                            default:
                                System.out.println("Opción introducida incorrecta. Vuelva a introducir una opción, por favor:");
                        }
                    }else{  /*Parte para la cuenta 2*/
                        c1.MenuCambios();
                        op = teclado.nextInt();
                        switch(op){
                            
                            case 1:
                                System.out.println("¿Qué nuevo nombre quieres introducir?");
                                c2.setNombre(teclado.next());
                                break;
                                
                            case 2:
                                System.out.println("¿Qué nuevo primer apellido quieres introducir?");
                                c2.setApellido1(teclado.next());
                                break;
                                
                            case 3:
                                System.out.println("¿Qué nuevo segundo apellido quieres introducir?");
                                c2.setApellido2(teclado.next());
                                break;
                                
                            case 4:
                                System.out.println("¿Qué nuevo DNI quieres introducir?");
                                c2.setDni(teclado.next());
                                break;
                                
                            case 5:
                                System.out.println("¿Qué nuevo número de cuenta quieres poner?");
                                c2.setNum_cuenta(teclado.nextLong());
                                break;
                                
                            case 6:
                                System.out.println("¿Qué tipo quieres poner?");
                                c2.setTipo(teclado.next());
                                break;
                                
                            case 7:
                                System.out.println("¿Qué nuevo interés quieres darle?");
                                c2.setInteres(teclado.nextInt());
                                break;
                            
                            default:
                                System.out.println("Opción introducida incorrecta. Vuelva a introducir una opción, por favor:");
                        }
                    }
              
                    break;
                               
                case 2:     /*Peticion de ingreso*/
                    System.out.println("");
                    System.out.println("Introduce una cantidad: ");
                    cantidad = teclado.nextDouble();
                    c1.MenuElige();
                    op = teclado.nextInt();
                    if (op!=1 && op!=2){
                        System.out.println("Opción de cuenta introducida incorrecta, vuelva a introducir otra opción, por favor: ");
                        break;
                    }
                    if (op==1){
                        c1.Ingreso(cantidad);
                    }else{
                        c2.Ingreso(cantidad);
                    }
                    break;
                    
                case 3:     /*Peticion de reintegro*/
                    System.out.println("");
                    System.out.println("Introduce una cantidad: ");
                    cantidad = teclado.nextDouble();
                    c1.MenuElige();
                    op = teclado.nextInt();
                    if (op!=1 && op!=2){
                        System.out.println("Opción de cuenta introducida incorrecta, vuelva a introducir otra opción, por favor: ");
                        break;
                    }
                    if (op==1){
                        c1.Reintegro(cantidad);
                    }else{
                        c2.Reintegro(cantidad);
                    }
                    break;
                    
                case 4:     /*Hacer transferencia*/
                    System.out.println("");
                    System.out.println("Dime la cantidad que quieres transferir: ");
                    cantidad = teclado.nextDouble();
                    c1.MenuElige();
                    op = teclado.nextInt();
                    if (op!=1 && op!=2){
                        System.out.println("Opción de cuenta introducida incorrecta, vuelva a introducir otra opción, por favor: ");
                        break;
                    }
                    if (op==1){
                        c2.setSaldo(c1.Transferencia(c2.getSaldo(), cantidad));
                    }else{
                        c1.setSaldo(c2.Transferencia(c1.getSaldo(), cantidad));
                    }
                    break;
                
                case 5:         /*Ver fondos de cuentas*/
                    System.out.println("");
                    System.out.println("Tu cuenta 1 está a: "+c1.VerCuenta()+"€");
                    System.out.println("Tu cuenta 2 está a: "+c2.VerCuenta()+"€");   
                    break;
                
                case 6:     /*Ver datos de cuentas*/
                    System.out.println("");
                    System.out.println("La cuenta 1 es:");
                    c1.MostrarCuenta();
                    System.out.println("");
                    System.out.println("La cuenta 2 es:");
                    c2.MostrarCuenta();
                    break;
                    
                case 7:     /*Finalizar programa*/
                    op = 7;
                    System.out.println("");
                    System.out.println("Finalizando programa...");
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println("Operación introducida incorrecta.");
                    System.out.println("Vuelva a introducir una de estas operaciones, por favor:");
                   
            }
        }while(op != 7);
  
    }
    
}
