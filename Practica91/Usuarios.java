package practica91;
/* @author carlos romeo*/
public class Usuarios {
    private String NIF;
    private String nombre;          
    private String nombre_libro;

    public String getNIF() {        /*Getter del NIF*/
        return NIF;
    }

    public void setNIF(String NIF) {        /*Setter del NIF*/
        this.NIF = NIF;
    }

    public String getNombre() {         /*Getter del nombre*/
        return nombre;
    }

    public void setNombre(String nombre) {      /*Setter del nombre*/
        this.nombre = nombre;
    }

    public String getNombre_libro() {       /*Getter del nombre del libro*/
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {      /*Stter del nombre del libro*/
        this.nombre_libro = nombre_libro;
    }
    
    public void MenuCambioUsuarios(){       /*Menú para el cambio individual de un usuario*/
        System.out.println("");
        System.out.println("¿Qué quieres cambiar en concreto?");
        System.out.println("1) NIF.");
        System.out.println("2) Nombre.");
        System.out.println("3) Nombre del libro.");
        System.out.println("");
    }
    
    public void MenuEligeUsuario(){  /*Menu para elegir uno de los posibles ejemplares*/
        System.out.println("");
        System.out.println("¿En qué usuario?");
        System.out.println("1) Usuario u1");
        System.out.println("2) Usuario u2");
        System.out.println("");       
    }    
    
    public void MostrarDatosUsuario(){  /*Método para mostrar los datos de un usuario en concreto*/
        System.out.println("El NIF es: "+this.NIF);
        System.out.println("El nombre es: "+this.nombre);      
        System.out.println("El nombre del libro es: "+this.nombre_libro);

    }
    
}
