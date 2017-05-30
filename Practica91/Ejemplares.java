package practica91;
/** @author carlos*/
public class Ejemplares {
    private String nombre_libro;
    private String cod_ejemplar;
    private String ISBN;
    private String fecha_sacada;
    private String fecha_devolucion;

    public Ejemplares(){        /*Constructor por defecto*/
        
    }
    
    public Ejemplares(String elnombre_libro, String elcod_ejemplar, String elISBN, String lafecha_sacada, String lafecha_devolucion){
        this.nombre_libro = elnombre_libro;
        this.cod_ejemplar = elcod_ejemplar;
        this.ISBN = elISBN;
        this.fecha_sacada = lafecha_sacada;
        this.fecha_devolucion = lafecha_devolucion;
    }
    
    public String getNombre_libro() {       /*Getter del nombre del libro*/
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {      /*Setter del nombre del libro*/
        this.nombre_libro = nombre_libro;
    }

    public String getCod_ejemplar() {       /*Getter del codigo del ejemplar*/
        return cod_ejemplar;
    }

    public void setCod_ejemplar(String cod_ejemplar) {      /*Setter del codigo del ejemplar*/
        this.cod_ejemplar = cod_ejemplar;
    }

    public String getISBN() {       /*Getter del ISBN*/
        return ISBN;
    }

    public void setISBN(String ISBN) {      /*Setter del ISBN*/
        this.ISBN = ISBN;
    }

    public String getFecha_sacada() {       /*Getter de la fecha sacada*/
        return fecha_sacada;
    }

    public void setFecha_sacada(String fecha_sacada) {      /*Setter de la fecha sacada*/
        this.fecha_sacada = fecha_sacada;
    }

    public String getFecha_devolucion() {       /*Getter de la fecha devolucion*/
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {      /*Setter de la fecha devolucion*/
        this.fecha_devolucion = fecha_devolucion;
    }
    
    public void MenuCambioEjemplares(){     /*Menú para el cambio individual de datos de ejemplares*/
        System.out.println("");
        System.out.println("¿Qué quieres cambiar en concreto?");
        System.out.println("1) Nombre del libro.");
        System.out.println("2) Codigo del ejemplar.");
        System.out.println("3) ISBN.");
        System.out.println("4) Fecha de sacada.");
        System.out.println("5) Fecha de devolución.s");
        System.out.println("");
    }
    
    public void MenuEligeEjemplares(){  /*Menu para elegir uno de los posibles ejemplares*/
        System.out.println("");
        System.out.println("¿Elige ejemplar?");
        System.out.println("1) Ejemplares e1");
        System.out.println("2) Ejemplares e2");
        System.out.println("3) Ejemplares e3");
        System.out.println("");       
    }
    
    public void MostrarDatosEjemplar(){ /*Método para mostrar datos de un ejemplar en concreto*/
        System.out.println("El nombre del libro es: "+this.nombre_libro);
        System.out.println("El codigo del ejemplar es: "+this.cod_ejemplar);
        System.out.println("El ISBN es: "+this.ISBN);
        System.out.println("La fecha de recogida es: "+this.fecha_sacada);
        System.out.println("La fecha de devolución es: "+this.fecha_devolucion);
    }
                       
}
