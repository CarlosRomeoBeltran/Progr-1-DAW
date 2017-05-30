package practica84;
import java.util.Scanner;
/**
 *
 * @author carlos romeo
 */
public class Cuenta {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private long num_cuenta;
    private String tipo;
    private double interes;
    private double saldo;
    
    public Cuenta(){    /*Constructor por defecto*/        
    }

    public String getNombre(){     /*Getter de nombre*/
        return nombre;
    }

    public void setNombre(String nombre){      /*Setter de nombre*/
        this.nombre = nombre;
    }

    public String getApellido1(){      /*Getter de apellido1*/
        return apellido1;
    }

    public void setApellido1(String apellido1){    /*Setter de apellido1*/
        this.apellido1 = apellido1;
    }

    public String getApellido2(){      /*Getter de apellido2*/
        return apellido2;
    }

    public void setApellido2(String apellido2){        /*Setter de apellido2*/
        this.apellido2 = apellido2;
    }
    
    public String getDni(){        /*Getter de DNI*/
        return dni;
    }

    public void setDni(String dni){        /*Setter de DNI*/
        this.dni = dni;
    }

    public long getNum_cuenta(){       /*Getter de num_cuenta*/
        return num_cuenta;
    }

    public void setNum_cuenta(long num_cuenta){        /*Setter de num_cuenta*/
        this.num_cuenta = num_cuenta;
    }

    public String getTipo(){       /*Getter de tipo*/
        return tipo;
    }

    public void setTipo(String tipo){      /*Setter de tipo*/
        this.tipo = tipo;
    }

    public double getInteres(){        /*Getter de interes*/
        return interes;
    }

    public void setInteres(double interes){        /*Setter de interes*/
        this.interes = interes;
    }

    public double getSaldo(){          /*Getter de saldo*/
        return saldo;
    }

    public void setSaldo(double saldo){        /*Setter de saldo*/
        this.saldo = saldo;
    }
    
    public Cuenta(String nombre, String apellido1, String apellido2, String dni, long num_cuenta, String tipo, double interes, double saldo ){      /*Constructor por parámetros*/
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.num_cuenta = num_cuenta;
        this.tipo = tipo;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta c1){           /*Constructor copia*/
        this.nombre = c1.nombre;
        this.apellido1 = c1.apellido1;
        this.apellido2 = c1.apellido2;
        this.dni = c1.dni;
        this.num_cuenta = c1.num_cuenta;
        this.tipo = c1.tipo;
        this.interes = c1.interes;
        this.saldo = c1.saldo;
    }
    
    public void Ingreso(double cantidad){        /*Método ingreso*/
        this.saldo += cantidad; 
    }
    
    public void Reintegro(double cantidad){      /*Método reintegro*/
        this.saldo -= cantidad; 
    }
    
    public double Transferencia(double elsaldo, double cantidad){       /*Método transferencia*/
        this.saldo -= cantidad;
        elsaldo += cantidad;        
        return elsaldo;
    }
    
    public void Menu(){             /*Método para el menu principal*/
        System.out.println("");
        System.out.println("1) Hacer cambios.");
        System.out.println("2) Ingresar.");
        System.out.println("3) Reintegrar.");
        System.out.println("4) Transferencia.");
        System.out.println("5) Ver fondos de cuentas.");
        System.out.println("6) Ver datos de cuentas.");
        System.out.println("7) Finalizar.");
    }
        
    public void MenuElige(){     /*Menu para elegir cuenta*/
            System.out.println("");
            System.out.println("Elige una de las dos cuentas introduciendo su número: ");
            System.out.println("1) Cuenta 1.");
            System.out.println("2) Cuenta 2.");       
    }
    
    public void MenuCambios(){      /*Menu para elegir la opcion a cambiar*/
        System.out.println("");
        System.out.println("Elige la opcion que quieres cambiar: ");
        System.out.println("1) Nombre.");
        System.out.println("2) Primer apellido.");
        System.out.println("3) Segundo apellido.");
        System.out.println("4) DNI.");
        System.out.println("5) Número de cuenta.");
        System.out.println("6) Tipo.");
        System.out.println("7) Interes.");
    }
    
    public void MostrarCuenta(){        /*Mostrar cuenta actual*/
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("El primer apellido es: "+this.apellido1);
        System.out.println("El segundo apellido es: "+this.apellido2);
        System.out.println("El DNI es: "+this.dni);
        System.out.println("El número de cuenta es: "+this.num_cuenta);
        System.out.println("El tipo es: "+this.tipo);
        System.out.println("El interes es de: "+this.interes);
    }
}
