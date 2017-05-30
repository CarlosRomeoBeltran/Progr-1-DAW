package practica91;
/*@author carlos romeo*/
public class Libro {
    private String ISBN;
    private int codigo;
    private String nombre;
    private String autor;
    private int numero_ejemplares;
    
    public Libro(){     /*Constructor por defecto*/
        
    }
    
    public Libro(String elisbn, int elcodigo, String elnombre, String elautor, int elnum_ejemplares){   /*Constructor por parametros*/
        this.ISBN = elisbn;
        this.codigo = elcodigo;
        this.nombre = elnombre;
        this.autor = elautor;
        this.numero_ejemplares = elnum_ejemplares;
    }
    

    public String getISBN() {       /*Getter del ISBN*/
        return ISBN;
    }

    public void setISBN(String ISBN) {  /*Setter del ISBN*/
        this.ISBN = ISBN;
    }

    public int getCodigo() {        /*Getter del codigo*/
        return codigo;
    }

    public void setCodigo(int codigo) {     /*Setter del codigo*/
        this.codigo = codigo;
    }

    public String getNombre() {     /*Getter del nombre*/
        return nombre;
    }

    public void setNombre(String nombre) {      /*Setter del nombre*/
        this.nombre = nombre;
    }

    public String getAutor() {      /*Getter del autor*/
        return autor;
    }

    public void setAutor(String autor) {    /*Setter del autor*/
        this.autor = autor;
    }

    public int getNumero_ejemplares() {     /*Getter del numero de ejemplares*/
        return numero_ejemplares;
    }

    public void setNumero_ejemplares(int numero_ejemplares) {       /*Setter del numero de ejemplares*/
        this.numero_ejemplares = numero_ejemplares;
    }
    
    public void MenuPrincipal(){    /*Menú principal*/
        System.out.println("");
        System.out.println("1) Introducir/cambiar algún parámetro.");
        System.out.println("2) Consultar préstamos.");
        System.out.println("3) Consultar datos.");
        System.out.println("4) Finalizar programa.");
    }
    
    public void MenuCambioLibro(){  /*Menú para el cambio individual de información de un libro*/
        System.out.println("");
        System.out.println("1) ISBN.");
        System.out.println("2) Codigo.");
        System.out.println("3) Nombre.");
        System.out.println("4) Autor.");
        System.out.println("5) Número de ejemplares.");
        System.out.println("");
    }
    
    public void MenuCambioEnteroIndividual(){   /*Menu para cambiar un objeto entero o un atributo en concreto*/
        System.out.println("");
        System.out.println("¿Quieres introducir datos desde cero o cambiar uno en concreto?");
        System.out.println("1) Introducir datos desde cero.");
        System.out.println("2) Cambiar dato en concreto.");
        System.out.println("");        
    }
    
    public void MenuElegirCambio(){ /*Menu para elegir cual de los objetos quiero cambiar*/
        System.out.println("");
        System.out.println("Elige uno: ");
        System.out.println("");
        System.out.println("1) Libro.");
        System.out.println("2) Ejemplares.");
        System.out.println("3) Usuarios.");
    }
    
    public void MenuEligeLibro(){   /*Menu para elegir uno de los libros*/
        System.out.println("");
        System.out.println("¿En qué libro?");
        System.out.println("1) Libro l1");
        System.out.println("2) Libro l2");
        System.out.println("3) Libro l3");
        System.out.println("");       
    }
    

    
    public void MenuCambiosIndividuales(){  /*Menu para elegir uno de los atributos del objeto libro*/
        System.out.println("");
        System.out.println("¿Qué quieres cambiar en concreto?");
        System.out.println("1) El ISBN.");
        System.out.println("2) El código.");
        System.out.println("3) El nombre del libro.");
        System.out.println("4) El autor del libro.");
        System.out.println("5) El número de ejemplares que hay.");
    }
              
    public void MostrarDatosLibros(){       /*Método para mostrar datos de un libro en concreto*/
        System.out.println("El ISBN es: "+this.ISBN);
        System.out.println("El codigo es: "+this.codigo);
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("El autor es: "+this.autor);
        System.out.println("El numero de ejemplares es: "+this.numero_ejemplares);
    }
}
