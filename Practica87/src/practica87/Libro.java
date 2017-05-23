package practica87;
import java.util.Scanner;
/** @author Carlos Romeo */
public class Libro {
    Scanner teclado = new Scanner(System.in);
    private String titulo;
    private String autor;
    private int ejemplares;
    private int libros_prestados;
    private String ISBN;
    int eleccion=0;
    
    public Libro(){     /*Contructor por defecto*/       
    }
    
    public Libro(String eltitulo, String elautor, int losejemplares, int loslibros_prestados, String elISBN){   /*Constructor con parametros*/
        this.titulo = eltitulo;
        this.autor = elautor;
        this.ejemplares = losejemplares;
        this.libros_prestados = loslibros_prestados;
        this.ISBN = elISBN;    
    }
    
    public Libro(Libro l1){         /*Constructor copia*/
        this.titulo = l1.titulo;
        this.autor = l1.autor;
        this.ejemplares = l1.ejemplares;
        this.libros_prestados = l1.libros_prestados;
        this.ISBN = l1.ISBN;       
    }

    public void setTitulo(String titulo) {      /*Setter de titulo*/
        this.titulo = titulo;
    }

    public void setAutor(String autor) {        /*Setter de autor*/
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {      /*Setter de ejemplares*/
        this.ejemplares = ejemplares;
    }

    public void setLibros_prestados(int libros_prestados) {      /*Setter de libros prestador*/
        this.libros_prestados = libros_prestados;
    }

    public void setISBN(String ISBN) {            /*Setter del ISBN*/
        this.ISBN = ISBN;
    }

    public String getTitulo() {     /*Getter del titulo*/
        return titulo;
    }

    public String getAutor() {      /*Getter del autor*/
        return autor;
    }

    public int getEjemplares() {     /*Getter de ejemplares*/
        return ejemplares;
    }

    public int getLibros_prestados() {       /*Getter de libros prestador*/
        return libros_prestados;
    }

    public String getISBN() {         /*Getter del ISBN*/
        return ISBN;
    }    
    
    public void Prestamo(int cantidad){      /*Método de prestamos*/
        this.libros_prestados += cantidad;
        this.ejemplares -= cantidad;
    }
    
    public void Devolucion(int cantidad){    /*Método de devolución*/
        this.libros_prestados -= cantidad;
        this.ejemplares += cantidad;
    }
    
    public void Alta(){            /*Menú para dar de alta libro*/
        teclado.nextLine();
        System.out.println("Introduce el titulo: ");
        this.titulo = teclado.nextLine();
        System.out.println("Introduce el autor: ");
        this.autor = teclado.nextLine();
        System.out.println("Introduce la cantidad de ejemplares: ");
        this.ejemplares = teclado.nextInt();
        System.out.println("Introduce la cantidad de libros prestados: ");
        this.libros_prestados = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce el ISBN: ");
        this.ISBN = teclado.nextLine();        
        
    }
    
    public void Baja(){     /*Método para dar de baja un libro, poniendo todos sus parámetros a null*/
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.libros_prestados = 0;
        this.ISBN = "";
    }
    
    public void MostrarLibro(){        /*Mostrar libro actual*/
        System.out.println("El título es: "+this.titulo);
        System.out.println("El autor es: "+this.autor);
        System.out.println("Los ejemplares que quedan son: "+this.ejemplares);
        System.out.println("Los libros prestados son: "+this.libros_prestados);
        System.out.println("El ISBN es: "+this.ISBN);
    }
    
    public void MenuPrincipal(){                /*Menú principal*/
        System.out.println("");
        System.out.println("1) Dar de alta libro.");
        System.out.println("2) Dar de baja libro.");
        System.out.println("3) Dar préstamo de libro");
        System.out.println("4) Libro devuelto.");
        System.out.println("5) Mostrar libro.");
        System.out.println("6) Finalizar programa.");
        System.out.println("");
    }
    
    public void MenuEligeLibro(){        /*ya que en este ejercicio solo hay dos libros, tendremos que varias veces elegir entre uno y otro*/
        do{
            System.out.println("¿Qué libro es, el 1 o el 2?");
            eleccion = teclado.nextInt();
        }while(eleccion <= 1 && eleccion >= 2);{
            if (eleccion == 1 || eleccion == 2){
                
            }else{
                System.out.println("Libro introducido incorrecto.");
                System.out.println("Vuelve a introducir una opción, por favor");
            }
        }
    }
        
    public int GetMenuEligeLibro(){      /*Getter para obtener la elección del usuario*/
        return eleccion;
    }
    
}
