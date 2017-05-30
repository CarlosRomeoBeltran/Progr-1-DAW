package practica85;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author carlos romeo
 */
public class Practica85 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int op; 
        double cantidad;
        ArrayList<Cuenta> ArrayCuentas = new ArrayList <Cuenta>();
        
        Cuenta c1 = new Cuenta("Carlos","Romeo", "Beltran", "35161601J", 56, "Universitaria", 1.02, 200);
        Cuenta c2 = new Cuenta("Luis","Gordo", "Cobain", "89872030J", 57, "Normal", 5, 50);
        ArrayCuentas.add(c1);
        ArrayCuentas.add(c2);
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
                                ArrayCuentas.get(0).setNombre(teclado.next());
                                break;
                                
                            case 2:                               
                                System.out.println("¿Qué nuevo primer apellido quieres introducir?");
                                ArrayCuentas.get(0).setApellido1(teclado.next());
                                break;
                                
                            case 3:
                                System.out.println("¿Qué nuevo segundo apellido quieres introducir?");
                                ArrayCuentas.get(0).setApellido2(teclado.next());
                                break;
                                
                            case 4:
                                System.out.println("¿Qué nuevo DNI quieres introducir?");          
                                ArrayCuentas.get(0).setDni(teclado.next());
                                break;
                                
                            case 5:
                                System.out.println("¿Qué nuevo número de cuenta quieres poner?");
                                ArrayCuentas.get(0).setNum_cuenta(teclado.nextLong());
                                break;
                                
                            case 6:
                                System.out.println("¿Qué tipo quieres poner?");
                                ArrayCuentas.get(0).setTipo(teclado.next());
                                break;
                                
                            case 7:
                                System.out.println("¿Qué nuevo interés quieres darle?");
                                ArrayCuentas.get(0).setInteres(teclado.nextInt());
                                break;
                             
                            default:
                                System.out.println("Opción introducida incorrecta. Vuelva a introducir una opción, por favor:");
                        }
                    }else{  /*Para cuenta 2*/
                        c1.MenuCambios();
                        op = teclado.nextInt();
                        switch(op){
                            
                            case 1:
                                System.out.println("¿Qué nuevo nombre quieres introducir?");
                                ArrayCuentas.get(1).setNombre(teclado.next());
                                break;
                                
                            case 2:
                                System.out.println("¿Qué nuevo primer apellido quieres introducir?");
                                ArrayCuentas.get(1).setApellido1(teclado.next());
                                break;
                                
                            case 3:
                                System.out.println("¿Qué nuevo segundo apellido quieres introducir?");
                                ArrayCuentas.get(1).setApellido2(teclado.next());
                                break;
                                
                            case 4:
                                System.out.println("¿Qué nuevo DNI quieres introducir?");
                                ArrayCuentas.get(1).setDni(teclado.next());
                                break;
                                
                            case 5:
                                System.out.println("¿Qué nuevo número de cuenta quieres poner?");
                                ArrayCuentas.get(1).setNum_cuenta(teclado.nextLong());
                                break;
                                
                            case 6:
                                System.out.println("¿Qué tipo quieres poner?");
                                ArrayCuentas.get(1).setTipo(teclado.next());
                                break;
                                
                            case 7:
                                System.out.println("¿Qué nuevo interés quieres darle?");
                                ArrayCuentas.get(1).setInteres(teclado.nextInt());
                                break;
                            
                            default:
                                System.out.println("Opción introducida incorrecta. Vuelva a introducir una opción, por favor:");
                        }
                    }
              
                    break;
                               
                case 2:     /*Ingresar dinero*/
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
                        ArrayCuentas.get(0).Ingreso(cantidad);
                    }else{
                        ArrayCuentas.get(1).Ingreso(cantidad);
                    }
                    break;
                    
                case 3:     /*Retirarlo*/
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
                        ArrayCuentas.get(0).Reintegro(cantidad);
                    }else{
                        ArrayCuentas.get(1).Reintegro(cantidad);
                    }
                    break;
                    
                case 4:     /*Transferencia*/
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
                        ArrayCuentas.get(1).setSaldo(ArrayCuentas.get(0).Transferencia(ArrayCuentas.get(1).getSaldo(), cantidad));
                    }else{
                        ArrayCuentas.get(0).setSaldo(ArrayCuentas.get(1).Transferencia(ArrayCuentas.get(0).getSaldo(), cantidad));
                    }
                    break;
                
                case 5:     /*Ver cuentas*/
                    System.out.println("");
                    System.out.println("Tu cuenta 1 está a: "+ArrayCuentas.get(0).getSaldo()+"€");
                    System.out.println("Tu cuenta 2 está a: "+ArrayCuentas.get(1).getSaldo()+"€");   
                 break;
                
                case 6:     /*Mostrar datos de cuentas*/
                    System.out.println("");
                    System.out.println("La cuenta 1 es:");
                    ArrayCuentas.get(0).MostrarCuenta();
                    System.out.println("");
                    System.out.println("La cuenta 2 es:");
                    ArrayCuentas.get(1).MostrarCuenta();
                    break;
                    
                case 7: /*Finalizar programa*/
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
